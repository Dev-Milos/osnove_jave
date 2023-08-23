package d22_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//Napisati program koji od korisnika ucitava brojeve
// sve dok ne unesu bar dve dvojke ili tri jedinice.
//Primer izvrsenja 1:
//Unesite broj:1
//Unesite broj:2
//Unesite broj:0
//Unesite broj:2
//Kraj programa.
        Scanner s = new Scanner(System.in);

        boolean end = false;

        int counterOne = 0;
        int counterTwo = 0;

        while (!end) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            if (broj == 1) {
                counterOne++;
            } else if (broj == 2) {
                counterTwo++;
            }
            if (counterOne == 3) {
                end = true;
                System.out.println("Kraj programa");
                System.out.println("Objasnjenje: uneto je tri jedinice");
            } else if (counterTwo==2) {
                end = true;
                System.out.println("Kraj programa");
                System.out.println("Objasnjenje: uneto je dve dvojke");
            }
        }



    }
}
