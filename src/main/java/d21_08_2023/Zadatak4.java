package d21_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija.
// Korisnik unosi N rekacija zatim se prikazuje evidencija:
//Program podrzava sledece reakcije:
//like
//smile
//heart
//
//	Primer izvrsenja:
//Unesite N: 7
//	Reaguj: like
//	Reaguj: heart
//	Reaguj: smile
//	Reaguj: lol
//	Reaguj: smile
//	Reaguj: like
//	Reaguj: like
//Summary: like 3 | smile 2 | heart 1
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj reakcija: ");
        int brojReakcija = s.nextInt();

        String smile = "smile";
        String like = "like";
        String heart = "heart";

        int reakcijaSmile = 0;
        int reakcijaLike = 0;
        int reakcijaHeart = 0;

        for (int i = 0; i < brojReakcija ; i++) {

            System.out.println("Reaguj: ");
            String reakcija = s.next();
            System.out.println(reakcija);
            if (reakcija.equals(smile)){
                reakcijaSmile++;
            } else if (reakcija.equals(like)) {
                reakcijaLike++;
            } else if (reakcija.equals(heart)) {
                reakcijaHeart++;
            }

        }
        System.out.println("Summary: like " + reakcijaLike + " | " + " smile " + reakcijaSmile
        + " | " + " heart " + reakcijaHeart);















    }
}
