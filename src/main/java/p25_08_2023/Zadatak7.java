package p25_08_2023;

public class Zadatak7 {
    public static void main(String[] args) {
//Napisati metodu koja proverava da li je trougao pravougli.
// Metoda prima stranice trougla i hipotenuzu trougla.
// Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//Trougao je pravougli ukoliko je a*a+b*b=c*c
        int a = 10;
        int b = 20;
        int c = 10;

         boolean result = proveraTrougla(a,b, c);



    }
    public static boolean proveraTrougla(int a, int b, int c){
        if (a*a + b*b==c*c){
            return true;
        }else {
            return false;
        }
    }
}
