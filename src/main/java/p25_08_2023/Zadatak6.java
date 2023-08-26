package p25_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
//Napisati metodu koja vraca suprotno negativni broj od prosledjenog.
// Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//Primer: Ako se metoda pozove za N=10, vraca -10
//	Ako se metoda pozove za N=-11, vraca 11
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj n");
        int n = s.nextInt();

    }
    public static int suprotni(int n){
        return -n;
    }
}
