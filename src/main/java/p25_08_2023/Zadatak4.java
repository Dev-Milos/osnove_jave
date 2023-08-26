package p25_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {
//        Napisati funkciju koja stampa zbir, razliku, proizvod i
//        kolicnik za dva prosledjena broja. Brojevi su ulazni parametri funkcije.
//        U gravnom programu pozvati nekoliko puta funkciju
//        sa razlicitim prosledjenim vrednostima.
        mathOperations(5,6);
        mathOperations(32,34);
        mathOperations(76,1);
    }

    public static void mathOperations(int a, int b) {
        int suma = a + b;
        System.out.println(suma);
        int razlika = a - b;
        System.out.println(razlika);
        int kolicnik = a / b;
        System.out.println(kolicnik);
        int proizvod = a * b;
        System.out.println(proizvod);
    }
}
