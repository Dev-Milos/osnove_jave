package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//Napisati program koji u sebi ima definisan niz od 10 broja
// (brojevi su proizvoljni) i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
//Primer:
//Unesite pozicjiu od 0 do 9: 3
//Unesite novu vrednost: 11
        Scanner s = new Scanner(System.in);
        ArrayList<Integer>numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        System.out.println("Unesite poziciju na kojoj zelite da promenite vrednost: ");
        int k = s.nextInt();

        System.out.println("Unesite novu vrednost");
        int n = s.nextInt();

        numbers.set(k,n);
        System.out.println(numbers);

    }
}
