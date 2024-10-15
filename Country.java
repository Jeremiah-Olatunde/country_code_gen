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
  @JsonSubTypes.Type(value = Country.Congo.class, name = "CD"),
  @JsonSubTypes.Type(value = Country.CentralAfricanRepublic.class, name = "CF"),
  @JsonSubTypes.Type(value = Country.Congo.class, name = "CG"),
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
  @JsonSubTypes.Type(value = Country.Korea.class, name = "KP"),
  @JsonSubTypes.Type(value = Country.Korea.class, name = "KR"),
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
public sealed interface Country extends AdministrativeArea permits  Country.Andorra, Country.UnitedArabEmirates, Country.Afghanistan, Country.AntiguaAndBarbuda, Country.Anguilla, Country.Albania, Country.Armenia, Country.Angola, Country.Antarctica, Country.Argentina, Country.AmericanSamoa, Country.Austria, Country.Australia, Country.Aruba, Country.Azerbaijan, Country.BosniaAndHerzegovina, Country.Barbados, Country.Bangladesh, Country.Belgium, Country.BurkinaFaso, Country.Bulgaria, Country.Bahrain, Country.Burundi, Country.Benin, Country.Bermuda, Country.BruneiDarussalam, Country.Bolivia, Country.Bonaire, Country.Brazil, Country.Bahamas, Country.Bhutan, Country.BouvetIsland, Country.Botswana, Country.Belarus, Country.Belize, Country.Canada, Country.CocosIslands, Country.Congo, Country.CentralAfricanRepublic, Country.Congo, Country.Switzerland, Country.CoteDIvoire, Country.CookIslands, Country.Chile, Country.Cameroon, Country.China, Country.Colombia, Country.CostaRica, Country.Cuba, Country.CapeVerde, Country.ChristmasIsland, Country.Cyprus, Country.CzechRepublic, Country.Germany, Country.Djibouti, Country.Denmark, Country.Dominica, Country.DominicanRepublic, Country.Algeria, Country.Ecuador, Country.Estonia, Country.Egypt, Country.WesternSahara, Country.Eritrea, Country.Spain, Country.Ethiopia, Country.Finland, Country.Fiji, Country.FalklandIslands, Country.Micronesia, Country.FaeroeIslands, Country.France, Country.Gabon, Country.UnitedKingdomOfGreatBritainAndNIreland, Country.Grenada, Country.Georgia, Country.FrenchGuiana, Country.Guernsey, Country.Ghana, Country.Gibraltar, Country.Greenland, Country.Gambia, Country.Guinea, Country.Guadaloupe, Country.EquatorialGuinea, Country.Greece, Country.SouthGeorgiaAndTheSouthSandwichIslands, Country.Guatemala, Country.Guam, Country.GuineaBissau, Country.Guyana, Country.HongKong, Country.HeardAndMcDonaldIslands, Country.Honduras, Country.Hrvatska, Country.Haiti, Country.Hungary, Country.Indonesia, Country.Ireland, Country.Israel, Country.IsleOfMan, Country.India, Country.BritishIndianOceanTerritory, Country.Iraq, Country.Iran, Country.Iceland, Country.Italy, Country.Jersey, Country.Jamaica, Country.Jordan, Country.Japan, Country.Kenya, Country.KyrgyzRepublic, Country.Cambodia, Country.Kiribati, Country.Comoros, Country.StKittsAndNevis, Country.Korea, Country.Korea, Country.Kuwait, Country.CaymanIslands, Country.Kazakhstan, Country.LaoPeoplesDemocraticRepublic, Country.Lebanon, Country.StLucia, Country.Liechtenstein, Country.SriLanka, Country.Liberia, Country.Lesotho, Country.Lithuania, Country.Luxembourg, Country.Latvia, Country.Libya, Country.Morocco, Country.Monaco, Country.Moldova, Country.Montenegro, Country.SaintMartin, Country.Madagascar, Country.MarshallIslands, Country.Macedonia, Country.Mali, Country.Myanmar, Country.Mongolia, Country.Macao, Country.NorthernMarianaIslands, Country.Martinique, Country.Mauritania, Country.Montserrat, Country.Malta, Country.Mauritius, Country.Maldives, Country.Malawi, Country.Mexico, Country.Malaysia, Country.Mozambique, Country.Namibia, Country.NewCaledonia, Country.Niger, Country.NorfolkIsland, Country.Nigeria, Country.Nicaragua, Country.Netherlands, Country.Norway, Country.Nepal, Country.Nauru, Country.Niue, Country.NewZealand, Country.Oman, Country.Panama, Country.Peru, Country.FrenchPolynesia, Country.PapuaNewGuinea, Country.Philippines, Country.Pakistan, Country.Poland, Country.StPierreAndMiquelon, Country.PitcairnIsland, Country.PuertoRico, Country.Palestine, Country.Portugal, Country.Palau, Country.Paraguay, Country.Qatar, Country.Reunion, Country.Romania, Country.Serbia, Country.RussianFederation, Country.Rwanda, Country.SaudiArabia, Country.SolomonIslands, Country.Seychelles, Country.Sudan, Country.Sweden, Country.Singapore, Country.SaintHelena, Country.Slovenia, Country.SvalbardAndJanMayenIslands, Country.Slovakia, Country.SierraLeone, Country.SanMarino, Country.Senegal, Country.Somalia, Country.Suriname, Country.SouthSudan, Country.SaoTomeAndPrincipe, Country.ElSalvador, Country.SintMaarten, Country.SyrianArabRepublic, Country.Swaziland, Country.TurksAndCaicosIslands, Country.Chad, Country.FrenchSouthernTerritories, Country.Togo, Country.Thailand, Country.Tajikistan, Country.Tokelau, Country.TimorLeste, Country.Turkmenistan, Country.Tunisia, Country.Tonga, Country.Turkey, Country.TrinidadAndTobago, Country.Tuvalu, Country.Taiwan, Country.Tanzania, Country.Ukraine, Country.Uganda, Country.UnitedStatesMinorOutlyingIslands, Country.UnitedStatesOfAmerica, Country.Uruguay, Country.Uzbekistan, Country.HolySee, Country.StVincentAndTheGrenadines, Country.Venezuela, Country.BritishVirginIslands, Country.USVirginIslands, Country.VietNam, Country.Vanuatu, Country.WallisAndFutunaIslands, Country.Samoa, Country.Yemen, Country.Mayotte, Country.SouthAfrica, Country.Zambia, Country.Zimbabwe, {
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

  
  record AD(String name, String code) implements Country {
    public AD {
      name = "Andorra";
      code = "Andorra";
    }
  } 
  record AE(String name, String code) implements Country {
    public AE {
      name = "United Arab Emirates";
      code = "UnitedArabEmirates";
    }
  } 
  record AF(String name, String code) implements Country {
    public AF {
      name = "Afghanistan";
      code = "Afghanistan";
    }
  } 
  record AG(String name, String code) implements Country {
    public AG {
      name = "Antigua and Barbuda";
      code = "AntiguaAndBarbuda";
    }
  } 
  record AI(String name, String code) implements Country {
    public AI {
      name = "Anguilla";
      code = "Anguilla";
    }
  } 
  record AL(String name, String code) implements Country {
    public AL {
      name = "Albania";
      code = "Albania";
    }
  } 
  record AM(String name, String code) implements Country {
    public AM {
      name = "Armenia";
      code = "Armenia";
    }
  } 
  record AO(String name, String code) implements Country {
    public AO {
      name = "Angola";
      code = "Angola";
    }
  } 
  record AQ(String name, String code) implements Country {
    public AQ {
      name = "Antarctica";
      code = "Antarctica";
    }
  } 
  record AR(String name, String code) implements Country {
    public AR {
      name = "Argentina";
      code = "Argentina";
    }
  } 
  record AS(String name, String code) implements Country {
    public AS {
      name = "American Samoa";
      code = "AmericanSamoa";
    }
  } 
  record AT(String name, String code) implements Country {
    public AT {
      name = "Austria";
      code = "Austria";
    }
  } 
  record AU(String name, String code) implements Country {
    public AU {
      name = "Australia";
      code = "Australia";
    }
  } 
  record AW(String name, String code) implements Country {
    public AW {
      name = "Aruba";
      code = "Aruba";
    }
  } 
  record AZ(String name, String code) implements Country {
    public AZ {
      name = "Azerbaijan";
      code = "Azerbaijan";
    }
  } 
  record BA(String name, String code) implements Country {
    public BA {
      name = "Bosnia and Herzegovina";
      code = "BosniaAndHerzegovina";
    }
  } 
  record BB(String name, String code) implements Country {
    public BB {
      name = "Barbados";
      code = "Barbados";
    }
  } 
  record BD(String name, String code) implements Country {
    public BD {
      name = "Bangladesh";
      code = "Bangladesh";
    }
  } 
  record BE(String name, String code) implements Country {
    public BE {
      name = "Belgium";
      code = "Belgium";
    }
  } 
  record BF(String name, String code) implements Country {
    public BF {
      name = "Burkina Faso";
      code = "BurkinaFaso";
    }
  } 
  record BG(String name, String code) implements Country {
    public BG {
      name = "Bulgaria";
      code = "Bulgaria";
    }
  } 
  record BH(String name, String code) implements Country {
    public BH {
      name = "Bahrain";
      code = "Bahrain";
    }
  } 
  record BI(String name, String code) implements Country {
    public BI {
      name = "Burundi";
      code = "Burundi";
    }
  } 
  record BJ(String name, String code) implements Country {
    public BJ {
      name = "Benin";
      code = "Benin";
    }
  } 
  record BM(String name, String code) implements Country {
    public BM {
      name = "Bermuda";
      code = "Bermuda";
    }
  } 
  record BN(String name, String code) implements Country {
    public BN {
      name = "Brunei Darussalam";
      code = "BruneiDarussalam";
    }
  } 
  record BO(String name, String code) implements Country {
    public BO {
      name = "Bolivia";
      code = "Bolivia";
    }
  } 
  record BQ(String name, String code) implements Country {
    public BQ {
      name = "Bonaire";
      code = "Bonaire";
    }
  } 
  record BR(String name, String code) implements Country {
    public BR {
      name = "Brazil";
      code = "Brazil";
    }
  } 
  record BS(String name, String code) implements Country {
    public BS {
      name = "Bahamas";
      code = "Bahamas";
    }
  } 
  record BT(String name, String code) implements Country {
    public BT {
      name = "Bhutan";
      code = "Bhutan";
    }
  } 
  record BV(String name, String code) implements Country {
    public BV {
      name = "Bouvet Island";
      code = "BouvetIsland";
    }
  } 
  record BW(String name, String code) implements Country {
    public BW {
      name = "Botswana";
      code = "Botswana";
    }
  } 
  record BY(String name, String code) implements Country {
    public BY {
      name = "Belarus";
      code = "Belarus";
    }
  } 
  record BZ(String name, String code) implements Country {
    public BZ {
      name = "Belize";
      code = "Belize";
    }
  } 
  record CA(String name, String code) implements Country {
    public CA {
      name = "Canada";
      code = "Canada";
    }
  } 
  record CC(String name, String code) implements Country {
    public CC {
      name = "Cocos Islands";
      code = "CocosIslands";
    }
  } 
  record CD(String name, String code) implements Country {
    public CD {
      name = "Congo";
      code = "Congo";
    }
  } 
  record CF(String name, String code) implements Country {
    public CF {
      name = "Central African Republic";
      code = "CentralAfricanRepublic";
    }
  } 
  record CG(String name, String code) implements Country {
    public CG {
      name = "Congo";
      code = "Congo";
    }
  } 
  record CH(String name, String code) implements Country {
    public CH {
      name = "Switzerland";
      code = "Switzerland";
    }
  } 
  record CI(String name, String code) implements Country {
    public CI {
      name = "Cote DIvoire";
      code = "CoteDIvoire";
    }
  } 
  record CK(String name, String code) implements Country {
    public CK {
      name = "Cook Islands";
      code = "CookIslands";
    }
  } 
  record CL(String name, String code) implements Country {
    public CL {
      name = "Chile";
      code = "Chile";
    }
  } 
  record CM(String name, String code) implements Country {
    public CM {
      name = "Cameroon";
      code = "Cameroon";
    }
  } 
  record CN(String name, String code) implements Country {
    public CN {
      name = "China";
      code = "China";
    }
  } 
  record CO(String name, String code) implements Country {
    public CO {
      name = "Colombia";
      code = "Colombia";
    }
  } 
  record CR(String name, String code) implements Country {
    public CR {
      name = "Costa Rica";
      code = "CostaRica";
    }
  } 
  record CU(String name, String code) implements Country {
    public CU {
      name = "Cuba";
      code = "Cuba";
    }
  } 
  record CV(String name, String code) implements Country {
    public CV {
      name = "Cape Verde";
      code = "CapeVerde";
    }
  } 
  record CX(String name, String code) implements Country {
    public CX {
      name = "Christmas Island";
      code = "ChristmasIsland";
    }
  } 
  record CY(String name, String code) implements Country {
    public CY {
      name = "Cyprus";
      code = "Cyprus";
    }
  } 
  record CZ(String name, String code) implements Country {
    public CZ {
      name = "Czech Republic";
      code = "CzechRepublic";
    }
  } 
  record DE(String name, String code) implements Country {
    public DE {
      name = "Germany";
      code = "Germany";
    }
  } 
  record DJ(String name, String code) implements Country {
    public DJ {
      name = "Djibouti";
      code = "Djibouti";
    }
  } 
  record DK(String name, String code) implements Country {
    public DK {
      name = "Denmark";
      code = "Denmark";
    }
  } 
  record DM(String name, String code) implements Country {
    public DM {
      name = "Dominica";
      code = "Dominica";
    }
  } 
  record DO(String name, String code) implements Country {
    public DO {
      name = "Dominican Republic";
      code = "DominicanRepublic";
    }
  } 
  record DZ(String name, String code) implements Country {
    public DZ {
      name = "Algeria";
      code = "Algeria";
    }
  } 
  record EC(String name, String code) implements Country {
    public EC {
      name = "Ecuador";
      code = "Ecuador";
    }
  } 
  record EE(String name, String code) implements Country {
    public EE {
      name = "Estonia";
      code = "Estonia";
    }
  } 
  record EG(String name, String code) implements Country {
    public EG {
      name = "Egypt";
      code = "Egypt";
    }
  } 
  record EH(String name, String code) implements Country {
    public EH {
      name = "Western Sahara";
      code = "WesternSahara";
    }
  } 
  record ER(String name, String code) implements Country {
    public ER {
      name = "Eritrea";
      code = "Eritrea";
    }
  } 
  record ES(String name, String code) implements Country {
    public ES {
      name = "Spain";
      code = "Spain";
    }
  } 
  record ET(String name, String code) implements Country {
    public ET {
      name = "Ethiopia";
      code = "Ethiopia";
    }
  } 
  record FI(String name, String code) implements Country {
    public FI {
      name = "Finland";
      code = "Finland";
    }
  } 
  record FJ(String name, String code) implements Country {
    public FJ {
      name = "Fiji";
      code = "Fiji";
    }
  } 
  record FK(String name, String code) implements Country {
    public FK {
      name = "Falkland Islands";
      code = "FalklandIslands";
    }
  } 
  record FM(String name, String code) implements Country {
    public FM {
      name = "Micronesia";
      code = "Micronesia";
    }
  } 
  record FO(String name, String code) implements Country {
    public FO {
      name = "Faeroe Islands";
      code = "FaeroeIslands";
    }
  } 
  record FR(String name, String code) implements Country {
    public FR {
      name = "France";
      code = "France";
    }
  } 
  record GA(String name, String code) implements Country {
    public GA {
      name = "Gabon";
      code = "Gabon";
    }
  } 
  record GB(String name, String code) implements Country {
    public GB {
      name = "United Kingdom of Great Britain And N Ireland";
      code = "UnitedKingdomOfGreatBritainAndNIreland";
    }
  } 
  record GD(String name, String code) implements Country {
    public GD {
      name = "Grenada";
      code = "Grenada";
    }
  } 
  record GE(String name, String code) implements Country {
    public GE {
      name = "Georgia";
      code = "Georgia";
    }
  } 
  record GF(String name, String code) implements Country {
    public GF {
      name = "French Guiana";
      code = "FrenchGuiana";
    }
  } 
  record GG(String name, String code) implements Country {
    public GG {
      name = "Guernsey";
      code = "Guernsey";
    }
  } 
  record GH(String name, String code) implements Country {
    public GH {
      name = "Ghana";
      code = "Ghana";
    }
  } 
  record GI(String name, String code) implements Country {
    public GI {
      name = "Gibraltar";
      code = "Gibraltar";
    }
  } 
  record GL(String name, String code) implements Country {
    public GL {
      name = "Greenland";
      code = "Greenland";
    }
  } 
  record GM(String name, String code) implements Country {
    public GM {
      name = "Gambia";
      code = "Gambia";
    }
  } 
  record GN(String name, String code) implements Country {
    public GN {
      name = "Guinea";
      code = "Guinea";
    }
  } 
  record GP(String name, String code) implements Country {
    public GP {
      name = "Guadaloupe";
      code = "Guadaloupe";
    }
  } 
  record GQ(String name, String code) implements Country {
    public GQ {
      name = "Equatorial Guinea";
      code = "EquatorialGuinea";
    }
  } 
  record GR(String name, String code) implements Country {
    public GR {
      name = "Greece";
      code = "Greece";
    }
  } 
  record GS(String name, String code) implements Country {
    public GS {
      name = "South Georgia and the South Sandwich Islands";
      code = "SouthGeorgiaAndTheSouthSandwichIslands";
    }
  } 
  record GT(String name, String code) implements Country {
    public GT {
      name = "Guatemala";
      code = "Guatemala";
    }
  } 
  record GU(String name, String code) implements Country {
    public GU {
      name = "Guam";
      code = "Guam";
    }
  } 
  record GW(String name, String code) implements Country {
    public GW {
      name = "GuineaBissau";
      code = "GuineaBissau";
    }
  } 
  record GY(String name, String code) implements Country {
    public GY {
      name = "Guyana";
      code = "Guyana";
    }
  } 
  record HK(String name, String code) implements Country {
    public HK {
      name = "Hong Kong";
      code = "HongKong";
    }
  } 
  record HM(String name, String code) implements Country {
    public HM {
      name = "Heard and McDonald Islands";
      code = "HeardAndMcDonaldIslands";
    }
  } 
  record HN(String name, String code) implements Country {
    public HN {
      name = "Honduras";
      code = "Honduras";
    }
  } 
  record HR(String name, String code) implements Country {
    public HR {
      name = "Hrvatska";
      code = "Hrvatska";
    }
  } 
  record HT(String name, String code) implements Country {
    public HT {
      name = "Haiti";
      code = "Haiti";
    }
  } 
  record HU(String name, String code) implements Country {
    public HU {
      name = "Hungary";
      code = "Hungary";
    }
  } 
  record ID(String name, String code) implements Country {
    public ID {
      name = "Indonesia";
      code = "Indonesia";
    }
  } 
  record IE(String name, String code) implements Country {
    public IE {
      name = "Ireland";
      code = "Ireland";
    }
  } 
  record IL(String name, String code) implements Country {
    public IL {
      name = "Israel";
      code = "Israel";
    }
  } 
  record IM(String name, String code) implements Country {
    public IM {
      name = "Isle of Man";
      code = "IsleOfMan";
    }
  } 
  record IN(String name, String code) implements Country {
    public IN {
      name = "India";
      code = "India";
    }
  } 
  record IO(String name, String code) implements Country {
    public IO {
      name = "British Indian Ocean Territory";
      code = "BritishIndianOceanTerritory";
    }
  } 
  record IQ(String name, String code) implements Country {
    public IQ {
      name = "Iraq";
      code = "Iraq";
    }
  } 
  record IR(String name, String code) implements Country {
    public IR {
      name = "Iran";
      code = "Iran";
    }
  } 
  record IS(String name, String code) implements Country {
    public IS {
      name = "Iceland";
      code = "Iceland";
    }
  } 
  record IT(String name, String code) implements Country {
    public IT {
      name = "Italy";
      code = "Italy";
    }
  } 
  record JE(String name, String code) implements Country {
    public JE {
      name = "Jersey";
      code = "Jersey";
    }
  } 
  record JM(String name, String code) implements Country {
    public JM {
      name = "Jamaica";
      code = "Jamaica";
    }
  } 
  record JO(String name, String code) implements Country {
    public JO {
      name = "Jordan";
      code = "Jordan";
    }
  } 
  record JP(String name, String code) implements Country {
    public JP {
      name = "Japan";
      code = "Japan";
    }
  } 
  record KE(String name, String code) implements Country {
    public KE {
      name = "Kenya";
      code = "Kenya";
    }
  } 
  record KG(String name, String code) implements Country {
    public KG {
      name = "Kyrgyz Republic";
      code = "KyrgyzRepublic";
    }
  } 
  record KH(String name, String code) implements Country {
    public KH {
      name = "Cambodia";
      code = "Cambodia";
    }
  } 
  record KI(String name, String code) implements Country {
    public KI {
      name = "Kiribati";
      code = "Kiribati";
    }
  } 
  record KM(String name, String code) implements Country {
    public KM {
      name = "Comoros";
      code = "Comoros";
    }
  } 
  record KN(String name, String code) implements Country {
    public KN {
      name = "St Kitts and Nevis";
      code = "StKittsAndNevis";
    }
  } 
  record KP(String name, String code) implements Country {
    public KP {
      name = "Korea";
      code = "Korea";
    }
  } 
  record KR(String name, String code) implements Country {
    public KR {
      name = "Korea";
      code = "Korea";
    }
  } 
  record KW(String name, String code) implements Country {
    public KW {
      name = "Kuwait";
      code = "Kuwait";
    }
  } 
  record KY(String name, String code) implements Country {
    public KY {
      name = "Cayman Islands";
      code = "CaymanIslands";
    }
  } 
  record KZ(String name, String code) implements Country {
    public KZ {
      name = "Kazakhstan";
      code = "Kazakhstan";
    }
  } 
  record LA(String name, String code) implements Country {
    public LA {
      name = "Lao Peoples Democratic Republic";
      code = "LaoPeoplesDemocraticRepublic";
    }
  } 
  record LB(String name, String code) implements Country {
    public LB {
      name = "Lebanon";
      code = "Lebanon";
    }
  } 
  record LC(String name, String code) implements Country {
    public LC {
      name = "St Lucia";
      code = "StLucia";
    }
  } 
  record LI(String name, String code) implements Country {
    public LI {
      name = "Liechtenstein";
      code = "Liechtenstein";
    }
  } 
  record LK(String name, String code) implements Country {
    public LK {
      name = "Sri Lanka";
      code = "SriLanka";
    }
  } 
  record LR(String name, String code) implements Country {
    public LR {
      name = "Liberia";
      code = "Liberia";
    }
  } 
  record LS(String name, String code) implements Country {
    public LS {
      name = "Lesotho";
      code = "Lesotho";
    }
  } 
  record LT(String name, String code) implements Country {
    public LT {
      name = "Lithuania";
      code = "Lithuania";
    }
  } 
  record LU(String name, String code) implements Country {
    public LU {
      name = "Luxembourg";
      code = "Luxembourg";
    }
  } 
  record LV(String name, String code) implements Country {
    public LV {
      name = "Latvia";
      code = "Latvia";
    }
  } 
  record LY(String name, String code) implements Country {
    public LY {
      name = "Libya";
      code = "Libya";
    }
  } 
  record MA(String name, String code) implements Country {
    public MA {
      name = "Morocco";
      code = "Morocco";
    }
  } 
  record MC(String name, String code) implements Country {
    public MC {
      name = "Monaco";
      code = "Monaco";
    }
  } 
  record MD(String name, String code) implements Country {
    public MD {
      name = "Moldova";
      code = "Moldova";
    }
  } 
  record ME(String name, String code) implements Country {
    public ME {
      name = "Montenegro";
      code = "Montenegro";
    }
  } 
  record MF(String name, String code) implements Country {
    public MF {
      name = "Saint Martin";
      code = "SaintMartin";
    }
  } 
  record MG(String name, String code) implements Country {
    public MG {
      name = "Madagascar";
      code = "Madagascar";
    }
  } 
  record MH(String name, String code) implements Country {
    public MH {
      name = "Marshall Islands";
      code = "MarshallIslands";
    }
  } 
  record MK(String name, String code) implements Country {
    public MK {
      name = "Macedonia";
      code = "Macedonia";
    }
  } 
  record ML(String name, String code) implements Country {
    public ML {
      name = "Mali";
      code = "Mali";
    }
  } 
  record MM(String name, String code) implements Country {
    public MM {
      name = "Myanmar";
      code = "Myanmar";
    }
  } 
  record MN(String name, String code) implements Country {
    public MN {
      name = "Mongolia";
      code = "Mongolia";
    }
  } 
  record MO(String name, String code) implements Country {
    public MO {
      name = "Macao";
      code = "Macao";
    }
  } 
  record MP(String name, String code) implements Country {
    public MP {
      name = "Northern Mariana Islands";
      code = "NorthernMarianaIslands";
    }
  } 
  record MQ(String name, String code) implements Country {
    public MQ {
      name = "Martinique";
      code = "Martinique";
    }
  } 
  record MR(String name, String code) implements Country {
    public MR {
      name = "Mauritania";
      code = "Mauritania";
    }
  } 
  record MS(String name, String code) implements Country {
    public MS {
      name = "Montserrat";
      code = "Montserrat";
    }
  } 
  record MT(String name, String code) implements Country {
    public MT {
      name = "Malta";
      code = "Malta";
    }
  } 
  record MU(String name, String code) implements Country {
    public MU {
      name = "Mauritius";
      code = "Mauritius";
    }
  } 
  record MV(String name, String code) implements Country {
    public MV {
      name = "Maldives";
      code = "Maldives";
    }
  } 
  record MW(String name, String code) implements Country {
    public MW {
      name = "Malawi";
      code = "Malawi";
    }
  } 
  record MX(String name, String code) implements Country {
    public MX {
      name = "Mexico";
      code = "Mexico";
    }
  } 
  record MY(String name, String code) implements Country {
    public MY {
      name = "Malaysia";
      code = "Malaysia";
    }
  } 
  record MZ(String name, String code) implements Country {
    public MZ {
      name = "Mozambique";
      code = "Mozambique";
    }
  } 
  record NA(String name, String code) implements Country {
    public NA {
      name = "Namibia";
      code = "Namibia";
    }
  } 
  record NC(String name, String code) implements Country {
    public NC {
      name = "New Caledonia";
      code = "NewCaledonia";
    }
  } 
  record NE(String name, String code) implements Country {
    public NE {
      name = "Niger";
      code = "Niger";
    }
  } 
  record NF(String name, String code) implements Country {
    public NF {
      name = "Norfolk Island";
      code = "NorfolkIsland";
    }
  } 
  record NG(String name, String code) implements Country {
    public NG {
      name = "Nigeria";
      code = "Nigeria";
    }
  } 
  record NI(String name, String code) implements Country {
    public NI {
      name = "Nicaragua";
      code = "Nicaragua";
    }
  } 
  record NL(String name, String code) implements Country {
    public NL {
      name = "Netherlands";
      code = "Netherlands";
    }
  } 
  record NO(String name, String code) implements Country {
    public NO {
      name = "Norway";
      code = "Norway";
    }
  } 
  record NP(String name, String code) implements Country {
    public NP {
      name = "Nepal";
      code = "Nepal";
    }
  } 
  record NR(String name, String code) implements Country {
    public NR {
      name = "Nauru";
      code = "Nauru";
    }
  } 
  record NU(String name, String code) implements Country {
    public NU {
      name = "Niue";
      code = "Niue";
    }
  } 
  record NZ(String name, String code) implements Country {
    public NZ {
      name = "New Zealand";
      code = "NewZealand";
    }
  } 
  record OM(String name, String code) implements Country {
    public OM {
      name = "Oman";
      code = "Oman";
    }
  } 
  record PA(String name, String code) implements Country {
    public PA {
      name = "Panama";
      code = "Panama";
    }
  } 
  record PE(String name, String code) implements Country {
    public PE {
      name = "Peru";
      code = "Peru";
    }
  } 
  record PF(String name, String code) implements Country {
    public PF {
      name = "French Polynesia";
      code = "FrenchPolynesia";
    }
  } 
  record PG(String name, String code) implements Country {
    public PG {
      name = "Papua New Guinea";
      code = "PapuaNewGuinea";
    }
  } 
  record PH(String name, String code) implements Country {
    public PH {
      name = "Philippines";
      code = "Philippines";
    }
  } 
  record PK(String name, String code) implements Country {
    public PK {
      name = "Pakistan";
      code = "Pakistan";
    }
  } 
  record PL(String name, String code) implements Country {
    public PL {
      name = "Poland";
      code = "Poland";
    }
  } 
  record PM(String name, String code) implements Country {
    public PM {
      name = "St Pierre and Miquelon";
      code = "StPierreAndMiquelon";
    }
  } 
  record PN(String name, String code) implements Country {
    public PN {
      name = "Pitcairn Island";
      code = "PitcairnIsland";
    }
  } 
  record PR(String name, String code) implements Country {
    public PR {
      name = "Puerto Rico";
      code = "PuertoRico";
    }
  } 
  record PS(String name, String code) implements Country {
    public PS {
      name = "Palestine";
      code = "Palestine";
    }
  } 
  record PT(String name, String code) implements Country {
    public PT {
      name = "Portugal";
      code = "Portugal";
    }
  } 
  record PW(String name, String code) implements Country {
    public PW {
      name = "Palau";
      code = "Palau";
    }
  } 
  record PY(String name, String code) implements Country {
    public PY {
      name = "Paraguay";
      code = "Paraguay";
    }
  } 
  record QA(String name, String code) implements Country {
    public QA {
      name = "Qatar";
      code = "Qatar";
    }
  } 
  record RE(String name, String code) implements Country {
    public RE {
      name = "Reunion";
      code = "Reunion";
    }
  } 
  record RO(String name, String code) implements Country {
    public RO {
      name = "Romania";
      code = "Romania";
    }
  } 
  record RS(String name, String code) implements Country {
    public RS {
      name = "Serbia";
      code = "Serbia";
    }
  } 
  record RU(String name, String code) implements Country {
    public RU {
      name = "Russian Federation";
      code = "RussianFederation";
    }
  } 
  record RW(String name, String code) implements Country {
    public RW {
      name = "Rwanda";
      code = "Rwanda";
    }
  } 
  record SA(String name, String code) implements Country {
    public SA {
      name = "Saudi Arabia";
      code = "SaudiArabia";
    }
  } 
  record SB(String name, String code) implements Country {
    public SB {
      name = "Solomon Islands";
      code = "SolomonIslands";
    }
  } 
  record SC(String name, String code) implements Country {
    public SC {
      name = "Seychelles";
      code = "Seychelles";
    }
  } 
  record SD(String name, String code) implements Country {
    public SD {
      name = "Sudan";
      code = "Sudan";
    }
  } 
  record SE(String name, String code) implements Country {
    public SE {
      name = "Sweden";
      code = "Sweden";
    }
  } 
  record SG(String name, String code) implements Country {
    public SG {
      name = "Singapore";
      code = "Singapore";
    }
  } 
  record SH(String name, String code) implements Country {
    public SH {
      name = "Saint Helena";
      code = "SaintHelena";
    }
  } 
  record SI(String name, String code) implements Country {
    public SI {
      name = "Slovenia";
      code = "Slovenia";
    }
  } 
  record SJ(String name, String code) implements Country {
    public SJ {
      name = "Svalbard And Jan Mayen Islands";
      code = "SvalbardAndJanMayenIslands";
    }
  } 
  record SK(String name, String code) implements Country {
    public SK {
      name = "Slovakia";
      code = "Slovakia";
    }
  } 
  record SL(String name, String code) implements Country {
    public SL {
      name = "Sierra Leone";
      code = "SierraLeone";
    }
  } 
  record SM(String name, String code) implements Country {
    public SM {
      name = "San Marino";
      code = "SanMarino";
    }
  } 
  record SN(String name, String code) implements Country {
    public SN {
      name = "Senegal";
      code = "Senegal";
    }
  } 
  record SO(String name, String code) implements Country {
    public SO {
      name = "Somalia";
      code = "Somalia";
    }
  } 
  record SR(String name, String code) implements Country {
    public SR {
      name = "Suriname";
      code = "Suriname";
    }
  } 
  record SS(String name, String code) implements Country {
    public SS {
      name = "South Sudan";
      code = "SouthSudan";
    }
  } 
  record ST(String name, String code) implements Country {
    public ST {
      name = "Sao Tome and Principe";
      code = "SaoTomeAndPrincipe";
    }
  } 
  record SV(String name, String code) implements Country {
    public SV {
      name = "El Salvador";
      code = "ElSalvador";
    }
  } 
  record SX(String name, String code) implements Country {
    public SX {
      name = "Sint Maarten";
      code = "SintMaarten";
    }
  } 
  record SY(String name, String code) implements Country {
    public SY {
      name = "Syrian Arab Republic";
      code = "SyrianArabRepublic";
    }
  } 
  record SZ(String name, String code) implements Country {
    public SZ {
      name = "Swaziland";
      code = "Swaziland";
    }
  } 
  record TC(String name, String code) implements Country {
    public TC {
      name = "Turks and Caicos Islands";
      code = "TurksAndCaicosIslands";
    }
  } 
  record TD(String name, String code) implements Country {
    public TD {
      name = "Chad";
      code = "Chad";
    }
  } 
  record TF(String name, String code) implements Country {
    public TF {
      name = "French Southern Territories";
      code = "FrenchSouthernTerritories";
    }
  } 
  record TG(String name, String code) implements Country {
    public TG {
      name = "Togo";
      code = "Togo";
    }
  } 
  record TH(String name, String code) implements Country {
    public TH {
      name = "Thailand";
      code = "Thailand";
    }
  } 
  record TJ(String name, String code) implements Country {
    public TJ {
      name = "Tajikistan";
      code = "Tajikistan";
    }
  } 
  record TK(String name, String code) implements Country {
    public TK {
      name = "Tokelau";
      code = "Tokelau";
    }
  } 
  record TL(String name, String code) implements Country {
    public TL {
      name = "TimorLeste";
      code = "TimorLeste";
    }
  } 
  record TM(String name, String code) implements Country {
    public TM {
      name = "Turkmenistan";
      code = "Turkmenistan";
    }
  } 
  record TN(String name, String code) implements Country {
    public TN {
      name = "Tunisia";
      code = "Tunisia";
    }
  } 
  record TO(String name, String code) implements Country {
    public TO {
      name = "Tonga";
      code = "Tonga";
    }
  } 
  record TR(String name, String code) implements Country {
    public TR {
      name = "Turkey";
      code = "Turkey";
    }
  } 
  record TT(String name, String code) implements Country {
    public TT {
      name = "Trinidad and Tobago";
      code = "TrinidadAndTobago";
    }
  } 
  record TV(String name, String code) implements Country {
    public TV {
      name = "Tuvalu";
      code = "Tuvalu";
    }
  } 
  record TW(String name, String code) implements Country {
    public TW {
      name = "Taiwan";
      code = "Taiwan";
    }
  } 
  record TZ(String name, String code) implements Country {
    public TZ {
      name = "Tanzania";
      code = "Tanzania";
    }
  } 
  record UA(String name, String code) implements Country {
    public UA {
      name = "Ukraine";
      code = "Ukraine";
    }
  } 
  record UG(String name, String code) implements Country {
    public UG {
      name = "Uganda";
      code = "Uganda";
    }
  } 
  record UM(String name, String code) implements Country {
    public UM {
      name = "United States Minor Outlying Islands";
      code = "UnitedStatesMinorOutlyingIslands";
    }
  } 
  record US(String name, String code) implements Country {
    public US {
      name = "United States of America";
      code = "UnitedStatesOfAmerica";
    }
  } 
  record UY(String name, String code) implements Country {
    public UY {
      name = "Uruguay";
      code = "Uruguay";
    }
  } 
  record UZ(String name, String code) implements Country {
    public UZ {
      name = "Uzbekistan";
      code = "Uzbekistan";
    }
  } 
  record VA(String name, String code) implements Country {
    public VA {
      name = "Holy See";
      code = "HolySee";
    }
  } 
  record VC(String name, String code) implements Country {
    public VC {
      name = "St Vincent and the Grenadines";
      code = "StVincentAndTheGrenadines";
    }
  } 
  record VE(String name, String code) implements Country {
    public VE {
      name = "Venezuela";
      code = "Venezuela";
    }
  } 
  record VG(String name, String code) implements Country {
    public VG {
      name = "British Virgin Islands";
      code = "BritishVirginIslands";
    }
  } 
  record VI(String name, String code) implements Country {
    public VI {
      name = "US Virgin Islands";
      code = "USVirginIslands";
    }
  } 
  record VN(String name, String code) implements Country {
    public VN {
      name = "Viet Nam";
      code = "VietNam";
    }
  } 
  record VU(String name, String code) implements Country {
    public VU {
      name = "Vanuatu";
      code = "Vanuatu";
    }
  } 
  record WF(String name, String code) implements Country {
    public WF {
      name = "Wallis and Futuna Islands";
      code = "WallisAndFutunaIslands";
    }
  } 
  record WS(String name, String code) implements Country {
    public WS {
      name = "Samoa";
      code = "Samoa";
    }
  } 
  record YE(String name, String code) implements Country {
    public YE {
      name = "Yemen";
      code = "Yemen";
    }
  } 
  record YT(String name, String code) implements Country {
    public YT {
      name = "Mayotte";
      code = "Mayotte";
    }
  } 
  record ZA(String name, String code) implements Country {
    public ZA {
      name = "South Africa";
      code = "SouthAfrica";
    }
  } 
  record ZM(String name, String code) implements Country {
    public ZM {
      name = "Zambia";
      code = "Zambia";
    }
  } 
  record ZW(String name, String code) implements Country {
    public ZW {
      name = "Zimbabwe";
      code = "Zimbabwe";
    }
  } 

}  
