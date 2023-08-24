package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//Napisati program koji u sebi ima definisan niz od 5 broja
// (brojevi su proizvoljni) i koji prikazuje element na poziciji K.
// K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.
//Primer:
//Unesite pozicjiu: 2
//Na pozicji 2 je vrednost 7.
        Scanner s = new Scanner(System.in);
        ArrayList<Integer>numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Unesite index K");
        int broj = s.nextInt();

        int result = numbers.get(broj);

        System.out.println(result);


    }
}
