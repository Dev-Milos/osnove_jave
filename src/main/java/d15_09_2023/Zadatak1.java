package d15_09_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        ArrayList<Igrac>igraci = new ArrayList<>();
        ArrayList<Trener>treneri = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        Igrac igrac1 = new Igrac();


        System.out.println("Unesite neophodne informacije za prvog igraca, ime i prezime ide poslednje");

        System.out.println("Unesite info: ");
        System.out.println("God rodj");
        igrac1.setGodinaRodjenja(s.nextInt());
        System.out.println("jmbg");
        igrac1.setJMBG(s.next());
        System.out.println("broj");
        igrac1.setBroj(s.nextInt());
        System.out.println("Pozicija");
        igrac1.setPozicija(s.next());
        System.out.println("Kapiten");
        igrac1.setImePrezime(s.next());








        Igrac igrac2 = new Igrac();
//        Igrac igrac1 = new Igrac("Milos Josifovic","121284322009",2000, 12,"Napadac",true);
//        Igrac igrac2 = new Igrac("Marko Markovic","123123211241414",2001,12,"Odbrana",false);
        System.out.println("Unesite info: ");
        System.out.println("God rodj");
        igrac1.setGodinaRodjenja(s.nextInt());
        System.out.println("jmbg");
        igrac1.setJMBG(s.next());
        System.out.println("broj");
        igrac1.setBroj(s.nextInt());
        System.out.println("Pozicija");
        igrac1.setPozicija(s.next());
        System.out.println("Kapiten");
        igrac1.setImePrezime(s.next());


        Trener trener1 = new Trener();
//        trener1.setTipTrenera("Za igru");
//        trener1.setImePrezime("Pera");
//        trener1.setGodineIskustva(12);
//        trener1.setJMBG("123123412414");
//        trener1.setGodinaRodjenja(1988);

        System.out.println("Unesite info: ");
        System.out.println("God rodj");
        trener1.setGodinaRodjenja(s.nextInt());
        System.out.println("jmbg");
        trener1.setJMBG(s.next());
        System.out.println("god iskustva");
        trener1.setGodineIskustva(s.nextInt());
        System.out.println("tip trenera");
        trener1.setTipTrenera(s.next());
        System.out.println();
        trener1.setImePrezime(s.next());

        Trener trener2 = new Trener();
//        trener2.setTipTrenera("Kondicioni");
//        trener2.setImePrezime("Dejan");
//        trener2.setGodineIskustva(8);
//        trener2.setJMBG("12414141412412");
//        trener2.setGodinaRodjenja(1990);
        System.out.println("Unesite info: ");
        System.out.println("God rodj");
        trener1.setGodinaRodjenja(s.nextInt());
        System.out.println("jmbg");
        trener1.setJMBG(s.next());
        System.out.println("god iskustva");
        trener1.setGodineIskustva(s.nextInt());
        System.out.println("tip trenera");
        trener1.setTipTrenera(s.next());
        System.out.println();
        trener1.setImePrezime(s.next());

        igrac1.stampaj();
        igrac2.stampaj();

        trener1.stampaj();
        trener2.stampaj();

        igraci.add(igrac1);
        igraci.add(igrac2);

        treneri.add(trener1);
        treneri.add(trener2);




    }
}
