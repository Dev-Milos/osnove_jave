package p15_09_2023;

public class MasterKartica extends PlatnaKartica {
    public MasterKartica(double suma, String brKartice, String godina, String mesec) {
        super(suma, brKartice, godina, mesec);
    }

    @Override
    public void izvrsiTransakciju(double suma) {
        this.suma = this.suma - suma + suma * 1.5 / 100;
        super.izvrsiTransakciju(suma);
    }

    public void naplatiOdrzavanje() {
        this.suma = this.suma - 2;
    }

    @Override
    public void stampaj() {
        System.out.print("Master Card : ");
        super.stampaj();
    }


}
