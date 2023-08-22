package p22_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
//Zadatak
//Napisati program koji radi bipovanje ruznih reci.
// Program radi za jednu recenicu, sto znaci da ucitava od korisnika
//rec po rec sve dok se ne unese rec sa tackom.
// Za reci koje su nepristojne ispisuje beeeeeeeeeeeeep.
//Ruzne reci koje program prepoznaje su:
//zajebava
//mars
//stoko
//svinjo
        Scanner s = new Scanner(System.in);

        String zajebava = "zajebava";
        String mars = "mars";
        String stoko = "stoko";
        String svinjo = "svinjo";

        boolean proveraReci = false;

        while (!proveraReci){
            System.out.println("Unesite rec");
            String rec = s.next();

            if (rec.equals(zajebava) || rec.equals(mars) || rec.equals(stoko) || rec.equals(svinjo)){
                System.out.println("beeeeeeeeeeeeeeep");
            } else if (rec==rec) {
                System.out.println(rec);

            } else if (rec.contains(rec + ".")) {
                proveraReci = true;
            }
        }











    }
}
