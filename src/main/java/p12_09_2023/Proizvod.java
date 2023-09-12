package p12_09_2023;

public class Proizvod {
    private String nazivProizvoda;
    private Kupac kupac;
    private int cena;
    public String getNazivProizvoda(){
        return this.nazivProizvoda;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }
    public Proizvod(){

    }
    public Proizvod(String nazivProizvoda, Kupac kupac, int cena){
        this.cena = cena;
        this.kupac = kupac;
        this.nazivProizvoda = nazivProizvoda;

    }
    public double racunajCenu(){
        return this.cena * 1.9*(100 - getKupac().getClanskaKarta().getPopust()/100);
    }
    public void stampajProizvod(){
        System.out.println(this.nazivProizvoda + " - " + this.cena);
        System.out.println(this.getKupac().getPunoIme() + this.kupac.getClanskaKarta().getBrojKarte());
        System.out.println(this.racunajCenu());
    }
}
