package p12_09_2023;

public class ClanskaKarta {
    private double popust;
    private String brojKarte;

    public ClanskaKarta(){

    }
    public ClanskaKarta(double popust,String brojKarte){
        this.popust = popust;
        this.brojKarte = brojKarte;
    }

    public double getPopust() {
        return this.popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }
    public String getBrojKarte(){
        return this.brojKarte;
    }
    public void setBroj_karte(String broj_karte){
        this.brojKarte = brojKarte;
    }
}
