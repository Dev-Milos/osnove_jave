package p15_09_2023;

public class UvodUNasledjivanje {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.setRegistracija("NI-9217");
        auto.setMarka("BMW");
        auto.setBrojVrata(5);

        auto.stampaj();

        Kamion kamion = new Kamion();

        kamion.setRegistracija("NI-9219");
        kamion.setMarka("BMW");
        kamion.setNosivost(120);

        System.out.println("KRAJ");


    }
}
