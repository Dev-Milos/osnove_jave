package d24_08_2023;

import java.util.ArrayList;

public class Zadatak6 {
    public static void main(String[] args) {
//Napisati program koji vrsi proveru linkova sa stranice. Program cuva 3 niza:
//niz linkova
//niz ocekivanih status kodova za linkove iz prvog niza (expected status codes)
//niz status kodova koje vracaju linkovi iz prvog niza (actual status codes)
//Program za svaki link vrsi proveru ocekivane i dobijene vrednosti za status kod.
// Ukoliko se actual i expected vrednosti ne poklapaju ispisati gresku u formatu:
//Assertion Error: Link <link> expected status code <expected code> but got <actual code>
//Primer izvrsenja:
//Assertion Error: https://cms.demo.katalon.com/account/ expected 404 but got 400
//Assertion Error: https://cms.demo.katalon.com/cart/ expected 204 but got 200
//Assertion Error: https://cms.demo.katalon.com/test/ expected 200 but got 404
        ArrayList<String>linkovi = new ArrayList<>();
        ArrayList<String>expCodes = new ArrayList<>();
        ArrayList<String>actCodes = new ArrayList<>();

        linkovi.add("https://cms.demo.katalon.com/cart/");
        linkovi.add("https://cms.demo.katalon.com/shop/");
        linkovi.add("https://cms.demo.katalon.com/account/");
        linkovi.add("https://cms.demo.katalon.com/cart/");
        linkovi.add("https://cms.demo.katalon.com/test/");

        expCodes.add("200");
        expCodes.add("200");
        expCodes.add("404");
        expCodes.add("204");
        expCodes.add("200");

        actCodes.add("200");
        actCodes.add("200");
        actCodes.add("400");
        actCodes.add("200");
        actCodes.add("404");

        for (int i = 0; i <= linkovi.size()-1; i++) {
            if (!expCodes.get(i).equals(actCodes.get(i))){
                System.out.println("Assertion Error: " + linkovi.get(i) + " expected status code " +
                        expCodes.get(i) + " , but got " + actCodes.get(i));
            }
        }
    }
}
