package d07_09_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Oprema oprema1 = new Oprema();
        Oprema oprema2 = new Oprema();
        Oprema oprema3 = new Oprema();

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite tip opreme: ");
        oprema1.tip = s.next();
        System.out.println("Unesite marku: ");
        oprema1.marka = s.next();
        System.out.println("Unesite cenu opreme: ");
        oprema1.cena = s.nextDouble();

        System.out.println("Unesite tip opreme: ");
        oprema2.tip = s.next();
        System.out.println("Unesite marku: ");
        oprema2.marka = s.next();
        System.out.println("Unesite cenu opreme: ");
        oprema2.cena = s.nextDouble();

        System.out.println("Unesite tip opreme: ");
        oprema3.tip = s.next();
        System.out.println("Unesite marku: ");
        oprema3.marka = s.next();
        System.out.println("Unesite cenu opreme: ");
        oprema3.cena = s.nextDouble();

        oprema1.stampajInfo();
        oprema2.stampajInfo();
        oprema3.stampajInfo();


    }
}
