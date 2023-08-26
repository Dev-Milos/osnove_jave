package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//Napisati program koji ucitava niz A duzine N,
// i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.
        Scanner s = new Scanner(System.in);
        ArrayList<Integer>numbers = new ArrayList<>();

        System.out.println("Unesite duzinu niza N: ");
        int n = s.nextInt();
        int k;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj");
            k = s.nextInt();
            numbers.add(k);



        }
        for (int i = 0; i <= numbers.size()-1; i++) {
            if (numbers.get(i)>0){
                System.out.print(numbers.get(i) + ", ");
            }
        }



    }
}
