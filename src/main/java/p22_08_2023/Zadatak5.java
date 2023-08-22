package p22_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//Napisati program koji simulira ponasanje jednog test case-a.
// Test case ima 5 provera, a program validira jednu po jednu proveru
// sve dok ne proveri sve ili dok neka provera ne failuje.
// Korisnik sa tastature za svaku proveru unosi expected rec i actual rec.
// U slucaju fail-a ispisati odgovarajucu poruku.
//	Primer izvrsenja 1:
//	Unesite expected: hello
//	Unesite actual: hello
//Unesite expected: hello1
//	Unesite actual: hello1
//Unesite expected: hello2
//	Unesite actual: hello
//	Error: Expected hello2 but got hello.
        Scanner s = new Scanner(System.in);
        int testCase = 0;
        boolean provera = false;
        while (!provera){
            System.out.println("Unesite expected: ");
            String expected = s.next();
            System.out.println("Unesite actual");
            String actual = s.next();
            if (!expected.equals(actual)) {
                provera = true;
                System.out.println("Test Case: expected " +expected + " but got " + actual);
            }
            else if (expected.equals(actual)) {
                testCase++;

            }
            if (testCase>5){
                provera = true;
            }
        }
        System.out.println("KRAJ Test Case-a.");











    }
}
