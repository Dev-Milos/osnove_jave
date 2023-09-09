package p08_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        Auto auto1 = new Auto();

        auto1.vozac = "Milos Josifovic";
        auto1.marka = "BMW";
        auto1.brojVrata = 5;
        auto1.potrosnjaNa100Km = 5;
        auto1.trenutnaBrzina = 120;

        auto1.stampaj();

        int ogranicenje = 100;

        if (auto1.prekoracenje(ogranicenje)){
            System.out.println("Prekoracili ste brzinu!");
            System.out.println(auto1.kazna(ogranicenje) + "RSD je vasa kazna. ");
        }else {
            System.out.println("Niste prekoracili brzinu.");
        }

    }
}
