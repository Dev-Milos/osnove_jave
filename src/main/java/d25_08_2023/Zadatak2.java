package d25_08_2023;

public class Zadatak2 {
    public static void main(String[] args) {
//Napisati funkciju koja za dva jednocifrena broja koja su
// ulazni parametri funkcije vraca novu vrednost
// koja se formira kao na primeru. METODA NISTA NE STAMPA.
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

        System.out.println(spajanje(4,5));
    }
    public static int spajanje(int a, int b){
        int c = a*10+b;
        return c;
    }
}
