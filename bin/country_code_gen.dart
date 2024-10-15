import 'dart:io';
import 'dart:convert';

void main(List<String> arguments) async {
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

      return '$accum, { "code": "$code", "name": "$name", "identifier": ${isValidIdentifier ? '"$identifier"' : null}, "title": ${isValidTitle ? null : '"$title"'} }';
    }

    throw 'invalid json structure';
  });

  jsonGenerated = '[$jsonGenerated]';

  await File('country_codes.json').writeAsString(jsonGenerated);
}
