package p24_08_2023;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
//Napisati program koji u sebi ima definisan niz od 5 broja
// (brojevi su proizvoljni) i prikazuje sumu nultog i zadnjeg elementa tog niza.
        ArrayList<Integer> brojevi = new ArrayList<>();

        brojevi.add(10);
        brojevi.add(20);
        brojevi.add(30);
        brojevi.add(40);
        brojevi.add(50);

        int prviBroj = brojevi.get(0);


        int drugiBroj = brojevi.get(brojevi.size() - 1);

        int suma = prviBroj + drugiBroj;

        System.out.println(suma);


    }
}
