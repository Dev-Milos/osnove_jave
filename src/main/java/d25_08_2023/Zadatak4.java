package d25_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
/// / / / /
//Napomena: Metoda nista ne vraca.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite n: ");
        int n = s.nextInt();

        System.out.println("Unesite jedan karakter: ");
        String k = s.next();

        for (int i = 0; i < n; i++) {
            stampajNKaraktera(n,k);
        }

    }public static void stampajNKaraktera(int n, String k){

        System.out.print(k);

    }
}
