package d19_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Tetrapak tetrapak = new Tetrapak("12345", "Mleko", 1.0, 1.2, true, 100);
        StaklenaAmbalaza flasa = new StaklenaAmbalaza("67890", "Djus", 0.5, 0.7, 10, true, 50);

        Korpa korpa = new Korpa();
        korpa.dodajAmbalazu(tetrapak);
        korpa.dodajAmbalazu(flasa);

        SuperKartica superKartica = new SuperKartica("123456789", "Milos Josifovic", 10);

        System.out.println("Ukupna cena sa popustom: " + korpa.ukupnaCena(superKartica) + " dinara");


        tetrapak.stampaj();
        flasa.stampaj();
        superKartica.stampaj();
    }
}
