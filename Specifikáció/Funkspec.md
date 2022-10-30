# Funkcionális követelmény

## 1.0 Hogyan működik az applikáció?


### 1.1 Felhasználói oldalról tekintve

Az alkalmazásba belépve első alkalommal a felhasználó látni fogja képernyőjén az applikáció nevét,
alatta három gombot fog találni: Bejelentkezés, Regisztráció, Vendég belépés. A felhasználó dönthet arról, hogy regisztrálva lép be a kvíz játékba,
vagy csupán vendégként (ekkor nem lesznek elmentve az eredményei). A regisztráció külön menübe visz, ahol a szükséges adatokat megadva létre tud a felhasználó hozni egy fiókot. <br>

A bejelentkezés gomb elnavigálja a Bejelentkezés menüre a felhasználót, ahol email cím / felhasználónév és jelszó megadása után képes fiókjába belépni a téma választó menübe.
Ha a felhasználó úgy dönt nem kíván fiókkal belépni, a Vendég belépés gombbal azonnal a Téma Választás menübe tud navigálni.
A Téma választás menüben választhatunk többféle kvíz közül (legalább 4 darab). Ezek valamelyikére nyomva a felhasználó elindítja az adott témájú kvízt. <br>
A játék fő részére érve a felhasználó 10 kérdést kap, melyre 4 válaszlehetőség közül kell a helyeset kiválasztania, majd leadnia a választ. <br>
A válasz leadásával átszíneződik zöldre a helyes válasz, ha pedig rossz választ nyom, akkor pirosra színeződik át a leadott válasz, de mellé zölddel a helyes választ is megmutatjuk. <br>

A felhasználó képes lesz követni a haladását, a kérdés alatt egy 'progress bar' fogja mutatni, hogy a 10 kérdésből hányat válaszolt már meg a felhasználó.
Miután a felhasználó megválaszolta az összes kérdést, az applikáció egy új menüre lép át, az Eredményekre. Amennyiben nem vendégként lépett be a felhasználó,
az applikáció kiírja a regisztráláskor megadott Felhasználónevet, valamint, hogy mennyi helyes választ adott a felhasználó a kérdésekre. <br>
Ezután az applikáció alján látható gombbal visszatérhet a Téma választás menübe.

### 1.2 Fejlesztői oldalról tekintve

A fejlesztő a kiválasztott környezetet használva képes kódbeli változtatásokat végezni, ezzel változtatva az alkalmazás következő részein: <br>

- Dizájn
- Navigáció
- Adatbázis kezelés
- Interakció megvalósítás
- Optimalizáció

Az alkalmazás fejlesztőinek érdemes olyan fejlesztői környezetet választaniuk, ahol folyamatosan tudják tesztelni az applikáció változását kódolás közben. <br>
Megjegyzések, kommentek használata a kódban szükséges, hogy bármelyik programozó képes legyen gyorsan értelmezni az egyes kódrészletek funkcionalitását. <br>


## 2.0 Az applikáció funkciói

### 2.1 Felhasználók számára elérhető funkciók

2.1.1 Applikációbeli tevékenységek: <br>

A felhasználók az applikáción belüli quiz kérdésekre tudnak válaszolni, választhatnak kérdéseket kategóriák szerint is. <br>
Ahogy belépünk az applikációba, először a bejelentkezés / regisztráció ablak fog felugrani. <br>
Itt a felhasználó dönthet, hogy bejelentkezik fiókjával, regisztrál egy újat, vagy vendégként lép be. <br>
Bizonyos funkciók, mint például pontszám és előrelépések mentése is elérhetőek, csupán regisztrált felhasználóknak. <br>
Erre egy külön oldalon lesz lehetőség. <br>

A regisztrációs lap tervezett mezői: <br>

- Email cím*
- Felhasználónév*
- Jelszó*
- Jelszó mégegyszer*

(A csillaggal megjelölt mezők kitöltése kötelező) <br>

A megadott adatok egy adatbázisban kerülnek tárolásra.  <br>


2.1.2 Bejelentkezés: <br>
A regisztráció során megadott felhasználó névvel és jelszóval lehetőség nyílik a bejelentkezésre a felhasználói funkciók eléréséhez.
Erre egy külön bejelentkező oldalon van lehetőség, amely két szövegmezőt tartalmaz: <br>

- Felhasználónév <br>
- Jelszó <br>

(A csillaggal megjelölt mezők kitöltése kötelező) <br>

### 2.2	A bejelentkezés után elérhető funkciók: <br>
Pontszám: <br>
Bejelentkezés után a felhasználóknak lehetősége nyílik az eddigi elért pontszámának megtekintésére. <br>

Előrehaladás: <br>
A felhasználó megtekintheti, hogy az eddigi megválaszolt kérdései milyen arányban helyesek/helytelenek. <br>

Értékelés: <br>
A felhasználó egytől ötig pontozhatja a kérdések hasznosságát/ érdekességét. <br>

## 3.0 Koncepciós alkamazásbeli navigációs ábra
> ![funk.spec](./images/quizapplicationconcept.png 'Koncepciós ábra')
> Koncepciós ábra: A felhasználó által látott menük és az azok közti navigáció
