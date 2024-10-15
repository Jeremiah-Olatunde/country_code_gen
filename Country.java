package io.pinnacl.commons.data.domain.base;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.pinnacl.commons.data.domain.AdministrativeArea;

import java.util.UUID;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "code")
@JsonSubTypes({
  @JsonSubTypes.Type(value = Country.Andorra.class, name = "AD"),
  @JsonSubTypes.Type(value = Country.UnitedArabEmirates.class, name = "AE"),
  @JsonSubTypes.Type(value = Country.Afghanistan.class, name = "AF"),
  @JsonSubTypes.Type(value = Country.AntiguaAndBarbuda.class, name = "AG"),
  @JsonSubTypes.Type(value = Country.Anguilla.class, name = "AI"),
  @JsonSubTypes.Type(value = Country.Albania.class, name = "AL"),
  @JsonSubTypes.Type(value = Country.Armenia.class, name = "AM"),
  @JsonSubTypes.Type(value = Country.Angola.class, name = "AO"),
  @JsonSubTypes.Type(value = Country.Antarctica.class, name = "AQ"),
  @JsonSubTypes.Type(value = Country.Argentina.class, name = "AR"),
  @JsonSubTypes.Type(value = Country.AmericanSamoa.class, name = "AS"),
  @JsonSubTypes.Type(value = Country.Austria.class, name = "AT"),
  @JsonSubTypes.Type(value = Country.Australia.class, name = "AU"),
  @JsonSubTypes.Type(value = Country.Aruba.class, name = "AW"),
  @JsonSubTypes.Type(value = Country.Azerbaijan.class, name = "AZ"),
  @JsonSubTypes.Type(value = Country.BosniaAndHerzegovina.class, name = "BA"),
  @JsonSubTypes.Type(value = Country.Barbados.class, name = "BB"),
  @JsonSubTypes.Type(value = Country.Bangladesh.class, name = "BD"),
  @JsonSubTypes.Type(value = Country.Belgium.class, name = "BE"),
  @JsonSubTypes.Type(value = Country.BurkinaFaso.class, name = "BF"),
  @JsonSubTypes.Type(value = Country.Bulgaria.class, name = "BG"),
  @JsonSubTypes.Type(value = Country.Bahrain.class, name = "BH"),
  @JsonSubTypes.Type(value = Country.Burundi.class, name = "BI"),
  @JsonSubTypes.Type(value = Country.Benin.class, name = "BJ"),
  @JsonSubTypes.Type(value = Country.Bermuda.class, name = "BM"),
  @JsonSubTypes.Type(value = Country.BruneiDarussalam.class, name = "BN"),
  @JsonSubTypes.Type(value = Country.Bolivia.class, name = "BO"),
  @JsonSubTypes.Type(value = Country.Bonaire.class, name = "BQ"),
  @JsonSubTypes.Type(value = Country.Brazil.class, name = "BR"),
  @JsonSubTypes.Type(value = Country.Bahamas.class, name = "BS"),
  @JsonSubTypes.Type(value = Country.Bhutan.class, name = "BT"),
  @JsonSubTypes.Type(value = Country.BouvetIsland.class, name = "BV"),
  @JsonSubTypes.Type(value = Country.Botswana.class, name = "BW"),
  @JsonSubTypes.Type(value = Country.Belarus.class, name = "BY"),
  @JsonSubTypes.Type(value = Country.Belize.class, name = "BZ"),
  @JsonSubTypes.Type(value = Country.Canada.class, name = "CA"),
  @JsonSubTypes.Type(value = Country.CocosIslands.class, name = "CC"),
  @JsonSubTypes.Type(value = Country.DRCongo.class, name = "CD"),
  @JsonSubTypes.Type(value = Country.CentralAfricanRepublic.class, name = "CF"),
  @JsonSubTypes.Type(value = Country.PRCongo.class, name = "CG"),
  @JsonSubTypes.Type(value = Country.Switzerland.class, name = "CH"),
  @JsonSubTypes.Type(value = Country.CoteDIvoire.class, name = "CI"),
  @JsonSubTypes.Type(value = Country.CookIslands.class, name = "CK"),
  @JsonSubTypes.Type(value = Country.Chile.class, name = "CL"),
  @JsonSubTypes.Type(value = Country.Cameroon.class, name = "CM"),
  @JsonSubTypes.Type(value = Country.China.class, name = "CN"),
  @JsonSubTypes.Type(value = Country.Colombia.class, name = "CO"),
  @JsonSubTypes.Type(value = Country.CostaRica.class, name = "CR"),
  @JsonSubTypes.Type(value = Country.Cuba.class, name = "CU"),
  @JsonSubTypes.Type(value = Country.CapeVerde.class, name = "CV"),
  @JsonSubTypes.Type(value = Country.ChristmasIsland.class, name = "CX"),
  @JsonSubTypes.Type(value = Country.Cyprus.class, name = "CY"),
  @JsonSubTypes.Type(value = Country.CzechRepublic.class, name = "CZ"),
  @JsonSubTypes.Type(value = Country.Germany.class, name = "DE"),
  @JsonSubTypes.Type(value = Country.Djibouti.class, name = "DJ"),
  @JsonSubTypes.Type(value = Country.Denmark.class, name = "DK"),
  @JsonSubTypes.Type(value = Country.Dominica.class, name = "DM"),
  @JsonSubTypes.Type(value = Country.DominicanRepublic.class, name = "DO"),
  @JsonSubTypes.Type(value = Country.Algeria.class, name = "DZ"),
  @JsonSubTypes.Type(value = Country.Ecuador.class, name = "EC"),
  @JsonSubTypes.Type(value = Country.Estonia.class, name = "EE"),
  @JsonSubTypes.Type(value = Country.Egypt.class, name = "EG"),
  @JsonSubTypes.Type(value = Country.WesternSahara.class, name = "EH"),
  @JsonSubTypes.Type(value = Country.Eritrea.class, name = "ER"),
  @JsonSubTypes.Type(value = Country.Spain.class, name = "ES"),
  @JsonSubTypes.Type(value = Country.Ethiopia.class, name = "ET"),
  @JsonSubTypes.Type(value = Country.Finland.class, name = "FI"),
  @JsonSubTypes.Type(value = Country.Fiji.class, name = "FJ"),
  @JsonSubTypes.Type(value = Country.FalklandIslands.class, name = "FK"),
  @JsonSubTypes.Type(value = Country.Micronesia.class, name = "FM"),
  @JsonSubTypes.Type(value = Country.FaeroeIslands.class, name = "FO"),
  @JsonSubTypes.Type(value = Country.France.class, name = "FR"),
  @JsonSubTypes.Type(value = Country.Gabon.class, name = "GA"),
  @JsonSubTypes.Type(value = Country.UnitedKingdomOfGreatBritainAndNIreland.class, name = "GB"),
  @JsonSubTypes.Type(value = Country.Grenada.class, name = "GD"),
  @JsonSubTypes.Type(value = Country.Georgia.class, name = "GE"),
  @JsonSubTypes.Type(value = Country.FrenchGuiana.class, name = "GF"),
  @JsonSubTypes.Type(value = Country.Guernsey.class, name = "GG"),
  @JsonSubTypes.Type(value = Country.Ghana.class, name = "GH"),
  @JsonSubTypes.Type(value = Country.Gibraltar.class, name = "GI"),
  @JsonSubTypes.Type(value = Country.Greenland.class, name = "GL"),
  @JsonSubTypes.Type(value = Country.Gambia.class, name = "GM"),
  @JsonSubTypes.Type(value = Country.Guinea.class, name = "GN"),
  @JsonSubTypes.Type(value = Country.Guadaloupe.class, name = "GP"),
  @JsonSubTypes.Type(value = Country.EquatorialGuinea.class, name = "GQ"),
  @JsonSubTypes.Type(value = Country.Greece.class, name = "GR"),
  @JsonSubTypes.Type(value = Country.SouthGeorgiaAndTheSouthSandwichIslands.class, name = "GS"),
  @JsonSubTypes.Type(value = Country.Guatemala.class, name = "GT"),
  @JsonSubTypes.Type(value = Country.Guam.class, name = "GU"),
  @JsonSubTypes.Type(value = Country.GuineaBissau.class, name = "GW"),
  @JsonSubTypes.Type(value = Country.Guyana.class, name = "GY"),
  @JsonSubTypes.Type(value = Country.HongKong.class, name = "HK"),
  @JsonSubTypes.Type(value = Country.HeardAndMcDonaldIslands.class, name = "HM"),
  @JsonSubTypes.Type(value = Country.Honduras.class, name = "HN"),
  @JsonSubTypes.Type(value = Country.Hrvatska.class, name = "HR"),
  @JsonSubTypes.Type(value = Country.Haiti.class, name = "HT"),
  @JsonSubTypes.Type(value = Country.Hungary.class, name = "HU"),
  @JsonSubTypes.Type(value = Country.Indonesia.class, name = "ID"),
  @JsonSubTypes.Type(value = Country.Ireland.class, name = "IE"),
  @JsonSubTypes.Type(value = Country.Israel.class, name = "IL"),
  @JsonSubTypes.Type(value = Country.IsleOfMan.class, name = "IM"),
  @JsonSubTypes.Type(value = Country.India.class, name = "IN"),
  @JsonSubTypes.Type(value = Country.BritishIndianOceanTerritory.class, name = "IO"),
  @JsonSubTypes.Type(value = Country.Iraq.class, name = "IQ"),
  @JsonSubTypes.Type(value = Country.Iran.class, name = "IR"),
  @JsonSubTypes.Type(value = Country.Iceland.class, name = "IS"),
  @JsonSubTypes.Type(value = Country.Italy.class, name = "IT"),
  @JsonSubTypes.Type(value = Country.Jersey.class, name = "JE"),
  @JsonSubTypes.Type(value = Country.Jamaica.class, name = "JM"),
  @JsonSubTypes.Type(value = Country.Jordan.class, name = "JO"),
  @JsonSubTypes.Type(value = Country.Japan.class, name = "JP"),
  @JsonSubTypes.Type(value = Country.Kenya.class, name = "KE"),
  @JsonSubTypes.Type(value = Country.KyrgyzRepublic.class, name = "KG"),
  @JsonSubTypes.Type(value = Country.Cambodia.class, name = "KH"),
  @JsonSubTypes.Type(value = Country.Kiribati.class, name = "KI"),
  @JsonSubTypes.Type(value = Country.Comoros.class, name = "KM"),
  @JsonSubTypes.Type(value = Country.StKittsAndNevis.class, name = "KN"),
  @JsonSubTypes.Type(value = Country.NorthKorea.class, name = "KP"),
  @JsonSubTypes.Type(value = Country.SouthKorea.class, name = "KR"),
  @JsonSubTypes.Type(value = Country.Kuwait.class, name = "KW"),
  @JsonSubTypes.Type(value = Country.CaymanIslands.class, name = "KY"),
  @JsonSubTypes.Type(value = Country.Kazakhstan.class, name = "KZ"),
  @JsonSubTypes.Type(value = Country.LaoPeoplesDemocraticRepublic.class, name = "LA"),
  @JsonSubTypes.Type(value = Country.Lebanon.class, name = "LB"),
  @JsonSubTypes.Type(value = Country.StLucia.class, name = "LC"),
  @JsonSubTypes.Type(value = Country.Liechtenstein.class, name = "LI"),
  @JsonSubTypes.Type(value = Country.SriLanka.class, name = "LK"),
  @JsonSubTypes.Type(value = Country.Liberia.class, name = "LR"),
  @JsonSubTypes.Type(value = Country.Lesotho.class, name = "LS"),
  @JsonSubTypes.Type(value = Country.Lithuania.class, name = "LT"),
  @JsonSubTypes.Type(value = Country.Luxembourg.class, name = "LU"),
  @JsonSubTypes.Type(value = Country.Latvia.class, name = "LV"),
  @JsonSubTypes.Type(value = Country.Libya.class, name = "LY"),
  @JsonSubTypes.Type(value = Country.Morocco.class, name = "MA"),
  @JsonSubTypes.Type(value = Country.Monaco.class, name = "MC"),
  @JsonSubTypes.Type(value = Country.Moldova.class, name = "MD"),
  @JsonSubTypes.Type(value = Country.Montenegro.class, name = "ME"),
  @JsonSubTypes.Type(value = Country.SaintMartin.class, name = "MF"),
  @JsonSubTypes.Type(value = Country.Madagascar.class, name = "MG"),
  @JsonSubTypes.Type(value = Country.MarshallIslands.class, name = "MH"),
  @JsonSubTypes.Type(value = Country.Macedonia.class, name = "MK"),
  @JsonSubTypes.Type(value = Country.Mali.class, name = "ML"),
  @JsonSubTypes.Type(value = Country.Myanmar.class, name = "MM"),
  @JsonSubTypes.Type(value = Country.Mongolia.class, name = "MN"),
  @JsonSubTypes.Type(value = Country.Macao.class, name = "MO"),
  @JsonSubTypes.Type(value = Country.NorthernMarianaIslands.class, name = "MP"),
  @JsonSubTypes.Type(value = Country.Martinique.class, name = "MQ"),
  @JsonSubTypes.Type(value = Country.Mauritania.class, name = "MR"),
  @JsonSubTypes.Type(value = Country.Montserrat.class, name = "MS"),
  @JsonSubTypes.Type(value = Country.Malta.class, name = "MT"),
  @JsonSubTypes.Type(value = Country.Mauritius.class, name = "MU"),
  @JsonSubTypes.Type(value = Country.Maldives.class, name = "MV"),
  @JsonSubTypes.Type(value = Country.Malawi.class, name = "MW"),
  @JsonSubTypes.Type(value = Country.Mexico.class, name = "MX"),
  @JsonSubTypes.Type(value = Country.Malaysia.class, name = "MY"),
  @JsonSubTypes.Type(value = Country.Mozambique.class, name = "MZ"),
  @JsonSubTypes.Type(value = Country.Namibia.class, name = "NA"),
  @JsonSubTypes.Type(value = Country.NewCaledonia.class, name = "NC"),
  @JsonSubTypes.Type(value = Country.Niger.class, name = "NE"),
  @JsonSubTypes.Type(value = Country.NorfolkIsland.class, name = "NF"),
  @JsonSubTypes.Type(value = Country.Nigeria.class, name = "NG"),
  @JsonSubTypes.Type(value = Country.Nicaragua.class, name = "NI"),
  @JsonSubTypes.Type(value = Country.Netherlands.class, name = "NL"),
  @JsonSubTypes.Type(value = Country.Norway.class, name = "NO"),
  @JsonSubTypes.Type(value = Country.Nepal.class, name = "NP"),
  @JsonSubTypes.Type(value = Country.Nauru.class, name = "NR"),
  @JsonSubTypes.Type(value = Country.Niue.class, name = "NU"),
  @JsonSubTypes.Type(value = Country.NewZealand.class, name = "NZ"),
  @JsonSubTypes.Type(value = Country.Oman.class, name = "OM"),
  @JsonSubTypes.Type(value = Country.Panama.class, name = "PA"),
  @JsonSubTypes.Type(value = Country.Peru.class, name = "PE"),
  @JsonSubTypes.Type(value = Country.FrenchPolynesia.class, name = "PF"),
  @JsonSubTypes.Type(value = Country.PapuaNewGuinea.class, name = "PG"),
  @JsonSubTypes.Type(value = Country.Philippines.class, name = "PH"),
  @JsonSubTypes.Type(value = Country.Pakistan.class, name = "PK"),
  @JsonSubTypes.Type(value = Country.Poland.class, name = "PL"),
  @JsonSubTypes.Type(value = Country.StPierreAndMiquelon.class, name = "PM"),
  @JsonSubTypes.Type(value = Country.PitcairnIsland.class, name = "PN"),
  @JsonSubTypes.Type(value = Country.PuertoRico.class, name = "PR"),
  @JsonSubTypes.Type(value = Country.Palestine.class, name = "PS"),
  @JsonSubTypes.Type(value = Country.Portugal.class, name = "PT"),
  @JsonSubTypes.Type(value = Country.Palau.class, name = "PW"),
  @JsonSubTypes.Type(value = Country.Paraguay.class, name = "PY"),
  @JsonSubTypes.Type(value = Country.Qatar.class, name = "QA"),
  @JsonSubTypes.Type(value = Country.Reunion.class, name = "RE"),
  @JsonSubTypes.Type(value = Country.Romania.class, name = "RO"),
  @JsonSubTypes.Type(value = Country.Serbia.class, name = "RS"),
  @JsonSubTypes.Type(value = Country.RussianFederation.class, name = "RU"),
  @JsonSubTypes.Type(value = Country.Rwanda.class, name = "RW"),
  @JsonSubTypes.Type(value = Country.SaudiArabia.class, name = "SA"),
  @JsonSubTypes.Type(value = Country.SolomonIslands.class, name = "SB"),
  @JsonSubTypes.Type(value = Country.Seychelles.class, name = "SC"),
  @JsonSubTypes.Type(value = Country.Sudan.class, name = "SD"),
  @JsonSubTypes.Type(value = Country.Sweden.class, name = "SE"),
  @JsonSubTypes.Type(value = Country.Singapore.class, name = "SG"),
  @JsonSubTypes.Type(value = Country.SaintHelena.class, name = "SH"),
  @JsonSubTypes.Type(value = Country.Slovenia.class, name = "SI"),
  @JsonSubTypes.Type(value = Country.SvalbardAndJanMayenIslands.class, name = "SJ"),
  @JsonSubTypes.Type(value = Country.Slovakia.class, name = "SK"),
  @JsonSubTypes.Type(value = Country.SierraLeone.class, name = "SL"),
  @JsonSubTypes.Type(value = Country.SanMarino.class, name = "SM"),
  @JsonSubTypes.Type(value = Country.Senegal.class, name = "SN"),
  @JsonSubTypes.Type(value = Country.Somalia.class, name = "SO"),
  @JsonSubTypes.Type(value = Country.Suriname.class, name = "SR"),
  @JsonSubTypes.Type(value = Country.SouthSudan.class, name = "SS"),
  @JsonSubTypes.Type(value = Country.SaoTomeAndPrincipe.class, name = "ST"),
  @JsonSubTypes.Type(value = Country.ElSalvador.class, name = "SV"),
  @JsonSubTypes.Type(value = Country.SintMaarten.class, name = "SX"),
  @JsonSubTypes.Type(value = Country.SyrianArabRepublic.class, name = "SY"),
  @JsonSubTypes.Type(value = Country.Swaziland.class, name = "SZ"),
  @JsonSubTypes.Type(value = Country.TurksAndCaicosIslands.class, name = "TC"),
  @JsonSubTypes.Type(value = Country.Chad.class, name = "TD"),
  @JsonSubTypes.Type(value = Country.FrenchSouthernTerritories.class, name = "TF"),
  @JsonSubTypes.Type(value = Country.Togo.class, name = "TG"),
  @JsonSubTypes.Type(value = Country.Thailand.class, name = "TH"),
  @JsonSubTypes.Type(value = Country.Tajikistan.class, name = "TJ"),
  @JsonSubTypes.Type(value = Country.Tokelau.class, name = "TK"),
  @JsonSubTypes.Type(value = Country.TimorLeste.class, name = "TL"),
  @JsonSubTypes.Type(value = Country.Turkmenistan.class, name = "TM"),
  @JsonSubTypes.Type(value = Country.Tunisia.class, name = "TN"),
  @JsonSubTypes.Type(value = Country.Tonga.class, name = "TO"),
  @JsonSubTypes.Type(value = Country.Turkey.class, name = "TR"),
  @JsonSubTypes.Type(value = Country.TrinidadAndTobago.class, name = "TT"),
  @JsonSubTypes.Type(value = Country.Tuvalu.class, name = "TV"),
  @JsonSubTypes.Type(value = Country.Taiwan.class, name = "TW"),
  @JsonSubTypes.Type(value = Country.Tanzania.class, name = "TZ"),
  @JsonSubTypes.Type(value = Country.Ukraine.class, name = "UA"),
  @JsonSubTypes.Type(value = Country.Uganda.class, name = "UG"),
  @JsonSubTypes.Type(value = Country.UnitedStatesMinorOutlyingIslands.class, name = "UM"),
  @JsonSubTypes.Type(value = Country.UnitedStatesOfAmerica.class, name = "US"),
  @JsonSubTypes.Type(value = Country.Uruguay.class, name = "UY"),
  @JsonSubTypes.Type(value = Country.Uzbekistan.class, name = "UZ"),
  @JsonSubTypes.Type(value = Country.HolySee.class, name = "VA"),
  @JsonSubTypes.Type(value = Country.StVincentAndTheGrenadines.class, name = "VC"),
  @JsonSubTypes.Type(value = Country.Venezuela.class, name = "VE"),
  @JsonSubTypes.Type(value = Country.BritishVirginIslands.class, name = "VG"),
  @JsonSubTypes.Type(value = Country.USVirginIslands.class, name = "VI"),
  @JsonSubTypes.Type(value = Country.VietNam.class, name = "VN"),
  @JsonSubTypes.Type(value = Country.Vanuatu.class, name = "VU"),
  @JsonSubTypes.Type(value = Country.WallisAndFutunaIslands.class, name = "WF"),
  @JsonSubTypes.Type(value = Country.Samoa.class, name = "WS"),
  @JsonSubTypes.Type(value = Country.Yemen.class, name = "YE"),
  @JsonSubTypes.Type(value = Country.Mayotte.class, name = "YT"),
  @JsonSubTypes.Type(value = Country.SouthAfrica.class, name = "ZA"),
  @JsonSubTypes.Type(value = Country.Zambia.class, name = "ZM"),
  @JsonSubTypes.Type(value = Country.Zimbabwe.class, name = "ZW"),
})  
public sealed interface Country extends AdministrativeArea permits Country.Andorra, Country.UnitedArabEmirates, Country.Afghanistan, Country.AntiguaAndBarbuda, Country.Anguilla, Country.Albania, Country.Armenia, Country.Angola, Country.Antarctica, Country.Argentina, Country.AmericanSamoa, Country.Austria, Country.Australia, Country.Aruba, Country.Azerbaijan, Country.BosniaAndHerzegovina, Country.Barbados, Country.Bangladesh, Country.Belgium, Country.BurkinaFaso, Country.Bulgaria, Country.Bahrain, Country.Burundi, Country.Benin, Country.Bermuda, Country.BruneiDarussalam, Country.Bolivia, Country.Bonaire, Country.Brazil, Country.Bahamas, Country.Bhutan, Country.BouvetIsland, Country.Botswana, Country.Belarus, Country.Belize, Country.Canada, Country.CocosIslands, Country.DRCongo, Country.CentralAfricanRepublic, Country.PRCongo, Country.Switzerland, Country.CoteDIvoire, Country.CookIslands, Country.Chile, Country.Cameroon, Country.China, Country.Colombia, Country.CostaRica, Country.Cuba, Country.CapeVerde, Country.ChristmasIsland, Country.Cyprus, Country.CzechRepublic, Country.Germany, Country.Djibouti, Country.Denmark, Country.Dominica, Country.DominicanRepublic, Country.Algeria, Country.Ecuador, Country.Estonia, Country.Egypt, Country.WesternSahara, Country.Eritrea, Country.Spain, Country.Ethiopia, Country.Finland, Country.Fiji, Country.FalklandIslands, Country.Micronesia, Country.FaeroeIslands, Country.France, Country.Gabon, Country.UnitedKingdomOfGreatBritainAndNIreland, Country.Grenada, Country.Georgia, Country.FrenchGuiana, Country.Guernsey, Country.Ghana, Country.Gibraltar, Country.Greenland, Country.Gambia, Country.Guinea, Country.Guadaloupe, Country.EquatorialGuinea, Country.Greece, Country.SouthGeorgiaAndTheSouthSandwichIslands, Country.Guatemala, Country.Guam, Country.GuineaBissau, Country.Guyana, Country.HongKong, Country.HeardAndMcDonaldIslands, Country.Honduras, Country.Hrvatska, Country.Haiti, Country.Hungary, Country.Indonesia, Country.Ireland, Country.Israel, Country.IsleOfMan, Country.India, Country.BritishIndianOceanTerritory, Country.Iraq, Country.Iran, Country.Iceland, Country.Italy, Country.Jersey, Country.Jamaica, Country.Jordan, Country.Japan, Country.Kenya, Country.KyrgyzRepublic, Country.Cambodia, Country.Kiribati, Country.Comoros, Country.StKittsAndNevis, Country.NorthKorea, Country.SouthKorea, Country.Kuwait, Country.CaymanIslands, Country.Kazakhstan, Country.LaoPeoplesDemocraticRepublic, Country.Lebanon, Country.StLucia, Country.Liechtenstein, Country.SriLanka, Country.Liberia, Country.Lesotho, Country.Lithuania, Country.Luxembourg, Country.Latvia, Country.Libya, Country.Morocco, Country.Monaco, Country.Moldova, Country.Montenegro, Country.SaintMartin, Country.Madagascar, Country.MarshallIslands, Country.Macedonia, Country.Mali, Country.Myanmar, Country.Mongolia, Country.Macao, Country.NorthernMarianaIslands, Country.Martinique, Country.Mauritania, Country.Montserrat, Country.Malta, Country.Mauritius, Country.Maldives, Country.Malawi, Country.Mexico, Country.Malaysia, Country.Mozambique, Country.Namibia, Country.NewCaledonia, Country.Niger, Country.NorfolkIsland, Country.Nigeria, Country.Nicaragua, Country.Netherlands, Country.Norway, Country.Nepal, Country.Nauru, Country.Niue, Country.NewZealand, Country.Oman, Country.Panama, Country.Peru, Country.FrenchPolynesia, Country.PapuaNewGuinea, Country.Philippines, Country.Pakistan, Country.Poland, Country.StPierreAndMiquelon, Country.PitcairnIsland, Country.PuertoRico, Country.Palestine, Country.Portugal, Country.Palau, Country.Paraguay, Country.Qatar, Country.Reunion, Country.Romania, Country.Serbia, Country.RussianFederation, Country.Rwanda, Country.SaudiArabia, Country.SolomonIslands, Country.Seychelles, Country.Sudan, Country.Sweden, Country.Singapore, Country.SaintHelena, Country.Slovenia, Country.SvalbardAndJanMayenIslands, Country.Slovakia, Country.SierraLeone, Country.SanMarino, Country.Senegal, Country.Somalia, Country.Suriname, Country.SouthSudan, Country.SaoTomeAndPrincipe, Country.ElSalvador, Country.SintMaarten, Country.SyrianArabRepublic, Country.Swaziland, Country.TurksAndCaicosIslands, Country.Chad, Country.FrenchSouthernTerritories, Country.Togo, Country.Thailand, Country.Tajikistan, Country.Tokelau, Country.TimorLeste, Country.Turkmenistan, Country.Tunisia, Country.Tonga, Country.Turkey, Country.TrinidadAndTobago, Country.Tuvalu, Country.Taiwan, Country.Tanzania, Country.Ukraine, Country.Uganda, Country.UnitedStatesMinorOutlyingIslands, Country.UnitedStatesOfAmerica, Country.Uruguay, Country.Uzbekistan, Country.HolySee, Country.StVincentAndTheGrenadines, Country.Venezuela, Country.BritishVirginIslands, Country.USVirginIslands, Country.VietNam, Country.Vanuatu, Country.WallisAndFutunaIslands, Country.Samoa, Country.Yemen, Country.Mayotte, Country.SouthAfrica, Country.Zambia, Country.Zimbabwe {
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

  
  record Andorra(String name, String code) implements Country {
    public Andorra {
      name = "Andorra";
      code = "AD";
    }
  } 
  record UnitedArabEmirates(String name, String code) implements Country {
    public UnitedArabEmirates {
      name = "United Arab Emirates";
      code = "AE";
    }
  } 
  record Afghanistan(String name, String code) implements Country {
    public Afghanistan {
      name = "Afghanistan";
      code = "AF";
    }
  } 
  record AntiguaAndBarbuda(String name, String code) implements Country {
    public AntiguaAndBarbuda {
      name = "Antigua and Barbuda";
      code = "AG";
    }
  } 
  record Anguilla(String name, String code) implements Country {
    public Anguilla {
      name = "Anguilla";
      code = "AI";
    }
  } 
  record Albania(String name, String code) implements Country {
    public Albania {
      name = "Albania";
      code = "AL";
    }
  } 
  record Armenia(String name, String code) implements Country {
    public Armenia {
      name = "Armenia";
      code = "AM";
    }
  } 
  record Angola(String name, String code) implements Country {
    public Angola {
      name = "Angola";
      code = "AO";
    }
  } 
  record Antarctica(String name, String code) implements Country {
    public Antarctica {
      name = "Antarctica";
      code = "AQ";
    }
  } 
  record Argentina(String name, String code) implements Country {
    public Argentina {
      name = "Argentina";
      code = "AR";
    }
  } 
  record AmericanSamoa(String name, String code) implements Country {
    public AmericanSamoa {
      name = "American Samoa";
      code = "AS";
    }
  } 
  record Austria(String name, String code) implements Country {
    public Austria {
      name = "Austria";
      code = "AT";
    }
  } 
  record Australia(String name, String code) implements Country {
    public Australia {
      name = "Australia";
      code = "AU";
    }
  } 
  record Aruba(String name, String code) implements Country {
    public Aruba {
      name = "Aruba";
      code = "AW";
    }
  } 
  record Azerbaijan(String name, String code) implements Country {
    public Azerbaijan {
      name = "Azerbaijan";
      code = "AZ";
    }
  } 
  record BosniaAndHerzegovina(String name, String code) implements Country {
    public BosniaAndHerzegovina {
      name = "Bosnia and Herzegovina";
      code = "BA";
    }
  } 
  record Barbados(String name, String code) implements Country {
    public Barbados {
      name = "Barbados";
      code = "BB";
    }
  } 
  record Bangladesh(String name, String code) implements Country {
    public Bangladesh {
      name = "Bangladesh";
      code = "BD";
    }
  } 
  record Belgium(String name, String code) implements Country {
    public Belgium {
      name = "Belgium";
      code = "BE";
    }
  } 
  record BurkinaFaso(String name, String code) implements Country {
    public BurkinaFaso {
      name = "Burkina Faso";
      code = "BF";
    }
  } 
  record Bulgaria(String name, String code) implements Country {
    public Bulgaria {
      name = "Bulgaria";
      code = "BG";
    }
  } 
  record Bahrain(String name, String code) implements Country {
    public Bahrain {
      name = "Bahrain";
      code = "BH";
    }
  } 
  record Burundi(String name, String code) implements Country {
    public Burundi {
      name = "Burundi";
      code = "BI";
    }
  } 
  record Benin(String name, String code) implements Country {
    public Benin {
      name = "Benin";
      code = "BJ";
    }
  } 
  record Bermuda(String name, String code) implements Country {
    public Bermuda {
      name = "Bermuda";
      code = "BM";
    }
  } 
  record BruneiDarussalam(String name, String code) implements Country {
    public BruneiDarussalam {
      name = "Brunei Darussalam";
      code = "BN";
    }
  } 
  record Bolivia(String name, String code) implements Country {
    public Bolivia {
      name = "Bolivia";
      code = "BO";
    }
  } 
  record Bonaire(String name, String code) implements Country {
    public Bonaire {
      name = "Bonaire";
      code = "BQ";
    }
  } 
  record Brazil(String name, String code) implements Country {
    public Brazil {
      name = "Brazil";
      code = "BR";
    }
  } 
  record Bahamas(String name, String code) implements Country {
    public Bahamas {
      name = "Bahamas";
      code = "BS";
    }
  } 
  record Bhutan(String name, String code) implements Country {
    public Bhutan {
      name = "Bhutan";
      code = "BT";
    }
  } 
  record BouvetIsland(String name, String code) implements Country {
    public BouvetIsland {
      name = "Bouvet Island";
      code = "BV";
    }
  } 
  record Botswana(String name, String code) implements Country {
    public Botswana {
      name = "Botswana";
      code = "BW";
    }
  } 
  record Belarus(String name, String code) implements Country {
    public Belarus {
      name = "Belarus";
      code = "BY";
    }
  } 
  record Belize(String name, String code) implements Country {
    public Belize {
      name = "Belize";
      code = "BZ";
    }
  } 
  record Canada(String name, String code) implements Country {
    public Canada {
      name = "Canada";
      code = "CA";
    }
  } 
  record CocosIslands(String name, String code) implements Country {
    public CocosIslands {
      name = "Cocos Islands";
      code = "CC";
    }
  } 
  record DRCongo(String name, String code) implements Country {
    public DRCongo {
      name = "DR Congo";
      code = "CD";
    }
  } 
  record CentralAfricanRepublic(String name, String code) implements Country {
    public CentralAfricanRepublic {
      name = "Central African Republic";
      code = "CF";
    }
  } 
  record PRCongo(String name, String code) implements Country {
    public PRCongo {
      name = "PR Congo";
      code = "CG";
    }
  } 
  record Switzerland(String name, String code) implements Country {
    public Switzerland {
      name = "Switzerland";
      code = "CH";
    }
  } 
  record CoteDIvoire(String name, String code) implements Country {
    public CoteDIvoire {
      name = "Cote DIvoire";
      code = "CI";
    }
  } 
  record CookIslands(String name, String code) implements Country {
    public CookIslands {
      name = "Cook Islands";
      code = "CK";
    }
  } 
  record Chile(String name, String code) implements Country {
    public Chile {
      name = "Chile";
      code = "CL";
    }
  } 
  record Cameroon(String name, String code) implements Country {
    public Cameroon {
      name = "Cameroon";
      code = "CM";
    }
  } 
  record China(String name, String code) implements Country {
    public China {
      name = "China";
      code = "CN";
    }
  } 
  record Colombia(String name, String code) implements Country {
    public Colombia {
      name = "Colombia";
      code = "CO";
    }
  } 
  record CostaRica(String name, String code) implements Country {
    public CostaRica {
      name = "Costa Rica";
      code = "CR";
    }
  } 
  record Cuba(String name, String code) implements Country {
    public Cuba {
      name = "Cuba";
      code = "CU";
    }
  } 
  record CapeVerde(String name, String code) implements Country {
    public CapeVerde {
      name = "Cape Verde";
      code = "CV";
    }
  } 
  record ChristmasIsland(String name, String code) implements Country {
    public ChristmasIsland {
      name = "Christmas Island";
      code = "CX";
    }
  } 
  record Cyprus(String name, String code) implements Country {
    public Cyprus {
      name = "Cyprus";
      code = "CY";
    }
  } 
  record CzechRepublic(String name, String code) implements Country {
    public CzechRepublic {
      name = "Czech Republic";
      code = "CZ";
    }
  } 
  record Germany(String name, String code) implements Country {
    public Germany {
      name = "Germany";
      code = "DE";
    }
  } 
  record Djibouti(String name, String code) implements Country {
    public Djibouti {
      name = "Djibouti";
      code = "DJ";
    }
  } 
  record Denmark(String name, String code) implements Country {
    public Denmark {
      name = "Denmark";
      code = "DK";
    }
  } 
  record Dominica(String name, String code) implements Country {
    public Dominica {
      name = "Dominica";
      code = "DM";
    }
  } 
  record DominicanRepublic(String name, String code) implements Country {
    public DominicanRepublic {
      name = "Dominican Republic";
      code = "DO";
    }
  } 
  record Algeria(String name, String code) implements Country {
    public Algeria {
      name = "Algeria";
      code = "DZ";
    }
  } 
  record Ecuador(String name, String code) implements Country {
    public Ecuador {
      name = "Ecuador";
      code = "EC";
    }
  } 
  record Estonia(String name, String code) implements Country {
    public Estonia {
      name = "Estonia";
      code = "EE";
    }
  } 
  record Egypt(String name, String code) implements Country {
    public Egypt {
      name = "Egypt";
      code = "EG";
    }
  } 
  record WesternSahara(String name, String code) implements Country {
    public WesternSahara {
      name = "Western Sahara";
      code = "EH";
    }
  } 
  record Eritrea(String name, String code) implements Country {
    public Eritrea {
      name = "Eritrea";
      code = "ER";
    }
  } 
  record Spain(String name, String code) implements Country {
    public Spain {
      name = "Spain";
      code = "ES";
    }
  } 
  record Ethiopia(String name, String code) implements Country {
    public Ethiopia {
      name = "Ethiopia";
      code = "ET";
    }
  } 
  record Finland(String name, String code) implements Country {
    public Finland {
      name = "Finland";
      code = "FI";
    }
  } 
  record Fiji(String name, String code) implements Country {
    public Fiji {
      name = "Fiji";
      code = "FJ";
    }
  } 
  record FalklandIslands(String name, String code) implements Country {
    public FalklandIslands {
      name = "Falkland Islands";
      code = "FK";
    }
  } 
  record Micronesia(String name, String code) implements Country {
    public Micronesia {
      name = "Micronesia";
      code = "FM";
    }
  } 
  record FaeroeIslands(String name, String code) implements Country {
    public FaeroeIslands {
      name = "Faeroe Islands";
      code = "FO";
    }
  } 
  record France(String name, String code) implements Country {
    public France {
      name = "France";
      code = "FR";
    }
  } 
  record Gabon(String name, String code) implements Country {
    public Gabon {
      name = "Gabon";
      code = "GA";
    }
  } 
  record UnitedKingdomOfGreatBritainAndNIreland(String name, String code) implements Country {
    public UnitedKingdomOfGreatBritainAndNIreland {
      name = "United Kingdom of Great Britain And N Ireland";
      code = "GB";
    }
  } 
  record Grenada(String name, String code) implements Country {
    public Grenada {
      name = "Grenada";
      code = "GD";
    }
  } 
  record Georgia(String name, String code) implements Country {
    public Georgia {
      name = "Georgia";
      code = "GE";
    }
  } 
  record FrenchGuiana(String name, String code) implements Country {
    public FrenchGuiana {
      name = "French Guiana";
      code = "GF";
    }
  } 
  record Guernsey(String name, String code) implements Country {
    public Guernsey {
      name = "Guernsey";
      code = "GG";
    }
  } 
  record Ghana(String name, String code) implements Country {
    public Ghana {
      name = "Ghana";
      code = "GH";
    }
  } 
  record Gibraltar(String name, String code) implements Country {
    public Gibraltar {
      name = "Gibraltar";
      code = "GI";
    }
  } 
  record Greenland(String name, String code) implements Country {
    public Greenland {
      name = "Greenland";
      code = "GL";
    }
  } 
  record Gambia(String name, String code) implements Country {
    public Gambia {
      name = "Gambia";
      code = "GM";
    }
  } 
  record Guinea(String name, String code) implements Country {
    public Guinea {
      name = "Guinea";
      code = "GN";
    }
  } 
  record Guadaloupe(String name, String code) implements Country {
    public Guadaloupe {
      name = "Guadaloupe";
      code = "GP";
    }
  } 
  record EquatorialGuinea(String name, String code) implements Country {
    public EquatorialGuinea {
      name = "Equatorial Guinea";
      code = "GQ";
    }
  } 
  record Greece(String name, String code) implements Country {
    public Greece {
      name = "Greece";
      code = "GR";
    }
  } 
  record SouthGeorgiaAndTheSouthSandwichIslands(String name, String code) implements Country {
    public SouthGeorgiaAndTheSouthSandwichIslands {
      name = "South Georgia and the South Sandwich Islands";
      code = "GS";
    }
  } 
  record Guatemala(String name, String code) implements Country {
    public Guatemala {
      name = "Guatemala";
      code = "GT";
    }
  } 
  record Guam(String name, String code) implements Country {
    public Guam {
      name = "Guam";
      code = "GU";
    }
  } 
  record GuineaBissau(String name, String code) implements Country {
    public GuineaBissau {
      name = "GuineaBissau";
      code = "GW";
    }
  } 
  record Guyana(String name, String code) implements Country {
    public Guyana {
      name = "Guyana";
      code = "GY";
    }
  } 
  record HongKong(String name, String code) implements Country {
    public HongKong {
      name = "Hong Kong";
      code = "HK";
    }
  } 
  record HeardAndMcDonaldIslands(String name, String code) implements Country {
    public HeardAndMcDonaldIslands {
      name = "Heard and McDonald Islands";
      code = "HM";
    }
  } 
  record Honduras(String name, String code) implements Country {
    public Honduras {
      name = "Honduras";
      code = "HN";
    }
  } 
  record Hrvatska(String name, String code) implements Country {
    public Hrvatska {
      name = "Hrvatska";
      code = "HR";
    }
  } 
  record Haiti(String name, String code) implements Country {
    public Haiti {
      name = "Haiti";
      code = "HT";
    }
  } 
  record Hungary(String name, String code) implements Country {
    public Hungary {
      name = "Hungary";
      code = "HU";
    }
  } 
  record Indonesia(String name, String code) implements Country {
    public Indonesia {
      name = "Indonesia";
      code = "ID";
    }
  } 
  record Ireland(String name, String code) implements Country {
    public Ireland {
      name = "Ireland";
      code = "IE";
    }
  } 
  record Israel(String name, String code) implements Country {
    public Israel {
      name = "Israel";
      code = "IL";
    }
  } 
  record IsleOfMan(String name, String code) implements Country {
    public IsleOfMan {
      name = "Isle of Man";
      code = "IM";
    }
  } 
  record India(String name, String code) implements Country {
    public India {
      name = "India";
      code = "IN";
    }
  } 
  record BritishIndianOceanTerritory(String name, String code) implements Country {
    public BritishIndianOceanTerritory {
      name = "British Indian Ocean Territory";
      code = "IO";
    }
  } 
  record Iraq(String name, String code) implements Country {
    public Iraq {
      name = "Iraq";
      code = "IQ";
    }
  } 
  record Iran(String name, String code) implements Country {
    public Iran {
      name = "Iran";
      code = "IR";
    }
  } 
  record Iceland(String name, String code) implements Country {
    public Iceland {
      name = "Iceland";
      code = "IS";
    }
  } 
  record Italy(String name, String code) implements Country {
    public Italy {
      name = "Italy";
      code = "IT";
    }
  } 
  record Jersey(String name, String code) implements Country {
    public Jersey {
      name = "Jersey";
      code = "JE";
    }
  } 
  record Jamaica(String name, String code) implements Country {
    public Jamaica {
      name = "Jamaica";
      code = "JM";
    }
  } 
  record Jordan(String name, String code) implements Country {
    public Jordan {
      name = "Jordan";
      code = "JO";
    }
  } 
  record Japan(String name, String code) implements Country {
    public Japan {
      name = "Japan";
      code = "JP";
    }
  } 
  record Kenya(String name, String code) implements Country {
    public Kenya {
      name = "Kenya";
      code = "KE";
    }
  } 
  record KyrgyzRepublic(String name, String code) implements Country {
    public KyrgyzRepublic {
      name = "Kyrgyz Republic";
      code = "KG";
    }
  } 
  record Cambodia(String name, String code) implements Country {
    public Cambodia {
      name = "Cambodia";
      code = "KH";
    }
  } 
  record Kiribati(String name, String code) implements Country {
    public Kiribati {
      name = "Kiribati";
      code = "KI";
    }
  } 
  record Comoros(String name, String code) implements Country {
    public Comoros {
      name = "Comoros";
      code = "KM";
    }
  } 
  record StKittsAndNevis(String name, String code) implements Country {
    public StKittsAndNevis {
      name = "St Kitts and Nevis";
      code = "KN";
    }
  } 
  record NorthKorea(String name, String code) implements Country {
    public NorthKorea {
      name = "North Korea";
      code = "KP";
    }
  } 
  record SouthKorea(String name, String code) implements Country {
    public SouthKorea {
      name = "South Korea";
      code = "KR";
    }
  } 
  record Kuwait(String name, String code) implements Country {
    public Kuwait {
      name = "Kuwait";
      code = "KW";
    }
  } 
  record CaymanIslands(String name, String code) implements Country {
    public CaymanIslands {
      name = "Cayman Islands";
      code = "KY";
    }
  } 
  record Kazakhstan(String name, String code) implements Country {
    public Kazakhstan {
      name = "Kazakhstan";
      code = "KZ";
    }
  } 
  record LaoPeoplesDemocraticRepublic(String name, String code) implements Country {
    public LaoPeoplesDemocraticRepublic {
      name = "Lao Peoples Democratic Republic";
      code = "LA";
    }
  } 
  record Lebanon(String name, String code) implements Country {
    public Lebanon {
      name = "Lebanon";
      code = "LB";
    }
  } 
  record StLucia(String name, String code) implements Country {
    public StLucia {
      name = "St Lucia";
      code = "LC";
    }
  } 
  record Liechtenstein(String name, String code) implements Country {
    public Liechtenstein {
      name = "Liechtenstein";
      code = "LI";
    }
  } 
  record SriLanka(String name, String code) implements Country {
    public SriLanka {
      name = "Sri Lanka";
      code = "LK";
    }
  } 
  record Liberia(String name, String code) implements Country {
    public Liberia {
      name = "Liberia";
      code = "LR";
    }
  } 
  record Lesotho(String name, String code) implements Country {
    public Lesotho {
      name = "Lesotho";
      code = "LS";
    }
  } 
  record Lithuania(String name, String code) implements Country {
    public Lithuania {
      name = "Lithuania";
      code = "LT";
    }
  } 
  record Luxembourg(String name, String code) implements Country {
    public Luxembourg {
      name = "Luxembourg";
      code = "LU";
    }
  } 
  record Latvia(String name, String code) implements Country {
    public Latvia {
      name = "Latvia";
      code = "LV";
    }
  } 
  record Libya(String name, String code) implements Country {
    public Libya {
      name = "Libya";
      code = "LY";
    }
  } 
  record Morocco(String name, String code) implements Country {
    public Morocco {
      name = "Morocco";
      code = "MA";
    }
  } 
  record Monaco(String name, String code) implements Country {
    public Monaco {
      name = "Monaco";
      code = "MC";
    }
  } 
  record Moldova(String name, String code) implements Country {
    public Moldova {
      name = "Moldova";
      code = "MD";
    }
  } 
  record Montenegro(String name, String code) implements Country {
    public Montenegro {
      name = "Montenegro";
      code = "ME";
    }
  } 
  record SaintMartin(String name, String code) implements Country {
    public SaintMartin {
      name = "Saint Martin";
      code = "MF";
    }
  } 
  record Madagascar(String name, String code) implements Country {
    public Madagascar {
      name = "Madagascar";
      code = "MG";
    }
  } 
  record MarshallIslands(String name, String code) implements Country {
    public MarshallIslands {
      name = "Marshall Islands";
      code = "MH";
    }
  } 
  record Macedonia(String name, String code) implements Country {
    public Macedonia {
      name = "Macedonia";
      code = "MK";
    }
  } 
  record Mali(String name, String code) implements Country {
    public Mali {
      name = "Mali";
      code = "ML";
    }
  } 
  record Myanmar(String name, String code) implements Country {
    public Myanmar {
      name = "Myanmar";
      code = "MM";
    }
  } 
  record Mongolia(String name, String code) implements Country {
    public Mongolia {
      name = "Mongolia";
      code = "MN";
    }
  } 
  record Macao(String name, String code) implements Country {
    public Macao {
      name = "Macao";
      code = "MO";
    }
  } 
  record NorthernMarianaIslands(String name, String code) implements Country {
    public NorthernMarianaIslands {
      name = "Northern Mariana Islands";
      code = "MP";
    }
  } 
  record Martinique(String name, String code) implements Country {
    public Martinique {
      name = "Martinique";
      code = "MQ";
    }
  } 
  record Mauritania(String name, String code) implements Country {
    public Mauritania {
      name = "Mauritania";
      code = "MR";
    }
  } 
  record Montserrat(String name, String code) implements Country {
    public Montserrat {
      name = "Montserrat";
      code = "MS";
    }
  } 
  record Malta(String name, String code) implements Country {
    public Malta {
      name = "Malta";
      code = "MT";
    }
  } 
  record Mauritius(String name, String code) implements Country {
    public Mauritius {
      name = "Mauritius";
      code = "MU";
    }
  } 
  record Maldives(String name, String code) implements Country {
    public Maldives {
      name = "Maldives";
      code = "MV";
    }
  } 
  record Malawi(String name, String code) implements Country {
    public Malawi {
      name = "Malawi";
      code = "MW";
    }
  } 
  record Mexico(String name, String code) implements Country {
    public Mexico {
      name = "Mexico";
      code = "MX";
    }
  } 
  record Malaysia(String name, String code) implements Country {
    public Malaysia {
      name = "Malaysia";
      code = "MY";
    }
  } 
  record Mozambique(String name, String code) implements Country {
    public Mozambique {
      name = "Mozambique";
      code = "MZ";
    }
  } 
  record Namibia(String name, String code) implements Country {
    public Namibia {
      name = "Namibia";
      code = "NA";
    }
  } 
  record NewCaledonia(String name, String code) implements Country {
    public NewCaledonia {
      name = "New Caledonia";
      code = "NC";
    }
  } 
  record Niger(String name, String code) implements Country {
    public Niger {
      name = "Niger";
      code = "NE";
    }
  } 
  record NorfolkIsland(String name, String code) implements Country {
    public NorfolkIsland {
      name = "Norfolk Island";
      code = "NF";
    }
  } 
  record Nigeria(String name, String code) implements Country {
    public Nigeria {
      name = "Nigeria";
      code = "NG";
    }
  } 
  record Nicaragua(String name, String code) implements Country {
    public Nicaragua {
      name = "Nicaragua";
      code = "NI";
    }
  } 
  record Netherlands(String name, String code) implements Country {
    public Netherlands {
      name = "Netherlands";
      code = "NL";
    }
  } 
  record Norway(String name, String code) implements Country {
    public Norway {
      name = "Norway";
      code = "NO";
    }
  } 
  record Nepal(String name, String code) implements Country {
    public Nepal {
      name = "Nepal";
      code = "NP";
    }
  } 
  record Nauru(String name, String code) implements Country {
    public Nauru {
      name = "Nauru";
      code = "NR";
    }
  } 
  record Niue(String name, String code) implements Country {
    public Niue {
      name = "Niue";
      code = "NU";
    }
  } 
  record NewZealand(String name, String code) implements Country {
    public NewZealand {
      name = "New Zealand";
      code = "NZ";
    }
  } 
  record Oman(String name, String code) implements Country {
    public Oman {
      name = "Oman";
      code = "OM";
    }
  } 
  record Panama(String name, String code) implements Country {
    public Panama {
      name = "Panama";
      code = "PA";
    }
  } 
  record Peru(String name, String code) implements Country {
    public Peru {
      name = "Peru";
      code = "PE";
    }
  } 
  record FrenchPolynesia(String name, String code) implements Country {
    public FrenchPolynesia {
      name = "French Polynesia";
      code = "PF";
    }
  } 
  record PapuaNewGuinea(String name, String code) implements Country {
    public PapuaNewGuinea {
      name = "Papua New Guinea";
      code = "PG";
    }
  } 
  record Philippines(String name, String code) implements Country {
    public Philippines {
      name = "Philippines";
      code = "PH";
    }
  } 
  record Pakistan(String name, String code) implements Country {
    public Pakistan {
      name = "Pakistan";
      code = "PK";
    }
  } 
  record Poland(String name, String code) implements Country {
    public Poland {
      name = "Poland";
      code = "PL";
    }
  } 
  record StPierreAndMiquelon(String name, String code) implements Country {
    public StPierreAndMiquelon {
      name = "St Pierre and Miquelon";
      code = "PM";
    }
  } 
  record PitcairnIsland(String name, String code) implements Country {
    public PitcairnIsland {
      name = "Pitcairn Island";
      code = "PN";
    }
  } 
  record PuertoRico(String name, String code) implements Country {
    public PuertoRico {
      name = "Puerto Rico";
      code = "PR";
    }
  } 
  record Palestine(String name, String code) implements Country {
    public Palestine {
      name = "Palestine";
      code = "PS";
    }
  } 
  record Portugal(String name, String code) implements Country {
    public Portugal {
      name = "Portugal";
      code = "PT";
    }
  } 
  record Palau(String name, String code) implements Country {
    public Palau {
      name = "Palau";
      code = "PW";
    }
  } 
  record Paraguay(String name, String code) implements Country {
    public Paraguay {
      name = "Paraguay";
      code = "PY";
    }
  } 
  record Qatar(String name, String code) implements Country {
    public Qatar {
      name = "Qatar";
      code = "QA";
    }
  } 
  record Reunion(String name, String code) implements Country {
    public Reunion {
      name = "Reunion";
      code = "RE";
    }
  } 
  record Romania(String name, String code) implements Country {
    public Romania {
      name = "Romania";
      code = "RO";
    }
  } 
  record Serbia(String name, String code) implements Country {
    public Serbia {
      name = "Serbia";
      code = "RS";
    }
  } 
  record RussianFederation(String name, String code) implements Country {
    public RussianFederation {
      name = "Russian Federation";
      code = "RU";
    }
  } 
  record Rwanda(String name, String code) implements Country {
    public Rwanda {
      name = "Rwanda";
      code = "RW";
    }
  } 
  record SaudiArabia(String name, String code) implements Country {
    public SaudiArabia {
      name = "Saudi Arabia";
      code = "SA";
    }
  } 
  record SolomonIslands(String name, String code) implements Country {
    public SolomonIslands {
      name = "Solomon Islands";
      code = "SB";
    }
  } 
  record Seychelles(String name, String code) implements Country {
    public Seychelles {
      name = "Seychelles";
      code = "SC";
    }
  } 
  record Sudan(String name, String code) implements Country {
    public Sudan {
      name = "Sudan";
      code = "SD";
    }
  } 
  record Sweden(String name, String code) implements Country {
    public Sweden {
      name = "Sweden";
      code = "SE";
    }
  } 
  record Singapore(String name, String code) implements Country {
    public Singapore {
      name = "Singapore";
      code = "SG";
    }
  } 
  record SaintHelena(String name, String code) implements Country {
    public SaintHelena {
      name = "Saint Helena";
      code = "SH";
    }
  } 
  record Slovenia(String name, String code) implements Country {
    public Slovenia {
      name = "Slovenia";
      code = "SI";
    }
  } 
  record SvalbardAndJanMayenIslands(String name, String code) implements Country {
    public SvalbardAndJanMayenIslands {
      name = "Svalbard And Jan Mayen Islands";
      code = "SJ";
    }
  } 
  record Slovakia(String name, String code) implements Country {
    public Slovakia {
      name = "Slovakia";
      code = "SK";
    }
  } 
  record SierraLeone(String name, String code) implements Country {
    public SierraLeone {
      name = "Sierra Leone";
      code = "SL";
    }
  } 
  record SanMarino(String name, String code) implements Country {
    public SanMarino {
      name = "San Marino";
      code = "SM";
    }
  } 
  record Senegal(String name, String code) implements Country {
    public Senegal {
      name = "Senegal";
      code = "SN";
    }
  } 
  record Somalia(String name, String code) implements Country {
    public Somalia {
      name = "Somalia";
      code = "SO";
    }
  } 
  record Suriname(String name, String code) implements Country {
    public Suriname {
      name = "Suriname";
      code = "SR";
    }
  } 
  record SouthSudan(String name, String code) implements Country {
    public SouthSudan {
      name = "South Sudan";
      code = "SS";
    }
  } 
  record SaoTomeAndPrincipe(String name, String code) implements Country {
    public SaoTomeAndPrincipe {
      name = "Sao Tome and Principe";
      code = "ST";
    }
  } 
  record ElSalvador(String name, String code) implements Country {
    public ElSalvador {
      name = "El Salvador";
      code = "SV";
    }
  } 
  record SintMaarten(String name, String code) implements Country {
    public SintMaarten {
      name = "Sint Maarten";
      code = "SX";
    }
  } 
  record SyrianArabRepublic(String name, String code) implements Country {
    public SyrianArabRepublic {
      name = "Syrian Arab Republic";
      code = "SY";
    }
  } 
  record Swaziland(String name, String code) implements Country {
    public Swaziland {
      name = "Swaziland";
      code = "SZ";
    }
  } 
  record TurksAndCaicosIslands(String name, String code) implements Country {
    public TurksAndCaicosIslands {
      name = "Turks and Caicos Islands";
      code = "TC";
    }
  } 
  record Chad(String name, String code) implements Country {
    public Chad {
      name = "Chad";
      code = "TD";
    }
  } 
  record FrenchSouthernTerritories(String name, String code) implements Country {
    public FrenchSouthernTerritories {
      name = "French Southern Territories";
      code = "TF";
    }
  } 
  record Togo(String name, String code) implements Country {
    public Togo {
      name = "Togo";
      code = "TG";
    }
  } 
  record Thailand(String name, String code) implements Country {
    public Thailand {
      name = "Thailand";
      code = "TH";
    }
  } 
  record Tajikistan(String name, String code) implements Country {
    public Tajikistan {
      name = "Tajikistan";
      code = "TJ";
    }
  } 
  record Tokelau(String name, String code) implements Country {
    public Tokelau {
      name = "Tokelau";
      code = "TK";
    }
  } 
  record TimorLeste(String name, String code) implements Country {
    public TimorLeste {
      name = "TimorLeste";
      code = "TL";
    }
  } 
  record Turkmenistan(String name, String code) implements Country {
    public Turkmenistan {
      name = "Turkmenistan";
      code = "TM";
    }
  } 
  record Tunisia(String name, String code) implements Country {
    public Tunisia {
      name = "Tunisia";
      code = "TN";
    }
  } 
  record Tonga(String name, String code) implements Country {
    public Tonga {
      name = "Tonga";
      code = "TO";
    }
  } 
  record Turkey(String name, String code) implements Country {
    public Turkey {
      name = "Turkey";
      code = "TR";
    }
  } 
  record TrinidadAndTobago(String name, String code) implements Country {
    public TrinidadAndTobago {
      name = "Trinidad and Tobago";
      code = "TT";
    }
  } 
  record Tuvalu(String name, String code) implements Country {
    public Tuvalu {
      name = "Tuvalu";
      code = "TV";
    }
  } 
  record Taiwan(String name, String code) implements Country {
    public Taiwan {
      name = "Taiwan";
      code = "TW";
    }
  } 
  record Tanzania(String name, String code) implements Country {
    public Tanzania {
      name = "Tanzania";
      code = "TZ";
    }
  } 
  record Ukraine(String name, String code) implements Country {
    public Ukraine {
      name = "Ukraine";
      code = "UA";
    }
  } 
  record Uganda(String name, String code) implements Country {
    public Uganda {
      name = "Uganda";
      code = "UG";
    }
  } 
  record UnitedStatesMinorOutlyingIslands(String name, String code) implements Country {
    public UnitedStatesMinorOutlyingIslands {
      name = "United States Minor Outlying Islands";
      code = "UM";
    }
  } 
  record UnitedStatesOfAmerica(String name, String code) implements Country {
    public UnitedStatesOfAmerica {
      name = "United States of America";
      code = "US";
    }
  } 
  record Uruguay(String name, String code) implements Country {
    public Uruguay {
      name = "Uruguay";
      code = "UY";
    }
  } 
  record Uzbekistan(String name, String code) implements Country {
    public Uzbekistan {
      name = "Uzbekistan";
      code = "UZ";
    }
  } 
  record HolySee(String name, String code) implements Country {
    public HolySee {
      name = "Holy See";
      code = "VA";
    }
  } 
  record StVincentAndTheGrenadines(String name, String code) implements Country {
    public StVincentAndTheGrenadines {
      name = "St Vincent and the Grenadines";
      code = "VC";
    }
  } 
  record Venezuela(String name, String code) implements Country {
    public Venezuela {
      name = "Venezuela";
      code = "VE";
    }
  } 
  record BritishVirginIslands(String name, String code) implements Country {
    public BritishVirginIslands {
      name = "British Virgin Islands";
      code = "VG";
    }
  } 
  record USVirginIslands(String name, String code) implements Country {
    public USVirginIslands {
      name = "US Virgin Islands";
      code = "VI";
    }
  } 
  record VietNam(String name, String code) implements Country {
    public VietNam {
      name = "Viet Nam";
      code = "VN";
    }
  } 
  record Vanuatu(String name, String code) implements Country {
    public Vanuatu {
      name = "Vanuatu";
      code = "VU";
    }
  } 
  record WallisAndFutunaIslands(String name, String code) implements Country {
    public WallisAndFutunaIslands {
      name = "Wallis and Futuna Islands";
      code = "WF";
    }
  } 
  record Samoa(String name, String code) implements Country {
    public Samoa {
      name = "Samoa";
      code = "WS";
    }
  } 
  record Yemen(String name, String code) implements Country {
    public Yemen {
      name = "Yemen";
      code = "YE";
    }
  } 
  record Mayotte(String name, String code) implements Country {
    public Mayotte {
      name = "Mayotte";
      code = "YT";
    }
  } 
  record SouthAfrica(String name, String code) implements Country {
    public SouthAfrica {
      name = "South Africa";
      code = "ZA";
    }
  } 
  record Zambia(String name, String code) implements Country {
    public Zambia {
      name = "Zambia";
      code = "ZM";
    }
  } 
  record Zimbabwe(String name, String code) implements Country {
    public Zimbabwe {
      name = "Zimbabwe";
      code = "ZW";
    }
  } 

}  
