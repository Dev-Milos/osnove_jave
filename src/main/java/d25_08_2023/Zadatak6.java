package d25_08_2023;

public class Zadatak6 {
    public static void main(String[] args) {
//Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//Primer izvrsenja:
//izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
        izbroj(5,10);

    }
    public static int izbroj(int m, int n){

        int counter = 0;
        for (int i = m; i <= n  ; i++) {
            System.out.print(i + "  ");
            if (i>m && i<n){
                counter++;
            }
        }
        System.out.println();
        System.out.print(counter);
        return counter;

    }
}
