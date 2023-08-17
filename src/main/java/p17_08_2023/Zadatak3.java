package p17_08_2023;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {


//        Napisati program koji sa tastature ucitava tri broja a, b i c
//        i ispisuje srednju vrednost za ta tri broja.
//        Sve promenljive u programu su po tipu double

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite tri broja: ");
//        double a = s.nextInt();
//        double b = s.nextInt();
//        double c = s.nextInt();


        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        double result = (a + b + c)/3;

        System.out.println("Prosek tri broja je: " + result);

    }

}
