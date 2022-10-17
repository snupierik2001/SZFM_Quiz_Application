# Funkcionális követelmény
## 1.0 Az applikáció funkciói

### 1.1 Felhasználók számára elérhető funkciók

1.1.1 Applikációbeli tevékenységek: <br>

A felhasználók az applikáción belüli quiz kérdésekre tudnak válaszolni, választhatnak kérdéseket kategóriák szerint is. <br>
Ahogy belépünk az applikációba, először a bejelentkezés / regisztráció ablak fog felugrani. <br>
Itt a felhasználó dönthet, hogy bejelentkezik fiókjával, regisztrál egy újat, vagy vendégként lép be. <br>
Bizonyos funkciók, mint például pontszám és előrelépések mentése is elérhetőek, csupán regisztrált felhasználóknak. <br>
Erre egy külön oldalon lesz lehetőség. <br>


A regisztrációs lap tervezett mezői: <br>
- Vezetéknév
- Keresztnév
- Email cím*
- Felhasználónév*
- Jelszó*
- Jelszó mégegyszer*

(A csillaggal megjelölt mezők kitöltése kötelező) <br>

A megadott adatok egy adatbázisban kerülnek tárolásra.  <br>


1.1.2 Bejelentkezés: <br>
A regisztráció során megadott felhasználó névvel és jelszóval lehetőség nyílik a bejelentkezésre a felhasználói funkciók eléréséhez.
Erre egy külön bejelentkező oldalon van lehetőség, amely két szövegmezőt tartalmaz: <br>

- Felhasználónév <br>
- Jelszó <br>

(A csillaggal megjelölt mezők kitöltése kötelező) <br>

### 1.2	A bejelentkezés után elérhető funkciók: <br>
Pontszám: <br>
Bejelentkezés után a felhasználóknak lehetősége nyílik az eddigi elért pontszámának megtekintésére. <br>

Előrehaladás: <br>
A felhasználó megtekintheti, hogy az eddigi megválaszolt kérdései milyen arányban helyesek/helytelenek. <br>

Értékelés: <br>
A felhasználó egytől ötig pontozhatja a kérdések hasznosságát/ érdekességét. <br>


### 1.3 Koncepciós alkamazásbeli navigációs ábra
> ![funk.spec](./images/quizapplicationconcept.png 'Koncepciós ábra')
