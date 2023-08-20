package d18_08_2023;

public class Zadatak4 {

    public static void main(String[] args) {
//Napisati program koji stampa 25 _ (donjih crta), pritom na svaku 5.
// iteraciju odstampa i novi red.
// Zadatak resiti pomocu FOR petlje.
//Primer izvrsenja:

        String donjaCrta = "_";

        for (int i = 1; i < 26; i++) {

            System.out.print(donjaCrta);
            if (i%5==0) {
                System.out.println();

            }
        }



















    }






}
