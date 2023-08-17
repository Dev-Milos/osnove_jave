package p17_08_2023;

import java.util.Scanner;

public class Zadatak8 {

    public static void main(String[] args) {


//        Zadatak
//Napisati program koji ucitava stranice trougla a, b i c
// i ispisuje da li je trougao pravougli. Trougao je pravougli ako je
        // a**2 + b**2 = c**2

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite stranicu a: ");
        double a = s.nextDouble();

        System.out.println("Unesite stranicu b: ");
        double b = s.nextDouble();

        System.out.println("Unesite stranicu c: ");
        double c = s.nextDouble();

        if(c*c == (a*a)+(b*b)){
            System.out.println("Trougao je pravougli");
        }
        else {
            System.out.println("Nije pravougli");
        }




    }
}
