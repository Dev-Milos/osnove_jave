package d12_09_2023;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
        ZeleniKarton zeleniKarton = new ZeleniKarton("Milos Josifovic", "Marko Markovic", "06897", "Filozofija", 6);
        ZeleniKarton zeleniKarton1 = new ZeleniKarton("Milos Josifovic", "Nemanja Nemanjic", "06897", "Statistika", 7);
        ZeleniKarton zeleniKarton2 = new ZeleniKarton("Milos Josifovic", "Nemanja Dobric", "06897", "Biologija", 5);
        ZeleniKarton zeleniKarton3 = new ZeleniKarton("Milos Josifovic", "Petar Petrovic", "06897", "Hemija", 10);
        ZeleniKarton zeleniKarton4 = new ZeleniKarton("Milos Josifovic", "Nemanja Nemanjic", "06897", "Fizika", 8);
        ArrayList<ZeleniKarton>zeleniKartoni = new ArrayList<>();
        zeleniKartoni.add(zeleniKarton);
        zeleniKartoni.add(zeleniKarton1);
        zeleniKartoni.add(zeleniKarton2);
        zeleniKartoni.add(zeleniKarton3);
        zeleniKartoni.add(zeleniKarton4);

        zeleniKartoni.get(0).stampaj();
        zeleniKartoni.get(1).stampaj();
        zeleniKartoni.get(2).stampaj();
        zeleniKartoni.get(3).stampaj();
        zeleniKartoni.get(4).stampaj();

        double prosek;
        prosek = (zeleniKartoni.get(0).getOcena() + zeleniKartoni.get(1).getOcena()+zeleniKartoni.get(2).getOcena()+
        zeleniKartoni.get(3).getOcena() + zeleniKartoni.get(4).getOcena()) / 5;
        System.out.println(prosek);



    }
}
