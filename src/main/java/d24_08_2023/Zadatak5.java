package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//Napisati program koji ucitava niz A duzine N i broj X.
// Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
        Scanner s = new Scanner(System.in);
        ArrayList<Integer>numbers = new ArrayList<>();

        System.out.println("Unesite duzinu niza N: ");
        int n = s.nextInt();



        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int k = s.nextInt();
            numbers.add(k);
        }
        System.out.println("Unesite broj X");
        int x = s.nextInt();

        for (int i = 0; i < n; i++) {
            if (numbers.get(i)==x){
                System.out.print(i);
            }
        }
    }
}
