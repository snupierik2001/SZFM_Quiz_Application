package com.example.quizapp

import android.util.Log
import kotlin.collections.ArrayList

object Constants {

    fun findIndex(arr: List<String>, item: String): Int {
        return arr.indexOf(item)
    }

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getMovieQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val asc1 = listOf<String> ("Kyle Reese","Max Payne","Thomas Anderson","J. Jonah Jameson")
        val shuffledlist1 = asc1.shuffled();
        val q1c = findIndex(shuffledlist1,"Thomas Anderson")
        val que1 = Question(
            1,
            "Mi volt a teljes neve a Mátrix főszereplőjének, Neonak?",
            R.drawable.keanu_reeves_a_matrix,
            shuffledlist1[0],
            shuffledlist1[1],
            shuffledlist1[2],
            shuffledlist1[3],
            q1c+1
        )
        questionsList.add(que1)
        val asc2 = listOf<String> ("A teleportáló ember","A láthatatlan ember","Az eltűnő ember","A repülő ember")
        val shuffledlist2 = asc2.shuffled();
        val q2c = findIndex(shuffledlist2,"A teleportáló ember")
        val que2 = Question(
            2,
            "Mi volt a trükk neve, aminek módszerét próbálta ellopni egymástól a két főszereplő a 'Tökéletes trükk' című filmben?",
            R.drawable.the_prestige,
            shuffledlist2[0],
            shuffledlist2[1],
            shuffledlist2[2],
            shuffledlist2[3],
            q2c+1
        )
        questionsList.add(que2)
        val asc3 = listOf<String> ("Szingapúr","Tortuga","Kalóz-öböl","Port Royal")
        val shuffledlist3 = asc3.shuffled();
        val q3c = findIndex(shuffledlist3,"Tortuga")
        val que3 = Question(
            3,
            "Mi volt az úticélja Jack Sparrownak és Will Turnernek, miután elkötötték a Lopakodót?",
            R.drawable.pirates_of_the_caribbean,
            shuffledlist3[0],
            shuffledlist3[1],
            shuffledlist3[2],
            shuffledlist3[3],
            q3c+1
        )
        questionsList.add(que3)
        val asc4 = listOf<String> ("Adamantium","Vibránium","Eutektikum","Titánium")
        val shuffledlist4 = asc4.shuffled();
        val q4c = findIndex(shuffledlist4,"Adamantium")
        val que4 = Question(
            4,
            "Farkasnak (Logan/Rozsomák) milyen szuper fémből vannak a legendás karmai és a csontozata?",
            R.drawable.wolverine,
            shuffledlist4[0],
            shuffledlist4[1],
            shuffledlist4[2],
            shuffledlist4[3],
            q4c+1
        )
        questionsList.add(que4)

        val asc5 = listOf<String> ("Ragyogás","Viharsziget","Harmadik típusú találkozások","Eredet")
        val shuffledlist5 = asc5.shuffled();
        val q5c = findIndex(shuffledlist5,"Eredet")
        val que5 = Question(
            5,
            "Melyik filmből való az alábbi kép?",
            R.drawable.inception,
            shuffledlist5[0],
            shuffledlist5[1],
            shuffledlist5[2],
            shuffledlist5[3],
            q5c+1
        )
        questionsList.add(que5)
        val asc6 = listOf<String> ("121 mérföld/óra","17 km/óra","88 mérföld/óra","88 km/óra")
        val shuffledlist6 = asc6.shuffled();
        val q6c = findIndex(shuffledlist6,"88 mérföld/óra")
        val que6 = Question(
            6,
            "Mekkora sebességet kell elérnie a DeLorean-nek, hogy időben utazhasson?",
            R.drawable.back_to_the_future,
            shuffledlist6[0],
            shuffledlist6[1],
            shuffledlist6[2],
            shuffledlist6[3],
            q6c+1
        )
        questionsList.add(que6)
        val asc7 = listOf<String> ("brachioszaurusz","velociraptor","tirannoszaurusz rex","dilophoszaurusz")
        val shuffledlist7 = asc7.shuffled();
        val q7c = findIndex(shuffledlist7,"brachioszaurusz")
        val que7 = Question(
            7,
            "Melyik dinoszauruszt látjuk először a Jurassic Park-ban?",
            R.drawable.jurassic_park,
            shuffledlist7[0],
            shuffledlist7[1],
            shuffledlist7[2],
            shuffledlist7[3],
            q7c+1
        )
        questionsList.add(que7)
        val asc8 = listOf<String> ("Steve O'Sulley","Keith Alan Sullivan","William Malcolm Sulley","James P. Sullivan")
        val shuffledlist8 = asc8.shuffled();
        val q8c = findIndex(shuffledlist8,"James P. Sullivan")
        val que8 = Question(
            8,
            "Mi Sulley teljes neve a Szörny RT című animációs filmben?",
            R.drawable.monstersinc,
            shuffledlist8[0],
            shuffledlist8[1],
            shuffledlist8[2],
            shuffledlist8[3],
            q8c+1
        )
        questionsList.add(que8)

        val asc9 = listOf<String> ("Jason Voorhees","Pamela Voorhees","Alice L. Hardy","Tommy Jarvis")
        val shuffledlist9 = asc9.shuffled();
        val q9c = findIndex(shuffledlist9,"Pamela Voorhees")
        val que9 = Question(
            9,
            "Ki volt a gyilkos az első Péntek 13 (1980) filmben?",
            R.drawable.friday_the_13th,
            shuffledlist9[0],
            shuffledlist9[1],
            shuffledlist9[2],
            shuffledlist9[3],
            q9c+1
        )
        questionsList.add(que9)

        val asc10 = listOf<String> ("Clint Eastwood","Marlon Brando","William Shatner","Paul Newman")
        val shuffledlist10 = asc10.shuffled();
        val q10c = findIndex(shuffledlist10,"William Shatner")
        val que10 = Question(
            10,
            "Melyik színész arca Michael Myers maszkja Halloweenben?",
            R.drawable.halloween,
            shuffledlist10[0],
            shuffledlist10[1],
            shuffledlist10[2],
            shuffledlist10[3],
            q10c+1
        )
        questionsList.add(que10)

        questionsList.shuffle()
        return questionsList
    }

    fun getGameQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val asc1 = listOf<String> ("2012","2013","2018","2033")
        val shuffledlist1 = asc1.shuffled();
        val q1c = findIndex(shuffledlist1,"2013")
        val que1 = Question(
            1,
            "Melyik évben tör ki a vírus a The Last Of Us-ban?",
            R.drawable.thelastofus,
            shuffledlist1[0],
            shuffledlist1[1],
            shuffledlist1[2],
            shuffledlist1[3],
            q1c+1
        )
        questionsList.add(que1)

        val asc2 = listOf<String> ("Baldur","Mimir","Týr","Jörmungandr")
        val shuffledlist2 = asc2.shuffled();
        val q2c = findIndex(shuffledlist2,"Jörmungandr")
        val que2 = Question(
            2,
            "Hogy hívják a Világ Kígyót a God of War-ban?",
            R.drawable.god_of_war,
            shuffledlist2[0],
            shuffledlist2[1],
            shuffledlist2[2],
            shuffledlist2[3],
            q2c+1
        )
        questionsList.add(que2)
        val asc3 = listOf<String> ("League of Legends","Elden Ring","Dark Souls 3","Warhammer 40,000")
        val shuffledlist3 = asc3.shuffled();
        val q3c = findIndex(shuffledlist3,"League of Legends")
        val que3 = Question(
            3,
            "Melyik játékban küzdhetünk meg ellenfeleinkkel az idézők szurdokában??",
            R.drawable.league_of_legends,
            shuffledlist3[0],
            shuffledlist3[1],
            shuffledlist3[2],
            shuffledlist3[3],
            q3c+1
        )
        questionsList.add(que3)
        val asc4 = listOf<String> ("Kitüntetést","Semmit","Koronákat","Arany csillagokat")
        val shuffledlist4 = asc4.shuffled();
        val q4c = findIndex(shuffledlist4,"Koronákat")
        val que4 = Question(
            4,
            "Mit kapnak a játékosok, ha megnyernek egy meccset a Fall Guys-ban?",
            R.drawable.fallguys,
            shuffledlist4[0],
            shuffledlist4[1],
            shuffledlist4[2],
            shuffledlist4[3],
            q4c+1
        )
        questionsList.add(que4)
        val asc5 = listOf<String> ("Trevor","Michael","Franklin","Amanda")
        val shuffledlist5 = asc5.shuffled();
        val q5c = findIndex(shuffledlist5,"Trevor")
        val que5 = Question(
            5,
            "A szereplők közül melyik lakik egy sivatagban?",
            R.drawable.gta_v,
            shuffledlist5[0],
            shuffledlist5[1],
            shuffledlist5[2],
            shuffledlist5[3],
            q5c+1
        )
        questionsList.add(que5)
        val asc6 = listOf<String> ("007-es","47-es","13-as","1-es")
        val shuffledlist6 = asc6.shuffled();
        val q6c = findIndex(shuffledlist6,"47-es")
        val que6 = Question(
            6,
            "Hányas számú ügynököt irányíthatunk a Hitman című játékban?",
            R.drawable.hitman,
            shuffledlist6[0],
            shuffledlist6[1],
            shuffledlist6[2],
            shuffledlist6[3],
            q6c+1
        )
        questionsList.add(que6)
        val asc7 = listOf<String> ("Zoe Baker","Clancy Jarvis","Ethan Winters","Jack Baker")
        val shuffledlist7 = asc7.shuffled();
        val q7c = findIndex(shuffledlist7,"Jack Baker")
        val que7 = Question(
            7,
            "Melyik Baker családtaggal \"harcolsz\" és kell előle elbújnod a házban?",
            R.drawable.residentevil,
            shuffledlist7[0],
            shuffledlist7[1],
            shuffledlist7[2],
            shuffledlist7[3],
            q7c+1
        )
        questionsList.add(que7)
        val asc8 = listOf<String> ("Cirilla Fiona Elen Riannon","Yennefer of Vengerberg","Keira Metz","Triss Merigold")
        val shuffledlist8 = asc8.shuffled();
        val q8c = findIndex(shuffledlist8,"Cirilla Fiona Elen Riannon")
        val que8 = Question(
            8,
            "Kit kell megtalálnia Geraltnak a Witcher 3 fő történetszálban?",
            R.drawable.witcher3,
            shuffledlist8[0],
            shuffledlist8[1],
            shuffledlist8[2],
            shuffledlist8[3],
            q8c+1
        )
        questionsList.add(que8)
        val asc9 = listOf<String> ("Mert meghalt a fia.","Mert meg véget akar vetni az emberiségnek.","Mert ő egy sorozatgyilkos.","Mert tesztelni akarja az édesapákat.")
        val shuffledlist9 = asc9.shuffled();
        val q9c = findIndex(shuffledlist9,"Mert tesztelni akarja az édesapákat.")
        val que9 = Question(
            9,
            "Miért követi el ezeket a bűncselekményeket az origami gyilkos a Heavy Rain-ben?",
            R.drawable.heavyrain,
            shuffledlist9[0],
            shuffledlist9[1],
            shuffledlist9[2],
            shuffledlist9[3],
            q9c+1
        )
        questionsList.add(que9)
        val asc10 = listOf<String> ("Meg lehet őket lovagolni","Biztosítja a játékost erőforrásokkal","Megtámadja a játékost","Életerőt ad, ha szétütik")
        val shuffledlist10 = asc10.shuffled();
        val q10c = findIndex(shuffledlist10,"Biztosítja a játékost erőforrásokkal")
        val que10 = Question(
            10,
            "Mit csinálnak a lámák a Fortnite-ban?",
            R.drawable.fortnitellama,
            shuffledlist10[0],
            shuffledlist10[1],
            shuffledlist10[2],
            shuffledlist10[3],
            q10c+1
        )
        questionsList.add(que10)

        questionsList.shuffle()
        return questionsList
    }

    fun getHistoryQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val asc1 = listOf<String> ("1914. július 28. – 1918. november 11.","1939. szeptember 1. – 1945. szeptember 2.","1914. március 12. – 1919. november 2.","1938. május 1. – 1945. szeptember 11.")
        val shuffledlist1 = asc1.shuffled();
        val q1c = findIndex(shuffledlist1,"1914. július 28. – 1918. november 11.")
        val que1 = Question(
            1,
            "Mettől meddig tartott az első világháború?",
            R.drawable.world_war_one,
            shuffledlist1[0],
            shuffledlist1[1],
            shuffledlist1[2],
            shuffledlist1[3],
            q1c+1
        )
        questionsList.add(que1)
        val asc2 = listOf<String> ("Bulgária","Magyarország","Franciaország","Lengyelország")
        val shuffledlist2 = asc2.shuffled();
        val q2c = findIndex(shuffledlist2,"Franciaország")
        val que2 = Question(
            2,
            "A Szovjetunió 1955. május 14-én megalakította a Varsói Szerződést.\n" +
                    "Melyik ország NEM tartozott bele?",
            R.drawable.varsoi_szerzodes,
            shuffledlist2[0],
            shuffledlist2[1],
            shuffledlist2[2],
            shuffledlist2[3],
            q2c+1
        )
        questionsList.add(que2)
        val asc3 = listOf<String> ("Kossuth Lajos","Deák Ferenc","Széchenyi István","Petőfi Sándor")
        val shuffledlist3 = asc3.shuffled();
        val q3c = findIndex(shuffledlist3,"Deák Ferenc")
        val que3 = Question(
            3,
            "Kit neveztek a haza bölcsének?",
            R.drawable.deak_ferenc,
            shuffledlist3[0],
            shuffledlist3[1],
            shuffledlist3[2],
            shuffledlist3[3],
            q3c+1
        )
        questionsList.add(que3)
        val asc4 = listOf<String> ("Des Alleurs","Fernando Magellán","I. Rudolf","Bonaparte Napoleon")
        val shuffledlist4 = asc4.shuffled();
        val q4c = findIndex(shuffledlist4,"Bonaparte Napoleon")
        val que4 = Question(
            4,
            "Ki látható az alábbi képen?",
            R.drawable.napoleon,
            shuffledlist4[0],
            shuffledlist4[1],
            shuffledlist4[2],
            shuffledlist4[3],
            q4c+1
        )
        questionsList.add(que4)
        val asc5 = listOf<String> ("977-1001. január 1. között","1001-1038. január 1. között","977-1001. január 1. között","1038-1054. január 1. között")
        val shuffledlist5 = asc5.shuffled();
        val q5c = findIndex(shuffledlist5,"977-1001. január 1. között")
        val que5 = Question(
            5,
            "Mettől meddig volt I. István magyar nagyfejedelem?",
            R.drawable.szent_istvan,
            shuffledlist5[0],
            shuffledlist5[1],
            shuffledlist5[2],
            shuffledlist5[3],
            q5c+1
        )
        questionsList.add(que5)
        val asc6 = listOf<String> ("Budapesti","Ónodi","Nagyszombati","Pozsonyi")
        val shuffledlist6 = asc6.shuffled();
        val q6c = findIndex(shuffledlist6,"Ónodi")
        val que6 = Question(
            6,
            "Melyik országgyűlésen mondták ki először a Habsburg-ház trónfosztását?",
            R.drawable.onodi_orszaggyulesi,
            shuffledlist6[0],
            shuffledlist6[1],
            shuffledlist6[2],
            shuffledlist6[3],
            q6c+1
        )
        questionsList.add(que6)
        val asc7 = listOf<String> ("10","20","50","40")
        val shuffledlist7 = asc7.shuffled();
        val q7c = findIndex(shuffledlist7,"10")
        val que7 = Question(
            7,
            "Hány phülére osztotta Kleiszthenész Attika lakosságát?",
            R.drawable.attica,
            shuffledlist7[0],
            shuffledlist7[1],
            shuffledlist7[2],
            shuffledlist7[3],
            q7c+1
        )
        questionsList.add(que7)
        val asc8 = listOf<String> ("Rigómezei csata","Mohácsi csata","Temesvári csata","Kenyérmezei csata")
        val shuffledlist8 = asc8.shuffled();
        val q8c = findIndex(shuffledlist8,"Mohácsi csata")
        val que8 = Question(
            8,
            "Mi történt 1526-ban?",
            R.drawable.mohacsi_csata,
            shuffledlist8[0],
            shuffledlist8[1],
            shuffledlist8[2],
            shuffledlist8[3],
            q8c+1
        )
        questionsList.add(que8)
        val asc9 = listOf<String> ("Magyarországtól","Angliától","Franciaországtól","Oroszországtól")
        val shuffledlist9 = asc9.shuffled();
        val q9c = findIndex(shuffledlist9,"Oroszországtól")
        val que9 = Question(
            9,
            "Melyik nagyhatalomtól kért segítséget Ferenc József?",
            R.drawable.ferenc_jozsef,
            shuffledlist9[0],
            shuffledlist9[1],
            shuffledlist9[2],
            shuffledlist9[3],
            q9c+1
        )
        questionsList.add(que9)
        val asc10 = listOf<String> ("Németország, Olaszország, Szovjetunió","Franciaország, Nagy-Britannia, Egyesült Államok","Németország, Olaszország, Japán","Japán, Szovjetunió, Németország")
        val shuffledlist10 = asc10.shuffled();
        val q10c = findIndex(shuffledlist10,"Németország, Olaszország, Japán")
        val que10 = Question(
            10,
            "Melyik három állam írta alá 1940. szeptember 27-én a háromhatalmi egyezményt?",
            R.drawable.world_war_two,
            shuffledlist10[0],
            shuffledlist10[1],
            shuffledlist10[2],
            shuffledlist10[3],
            q10c+1
        )
        questionsList.add(que10)

        questionsList.shuffle()
        return questionsList
    }

    fun getGeographyQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val asc1 = listOf<String> ("Takla Makán","Kalahári","Mojave-sivatag","Góbi")
        val shuffledlist1 = asc1.shuffled();
        val q1c = findIndex(shuffledlist1,"Góbi")
        val que1 = Question(
            1,
            "Melyik sivatagnak a legnagyobb a területe a felsoroltak közül?",
            R.drawable.gobi_sivatag,
            shuffledlist1[0],
            shuffledlist1[1],
            shuffledlist1[2],
            shuffledlist1[3],
            q1c+1
        )
        questionsList.add(que1)
        val asc2 = listOf<String> ("Szeged","Békéscsaba","Gyula","Szentes")
        val shuffledlist2 = asc2.shuffled();
        val q2c = findIndex(shuffledlist2,"Szeged")
        val que2 = Question(
            2,
            "Mi Csongrád megye székhelye?",
            R.drawable.szeged,
            shuffledlist2[0],
            shuffledlist2[1],
            shuffledlist2[2],
            shuffledlist2[3],
            q2c+1
        )
        questionsList.add(que2)
        val asc3 = listOf<String> ("Taiwan","Hong Kong","Peking","Shanghai")
        val shuffledlist3 = asc3.shuffled();
        val q3c = findIndex(shuffledlist3,"Peking")
        val que3 = Question(
            3,
            "Melyik Kína fővárosa?",
            R.drawable.peking,
            shuffledlist3[0],
            shuffledlist3[1],
            shuffledlist3[2],
            shuffledlist3[3],
            q3c+1
        )
        questionsList.add(que3)
        val asc4 = listOf<String> ("Románia","Görögország","Bulgária","Szlovákia")
        val shuffledlist4 = asc4.shuffled();
        val q4c = findIndex(shuffledlist4,"Bulgária")
        val que4 = Question(
            4,
            "Melyik országot jelöli a térkép?",
            R.drawable.foldrajzkviz_masodik,
            shuffledlist4[0],
            shuffledlist4[1],
            shuffledlist4[2],
            shuffledlist4[3],
            q4c+1
        )
        questionsList.add(que4)
        val asc5 = listOf<String> ("USA","Franciaország","Egyesült Arab Emirátusok","Brazília")
        val shuffledlist5 = asc5.shuffled();
        val q5c = findIndex(shuffledlist5,"Brazília")
        val que5 = Question(
            5,
            "Melyik országban található a világ leghosszabb strandja, a Casino Beach?",
            R.drawable.brazil_beach,
            shuffledlist5[0],
            shuffledlist5[1],
            shuffledlist5[2],
            shuffledlist5[3],
            q5c+1
        )
        questionsList.add(que5)
        val asc6 = listOf<String> ("Brazíliaváros","Sao Paulo","Salvador", "Rio de Janeiro")
        val shuffledlist6 = asc6.shuffled();
        val q6c = findIndex(shuffledlist6,"Brazíliaváros")
        val que6 = Question(
            6,
            "Melyik Brazília fővárosa?",
            R.drawable.brazilia,
            shuffledlist6[0],
            shuffledlist6[1],
            shuffledlist6[2],
            shuffledlist6[3],
            q6c+1
        )
        questionsList.add(que6)
        val asc7 = listOf<String> ("A Baktérítő","Az Északi-sarkkör","A Ráktérítő","Az Egyenlítő")
        val shuffledlist7 = asc7.shuffled();
        val q7c = findIndex(shuffledlist7,"Az Északi-sarkkör")
        val que7 = Question(
            7,
            "Mi van Magyarországhoz közelebb?",
            R.drawable.szeless,
            shuffledlist7[0],
            shuffledlist7[1],
            shuffledlist7[2],
            shuffledlist7[3],
            q7c+1
        )
        questionsList.add(que7)
        val asc8 = listOf<String> ("Debrecen","Zalaegerszeg","Esztergom","Szombathely")
        val shuffledlist8 = asc8.shuffled();
        val q8c = findIndex(shuffledlist8,"Esztergom")
        val que8 = Question(
            8,
            "Melyik nem megyeszékhely?",
            R.drawable.esztergom,
            shuffledlist8[0],
            shuffledlist8[1],
            shuffledlist8[2],
            shuffledlist8[3],
            q8c+1
        )
        questionsList.add(que8)
        val asc9 = listOf<String> ("Szerbia","Montenegró","Albánia","Fehéroroszország")
        val shuffledlist9 = asc9.shuffled();
        val q9c = findIndex(shuffledlist9,"Szerbia")
        val que9 = Question(
            9,
            "Melyik országot jelöli a térkép?",
            R.drawable.foldrajzkviz_elso,
            shuffledlist9[0],
            shuffledlist9[1],
            shuffledlist9[2],
            shuffledlist9[3],
            q9c+1
        )
        questionsList.add(que9)
        val asc10 = listOf<String> ("Genf","Bern","Zürich","Lausanne")
        val shuffledlist10 = asc10.shuffled();
        val q10c = findIndex(shuffledlist10,"Bern")
        val que10 = Question(
            10,
            "Mi Svájc fővárosa?",
            R.drawable.svajc,
            shuffledlist10[0],
            shuffledlist10[1],
            shuffledlist10[2],
            shuffledlist10[3],
            q10c+1
        )
        questionsList.add(que10)

        questionsList.shuffle()
        return questionsList
    }
}