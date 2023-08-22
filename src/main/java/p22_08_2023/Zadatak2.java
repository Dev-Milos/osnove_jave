package p22_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//Zadatak
//Napisati program koji od korisnika ucitava brojeve sve dok ne unesu dve nule.
//Primer:
//Unesite broj:1
//Unesite broj:2
//Unesite broj:0
//Unesite broj:1
//Unesite broj:0
//Kraj programa jer je uneto 2 nule.
        Scanner s = new Scanner(System.in);


        int counter = 0;
        System.out.println("Unesite dve nule: ");

        while (counter<2){
            System.out.println("Unesite dve nule: ");
            int unos = s.nextInt();
            if (unos==0){
                counter++;
            }

        }
        System.out.println("Uneli ste dve nule");














    }
}
