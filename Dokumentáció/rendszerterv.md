# Rendszerterv
## 1. A rendszer célja

   A projekt célja egy olyan alkalmazás, amely az alapfunkciók (+, -, *, /) mellett további műveleteket is tartalmaz, így elősegíti a tanulást. Látványos, színes felülettel rendelkezik az alkalmazás, hogy felkeltse a felhasználók figyelmét. 

## 2. Projektterv

### 2.1 Projektszerepkörök, felelőségek:
   * Scrum masters: Kiss Dorina Hedvig
   * Product owner: Kiss Dorina Hedvig
   * Üzleti szereplő: Kiss Dorina Hedvig
     
### 2.2 Projektmunkások és felelőségek:
   * Frontend:Anka Bálint Kristóf
   * Backend:Jánosik Vanessza, Kiss Bálint, Aranyi Patrik
   * Tesztelés:Jánosik Vanessza, Kiss Bálint, Aranyi Patrik
     
### 2.3 Ütemterv:

   |Funkció                  | Feladat                                | Prioritás | Becslés (nap) | Aktuális becslés (nap) | Eltelt idő (nap) | Becsült idő (nap) |
   |-------------------------|----------------------------------------|-----------|---------------|------------------------|------------------|---------------------|
   |Követelmény specifikáció |Megírás                                 |         1 |             1 |                      1 |                1 |                   1 |             
   |Funkcionális specifikáció|Megírás                                 |         1 |             1 |                      1 |                1 |                   1 |
   |Rendszerterv             |Megírás                                 |         1 |             1 |                      1 |                1 |                   1 |
   |Program                  |Képernyőtervek elkészítése              |         2 |             1 |                      1 |                1 |                   1 |
   |Program                  |Prototípus elkészítése                  |         3 |             8 |                      8 |                8 |                   8 |
   |Program                  |Alapfunkciók elkészítése                |         3 |             8 |                      8 |                8 |                   8 |
   |Program                  |Tesztelés                               |         4 |             2 |                      2 |                2 |                   2 |

### 2.4 Mérföldkövek:
   * Dokumnetáció befejezése
   * Fejlesztés megkezdése
   * Fejlesztés befejezése
   * Prototípus átadása

## 3. Üzleti folyamatok modellje

   ![Névtelen.jpg](https://github.com/abalint49/afp1/blob/main/Dokumentáció/képernyökép/Névtelen.jpg)

## 4. Követelmények

### Funkcionális követelmények

   | Id | Modul | Név | Leírás |
   | :---: | --- | --- | --- |   
   | K01 | android alkalmazás | számológép | A számológép a matematikai számitások,számolások meggyorsítására szolgáló eszköz. |
   | K02 | Funkció | Összeadás | A számológép 2 és több érték összeadására képes |
   | K03 | Funkció | Kivonás | A számológép 2 és több érték kivonására képes |
   | K04 | Funkció | Szorzás | A számológép 2 és több érték szorzására képes | 
   | K05 | Funkció | Osztás | A számológép 2 és több érték osztására képes |  
   | K06 | Funkció | Egyenlő | A számológép kijelzi a műveletek eredményét |

### Nemfunkcionális követelmények

   | Id | Modul | Név | Leírás |
   | :---: | --- | --- | --- |
   | K07 | Funkció | 0 | jelenlegi szám*10 + 0 |
   | K08 | Funkció | 1 | jelenlegi szám*10 + 1 |
   | K09 | Funkció | 2 | jelenlegi szám*10 + 2 |
   | K10 | Funkció | 3 | jelenlegi szám*10 + 3 |
   | K11 | Funkció | 4 | jelenlegi szám*10 + 4 |
   | K12 | Funkció | 5 | jelenlegi szám*10 + 5 |
   | K13 | Funkció | 6 | jelenlegi szám*10 + 6 |
   | K14 | Funkció | 7 | jelenlegi szám*10 + 7 |
   | K15 | Funkció | 8 | jelenlegi szám*10 + 8 |
   | K16 | Funkció | 9 | jelenlegi szám*10 + 9 |

### Támogatott eszközök
	Android Studio

## 5. Funkcionális terv
   Fenhaszáló
      - Tud számolni(+,-,*,/)

### 5.1 Rendszerszereplők
   Felhasználó

## 6. Fizikai környezet
   *Android

### Hardver topológia
   *Android 8.0(Oreo)

### Fejlesztő eszközök
	*Android Studio


## 8. Architekturális terv

   XML frontendet Java kód szolgálja ki. aDatbázisra nincs szükség.

## 10. Implementációs terv

   Android:
   A  Android felület főként Java és XML nyelven fog készülni.
   Ezeket a technológiákat amennyire csak lehet külön fájlokba írva készítjük, és
   úgy fogjuk egymáshoz csatolni a jobb átláthatóság, könnyebb változtathatóság,
   és könnyebb bővítés érdekében.

## 12. Telepítési terv

1. Adja meg a szükséges engedélyeket az Android rendszerben (Beállítások -> Biztonság -> Ismeretlen források)
2. Csatlakoztassa a mobilkészüléket a számítógéphez egy adatkábel segítségével. Ezután elképzelhető, hogy a telefon értesítési felületén engedélyezni kell az adatátvitelt. Majd ezt követően másolja a telefon egy tetszőleges mappájába a letöltött APK fájlt.
3. Nyissa meg a telefon fájlkezelőjét, és keresse meg a könyvtárat, amelybe a fájlt másolta. Ezután bökjön az APK fájlra, majd válassza a Telepítés opciót.

## 11. Tesztterv

A tesztelések célja a rendszer és komponensei funkcionalitásának teljes vizsgálata,
ellenőrzése a rendszer által megvalósított üzleti szolgáltatások verifikálása.
A teszteléseket a fejlesztői csapat minden tagja elvégzi.
Egy teszt eredményeit a tagok dokumentálják külön fájlokba.

### A tesztelési jegyzőkönyv kitöltésére egy sablon:

**Tesztelő:** Anka Bálint Kristóf

**Tesztelés dátuma:** 2022.10.11

Tesztszám | Rövid leírás | Várt eredmény | Eredmény | Megjegyzés
----------|--------------|---------------|----------|-----------
Teszt #01 | 1 gomb megnyomása | képernyőn megjeleniik egy 1 | képernyün megjelent egy 1 | Nem találtam problémát.
Teszt #02 | 3 gomb megnyomása | képernyőn megjeleniik egy 2 | képernyün megjelent egy 2 | Nem találtam problémát.
Teszt #03 | 1 gomb megnyomása | képernyőn megjeleniik egy 1 | képernyün megjelent egy 1 | Nem találtam problémát.
Teszt #04 | 4 gomb megnyomása | képernyőn megjeleniik egy 4 | képernyün megjelent egy 4 | Nem találtam problémát.
Teszt #05 | 1 gomb megnyomása | képernyőn megjeleniik egy 1 | képernyün megjelent egy 1 | Nem találtam problémát.
Teszt #06 | 1 gomb megnyomása | képernyőn megjeleniik egy 1 | képernyün megjelent egy 1 | Nem találtam problémát.
Teszt #07 | 7 gomb megnyomása | képernyőn megjeleniik egy 7 | képernyün megjelent egy 7 | Nem találtam problémát.
Teszt #08 | 1 gomb megnyomása | képernyőn megjeleniik egy 1 | képernyün megjelent egy 1 | Nem találtam problémát.
Teszt #09 | 9 gomb megnyomása | képernyőn megjeleniik egy 9 | képernyün megjelent egy 9 | Nem találtam problémát.
Teszt #10 | 0 gomb megnyomása | képernyőn megjeleniik egy 0 | képernyün megjelent egy 0 | Nem találtam problémát.

**Tesztelő 2:** Aranyi Patrik

**Tesztelés dátuma 2:** 2022.10.12

Tesztszám | Rövid leírás | Várt eredmény | Eredmény | Megjegyzés
----------|--------------|---------------|----------|-----------
Teszt #11 | 9-es gomb megnyomása | képernyőn megjelenik a 9-es | képernyőn megjelent a 9-es | Nem találtam problémát.
Teszt #12 | 6-os gomb megnyomása | képernyőn megjelenik a 6-os | képernyőn megjelent a 6-os | Nem találtam problémát.
Teszt #13 | 6-os és 7-es gomb megnyomása | képernyőn megjelenik a 67-es | képernyőn megjelent a 67-es | Nem találtam problémát.
Teszt #14 | 2-es és 3-as gomb megnyomása | képernyőn megjelenik a 23-as | képernyőn megjelent a 23-as | Nem találtam problémát.
Teszt #15 | 3 * 6 = gombok megnyomása | képernyőn megjelenik a 18-as | képernyőn megjelent a 18-as | Nem találtam problémát.
Teszt #16 | 53 * 94 = gombok megnyomása | képernyőn megjelenik a 4982-es | képernyőn megjelent a 4982-es | Nem találtam problémát.
Teszt #17 | 9 - 52 = gombok megnyomása | képernyőn megjelenik a -43-as | képernyőn megjelent a -43-as | Nem találtam problémát.
Teszt #18 | 2594 + 355 = gombok megnyomása | képernyőn megjelenik a 2949-es | képernyőn megjelent a 2949-es | Nem találtam problémát.
Teszt #19 | 75 / 5 = gombok megnyomása | képernyőn megjelenik a 15-ös | képernyőn megjelent a 15-ös | Nem találtam problémát.
Teszt #20 | 27 / 3 = gombok megnyomása | képernyőn megjelenik a 9-es | képernyőn megjelent a 9-es | Nem találtam problémát.

## 13. Karbantartási terv

Fontos ellenőrizni:
...

Figyelembe kell venni a felhasználó által jött visszajelzést is a programmal kapcsolatban.
Ha hibát talált, mielőbb orvosolni kell, lehet az:
*	Működéssel kapcsolatos
*	Kinézet, dizájnnal kapcsolatos
