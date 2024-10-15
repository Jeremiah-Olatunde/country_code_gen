import 'dart:io';
import 'dart:convert';

void main(List<String> arguments) async {
  String java = await generateJavaCode();
  await File('Country.java').writeAsString(java);
}


Future<String> generateCountryDataJson() async {
  final String jsonRaw = await File('raw.json').readAsString();
  final List<dynamic> jsonParsed = json.decode(jsonRaw);

  String jsonGenerated = jsonParsed.fold('', (accum, value) {
    if (value case {'code': String code, 'name': String name}) {
      // remove the country qualifier
      var identifierAndTitle = name.split(',');

      String? title =
          identifierAndTitle.length == 2 ? identifierAndTitle[1].trim() : null;

      String identifier = identifierAndTitle.first
          // remove all brackets
          .replaceAll(RegExp(r'\s\(.*\)'), '')
          // remove all apostrophes, periods and hypens
          .replaceAll(RegExp(r"('|\.|-)"), '')
          // replace & with and
          .replaceAll(RegExp(r'&'), 'And')
          // convert to camel case (note: first letter is already in uppercase)
          .replaceAllMapped(RegExp(r'\s(?<target>\w)'), (match) {
        String? firstLetter = match.group(1)?.toUpperCase();
        if (firstLetter == null) {
          throw "regex error";
        }

        return firstLetter;
      });

      // reject identifiers with special characters (e.g Åland Islands)
      bool isValidIdentifier =
          identifier.split('').every(RegExp(r'[A-Za-z]').hasMatch);

      bool isValidTitle = title != null;
      return '$accum${accum == '' ? '' : ','} { "code": "$code", "name": "$name", "identifier": ${isValidIdentifier ? '"$identifier"' : null}, "title": ${isValidTitle ? '"$title"' : null} }';
    }

    throw 'invalid json structure';
  });

  jsonGenerated = '[$jsonGenerated]';

  await File('country_codes.json').writeAsString(jsonGenerated);

  return jsonGenerated;
}


class CountryData {
  final String name;
  final String identifier;
  final String code;

  CountryData(this.name, this.identifier, this.code);

  @override
  String toString() => 'CountryData(code: $code, name: $name, identifier: $identifier)';
}

Future<List<CountryData>> generateCountryData() async {
  final String jsonRaw = await File('raw.json').readAsString();
  final List<dynamic> jsonParsed = json.decode(jsonRaw);
  final List<CountryData> countryData = [];

  for(var {'code': String code, 'name': String name} in jsonParsed){
    name = name.split(',').first;
    name = name.replaceAll(RegExp(r'\s\(.*\)'), '');
    name = name.replaceAll(RegExp(r"('|\.|-)"), '');
    name = name.replaceAll(RegExp(r'&'), 'And');
    String identifier = toCamelCase(name);

    bool validIdentifier = RegExp(r'^[A-Za-z]+$').hasMatch(identifier);

    if(validIdentifier){
      countryData.add(CountryData(name, identifier, code));
    }
  }

  return countryData;
}

String toCamelCase(String str){
  return str.replaceAllMapped(RegExp(r'\s(?<target>\w)'), (match) {
    String? firstLetter = match.group(1)?.toUpperCase();
    if (firstLetter == null) {
      throw "regex error";
    }
    return firstLetter;
  });
}

Future<String> generateJavaCode() async {
  List<CountryData> countries = await generateCountryData();

  String jsonSubTypes = countries.fold('\n', (accum, country){
    var CountryData(:code, :identifier) = country;
    return '$accum${templateJsonSubType(identifier, code)}';
  });

  String permits = countries.fold('', (accum, country){
    var CountryData(:identifier, :code) = country;
    return '$accum Country.$identifier,';
  });

  String records = countries.fold('\n', (accum, country){
    var CountryData(:name, :identifier, :code) = country;
    return '$accum${templateRecord(name, identifier, code)}';
  }); 

  return template(jsonSubTypes, permits, records);
}


String templateJsonSubType(String identifier, String code) => '''
  @JsonSubTypes.Type(value = Country.$identifier.class, name = "$code"),
''';

String templateRecord(String name, String code, String identifier) => '''
  record $identifier(String name, String code) implements Country {
    public $identifier {
      name = "$name";
      code = "$code";
    }
  } 
''';


String template(String jsonSubTypes, String permits, String records) => '''
package io.pinnacl.commons.data.domain.base;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.pinnacl.commons.data.domain.AdministrativeArea;

import java.util.UUID;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "code")
@JsonSubTypes({$jsonSubTypes})  
public sealed interface Country extends AdministrativeArea permits $permits {
  String name();

  String code();

  default Double latitude() {
      return null;
  }

  default Double longitude() {
      return null;
  }

  default UUID createdBy() {
      return null;
  }

  default UUID updatedBy() {
      return null;
  }

  default UUID ownerId() {
      return null;
  }

  default String hash() {
      return "";
  }

  default String description() {
      return "";
  }

  default String alternateName() {
      return "";
  }

  default UUID id() {
      return null;
  }

  $records
}  
''';