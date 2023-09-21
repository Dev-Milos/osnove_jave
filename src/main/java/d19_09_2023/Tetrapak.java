package d19_09_2023;

public class Tetrapak extends Ambalaza{
    private boolean reciklaza;
    private double osnovnaCena;

    public Tetrapak(boolean reciklaza, double osnovnaCena) {
        this.reciklaza = reciklaza;
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, boolean reciklaza, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.reciklaza = reciklaza;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isReciklaza() {
        return reciklaza;
    }

    public void setReciklaza(boolean reciklaza) {
        this.reciklaza = reciklaza;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if (this.reciklaza){
            return this.racunajTezinuPakovanja() * 1.5 + this.osnovnaCena;
        }else return this.osnovnaCena;
    }

    @Override
    public void stampaj() {
        System.out.println(this.cenaArtikla());
        System.out.println(this.reciklaza);
        System.out.println(this.nazivArtikla);
        System.out.println(this.barkod);
        System.out.println(this.netoTezina);
    }
}
