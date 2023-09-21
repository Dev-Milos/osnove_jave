package d19_09_2023;

public class StaklenaAmbalaza extends Ambalaza{
    private double kaucijaZaFlasu;
    private boolean daLiKaucija;
    private double osnovnaCena;

    public StaklenaAmbalaza(double kaucijaZaFlasu, boolean daLiKaucija, double osnovnaCena) {
        this.kaucijaZaFlasu = kaucijaZaFlasu;
        this.daLiKaucija = daLiKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, double kaucijaZaFlasu, boolean daLiKaucija, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucijaZaFlasu = kaucijaZaFlasu;
        this.daLiKaucija = daLiKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public double getKaucijaZaFlasu() {
        return kaucijaZaFlasu;
    }

    public void setKaucijaZaFlasu(double kaucijaZaFlasu) {
        this.kaucijaZaFlasu = kaucijaZaFlasu;
    }

    public boolean isDaLiKaucija() {
        return daLiKaucija;
    }

    public void setDaLiKaucija(boolean daLiKaucija) {
        this.daLiKaucija = daLiKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if (daLiKaucija){
            return this.osnovnaCena * 1.2 + this.kaucijaZaFlasu;
        }else return this.osnovnaCena * 1.2;
    }

    @Override
    public void stampaj() {
        System.out.println(this.cenaArtikla());
        System.out.println(this.daLiKaucija);
        System.out.println(this.nazivArtikla);
        System.out.println(this.barkod);
        System.out.println(this.netoTezina);
    }
}
