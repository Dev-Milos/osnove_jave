package d08_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Proizvod proizvod1 = new Proizvod();
        Proizvod proizvod2 = new Proizvod();

        proizvod1.naziv = "LG Monitor";
        proizvod1.cena = 20000;
        proizvod1.weightInGrams = 1172;

        proizvod1.stampajPodatke();
        proizvod1.povecajCenu(990);
        proizvod1.stampajPodatke();
        System.out.println(proizvod1.vratiCenuSaPopustom(30));
        System.out.println(proizvod1.racunajPostarinu());

        proizvod2.naziv = "Iphone14 Pro Max";
        proizvod2.cena = 150000;
        proizvod2.weightInGrams = 240;

        proizvod2.stampajPodatke();
        proizvod2.povecajCenu(15000);
        proizvod2.stampajPodatke();
        System.out.println(proizvod2.vratiCenuSaPopustom(30));
        System.out.println(proizvod2.racunajPostarinu());



    }
}
