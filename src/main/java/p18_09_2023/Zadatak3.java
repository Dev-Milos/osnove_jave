package p18_09_2023;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
        ArrayList<Figura>figure = new ArrayList<>();

        JednakostranicniTrougao trougao = new JednakostranicniTrougao(3);
        JednakostranicniTrougao trougao2 = new JednakostranicniTrougao(4);

        Pravougaonik pravougaonik = new Pravougaonik(3,4);
        Pravougaonik pravougaonik2 = new Pravougaonik(6,7);

        figure.add(trougao);
        figure.add(trougao2);

        figure.add(pravougaonik);
        figure.add(pravougaonik2);


        double sumaPovrsina = 0;
        double sumaObima = 0;

        for (int i = 0; i < figure.size(); i++) {
            sumaPovrsina += figure.get(i).izracunajPovrsinu();
            sumaObima += figure.get(i).izracunajObim();
        }
        System.out.println(sumaPovrsina);
        System.out.println(sumaObima);

        for (int i = 0; i < figure.size(); i++) {
            figure.get(i).stampaj();
        }





    }
}
