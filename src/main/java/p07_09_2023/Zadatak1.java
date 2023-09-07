package p07_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Racun posiljalac = new Racun();
        posiljalac.vlasnik = "Milos Josifovic";
        posiljalac.broj = "143214124124";
        posiljalac.stanje = 1000;
        System.out.println(posiljalac.broj);
        System.out.println(posiljalac.vlasnik);
        System.out.println(posiljalac.stanje);

        Racun primalac = new Racun();
        primalac.vlasnik = "Petar Petrovic";
        primalac.broj = "352525235235";
        primalac.stanje = 200;
        System.out.println(primalac.broj);
        System.out.println(primalac.vlasnik);
        System.out.println(primalac.stanje);

        int suma = 500;
        System.out.println("Posiljalac: " + posiljalac.vlasnik + ", " + posiljalac.broj + ", " + posiljalac.stanje);
        System.out.println("Primalac: " + primalac.vlasnik + ", " + primalac.broj + ", " + primalac.stanje);

        posiljalac.stanje = posiljalac.stanje - suma;
        primalac.stanje = primalac.stanje + suma;

        System.out.println("Stanje nakon transakcije: ");

        System.out.println("Posiljalac: " + posiljalac.vlasnik + ", " + posiljalac.broj + ", " + posiljalac.stanje);
        System.out.println("Primalac: " + primalac.vlasnik + ", " + primalac.broj + ", " + primalac.stanje);


    }
}
