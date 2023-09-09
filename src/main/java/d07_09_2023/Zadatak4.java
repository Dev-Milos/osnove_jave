package d07_09_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Film film1 = new Film();

        System.out.println("Unesite naslov filma: ");
        film1.naslov = s.next();
        System.out.println("Unesite godinu izdanja: ");
        film1.godinaIzdanja = s.nextInt();
        System.out.println("Izaberite rezisera: ");
        film1.reziser = s.next();

        Film film2 = new Film();

        System.out.println("Unesite naslov filma: ");
        film2.naslov = s.next();
        System.out.println("Unesite godinu izdanja: ");
        film2.godinaIzdanja = s.nextInt();
        System.out.println("Izaberite rezisera: ");
        film2.reziser = s.next();

        Film film3 = new Film();

        System.out.println("Unesite naslov filma: ");
        film3.naslov = s.next();
        System.out.println("Unesite godinu izdanja: ");
        film3.godinaIzdanja = s.nextInt();
        System.out.println("Izaberite rezisera: ");
        film3.reziser = s.next();

    }
}
