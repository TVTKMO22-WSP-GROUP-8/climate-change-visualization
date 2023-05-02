package group_8.climatechangebackend.models;


import javax.persistence.*;

@Entity
@Table(name = "national_carbon_emissions_2021")
public class NationalCarbonEmissions2021 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "year")
    private Integer year;

    @Column(name = "Afghanistan")
    private Integer Afghanistan;

    @Column(name = "Albania")
    private Integer Albania;

    @Column(name = "Algeria")
    private Integer Algeria;

    @Column(name = "Andorra")
    private Integer Andorra;

    @Column(name = "Angola")
    private Integer Angola;

    @Column(name = "Anguilla")
    private Integer Anguilla;

    @Column(name = "Antigua_and_Barbuda")
    private Integer Antigua_and_Barbuda;

    @Column(name = "Argentina")
    private Integer Argentina;

    @Column(name = "Armenia")
    private Integer Armenia;

    @Column(name = "Aruba")
    private Integer Aruba;

    @Column(name = "Australia")
    private Integer Australia;

    @Column(name = "Austria")
    private Integer Austria;

    @Column(name = "Azerbaijan")
    private Integer Azerbaijan;

    @Column(name = "Bahamas")
    private Integer Bahamas;

    @Column(name = "Bahrain")
    private Integer Bahrain;

    @Column(name = "Bangladesh")
    private Integer Bangladesh;

    @Column(name = "Barbados")
    private Integer Barbados;

    @Column(name = "Belarus")
    private Integer Belarus;

    @Column(name = "Belgium")
    private Integer Belgium;

    @Column(name = "Belize")
    private Integer Belize;

    @Column(name = "Benin")
    private Integer Benin;

    @Column(name = "Bermuda")
    private Integer Bermuda;

    @Column(name = "Bhutan")
    private Integer Bhutan;

    @Column(name = "Bonaire_Saint_Eustatius_and_Saba")
    private Integer Bonaire_Saint_Eustatius_and_Saba;

    @Column(name = "Bosnia_and_Herzegovina")
    private Integer Bosnia_and_Herzegovina;

    @Column(name = "Botswana")
    private Integer Botswana;

    @Column(name = "Brazil")
    private Integer Brazil;

    @Column(name = "British_Virgin_Islands")
    private Integer British_Virgin_Islands;

    @Column(name = "Brunei_Darussalam")
    private Integer Brunei_Darussalam;

    @Column(name = "Bulgaria")
    private Integer Bulgaria;

    @Column(name = "Burkina_Faso")
    private Integer Burkina_Faso;

    @Column(name = "Burundi")
    private Integer Burundi;

    @Column(name = "Cambodia")
    private Integer Cambodia;

    @Column(name = "Canada")
    private Integer Canada;

    @Column(name = "Cape_Verde")
    private Integer Cape_Verde;

    @Column(name = "Central_African_Republic")
    private Integer Central_African_Republic;

    @Column(name = "Chad")
    private Integer Chad;

    @Column(name = "Chile")
    private Integer Chile;

    @Column(name = "China")
    private Integer China;

    @Column(name = "Colombia")
    private Integer Colombia;

    @Column(name = "Comoros")
    private Integer Comoros;

    @Column(name = "Congo")
    private Integer Congo;

    @Column(name = "Cook_Islands")
    private Integer Cook_Islands;

    @Column(name = "Costa_Rica")
    private Integer Costa_Rica;

    @Column(name = "Cote_dIvoire")
    private Integer Cote_dIvoire;

    @Column(name = "Croatia")
    private Integer Croatia;

    @Column(name = "Cuba")
    private Integer Cuba;

    @Column(name = "Curacao")
    private Integer Curacao;

    @Column(name = "Cyprus")
    private Integer Cyprus;

    @Column(name = "Czech_Republic")
    private Integer Czech_Republic;

    @Column(name = "North_Korea")
    private Integer North_Korea;

    @Column(name = "Democratic_Republic_of_the_Congo")
    private Integer Democratic_Republic_of_the_Congo;

    @Column(name = "Denmark")
    private Integer Denmark;

    @Column(name = "Djibouti")
    private Integer Djibouti;

    @Column(name = "Dominica")
    private Integer Dominica;

    @Column(name = "Dominican_Republic")
    private Integer Dominican_Republic;

    @Column(name = "Ecuador")
    private Integer Ecuador;

    @Column(name = "Egypt")
    private Integer Egypt;

    @Column(name = "El_Salvador")
    private Integer El_Salvador;

    @Column(name = "Equatorial_Guinea")
    private Integer Equatorial_Guinea;

    @Column(name = "Eritrea")
    private Integer Eritrea;

    @Column(name = "Estonia")
    private Integer Estonia;

    @Column(name = "Ethiopia")
    private Integer Ethiopia;

    @Column(name = "Faeroe_Islands")
    private Integer Faeroe_Islands;

    @Column(name = "Micronesia_Federated_States_of")
    private Integer Micronesia_Federated_States_of;

    @Column(name = "Fiji")
    private Integer Fiji;

    @Column(name = "Finland")
    private Integer Finland;

    @Column(name = "France")
    private Integer France;

    @Column(name = "French_Guiana")
    private Integer French_Guiana;

    @Column(name = "French_Polynesia")
    private Integer French_Polynesia;

    @Column(name = "Gabon")
    private Integer Gabon;

    @Column(name = "Gambia")
    private Integer Gambia;

    @Column(name = "Georgia")
    private Integer Georgia;

    @Column(name = "Germany")
    private Integer Germany;

    @Column(name = "Ghana")
    private Integer Ghana;

    @Column(name = "Greece")
    private Integer Greece;

    @Column(name = "Greenland")
    private Integer Greenland;

    @Column(name = "Grenada")
    private Integer Grenada;

    @Column(name = "Guadeloupe")
    private Integer Guadeloupe;

    @Column(name = "Guatemala")
    private Integer Guatemala;

    @Column(name = "Guinea")
    private Integer Guinea;

    @Column(name = "Guinea_Bissau")
    private Integer Guinea_Bissau;

    @Column(name = "Guyana")
    private Integer Guyana;

    @Column(name = "Haiti")
    private Integer Haiti;

    @Column(name = "Honduras")
    private Integer Honduras;

    @Column(name = "Hong_Kong")
    private Integer Hong_Kong;

    @Column(name = "Hungary")
    private Integer Hungary;

    @Column(name = "Iceland")
    private Integer Iceland;

    @Column(name = "India")
    private Integer India;

    @Column(name = "Indonesia")
    private Integer Indonesia;

    @Column(name = "Iraq")
    private Integer Iraq;

    @Column(name = "Ireland")
    private Integer Ireland;

    @Column(name = "Iran")
    private Integer Iran;

    @Column(name = "Israel")
    private Integer Israel;

    @Column(name = "Italy")
    private Integer Italy;

    @Column(name = "Jamaica")
    private Integer Jamaica;

    @Column(name = "Japan")
    private Integer Japan;

    @Column(name = "Jordan")
    private Integer Jordan;

    @Column(name = "Kazakhstan")
    private Integer Kazakhstan;

    @Column(name = "Kenya")
    private Integer Kenya;

    @Column(name = "Kiribati")
    private Integer Kiribati;

    @Column(name = "Kosovo")
    private Integer Kosovo;

    @Column(name = "Kuwait")
    private Integer Kuwait;

    @Column(name = "Kyrgyzstan")
    private Integer Kyrgyzstan;

    @Column(name = "Laos")
    private Integer Laos;

    @Column(name = "Latvia")
    private Integer Latvia;

    @Column(name = "Lebanon")
    private Integer Lebanon;

    @Column(name = "Lesotho")
    private Integer Lesotho;

    @Column(name = "Liberia")
    private Integer Liberia;

    @Column(name = "Libya")
    private Integer Libya;

    @Column(name = "Liechtenstein")
    private Integer Liechtenstein;

    @Column(name = "Lithuania")
    private Integer Lithuania;

    @Column(name = "Luxembourg")
    private Integer Luxembourg;

    @Column(name = "Macao")
    private Integer Macao;

    @Column(name = "North_Macedonia")
    private Integer North_Macedonia;

    @Column(name = "Madagascar")
    private Integer Madagascar;

    @Column(name = "Malawi")
    private Integer Malawi;

    @Column(name = "Malaysia")
    private Integer Malaysia;

    @Column(name = "Maldives")
    private Integer Maldives;

    @Column(name = "Mali")
    private Integer Mali;

    @Column(name = "Malta")
    private Integer Malta;

    @Column(name = "Marshall_Islands")
    private Integer Marshall_Islands;

    @Column(name = "Martinique")
    private Integer Martinique;

    @Column(name = "Mauritania")
    private Integer Mauritania;

    @Column(name = "Mauritius")
    private Integer Mauritius;

    @Column(name = "Mayotte")
    private Integer Mayotte;

    @Column(name = "Mexico")
    private Integer Mexico;

    @Column(name = "Mongolia")
    private Integer Mongolia;

    @Column(name = "Montenegro")
    private Integer Montenegro;

    @Column(name = "Montserrat")
    private Integer Montserrat;

    @Column(name = "Morocco")
    private Integer Morocco;

    @Column(name = "Mozambique")
    private Integer Mozambique;

    @Column(name = "Myanmar")
    private Integer Myanmar;

    @Column(name = "Namibia")
    private Integer Namibia;

    @Column(name = "Nauru")
    private Integer Nauru;

    @Column(name = "Nepal")
    private Integer Nepal;

    @Column(name = "Netherlands")
    private Integer Netherlands;

    @Column(name = "New_Caledonia")
    private Integer New_Caledonia;

    @Column(name = "New_Zealand")
    private Integer New_Zealand;

    @Column(name = "Nicaragua")
    private Integer Nicaragua;

    @Column(name = "Niger")
    private Integer Niger;

    @Column(name = "Nigeria")
    private Integer Nigeria;

    @Column(name = "Niue")
    private Integer Niue;

    @Column(name = "Norway")
    private Integer Norway;

    @Column(name = "Occupied_Palestinian_Territory")
    private Integer Occupied_Palestinian_Territory;

    @Column(name = "Oman")
    private Integer Oman;

    @Column(name = "Pakistan")
    private Integer Pakistan;

    @Column(name = "Palau")
    private Integer Palau;

    @Column(name = "Panama")
    private Integer Panama;

    @Column(name = "Papua_New_Guinea")
    private Integer Papua_New_Guinea;

    @Column(name = "Paraguay")
    private Integer Paraguay;

    @Column(name = "Peru")
    private Integer Peru;

    @Column(name = "Philippines")
    private Integer Philippines;

    @Column(name = "Bolivia")
    private Integer Bolivia;

    @Column(name = "Poland")
    private Integer Poland;

    @Column(name = "Portugal")
    private Integer Portugal;

    @Column(name = "Qatar")
    private Integer Qatar;

    @Column(name = "Cameroon")
    private Integer Cameroon;

    @Column(name = "South_Korea")
    private Integer South_Korea;

    @Column(name = "Moldova")
    private Integer Moldova;

    @Column(name = "South_Sudan")
    private Integer South_Sudan;

    @Column(name = "Sudan")
    private Integer Sudan;

    @Column(name = "Reunion")
    private Integer Reunion;

    @Column(name = "Romania")
    private Integer Romania;

    @Column(name = "Russian_Federation")
    private Integer Russian_Federation;

    @Column(name = "Rwanda")
    private Integer Rwanda;

    @Column(name = "Saint_Helena")
    private Integer Saint_Helena;

    @Column(name = "Saint_Lucia")
    private Integer Saint_Lucia;

    @Column(name = "Sint_Maarten_Dutch_part")
    private Integer Sint_Maarten_Dutch_part;

    @Column(name = "Samoa")
    private Integer Samoa;

    @Column(name = "Sao_Tome_and_Principe")
    private Integer Sao_Tome_and_Principe;

    @Column(name = "Saudi_Arabia")
    private Integer Saudi_Arabia;

    @Column(name = "Senegal")
    private Integer Senegal;

    @Column(name = "Serbia")
    private Integer Serbia;

    @Column(name = "Seychelles")
    private Integer Seychelles;

    @Column(name = "Sierra_Leone")
    private Integer Sierra_Leone;

    @Column(name = "Singapore")
    private Integer Singapore;

    @Column(name = "Slovakia")
    private Integer Slovakia;

    @Column(name = "Slovenia")
    private Integer Slovenia;

    @Column(name = "Solomon_Islands")
    private Integer Solomon_Islands;

    @Column(name = "Somalia")
    private Integer Somalia;

    @Column(name = "South_Africa")
    private Integer South_Africa;

    @Column(name = "Spain")
    private Integer Spain;

    @Column(name = "Sri_Lanka")
    private Integer Sri_Lanka;

    @Column(name = "Saint_Kitts_and_Nevis")
    private Integer Saint_Kitts_and_Nevis;

    @Column(name = "Saint_Pierre_and_Miquelon")
    private Integer Saint_Pierre_and_Miquelon;

    @Column(name = "Saint_Vincent_and_the_Grenadines")
    private Integer Saint_Vincent_and_the_Grenadines;

    @Column(name = "Suriname")
    private Integer Suriname;

    @Column(name = "Swaziland")
    private Integer Swaziland;

    @Column(name = "Syria")
    private Integer Syria;

    @Column(name = "Taiwan")
    private Integer Taiwan;

    @Column(name = "Tajikistan")
    private Integer Tajikistan;

    @Column(name = "Thailand")
    private Integer Thailand;

    @Column(name = "Timor_Leste")
    private Integer Timor_Leste;

    @Column(name = "Togo")
    private Integer Togo;

    @Column(name = "Tonga")
    private Integer Tonga;

    @Column(name = "Trinidad_and_Tobago")
    private Integer Trinidad_and_Tobago;

    @Column(name = "Tunisia")
    private Integer Tunisia;

    @Column(name = "Turkey")
    private Integer Turkey;

    @Column(name = "Turkmenistan")
    private Integer Turkmenistan;

    @Column(name = "Turks_and_Caicos_Islands")
    private Integer Turks_and_Caicos_Islands;

    @Column(name = "Tuvalu")
    private Integer Tuvalu;

    @Column(name = "Uganda")
    private Integer Uganda;

    @Column(name = "Ukraine")
    private Integer Ukraine;

    @Column(name = "United_Arab_Emirates")
    private Integer United_Arab_Emirates;

    @Column(name = "United_Kingdom")
    private Integer United_Kingdom;

    @Column(name = "Tanzania")
    private Integer Tanzania;

    @Column(name = "USA")
    private Integer USA;

    @Column(name = "Uruguay")
    private Integer Uruguay;

    @Column(name = "Uzbekistan")
    private Integer Uzbekistan;

    @Column(name = "Vanuatu")
    private Integer Vanuatu;

    @Column(name = "Venezuela")
    private Integer Venezuela;

    @Column(name = "Vietnam")
    private Integer Vietnam;

    @Column(name = "Wallis_and_Futuna_Islands")
    private Integer Wallis_and_Futuna_Islands;

    @Column(name = "Yemen")
    private Integer Yemen;

    @Column(name = "Zambia")
    private Integer Zambia;

    @Column(name = "Zimbabwe")
    private Integer Zimbabwe;

    @Column(name = "KP_Annex_B")
    private Integer KP_Annex_B;

    @Column(name = "Non_KP_Annex_B")
    private Integer Non_KP_Annex_B;

    @Column(name = "OECD")
    private Integer OECD;

    @Column(name = "Non_OECD")
    private Integer Non_OECD;

    @Column(name = "EU27")
    private Integer EU27;

    @Column(name = "Africa")
    private Integer Africa;

    @Column(name = "Asia")
    private Integer Asia;

    @Column(name = "Central_America")
    private Integer Central_America;

    @Column(name = "Europe")
    private Integer Europe;

    @Column(name = "Middle_East")
    private Integer Middle_East;

    @Column(name = "North_America")
    private Integer North_America;

    @Column(name = "Oceania")
    private Integer Oceania;

    @Column(name = "South_America")
    private Integer South_America;

    @Column(name = "Bunkers")
    private Integer Bunkers;

    @Column(name = "Statistical_Difference")
    private Integer Statistical_Difference;

    @Column(name = "World")
    private Integer World;

}
