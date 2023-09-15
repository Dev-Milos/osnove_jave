package p15_09_2023;

public class PlatnaKartica {
    protected double suma;
    protected String brKartice;
    protected String godina;
    protected String mesec;

    public PlatnaKartica(double suma, String brKartice, String godina, String mesec) {
        this.suma = suma;
        this.brKartice = brKartice;
        this.godina = godina;
        this.mesec = mesec;
    }

    public double getSuma() {
        return suma;
    }

    public String getBrKartice() {
        return brKartice;
    }

    public String getGodina() {
        return godina;
    }

    public String getMesec() {
        return mesec;
    }

    public void dodajSredstva(double suma) {
        this.suma += suma;
    }

    public void izvrsiTransakciju(double suma) {
        this.suma -= suma;
    }

    public void stampaj() {
        System.out.println(this.brKartice + ", " + this.mesec + "/" + this.godina + ",  $" + this.suma);
    }
}
