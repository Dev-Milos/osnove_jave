package p18_09_2023;

public class MasterKartica extends  PlatnaKartica{
    @Override
    public void izvrsiTransakciju(double suma) {
        this.suma = this.suma - suma + suma * 1.5 / 100;
    }

    @Override
    public void stampaj() {
        System.out.print("Master Card : ");
        System.out.println(this.godina + this.mesec + this.brKartice + this.suma);
    }
    public void naplatiOdrzavanje() {
        this.suma = this.suma - 2;
    }

    public MasterKartica(double suma, String brKartice, String godina, String mesec) {
        super(suma, brKartice, godina, mesec);
    }
}
