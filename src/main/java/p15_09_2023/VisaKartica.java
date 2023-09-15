package p15_09_2023;

public class VisaKartica extends PlatnaKartica {

    private String punoIme;

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public VisaKartica(double suma, String brKartice, String godina, String mesec, String punoIme) {
        super(suma, brKartice, godina, mesec);
        this.punoIme = punoIme;
    }

    @Override
    public void izvrsiTransakciju(double suma) {
        if (suma + 100 * 1.8 / 100 < 4) {
            this.suma = this.suma - 4;
        } else {
            this.suma = this.suma - suma + suma * 1.8 / 100;
        }
        super.izvrsiTransakciju(suma);
    }

    @Override
    public void stampaj() {
        System.out.print("Visa Card : ");
        super.stampaj();
        System.out.println("Puno Ime: " + this.punoIme);
    }
}
