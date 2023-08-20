package d18_08_2023;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {

//Napisati program koji za uneti broj x (smatrajte da korisnik unosi jednocifreni broj)
// ispisuje tablicu mnozenja za taj broj. Resiti for petljom.

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a one-digit number: ");

        int x = s.nextInt();

        int y = 9;


        for (int i = 1; i <= y; i++) {

            int result = x*i;
            System.out.println( x + "x" + i + "=" + result);

        }











    }




}
