package p17_08_2023;

import java.util.Scanner;

public class Zadatak9 {


    public static void main(String[] args) {


//Napisati program za potrebe Makao igrice. Korisnik unosi 4
// informacije:
//znak karte koja je na stolu
//broj karte koja je na stolu
//znak karte koju igrac zeli da odigra
//broj karte koju igrac zeli da odigra
//	i nakon toga se na ekranu ispisuje da li je potez ispravan.
//	Potez je ispravan ukoliko se karta na stolu i odigrana karta
//	poklapaju po znaku ili broju.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite znak karte koja je na stolu:");
        String znak1 = s.next();

        System.out.println("Unesite broj karte koja je na stolu:");
        String broj1 = s.next();

        System.out.println("Unesite znak karte koju zelite da odigrate:");
        String znak2 = s.next();

        System.out.println("Unesite broj karte koju zelite da odigrate:");
        String broj2 = s.next();

        if (znak1.equals(znak2) || broj1.equals(broj2)){
            System.out.println("Potez je validan");

        }
        else {
            System.out.println("Potez je nevalidan");
        }






    }


}
