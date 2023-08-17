package p17_08_2023;

import java.util.Scanner;

public class Zadatak6 {

    public static void main(String[] args) {

//      Napisati program koji ucitava brojeve a, b i c
//      sa tastature i za svaki broj proverava da li je validan.
//      Ukoliko broj nije validan, ispisuje se greska za svaki broj.
//Broj nije validan ukoliko je broj negativan.



        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj a");
        int a = s.nextInt();

        System.out.println("Unesite broj b");
        int b = s.nextInt();

        System.out.println("Unesite broj c");
        int c = s.nextInt();

        if(a<0){
            System.out.println("broj" + a + "nije validan broj.");
        }

        if(b<0){
            System.out.println("broj" + b + "nije validan broj.");
        }

        if(c<0){
            System.out.println("broj" + c + "nije validan broj.");
        }

    }

}
