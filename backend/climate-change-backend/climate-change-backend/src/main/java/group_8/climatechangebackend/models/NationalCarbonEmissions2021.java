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


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYear() {
        return this.year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getAfghanistan() {
        return this.Afghanistan;
    }

    public void setAfghanistan(Integer Afghanistan) {
        this.Afghanistan = Afghanistan;
    }

    public Integer getAlbania() {
        return this.Albania;
    }

    public void setAlbania(Integer Albania) {
        this.Albania = Albania;
    }

    public Integer getAlgeria() {
        return this.Algeria;
    }

    public void setAlgeria(Integer Algeria) {
        this.Algeria = Algeria;
    }

    public Integer getAndorra() {
        return this.Andorra;
    }

    public void setAndorra(Integer Andorra) {
        this.Andorra = Andorra;
    }

    public Integer getAngola() {
        return this.Angola;
    }

    public void setAngola(Integer Angola) {
        this.Angola = Angola;
    }

    public Integer getAnguilla() {
        return this.Anguilla;
    }

    public void setAnguilla(Integer Anguilla) {
        this.Anguilla = Anguilla;
    }

    public Integer getAntigua_and_Barbuda() {
        return this.Antigua_and_Barbuda;
    }

    public void setAntigua_and_Barbuda(Integer Antigua_and_Barbuda) {
        this.Antigua_and_Barbuda = Antigua_and_Barbuda;
    }

    public Integer getArgentina() {
        return this.Argentina;
    }

    public void setArgentina(Integer Argentina) {
        this.Argentina = Argentina;
    }

    public Integer getArmenia() {
        return this.Armenia;
    }

    public void setArmenia(Integer Armenia) {
        this.Armenia = Armenia;
    }

    public Integer getAruba() {
        return this.Aruba;
    }

    public void setAruba(Integer Aruba) {
        this.Aruba = Aruba;
    }

    public Integer getAustralia() {
        return this.Australia;
    }

    public void setAustralia(Integer Australia) {
        this.Australia = Australia;
    }

    public Integer getAustria() {
        return this.Austria;
    }

    public void setAustria(Integer Austria) {
        this.Austria = Austria;
    }

    public Integer getAzerbaijan() {
        return this.Azerbaijan;
    }

    public void setAzerbaijan(Integer Azerbaijan) {
        this.Azerbaijan = Azerbaijan;
    }

    public Integer getBahamas() {
        return this.Bahamas;
    }

    public void setBahamas(Integer Bahamas) {
        this.Bahamas = Bahamas;
    }

    public Integer getBahrain() {
        return this.Bahrain;
    }

    public void setBahrain(Integer Bahrain) {
        this.Bahrain = Bahrain;
    }

    public Integer getBangladesh() {
        return this.Bangladesh;
    }

    public void setBangladesh(Integer Bangladesh) {
        this.Bangladesh = Bangladesh;
    }

    public Integer getBarbados() {
        return this.Barbados;
    }

    public void setBarbados(Integer Barbados) {
        this.Barbados = Barbados;
    }

    public Integer getBelarus() {
        return this.Belarus;
    }

    public void setBelarus(Integer Belarus) {
        this.Belarus = Belarus;
    }

    public Integer getBelgium() {
        return this.Belgium;
    }

    public void setBelgium(Integer Belgium) {
        this.Belgium = Belgium;
    }

    public Integer getBelize() {
        return this.Belize;
    }

    public void setBelize(Integer Belize) {
        this.Belize = Belize;
    }

    public Integer getBenin() {
        return this.Benin;
    }

    public void setBenin(Integer Benin) {
        this.Benin = Benin;
    }

    public Integer getBermuda() {
        return this.Bermuda;
    }

    public void setBermuda(Integer Bermuda) {
        this.Bermuda = Bermuda;
    }

    public Integer getBhutan() {
        return this.Bhutan;
    }

    public void setBhutan(Integer Bhutan) {
        this.Bhutan = Bhutan;
    }

    public Integer getBonaire_Saint_Eustatius_and_Saba() {
        return this.Bonaire_Saint_Eustatius_and_Saba;
    }

    public void setBonaire_Saint_Eustatius_and_Saba(Integer Bonaire_Saint_Eustatius_and_Saba) {
        this.Bonaire_Saint_Eustatius_and_Saba = Bonaire_Saint_Eustatius_and_Saba;
    }

    public Integer getBosnia_and_Herzegovina() {
        return this.Bosnia_and_Herzegovina;
    }

    public void setBosnia_and_Herzegovina(Integer Bosnia_and_Herzegovina) {
        this.Bosnia_and_Herzegovina = Bosnia_and_Herzegovina;
    }

    public Integer getBotswana() {
        return this.Botswana;
    }

    public void setBotswana(Integer Botswana) {
        this.Botswana = Botswana;
    }

    public Integer getBrazil() {
        return this.Brazil;
    }

    public void setBrazil(Integer Brazil) {
        this.Brazil = Brazil;
    }

    public Integer getBritish_Virgin_Islands() {
        return this.British_Virgin_Islands;
    }

    public void setBritish_Virgin_Islands(Integer British_Virgin_Islands) {
        this.British_Virgin_Islands = British_Virgin_Islands;
    }

    public Integer getBrunei_Darussalam() {
        return this.Brunei_Darussalam;
    }

    public void setBrunei_Darussalam(Integer Brunei_Darussalam) {
        this.Brunei_Darussalam = Brunei_Darussalam;
    }

    public Integer getBulgaria() {
        return this.Bulgaria;
    }

    public void setBulgaria(Integer Bulgaria) {
        this.Bulgaria = Bulgaria;
    }

    public Integer getBurkina_Faso() {
        return this.Burkina_Faso;
    }

    public void setBurkina_Faso(Integer Burkina_Faso) {
        this.Burkina_Faso = Burkina_Faso;
    }

    public Integer getBurundi() {
        return this.Burundi;
    }

    public void setBurundi(Integer Burundi) {
        this.Burundi = Burundi;
    }

    public Integer getCambodia() {
        return this.Cambodia;
    }

    public void setCambodia(Integer Cambodia) {
        this.Cambodia = Cambodia;
    }

    public Integer getCanada() {
        return this.Canada;
    }

    public void setCanada(Integer Canada) {
        this.Canada = Canada;
    }

    public Integer getCape_Verde() {
        return this.Cape_Verde;
    }

    public void setCape_Verde(Integer Cape_Verde) {
        this.Cape_Verde = Cape_Verde;
    }

    public Integer getCentral_African_Republic() {
        return this.Central_African_Republic;
    }

    public void setCentral_African_Republic(Integer Central_African_Republic) {
        this.Central_African_Republic = Central_African_Republic;
    }

    public Integer getChad() {
        return this.Chad;
    }

    public void setChad(Integer Chad) {
        this.Chad = Chad;
    }

    public Integer getChile() {
        return this.Chile;
    }

    public void setChile(Integer Chile) {
        this.Chile = Chile;
    }

    public Integer getChina() {
        return this.China;
    }

    public void setChina(Integer China) {
        this.China = China;
    }

    public Integer getColombia() {
        return this.Colombia;
    }

    public void setColombia(Integer Colombia) {
        this.Colombia = Colombia;
    }

    public Integer getComoros() {
        return this.Comoros;
    }

    public void setComoros(Integer Comoros) {
        this.Comoros = Comoros;
    }

    public Integer getCongo() {
        return this.Congo;
    }

    public void setCongo(Integer Congo) {
        this.Congo = Congo;
    }

    public Integer getCook_Islands() {
        return this.Cook_Islands;
    }

    public void setCook_Islands(Integer Cook_Islands) {
        this.Cook_Islands = Cook_Islands;
    }

    public Integer getCosta_Rica() {
        return this.Costa_Rica;
    }

    public void setCosta_Rica(Integer Costa_Rica) {
        this.Costa_Rica = Costa_Rica;
    }

    public Integer getCote_dIvoire() {
        return this.Cote_dIvoire;
    }

    public void setCote_dIvoire(Integer Cote_dIvoire) {
        this.Cote_dIvoire = Cote_dIvoire;
    }

    public Integer getCroatia() {
        return this.Croatia;
    }

    public void setCroatia(Integer Croatia) {
        this.Croatia = Croatia;
    }

    public Integer getCuba() {
        return this.Cuba;
    }

    public void setCuba(Integer Cuba) {
        this.Cuba = Cuba;
    }

    public Integer getCuracao() {
        return this.Curacao;
    }

    public void setCuracao(Integer Curacao) {
        this.Curacao = Curacao;
    }

    public Integer getCyprus() {
        return this.Cyprus;
    }

    public void setCyprus(Integer Cyprus) {
        this.Cyprus = Cyprus;
    }

    public Integer getCzech_Republic() {
        return this.Czech_Republic;
    }

    public void setCzech_Republic(Integer Czech_Republic) {
        this.Czech_Republic = Czech_Republic;
    }

    public Integer getNorth_Korea() {
        return this.North_Korea;
    }

    public void setNorth_Korea(Integer North_Korea) {
        this.North_Korea = North_Korea;
    }

    public Integer getDemocratic_Republic_of_the_Congo() {
        return this.Democratic_Republic_of_the_Congo;
    }

    public void setDemocratic_Republic_of_the_Congo(Integer Democratic_Republic_of_the_Congo) {
        this.Democratic_Republic_of_the_Congo = Democratic_Republic_of_the_Congo;
    }

    public Integer getDenmark() {
        return this.Denmark;
    }

    public void setDenmark(Integer Denmark) {
        this.Denmark = Denmark;
    }

    public Integer getDjibouti() {
        return this.Djibouti;
    }

    public void setDjibouti(Integer Djibouti) {
        this.Djibouti = Djibouti;
    }

    public Integer getDominica() {
        return this.Dominica;
    }

    public void setDominica(Integer Dominica) {
        this.Dominica = Dominica;
    }

    public Integer getDominican_Republic() {
        return this.Dominican_Republic;
    }

    public void setDominican_Republic(Integer Dominican_Republic) {
        this.Dominican_Republic = Dominican_Republic;
    }

    public Integer getEcuador() {
        return this.Ecuador;
    }

    public void setEcuador(Integer Ecuador) {
        this.Ecuador = Ecuador;
    }

    public Integer getEgypt() {
        return this.Egypt;
    }

    public void setEgypt(Integer Egypt) {
        this.Egypt = Egypt;
    }

    public Integer getEl_Salvador() {
        return this.El_Salvador;
    }

    public void setEl_Salvador(Integer El_Salvador) {
        this.El_Salvador = El_Salvador;
    }

    public Integer getEquatorial_Guinea() {
        return this.Equatorial_Guinea;
    }

    public void setEquatorial_Guinea(Integer Equatorial_Guinea) {
        this.Equatorial_Guinea = Equatorial_Guinea;
    }

    public Integer getEritrea() {
        return this.Eritrea;
    }

    public void setEritrea(Integer Eritrea) {
        this.Eritrea = Eritrea;
    }

    public Integer getEstonia() {
        return this.Estonia;
    }

    public void setEstonia(Integer Estonia) {
        this.Estonia = Estonia;
    }

    public Integer getEthiopia() {
        return this.Ethiopia;
    }

    public void setEthiopia(Integer Ethiopia) {
        this.Ethiopia = Ethiopia;
    }

    public Integer getFaeroe_Islands() {
        return this.Faeroe_Islands;
    }

    public void setFaeroe_Islands(Integer Faeroe_Islands) {
        this.Faeroe_Islands = Faeroe_Islands;
    }

    public Integer getMicronesia_Federated_States_of() {
        return this.Micronesia_Federated_States_of;
    }

    public void setMicronesia_Federated_States_of(Integer Micronesia_Federated_States_of) {
        this.Micronesia_Federated_States_of = Micronesia_Federated_States_of;
    }

    public Integer getFiji() {
        return this.Fiji;
    }

    public void setFiji(Integer Fiji) {
        this.Fiji = Fiji;
    }

    public Integer getFinland() {
        return this.Finland;
    }

    public void setFinland(Integer Finland) {
        this.Finland = Finland;
    }

    public Integer getFrance() {
        return this.France;
    }

    public void setFrance(Integer France) {
        this.France = France;
    }

    public Integer getFrench_Guiana() {
        return this.French_Guiana;
    }

    public void setFrench_Guiana(Integer French_Guiana) {
        this.French_Guiana = French_Guiana;
    }

    public Integer getFrench_Polynesia() {
        return this.French_Polynesia;
    }

    public void setFrench_Polynesia(Integer French_Polynesia) {
        this.French_Polynesia = French_Polynesia;
    }

    public Integer getGabon() {
        return this.Gabon;
    }

    public void setGabon(Integer Gabon) {
        this.Gabon = Gabon;
    }

    public Integer getGambia() {
        return this.Gambia;
    }

    public void setGambia(Integer Gambia) {
        this.Gambia = Gambia;
    }

    public Integer getGeorgia() {
        return this.Georgia;
    }

    public void setGeorgia(Integer Georgia) {
        this.Georgia = Georgia;
    }

    public Integer getGermany() {
        return this.Germany;
    }

    public void setGermany(Integer Germany) {
        this.Germany = Germany;
    }

    public Integer getGhana() {
        return this.Ghana;
    }

    public void setGhana(Integer Ghana) {
        this.Ghana = Ghana;
    }

    public Integer getGreece() {
        return this.Greece;
    }

    public void setGreece(Integer Greece) {
        this.Greece = Greece;
    }

    public Integer getGreenland() {
        return this.Greenland;
    }

    public void setGreenland(Integer Greenland) {
        this.Greenland = Greenland;
    }

    public Integer getGrenada() {
        return this.Grenada;
    }

    public void setGrenada(Integer Grenada) {
        this.Grenada = Grenada;
    }

    public Integer getGuadeloupe() {
        return this.Guadeloupe;
    }

    public void setGuadeloupe(Integer Guadeloupe) {
        this.Guadeloupe = Guadeloupe;
    }

    public Integer getGuatemala() {
        return this.Guatemala;
    }

    public void setGuatemala(Integer Guatemala) {
        this.Guatemala = Guatemala;
    }

    public Integer getGuinea() {
        return this.Guinea;
    }

    public void setGuinea(Integer Guinea) {
        this.Guinea = Guinea;
    }

    public Integer getGuinea_Bissau() {
        return this.Guinea_Bissau;
    }

    public void setGuinea_Bissau(Integer Guinea_Bissau) {
        this.Guinea_Bissau = Guinea_Bissau;
    }

    public Integer getGuyana() {
        return this.Guyana;
    }

    public void setGuyana(Integer Guyana) {
        this.Guyana = Guyana;
    }

    public Integer getHaiti() {
        return this.Haiti;
    }

    public void setHaiti(Integer Haiti) {
        this.Haiti = Haiti;
    }

    public Integer getHonduras() {
        return this.Honduras;
    }

    public void setHonduras(Integer Honduras) {
        this.Honduras = Honduras;
    }

    public Integer getHong_Kong() {
        return this.Hong_Kong;
    }

    public void setHong_Kong(Integer Hong_Kong) {
        this.Hong_Kong = Hong_Kong;
    }

    public Integer getHungary() {
        return this.Hungary;
    }

    public void setHungary(Integer Hungary) {
        this.Hungary = Hungary;
    }

    public Integer getIceland() {
        return this.Iceland;
    }

    public void setIceland(Integer Iceland) {
        this.Iceland = Iceland;
    }

    public Integer getIndia() {
        return this.India;
    }

    public void setIndia(Integer India) {
        this.India = India;
    }

    public Integer getIndonesia() {
        return this.Indonesia;
    }

    public void setIndonesia(Integer Indonesia) {
        this.Indonesia = Indonesia;
    }

    public Integer getIraq() {
        return this.Iraq;
    }

    public void setIraq(Integer Iraq) {
        this.Iraq = Iraq;
    }

    public Integer getIreland() {
        return this.Ireland;
    }

    public void setIreland(Integer Ireland) {
        this.Ireland = Ireland;
    }

    public Integer getIran() {
        return this.Iran;
    }

    public void setIran(Integer Iran) {
        this.Iran = Iran;
    }

    public Integer getIsrael() {
        return this.Israel;
    }

    public void setIsrael(Integer Israel) {
        this.Israel = Israel;
    }

    public Integer getItaly() {
        return this.Italy;
    }

    public void setItaly(Integer Italy) {
        this.Italy = Italy;
    }

    public Integer getJamaica() {
        return this.Jamaica;
    }

    public void setJamaica(Integer Jamaica) {
        this.Jamaica = Jamaica;
    }

    public Integer getJapan() {
        return this.Japan;
    }

    public void setJapan(Integer Japan) {
        this.Japan = Japan;
    }

    public Integer getJordan() {
        return this.Jordan;
    }

    public void setJordan(Integer Jordan) {
        this.Jordan = Jordan;
    }

    public Integer getKazakhstan() {
        return this.Kazakhstan;
    }

    public void setKazakhstan(Integer Kazakhstan) {
        this.Kazakhstan = Kazakhstan;
    }

    public Integer getKenya() {
        return this.Kenya;
    }

    public void setKenya(Integer Kenya) {
        this.Kenya = Kenya;
    }

    public Integer getKiribati() {
        return this.Kiribati;
    }

    public void setKiribati(Integer Kiribati) {
        this.Kiribati = Kiribati;
    }

    public Integer getKosovo() {
        return this.Kosovo;
    }

    public void setKosovo(Integer Kosovo) {
        this.Kosovo = Kosovo;
    }

    public Integer getKuwait() {
        return this.Kuwait;
    }

    public void setKuwait(Integer Kuwait) {
        this.Kuwait = Kuwait;
    }

    public Integer getKyrgyzstan() {
        return this.Kyrgyzstan;
    }

    public void setKyrgyzstan(Integer Kyrgyzstan) {
        this.Kyrgyzstan = Kyrgyzstan;
    }

    public Integer getLaos() {
        return this.Laos;
    }

    public void setLaos(Integer Laos) {
        this.Laos = Laos;
    }

    public Integer getLatvia() {
        return this.Latvia;
    }

    public void setLatvia(Integer Latvia) {
        this.Latvia = Latvia;
    }

    public Integer getLebanon() {
        return this.Lebanon;
    }

    public void setLebanon(Integer Lebanon) {
        this.Lebanon = Lebanon;
    }

    public Integer getLesotho() {
        return this.Lesotho;
    }

    public void setLesotho(Integer Lesotho) {
        this.Lesotho = Lesotho;
    }

    public Integer getLiberia() {
        return this.Liberia;
    }

    public void setLiberia(Integer Liberia) {
        this.Liberia = Liberia;
    }

    public Integer getLibya() {
        return this.Libya;
    }

    public void setLibya(Integer Libya) {
        this.Libya = Libya;
    }

    public Integer getLiechtenstein() {
        return this.Liechtenstein;
    }

    public void setLiechtenstein(Integer Liechtenstein) {
        this.Liechtenstein = Liechtenstein;
    }

    public Integer getLithuania() {
        return this.Lithuania;
    }

    public void setLithuania(Integer Lithuania) {
        this.Lithuania = Lithuania;
    }

    public Integer getLuxembourg() {
        return this.Luxembourg;
    }

    public void setLuxembourg(Integer Luxembourg) {
        this.Luxembourg = Luxembourg;
    }

    public Integer getMacao() {
        return this.Macao;
    }

    public void setMacao(Integer Macao) {
        this.Macao = Macao;
    }

    public Integer getNorth_Macedonia() {
        return this.North_Macedonia;
    }

    public void setNorth_Macedonia(Integer North_Macedonia) {
        this.North_Macedonia = North_Macedonia;
    }

    public Integer getMadagascar() {
        return this.Madagascar;
    }

    public void setMadagascar(Integer Madagascar) {
        this.Madagascar = Madagascar;
    }

    public Integer getMalawi() {
        return this.Malawi;
    }

    public void setMalawi(Integer Malawi) {
        this.Malawi = Malawi;
    }

    public Integer getMalaysia() {
        return this.Malaysia;
    }

    public void setMalaysia(Integer Malaysia) {
        this.Malaysia = Malaysia;
    }

    public Integer getMaldives() {
        return this.Maldives;
    }

    public void setMaldives(Integer Maldives) {
        this.Maldives = Maldives;
    }

    public Integer getMali() {
        return this.Mali;
    }

    public void setMali(Integer Mali) {
        this.Mali = Mali;
    }

    public Integer getMalta() {
        return this.Malta;
    }

    public void setMalta(Integer Malta) {
        this.Malta = Malta;
    }

    public Integer getMarshall_Islands() {
        return this.Marshall_Islands;
    }

    public void setMarshall_Islands(Integer Marshall_Islands) {
        this.Marshall_Islands = Marshall_Islands;
    }

    public Integer getMartinique() {
        return this.Martinique;
    }

    public void setMartinique(Integer Martinique) {
        this.Martinique = Martinique;
    }

    public Integer getMauritania() {
        return this.Mauritania;
    }

    public void setMauritania(Integer Mauritania) {
        this.Mauritania = Mauritania;
    }

    public Integer getMauritius() {
        return this.Mauritius;
    }

    public void setMauritius(Integer Mauritius) {
        this.Mauritius = Mauritius;
    }

    public Integer getMayotte() {
        return this.Mayotte;
    }

    public void setMayotte(Integer Mayotte) {
        this.Mayotte = Mayotte;
    }

    public Integer getMexico() {
        return this.Mexico;
    }

    public void setMexico(Integer Mexico) {
        this.Mexico = Mexico;
    }

    public Integer getMongolia() {
        return this.Mongolia;
    }

    public void setMongolia(Integer Mongolia) {
        this.Mongolia = Mongolia;
    }

    public Integer getMontenegro() {
        return this.Montenegro;
    }

    public void setMontenegro(Integer Montenegro) {
        this.Montenegro = Montenegro;
    }

    public Integer getMontserrat() {
        return this.Montserrat;
    }

    public void setMontserrat(Integer Montserrat) {
        this.Montserrat = Montserrat;
    }

    public Integer getMorocco() {
        return this.Morocco;
    }

    public void setMorocco(Integer Morocco) {
        this.Morocco = Morocco;
    }

    public Integer getMozambique() {
        return this.Mozambique;
    }

    public void setMozambique(Integer Mozambique) {
        this.Mozambique = Mozambique;
    }

    public Integer getMyanmar() {
        return this.Myanmar;
    }

    public void setMyanmar(Integer Myanmar) {
        this.Myanmar = Myanmar;
    }

    public Integer getNamibia() {
        return this.Namibia;
    }

    public void setNamibia(Integer Namibia) {
        this.Namibia = Namibia;
    }

    public Integer getNauru() {
        return this.Nauru;
    }

    public void setNauru(Integer Nauru) {
        this.Nauru = Nauru;
    }

    public Integer getNepal() {
        return this.Nepal;
    }

    public void setNepal(Integer Nepal) {
        this.Nepal = Nepal;
    }

    public Integer getNetherlands() {
        return this.Netherlands;
    }

    public void setNetherlands(Integer Netherlands) {
        this.Netherlands = Netherlands;
    }

    public Integer getNew_Caledonia() {
        return this.New_Caledonia;
    }

    public void setNew_Caledonia(Integer New_Caledonia) {
        this.New_Caledonia = New_Caledonia;
    }

    public Integer getNew_Zealand() {
        return this.New_Zealand;
    }

    public void setNew_Zealand(Integer New_Zealand) {
        this.New_Zealand = New_Zealand;
    }

    public Integer getNicaragua() {
        return this.Nicaragua;
    }

    public void setNicaragua(Integer Nicaragua) {
        this.Nicaragua = Nicaragua;
    }

    public Integer getNiger() {
        return this.Niger;
    }

    public void setNiger(Integer Niger) {
        this.Niger = Niger;
    }

    public Integer getNigeria() {
        return this.Nigeria;
    }

    public void setNigeria(Integer Nigeria) {
        this.Nigeria = Nigeria;
    }

    public Integer getNiue() {
        return this.Niue;
    }

    public void setNiue(Integer Niue) {
        this.Niue = Niue;
    }

    public Integer getNorway() {
        return this.Norway;
    }

    public void setNorway(Integer Norway) {
        this.Norway = Norway;
    }

    public Integer getOccupied_Palestinian_Territory() {
        return this.Occupied_Palestinian_Territory;
    }

    public void setOccupied_Palestinian_Territory(Integer Occupied_Palestinian_Territory) {
        this.Occupied_Palestinian_Territory = Occupied_Palestinian_Territory;
    }

    public Integer getOman() {
        return this.Oman;
    }

    public void setOman(Integer Oman) {
        this.Oman = Oman;
    }

    public Integer getPakistan() {
        return this.Pakistan;
    }

    public void setPakistan(Integer Pakistan) {
        this.Pakistan = Pakistan;
    }

    public Integer getPalau() {
        return this.Palau;
    }

    public void setPalau(Integer Palau) {
        this.Palau = Palau;
    }

    public Integer getPanama() {
        return this.Panama;
    }

    public void setPanama(Integer Panama) {
        this.Panama = Panama;
    }

    public Integer getPapua_New_Guinea() {
        return this.Papua_New_Guinea;
    }

    public void setPapua_New_Guinea(Integer Papua_New_Guinea) {
        this.Papua_New_Guinea = Papua_New_Guinea;
    }

    public Integer getParaguay() {
        return this.Paraguay;
    }

    public void setParaguay(Integer Paraguay) {
        this.Paraguay = Paraguay;
    }

    public Integer getPeru() {
        return this.Peru;
    }

    public void setPeru(Integer Peru) {
        this.Peru = Peru;
    }

    public Integer getPhilippines() {
        return this.Philippines;
    }

    public void setPhilippines(Integer Philippines) {
        this.Philippines = Philippines;
    }

    public Integer getBolivia() {
        return this.Bolivia;
    }

    public void setBolivia(Integer Bolivia) {
        this.Bolivia = Bolivia;
    }

    public Integer getPoland() {
        return this.Poland;
    }

    public void setPoland(Integer Poland) {
        this.Poland = Poland;
    }

    public Integer getPortugal() {
        return this.Portugal;
    }

    public void setPortugal(Integer Portugal) {
        this.Portugal = Portugal;
    }

    public Integer getQatar() {
        return this.Qatar;
    }

    public void setQatar(Integer Qatar) {
        this.Qatar = Qatar;
    }

    public Integer getCameroon() {
        return this.Cameroon;
    }

    public void setCameroon(Integer Cameroon) {
        this.Cameroon = Cameroon;
    }

    public Integer getSouth_Korea() {
        return this.South_Korea;
    }

    public void setSouth_Korea(Integer South_Korea) {
        this.South_Korea = South_Korea;
    }

    public Integer getMoldova() {
        return this.Moldova;
    }

    public void setMoldova(Integer Moldova) {
        this.Moldova = Moldova;
    }

    public Integer getSouth_Sudan() {
        return this.South_Sudan;
    }

    public void setSouth_Sudan(Integer South_Sudan) {
        this.South_Sudan = South_Sudan;
    }

    public Integer getSudan() {
        return this.Sudan;
    }

    public void setSudan(Integer Sudan) {
        this.Sudan = Sudan;
    }

    public Integer getReunion() {
        return this.Reunion;
    }

    public void setReunion(Integer Reunion) {
        this.Reunion = Reunion;
    }

    public Integer getRomania() {
        return this.Romania;
    }

    public void setRomania(Integer Romania) {
        this.Romania = Romania;
    }

    public Integer getRussian_Federation() {
        return this.Russian_Federation;
    }

    public void setRussian_Federation(Integer Russian_Federation) {
        this.Russian_Federation = Russian_Federation;
    }

    public Integer getRwanda() {
        return this.Rwanda;
    }

    public void setRwanda(Integer Rwanda) {
        this.Rwanda = Rwanda;
    }

    public Integer getSaint_Helena() {
        return this.Saint_Helena;
    }

    public void setSaint_Helena(Integer Saint_Helena) {
        this.Saint_Helena = Saint_Helena;
    }

    public Integer getSaint_Lucia() {
        return this.Saint_Lucia;
    }

    public void setSaint_Lucia(Integer Saint_Lucia) {
        this.Saint_Lucia = Saint_Lucia;
    }

    public Integer getSint_Maarten_Dutch_part() {
        return this.Sint_Maarten_Dutch_part;
    }

    public void setSint_Maarten_Dutch_part(Integer Sint_Maarten_Dutch_part) {
        this.Sint_Maarten_Dutch_part = Sint_Maarten_Dutch_part;
    }

    public Integer getSamoa() {
        return this.Samoa;
    }

    public void setSamoa(Integer Samoa) {
        this.Samoa = Samoa;
    }

    public Integer getSao_Tome_and_Principe() {
        return this.Sao_Tome_and_Principe;
    }

    public void setSao_Tome_and_Principe(Integer Sao_Tome_and_Principe) {
        this.Sao_Tome_and_Principe = Sao_Tome_and_Principe;
    }

    public Integer getSaudi_Arabia() {
        return this.Saudi_Arabia;
    }

    public void setSaudi_Arabia(Integer Saudi_Arabia) {
        this.Saudi_Arabia = Saudi_Arabia;
    }

    public Integer getSenegal() {
        return this.Senegal;
    }

    public void setSenegal(Integer Senegal) {
        this.Senegal = Senegal;
    }

    public Integer getSerbia() {
        return this.Serbia;
    }

    public void setSerbia(Integer Serbia) {
        this.Serbia = Serbia;
    }

    public Integer getSeychelles() {
        return this.Seychelles;
    }

    public void setSeychelles(Integer Seychelles) {
        this.Seychelles = Seychelles;
    }

    public Integer getSierra_Leone() {
        return this.Sierra_Leone;
    }

    public void setSierra_Leone(Integer Sierra_Leone) {
        this.Sierra_Leone = Sierra_Leone;
    }

    public Integer getSingapore() {
        return this.Singapore;
    }

    public void setSingapore(Integer Singapore) {
        this.Singapore = Singapore;
    }

    public Integer getSlovakia() {
        return this.Slovakia;
    }

    public void setSlovakia(Integer Slovakia) {
        this.Slovakia = Slovakia;
    }

    public Integer getSlovenia() {
        return this.Slovenia;
    }

    public void setSlovenia(Integer Slovenia) {
        this.Slovenia = Slovenia;
    }

    public Integer getSolomon_Islands() {
        return this.Solomon_Islands;
    }

    public void setSolomon_Islands(Integer Solomon_Islands) {
        this.Solomon_Islands = Solomon_Islands;
    }

    public Integer getSomalia() {
        return this.Somalia;
    }

    public void setSomalia(Integer Somalia) {
        this.Somalia = Somalia;
    }

    public Integer getSouth_Africa() {
        return this.South_Africa;
    }

    public void setSouth_Africa(Integer South_Africa) {
        this.South_Africa = South_Africa;
    }

    public Integer getSpain() {
        return this.Spain;
    }

    public void setSpain(Integer Spain) {
        this.Spain = Spain;
    }

    public Integer getSri_Lanka() {
        return this.Sri_Lanka;
    }

    public void setSri_Lanka(Integer Sri_Lanka) {
        this.Sri_Lanka = Sri_Lanka;
    }

    public Integer getSaint_Kitts_and_Nevis() {
        return this.Saint_Kitts_and_Nevis;
    }

    public void setSaint_Kitts_and_Nevis(Integer Saint_Kitts_and_Nevis) {
        this.Saint_Kitts_and_Nevis = Saint_Kitts_and_Nevis;
    }

    public Integer getSaint_Pierre_and_Miquelon() {
        return this.Saint_Pierre_and_Miquelon;
    }

    public void setSaint_Pierre_and_Miquelon(Integer Saint_Pierre_and_Miquelon) {
        this.Saint_Pierre_and_Miquelon = Saint_Pierre_and_Miquelon;
    }

    public Integer getSaint_Vincent_and_the_Grenadines() {
        return this.Saint_Vincent_and_the_Grenadines;
    }

    public void setSaint_Vincent_and_the_Grenadines(Integer Saint_Vincent_and_the_Grenadines) {
        this.Saint_Vincent_and_the_Grenadines = Saint_Vincent_and_the_Grenadines;
    }

    public Integer getSuriname() {
        return this.Suriname;
    }

    public void setSuriname(Integer Suriname) {
        this.Suriname = Suriname;
    }

    public Integer getSwaziland() {
        return this.Swaziland;
    }

    public void setSwaziland(Integer Swaziland) {
        this.Swaziland = Swaziland;
    }

    public Integer getSyria() {
        return this.Syria;
    }

    public void setSyria(Integer Syria) {
        this.Syria = Syria;
    }

    public Integer getTaiwan() {
        return this.Taiwan;
    }

    public void setTaiwan(Integer Taiwan) {
        this.Taiwan = Taiwan;
    }

    public Integer getTajikistan() {
        return this.Tajikistan;
    }

    public void setTajikistan(Integer Tajikistan) {
        this.Tajikistan = Tajikistan;
    }

    public Integer getThailand() {
        return this.Thailand;
    }

    public void setThailand(Integer Thailand) {
        this.Thailand = Thailand;
    }

    public Integer getTimor_Leste() {
        return this.Timor_Leste;
    }

    public void setTimor_Leste(Integer Timor_Leste) {
        this.Timor_Leste = Timor_Leste;
    }

    public Integer getTogo() {
        return this.Togo;
    }

    public void setTogo(Integer Togo) {
        this.Togo = Togo;
    }

    public Integer getTonga() {
        return this.Tonga;
    }

    public void setTonga(Integer Tonga) {
        this.Tonga = Tonga;
    }

    public Integer getTrinidad_and_Tobago() {
        return this.Trinidad_and_Tobago;
    }

    public void setTrinidad_and_Tobago(Integer Trinidad_and_Tobago) {
        this.Trinidad_and_Tobago = Trinidad_and_Tobago;
    }

    public Integer getTunisia() {
        return this.Tunisia;
    }

    public void setTunisia(Integer Tunisia) {
        this.Tunisia = Tunisia;
    }

    public Integer getTurkey() {
        return this.Turkey;
    }

    public void setTurkey(Integer Turkey) {
        this.Turkey = Turkey;
    }

    public Integer getTurkmenistan() {
        return this.Turkmenistan;
    }

    public void setTurkmenistan(Integer Turkmenistan) {
        this.Turkmenistan = Turkmenistan;
    }

    public Integer getTurks_and_Caicos_Islands() {
        return this.Turks_and_Caicos_Islands;
    }

    public void setTurks_and_Caicos_Islands(Integer Turks_and_Caicos_Islands) {
        this.Turks_and_Caicos_Islands = Turks_and_Caicos_Islands;
    }

    public Integer getTuvalu() {
        return this.Tuvalu;
    }

    public void setTuvalu(Integer Tuvalu) {
        this.Tuvalu = Tuvalu;
    }

    public Integer getUganda() {
        return this.Uganda;
    }

    public void setUganda(Integer Uganda) {
        this.Uganda = Uganda;
    }

    public Integer getUkraine() {
        return this.Ukraine;
    }

    public void setUkraine(Integer Ukraine) {
        this.Ukraine = Ukraine;
    }

    public Integer getUnited_Arab_Emirates() {
        return this.United_Arab_Emirates;
    }

    public void setUnited_Arab_Emirates(Integer United_Arab_Emirates) {
        this.United_Arab_Emirates = United_Arab_Emirates;
    }

    public Integer getUnited_Kingdom() {
        return this.United_Kingdom;
    }

    public void setUnited_Kingdom(Integer United_Kingdom) {
        this.United_Kingdom = United_Kingdom;
    }

    public Integer getTanzania() {
        return this.Tanzania;
    }

    public void setTanzania(Integer Tanzania) {
        this.Tanzania = Tanzania;
    }

    public Integer getUSA() {
        return this.USA;
    }

    public void setUSA(Integer USA) {
        this.USA = USA;
    }

    public Integer getUruguay() {
        return this.Uruguay;
    }

    public void setUruguay(Integer Uruguay) {
        this.Uruguay = Uruguay;
    }

    public Integer getUzbekistan() {
        return this.Uzbekistan;
    }

    public void setUzbekistan(Integer Uzbekistan) {
        this.Uzbekistan = Uzbekistan;
    }

    public Integer getVanuatu() {
        return this.Vanuatu;
    }

    public void setVanuatu(Integer Vanuatu) {
        this.Vanuatu = Vanuatu;
    }

    public Integer getVenezuela() {
        return this.Venezuela;
    }

    public void setVenezuela(Integer Venezuela) {
        this.Venezuela = Venezuela;
    }

    public Integer getVietnam() {
        return this.Vietnam;
    }

    public void setVietnam(Integer Vietnam) {
        this.Vietnam = Vietnam;
    }

    public Integer getWallis_and_Futuna_Islands() {
        return this.Wallis_and_Futuna_Islands;
    }

    public void setWallis_and_Futuna_Islands(Integer Wallis_and_Futuna_Islands) {
        this.Wallis_and_Futuna_Islands = Wallis_and_Futuna_Islands;
    }

    public Integer getYemen() {
        return this.Yemen;
    }

    public void setYemen(Integer Yemen) {
        this.Yemen = Yemen;
    }

    public Integer getZambia() {
        return this.Zambia;
    }

    public void setZambia(Integer Zambia) {
        this.Zambia = Zambia;
    }

    public Integer getZimbabwe() {
        return this.Zimbabwe;
    }

    public void setZimbabwe(Integer Zimbabwe) {
        this.Zimbabwe = Zimbabwe;
    }

    public Integer getKP_Annex_B() {
        return this.KP_Annex_B;
    }

    public void setKP_Annex_B(Integer KP_Annex_B) {
        this.KP_Annex_B = KP_Annex_B;
    }

    public Integer getNon_KP_Annex_B() {
        return this.Non_KP_Annex_B;
    }

    public void setNon_KP_Annex_B(Integer Non_KP_Annex_B) {
        this.Non_KP_Annex_B = Non_KP_Annex_B;
    }

    public Integer getOECD() {
        return this.OECD;
    }

    public void setOECD(Integer OECD) {
        this.OECD = OECD;
    }

    public Integer getNon_OECD() {
        return this.Non_OECD;
    }

    public void setNon_OECD(Integer Non_OECD) {
        this.Non_OECD = Non_OECD;
    }

    public Integer getEU27() {
        return this.EU27;
    }

    public void setEU27(Integer EU27) {
        this.EU27 = EU27;
    }

    public Integer getAfrica() {
        return this.Africa;
    }

    public void setAfrica(Integer Africa) {
        this.Africa = Africa;
    }

    public Integer getAsia() {
        return this.Asia;
    }

    public void setAsia(Integer Asia) {
        this.Asia = Asia;
    }

    public Integer getCentral_America() {
        return this.Central_America;
    }

    public void setCentral_America(Integer Central_America) {
        this.Central_America = Central_America;
    }

    public Integer getEurope() {
        return this.Europe;
    }

    public void setEurope(Integer Europe) {
        this.Europe = Europe;
    }

    public Integer getMiddle_East() {
        return this.Middle_East;
    }

    public void setMiddle_East(Integer Middle_East) {
        this.Middle_East = Middle_East;
    }

    public Integer getNorth_America() {
        return this.North_America;
    }

    public void setNorth_America(Integer North_America) {
        this.North_America = North_America;
    }

    public Integer getOceania() {
        return this.Oceania;
    }

    public void setOceania(Integer Oceania) {
        this.Oceania = Oceania;
    }

    public Integer getSouth_America() {
        return this.South_America;
    }

    public void setSouth_America(Integer South_America) {
        this.South_America = South_America;
    }

    public Integer getBunkers() {
        return this.Bunkers;
    }

    public void setBunkers(Integer Bunkers) {
        this.Bunkers = Bunkers;
    }

    public Integer getStatistical_Difference() {
        return this.Statistical_Difference;
    }

    public void setStatistical_Difference(Integer Statistical_Difference) {
        this.Statistical_Difference = Statistical_Difference;
    }

    public Integer getWorld() {
        return this.World;
    }

    public void setWorld(Integer World) {
        this.World = World;
    }


}
