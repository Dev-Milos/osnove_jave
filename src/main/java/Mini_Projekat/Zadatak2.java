package Mini_Projekat;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
//Simulacija iscrtavanja korisnika na Slacku**
//
//Napišite program koji simulira prikazivanje korisnika na Slacku. Prikaz korisnika treba da se izvede tako da
// prvo budu prikazani aktivni korisnici, a potom neaktivni. Program će čuvati sledeće informacije:
//Niz korisnika - u ovom nizu će biti sačuvani svi korisnici koji imaju pristup Slacku.
//Niz aktivnosti - svaki korisnik će biti označen kao aktivan ili neaktivan.
// Informacije o aktivnostima biće čuvane u nizu gde će za svakog korisnika biti zabeleženo
// da li je trenutno aktivan ili ne  (true ili false).. Naravno, korisnik i njegova aktivnost
// će biti upareni po istom indeksu. To znači da će se za korisnika na poziciji N u nizu "korisnici" čitati aktivnost
// sa pozicije N u nizu "aktivnosti".
//
//Program će ispisivati informacije za svakog korisnika na sledeći način:
//Za aktivne korisnike:
//  | slika |o Ime Prezime
//Za neaktivne korisnike:
//  | slika |x Ime
        ArrayList<String> imena_korisnika = new ArrayList<>();
        ArrayList<Boolean> aktivnost_korisnika = new ArrayList<>();

        imena_korisnika.add("Pera Peric");
        imena_korisnika.add("Darko Darkovic");
        imena_korisnika.add("Marko Markovic");
        imena_korisnika.add("Stefan Stefanovic");
        imena_korisnika.add("Uros Urosevic");
        imena_korisnika.add("Milan Milanovic");

        aktivnost_korisnika.add(true);
        aktivnost_korisnika.add(false);
        aktivnost_korisnika.add(true);
        aktivnost_korisnika.add(true);
        aktivnost_korisnika.add(false);
        aktivnost_korisnika.add(true);

        for (int i = 0; i < imena_korisnika.size(); i++) {
            if (aktivnost_korisnika.get(i)) {
                System.out.println("| slika |o " + imena_korisnika.get(i));
            }

        }

        for (int i = 0; i < imena_korisnika.size(); i++) {
            if (!aktivnost_korisnika.get(i)){
                System.out.println("| slika |x " + imena_korisnika.get(i));
            }


        }


    }
}
