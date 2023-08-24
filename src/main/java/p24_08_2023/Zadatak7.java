package p24_08_2023;

import java.util.ArrayList;

public class Zadatak7 {
    public static void main(String[] args) {
        //Napisati program koji simulira digitalni meni za pasta bar.
// Program ima dva niza informacija paste i cene. Program stampa meni u formatu
//naziv paste ………………………….cena rsd
//Informacije su uparene po poziciji, to znaci da se je:
//pasta na poziciji 0, sa cenom sa pozicije 0
//pasta na poziciji 1, sa cenom sa pozicije 1
//…..
//
//Primer izvrsenja:
//AGLIO E OLIO ………………… 500 rsd
//PRIMAVERA…………………340 rsd
//ARRABBIATA ………………….420 rsd
//NAPOLITANA ………………….440 rsd
//POLLO E SPINACI ………………….550 rsd
        ArrayList<String>Paste = new ArrayList<>();
        ArrayList<String>Cene = new ArrayList<>();
        Paste.add("AGLIO E OLIO");
        Paste.add("PRIMAVERA");
        Paste.add("ARRABBIATA");
        Paste.add("NAPOLITANA");
        Paste.add("POLLO E SPINACI");

        Cene.add("500 RSD");
        Cene.add("340 RSD");
        Cene.add("420 RSD");
        Cene.add("440 RSD");
        Cene.add("550 RSD");


        for (int i = 0; i <Paste.size() ; i++) {
            System.out.println(Paste.get(i) + ".................." + Cene.get(i));
        }
    }

}
