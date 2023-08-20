package d18_08_2023;

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {
//Napisati program koji simulira stampanje ocitane
// licne karte u vise primeraka. Korisnik unosi podatke :
//ime
//prezime
//jmbg
//broj primeraka za stampu
//Primer izvrsenja:
//Unesite ime: Milan
//Unesite prezime: Jovanovic
//Unesite jmbg: 2109238932232
//Unesite broj primeraka za stampu: 3

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ime: ");
        String ime = s.next();

        System.out.println("Unesite prezime: ");
        String prezime = s.next();

        System.out.println("Unesite JMBG: ");
        String jmbg = s.next();

        System.out.println("Unesite broj primeraka za stampu : ");
        int brPrimeraka = s.nextInt();

        for (int i = 0; i < brPrimeraka; i++) {
            System.out.println("Ime i prezime: "+ ime + prezime);
            System.out.println("JMBG: " + jmbg);
        }

    }




}
