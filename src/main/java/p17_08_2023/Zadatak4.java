package p17_08_2023;

import java.util.Scanner;

public class Zadatak4 {


    public static void main(String[] args) {


//        Napisati program koji ispisuje da li je broj b manji od broja a.
//        A i B unosimo sa tastature.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        int a = s.nextInt();

        System.out.println("Unesite drugi broj: ");
        int b = s.nextInt();

        if (b<a) {
            System.out.println("Drugi broj je manji");

        }
        else {
            System.out.println("Drugi broj je veci");
        }


    }

}
