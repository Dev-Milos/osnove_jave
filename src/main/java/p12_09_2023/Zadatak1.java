package p12_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        ClanskaKarta clanskaKarta = new ClanskaKarta(30,"0689-2349");
        Kupac kupac = new Kupac("Milos Josifovic", clanskaKarta);
        Proizvod proizvod = new Proizvod("Frizider",kupac,90);



        proizvod.stampajProizvod();
        System.out.println(kupac.getClanskaKarta().getPopust());


    }
}
