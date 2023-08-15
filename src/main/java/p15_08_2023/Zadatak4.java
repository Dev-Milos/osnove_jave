package p15_08_2023;

public class Zadatak4 {

    public static void main(String[] args) {
//        Sifra [SIFRA PROIZVODA]
//[NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
//[BOJA], [VELICINA]
//        Svaku informaciju za proizvod je potrebno cuvati u okviru zasebne promenljive.
//Primer izvrsenja:
//Sifra x932k20
//Nike Patike - $90 - Popust 13.5%
//Crna, 46.5
        String sifra = "Sifra x932k20";
        String patike = "Nike Patike";
        int cena = 90;
        double popust = 13.5;
        String boja = "Crna";
        double velicina = 46.5;

        System.out.println(sifra);
        System.out.println(patike + " - $" + cena + " -popust " + popust + "%");
        System.out.print(boja + "," + velicina);


    }
}
