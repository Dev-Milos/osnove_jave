package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//Zadatak
//Napisati program koji ucitava N brojeva i smesta ih u niz
//Zatim, iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.
        Scanner s = new Scanner(System.in);

        ArrayList<Integer>numbers = new ArrayList<>();

        System.out.println("Unesite broj brojeva koje zelite da smestite u niz");
        int n = s.nextInt();

        int evenCounter = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj");
            int k = s.nextInt();
            numbers.add(k);
            if (k%2==0){
                evenCounter++;
            }
        }
        System.out.println("Broj unetih parnih brojeva je: " + evenCounter);
    }
}
