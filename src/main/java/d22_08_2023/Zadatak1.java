package d22_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//Napisati program koji sabira brojeve koje korisnik unosi,
// pritom da suma ne predje 100.Na kraju programa ispisati sracunatu sumu.
//Unesite vrednost: 20
//Unesite vrednost: 50
//Unesite vrednost: 50
//Prekoracenje! Kraj programa. Sracunata suma je 70.
        Scanner s = new Scanner(System.in);
        boolean overstep = false;

        int suma = 0;

        while (!overstep) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            System.out.println(broj);
            suma += broj;
            if (suma > 100) {
                overstep = true;
                suma -=broj;
            }
        }
        System.out.println("Prekoracenje! Kraj programa. Sracunata suma je " + suma);


    }
}
