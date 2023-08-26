package p25_08_2023;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
//Napisati metodu koja vrsi konverziju rimske(string) u arapske brojeve(int).
//Kao parametar se unosi vrednost rimkog broja(string) a vraca se arapski (int).
//Ako se unese V vraca se 5. Ako se unese vrednost koja nije podrzana vracamo nulu.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost: ");
        String rimski = s.next();
        System.out.println(konverzija(rimski));

    }

    public static int konverzija(String rimski){
        if (rimski.equals("I")){
            return 1;
        } else if (rimski.equals("II")) {
            return 2;
        }else if (rimski.equals("III")){
            return 3;
        }else if (rimski.equals("IV")){
            return 4;
        } else if (rimski.equals("V")) {
            return 5;
        }else {
            return 0;
        }


    }
}
