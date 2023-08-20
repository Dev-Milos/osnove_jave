package d17_08_2023;

import java.util.Scanner;

public class Zadatak4 {


    public static void main(String[] args) {



// Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu.
// Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.
        //T1 i T2 su pozicije login forme. M je pozicija na koju je kliknuto

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite X za T1: ");
        int x = s.nextInt();

        System.out.println("Unesite Y za T1: ");
        int y = s.nextInt();

        System.out.println("Unesite X2 za T2: ");
        int x2 = s.nextInt();

        System.out.println("Unesite Y2 za T2: ");
        int y2 = s.nextInt();

        System.out.println("Unesite X3 za M: ");
        int x3 = s.nextInt();

        System.out.println("Unesite Y3 za M: ");
        int y3 = s.nextInt();


        int T1 = (x + y) /2;

        int T2 = (x2 + y2)/2;

        int M = (x3 - y3)/2;


        if(M < T1 && M < T2){

            System.out.println("Kliknuto je unutar forme.");


        }
        else {
            System.out.println("Nije kliknuto unutar forme.");
        }

    }



}
