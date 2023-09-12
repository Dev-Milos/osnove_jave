package p12_09_2023;

public class Kupac {
    private String punoIme;
    private ClanskaKarta clanskaKarta;
    public String getPunoIme(){
        return this.punoIme;
    }
    public void setPunoIme(String punoIme){
        this.punoIme = punoIme;
    }
    public ClanskaKarta getClanskaKarta(){
        return this.clanskaKarta;
    }

    public void setClanskaKarta(ClanskaKarta clanskaKarta) {
        this.clanskaKarta = clanskaKarta;
    }

    public Kupac(){

    }
    public Kupac(String punoIme, ClanskaKarta clanskaKarta){
        this.punoIme = punoIme;
        this.clanskaKarta = clanskaKarta;

    }
    public void stampaj(){
        System.out.println(this.getPunoIme() + " - " + this.clanskaKarta);
    }

}
