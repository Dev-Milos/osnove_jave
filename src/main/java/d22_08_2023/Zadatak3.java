package d22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//Napisati program koji ucitava RIMSKE brojeva od korisnika
//i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..
//Primer izvrsenja:
//Unesite rimski broj: X
//Arapski: 10
//Unesite rimski broj: C
// Arapski: 50
//Unesite rimski broj: D
//Arapski: 500
//Unesite rimski broj: M
//Arapski: 1000
//Unesite rimski broj: I
//Arapski: 1
//Unesite rimski broj: KRAJ
//Kraj programa.
        Scanner s = new Scanner(System.in);

        boolean trigger = false;

        String rimskiJedan = "I";
        String rimskiDeset = "X";
        String rimskiPedeset = "C";
        String rimskiPetsto = "D";
        String rimskiHiljadu = "M";
        String end = "KRAJ";
        while (!trigger){
            System.out.println("Unesite rimski broj: ");
            String rimski = s.next();
            if (rimski.equals(rimskiJedan)){
                rimskiJedan= "1";
                System.out.println("Arapski: " + rimskiJedan);
            } else if (rimski.equals(rimskiDeset)) {
                rimskiDeset = "10";
                System.out.println("Arapski: " + rimskiDeset);
            } else if (rimski.equals(rimskiPedeset)) {
                rimskiPedeset = "50";
                System.out.println("Arapski " + rimskiPedeset);
            } else if (rimski.equals(rimskiPetsto)) {
                rimskiPetsto = "500";
                System.out.println("Arapski " + rimskiPetsto);
            } else if (rimski.equals(rimskiHiljadu)) {
                rimskiHiljadu = "1000";
                System.out.println("Arapski " + rimskiHiljadu);
            } else if (rimski.equals(end)) {
                System.out.println("Kraj programa. ");
                trigger = true;
            }
        }





















    }
}
