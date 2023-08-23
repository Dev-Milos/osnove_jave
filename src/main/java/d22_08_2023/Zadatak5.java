package d22_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//Napisati program koji proverava uparenost zagrada.
//Korisnik unosi matematicku formulu sve dok ne unese znak =
//Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje
// da li su sve zagrade uparene.
//Formula koja se koristi u primeru je: (2 * ( 1 + 3))=
        String zagrada1 = "(";
        String zagrada2 = ")";

        int counter1 = 0;
        int counter2 = 0;

        Scanner s = new Scanner(System.in);
        boolean jednacina = false;

        String prekid = "=";

        while (!jednacina){
            System.out.println("Unos: ");
            String karakter = s.next();
            if (karakter.equals(zagrada1)){
                counter1++;
            } else if (karakter.equals(zagrada2)) {
                counter2++;
            }
            if (karakter.equals(prekid) && counter1==counter2 && counter1>0 && counter2>0){
                jednacina = true;
                System.out.println("Objasnjenje: zagrade su uparene");
            } else if (karakter.equals(prekid) && counter1!=counter2 && counter1>0 && counter2>0) {
                jednacina = true;
                System.out.println("Objasnjenje: zagrade nisu uparene");
            }

        }













    }
}
