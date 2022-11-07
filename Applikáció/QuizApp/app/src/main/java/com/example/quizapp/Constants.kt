@file:Suppress("unused", "unused", "unused", "unused", "unused", "unused", "unused")

package com.example.quizapp

import kotlin.collections.ArrayList

@Suppress("unused", "unused", "unused", "unused", "unused", "unused", "unused")
object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getMovieQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Mi volt a teljes neve a Mátrix főszereplőjének, Neonak?",
            R.drawable.keanu_reeves_a_matrix,
            "Kyle Reese",
            "Max Payne",
            "Thomas Anderson",
            "J. Jonah Jameson",
            3
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "Mi volt a trükk neve, aminek módszerét próbálta ellopni egymástól a két főszereplő a 'Tökéletes trükk' című filmben?",
            R.drawable.the_prestige,
            "A teleportáló ember",
            "A láthatatlan ember",
            "Az eltűnő ember",
            "A repülő ember",
            1
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "Mi volt az úticélja Jack Sparrownak és Will Turnernek, miután elkötötték a Lopakodót?",
            R.drawable.pirates_of_the_caribbean,
            "Szingapúr",
            "Tortuga",
            "Kalóz-öböl",
            "Port Royal",
            2
        )
        questionsList.add(que3)

        val que4 = Question(
            4,
            "Farkasnak (Logan/Rozsomák) milyen szuper fémből vannak a legendás karmai és a csontozata?",
            R.drawable.wolverine,
            "Adamantium",
            "Vibránium",
            "Eutektikum",
            "Titánium",
            1
        )
        questionsList.add(que4)

        val que5 = Question(
            5,
            "Melyik filmből való az alábbi kép?",
            R.drawable.inception,
            "Ragyogás",
            "Viharsziget",
            "Harmadik típusú találkozások",
            "Eredet",
            4
        )
        questionsList.add(que5)

        val que6 = Question(
            6,
            "Mekkora sebességet kell elérnie a DeLorean-nek, hogy időben utazhasson?",
            R.drawable.back_to_the_future,
            "121 mérföld/óra",
            "17 km/óra",
            "88 mérföld/óra",
            "88 km/óra",
            3
        )
        questionsList.add(que6)

        val que7 = Question(
            7,
            "Melyik dinoszauruszt látjuk először a Jurassic Park-ban?",
            R.drawable.jurassic_park,
            "brachioszaurusz",
            "velociraptor",
            "tirannoszaurusz rex",
            "dilophoszaurusz",
            1
        )
        questionsList.add(que7)

        val que8 = Question(
            8,
            "Mi Sulley teljes neve a Szörny RT című animációs filmben?",
            R.drawable.monstersinc,
            "Steve O'Sulley",
            "Keith Alan Sullivan",
            "William Malcolm Sulley",
            "James P. Sullivan",
            4
        )
        questionsList.add(que8)

        val que9 = Question(
            9,
            "Ki volt a gyilkos az első Péntek 13 (1980) filmben?",
            R.drawable.friday_the_13th,
            "Jason Voorhees",
            "Pamela Voorhees",
            "Alice L. Hardy",
            "Tommy Jarvis",
            2
        )
        questionsList.add(que9)

        val que10 = Question(
            10,
            "Melyik színész arca Michael Myers maszkja Halloweenben?",
            R.drawable.halloween,
            "Clint Eastwood",
            "Marlon Brando",
            "William Shatner",
            "Paul Newman",
            3
        )
        questionsList.add(que10)

        questionsList.shuffle()
        return questionsList
    }

    fun getGameQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Melyik évben tör ki a vírus a The Last Of Us-ban?",
            R.drawable.thelastofus,
            "2012",
            "2013",
            "2018",
            "2033",
            2
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "Hogy hívják a Világ Kígyót a God of War-ban?",
            R.drawable.god_of_war,
            "Baldur",
            "Mimir",
            "Týr",
            "Jörmungandr",
            4
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "Melyik játékban küzdhetünk meg ellenfeleinkkel az idézők szurdokában??",
            R.drawable.league_of_legends,
            "League of Legends",
            "Elden Ring",
            "Dark Souls 3",
            "Warhammer 40,000",
            1
        )
        questionsList.add(que3)

        val que4 = Question(
            4,
            "Mit kapnak a játékosok, ha megnyernek egy meccset a Fall Guys-ban?",
            R.drawable.fallguys,
            "Kitüntetést",
            "Semmit",
            "Koronákat",
            "Arany csillagokat",
            3
        )
        questionsList.add(que4)

        val que5 = Question(
            5,
            "A szereplők közül melyik lakik egy sivatagban?",
            R.drawable.gta_v,
            "Trevor",
            "Michael",
            "Franklin",
            "Amanda",
            1
        )
        questionsList.add(que5)

        val que6 = Question(
            6,
            "Hányas számú ügynököt irányíthatunk a Hitman című játékban?",
            R.drawable.hitman,
            "007-es",
            "47-es",
            "13-as",
            "1-es",
            2
        )
        questionsList.add(que6)

        val que7 = Question(
            7,
            "Melyik Baker családtaggal \"harcolsz\" és kell előle elbújnod a házban?",
            R.drawable.residentevil,
            "Zoe Baker",
            "Clancy Jarvis",
            "Ethan Winters",
            "Jack Baker",
            4
        )
        questionsList.add(que7)

        val que8 = Question(
            8,
            "Kit kell megtalálnia Geraltnak a Witcher 3 fő történetszálban?",
            R.drawable.witcher3,
            "Cirilla Fiona Elen Riannon",
            "Yennefer of Vengerberg",
            "Keira Metz",
            "Triss Merigold",
            1
        )
        questionsList.add(que8)

        val que9 = Question(
            9,
            "Miért követi el ezeket a bűncselekményeket az origami gyilkos a Heavy Rain-ben?",
            R.drawable.heavyrain,
            "Mert meghalt a fia.",
            "Mert meg véget akar vetni az emberiségnek.",
            "Mert ő egy sorozatgyilkos.",
            "Mert tesztelni akarja az édesapákat.",
            4
        )
        questionsList.add(que9)

        val que10 = Question(
            10,
            "Mit csinálnak a lámák a Fortnite-ban?",
            R.drawable.fortnitellama,
            "Meg lehet őket lovagolni",
            "Biztosítja a játékost erőforrásokkal",
            "Megtámadja a játékost",
            "Életerőt ad, ha szétütik",
            2
        )
        questionsList.add(que10)

        questionsList.shuffle()
        return questionsList
    }

    fun getHistoryQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Mettől meddig tartott az első világháború?",
            R.drawable.world_war_one,
            "1914. július 28. – 1918. november 11.",
            "1939. szeptember 1. – 1945. szeptember 2.",
            "1914. március 12. – 1919. november 2.",
            "1938. május 1. – 1945. szeptember 11.",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "A Szovjetunió 1955. május 14-én megalakította a Varsói Szerződést.\n" +
                    "Melyik ország NEM tartozott bele?",
            R.drawable.varsoi_szerzodes,
            "Bulgária",
            "Magyarország",
            "Franciaország",
            "Lengyelország",
            3
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "Kit neveztek a haza bölcsének?",
            R.drawable.deak_ferenc,
            "Kossuth Lajos",
            "Deák Ferenc",
            "Széchenyi István",
            "Petőfi Sándor",
            2
        )
        questionsList.add(que3)

        val que4 = Question(
            4,
            "Ki látható az alábbi képen?",
            R.drawable.napoleon,
            "Des Alleurs",
            "Fernando Magellán",
            "I. Rudolf",
            "Bonaparte Napoleon",
            4
        )
        questionsList.add(que4)

        val que5 = Question(
            5,
            "Mettől meddig volt I. István magyar nagyfejedelem?",
            R.drawable.szent_istvan,
            "977-1001. január 1. között",
            "1001-1038. január 1. között",
            "977-1001. január 1. között",
            "1038-1054. január 1. között",
            3
        )
        questionsList.add(que5)

        val que6 = Question(
            6,
            "Melyik országgyűlésen mondták ki először a Habsburg-ház trónfosztását?",
            R.drawable.onodi_orszaggyulesi,
            "Budapesti",
            "Ónodi",
            "Nagyszombati",
            "Pozsonyi",
            2
        )
        questionsList.add(que6)

        val que7 = Question(
            7,
            "Hány phülére osztotta Kleiszthenész Attika lakosságát?",
            R.drawable.attica,
            "10",
            "20",
            "50",
            "40",
            1
        )
        questionsList.add(que7)

        val que8 = Question(
            8,
            "Mi történt 1526-ban?",
            R.drawable.mohacsi_csata,
            "Rigómezei csata",
            "Mohácsi csata",
            "Temesvári csata",
            "Kenyérmezei csata",
            2
        )
        questionsList.add(que8)

        val que9 = Question(
            9,
            "Melyik nagyhatalomtól kért segítséget Ferenc József?",
            R.drawable.ferenc_jozsef,
            "Magyarországtól",
            "Angliától",
            "Franciaországtól",
            "Oroszországtól",
            4
        )
        questionsList.add(que9)

        val que10 = Question(
            10,
            "Melyik három állam írta alá 1940. szeptember 27-én a háromhatalmi egyezményt?",
            R.drawable.world_war_two,
            "Németország, Olaszország, Szovjetunió",
            "Franciaország, Nagy-Britannia, Egyesült Államok",
            "Németország, Olaszország, Japán",
            "Japán, Szovjetunió, Németország",
            3
        )
        questionsList.add(que10)

        questionsList.shuffle()
        return questionsList
    }

    fun getGeographyQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Melyik sivatagnak a legnagyobb a területe a felsoroltak közül?",
            R.drawable.gobi_sivatag,
            "Takla Makán",
            "Kalahári",
            "Mojave-sivatag",
            "Góbi",
            4
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "Mi Csongrád megye székhelye?",
            R.drawable.szeged,
            "Szeged",
            "Békéscsaba",
            "Gyula",
            "Szentes",
            1
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "Melyik Kína fővárosa?",
            R.drawable.peking,
            "Taiwan",
            "Hong Kong",
            "Peking",
            "Shanghai",
            3
        )
        questionsList.add(que3)

        val que4 = Question(
            4,
            "Melyik országot jelöli a térkép?",
            R.drawable.foldrajzkviz_masodik,
            "Románia",
            "Görögország",
            "Bulgária",
            "Szlovákia",
            3
        )
        questionsList.add(que4)

        val que5 = Question(
            5,
            "Melyik országban található a világ leghosszabb strandja, a Casino Beach?",
            R.drawable.brazil_beach,
            "USA",
            "Franciaország",
            "Egyesült Arab Emirátusok",
            "Brazília",
            4
        )
        questionsList.add(que5)

        val que6 = Question(
            6,
            "Melyik Brazília fővárosa?",
            R.drawable.brazilia,
            "Brazíliaváros",
            "Sao Paulo",
            "Salvador",
            "Rio de Janeiro",
            1
        )
        questionsList.add(que6)

        val que7 = Question(
            7,
            "Mi van Magyarországhoz közelebb?",
            R.drawable.szeless,
            "A Baktérítő",
            "Az Északi-sarkkör",
            "A Ráktérítő",
            "Az Egyenlítő",
            2
        )
        questionsList.add(que7)

        val que8 = Question(
            8,
            "Melyik nem megyeszékhely?",
            R.drawable.esztergom,
            "Debrecen",
            "Zalaegerszeg",
            "Esztergom",
            "Szombathely",
            3
        )
        questionsList.add(que8)

        val que9 = Question(
            9,
            "Melyik országot jelöli a térkép?",
            R.drawable.foldrajzkviz_elso,
            "Szerbia",
            "Montenegró",
            "Albánia",
            "Fehéroroszország",
            1
        )
        questionsList.add(que9)

        val que10 = Question(
            10,
            "Mi Svájc fővárosa?",
            R.drawable.svajc,
            "Genf",
            "Bern",
            "Zürich",
            "Lausanne",
            2
        )
        questionsList.add(que10)

        questionsList.shuffle()
        return questionsList
    }
}