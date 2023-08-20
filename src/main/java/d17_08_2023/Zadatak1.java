package d17_08_2023;

import java.util.Scanner;

public class Zadatak1 {


    public static void main(String[] args) {



//Napisati program koji ima informacije koje ucitava informacije sa tastature:
//Ime
//Prezime
//godinu rodjenja
//I stampa informaicije u formatu:
//[ime] [prezime] - [startost] god

        Scanner s = new Scanner(System.in);

        int godina = 2023;

        System.out.println("Unesite vase ime: ");
        String ime = s.next();

        System.out.println("Unesite vase prezime: ");
        String prezime = s.next();

        System.out.println("Unesite vasu godinu rodjenja: ");
        int godRodjenja = s.nextInt();

        int starost = godina - godRodjenja;


        System.out.println(ime + " " + prezime + "-" + starost + " god");




    }


}
