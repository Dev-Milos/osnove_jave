package d19_09_2023;

import java.util.ArrayList;

public class Korpa {

    private ArrayList<Ambalaza> ambalaze;

    public Korpa() {
        this.ambalaze = new ArrayList<>();
    }

    public Korpa(ArrayList<Ambalaza> ambalaze) {
        this.ambalaze = ambalaze;
    }

    public ArrayList<Ambalaza> getAmbalaze() {
        return ambalaze;
    }

    public void setAmbalaze(ArrayList<Ambalaza> ambalaze) {
        this.ambalaze = ambalaze;
    }
    public void dodajAmbalazu(Ambalaza ambalaza){
        this.ambalaze.add(ambalaza);
    }
    public void izbaciAmbalazu(String barkod){
        for (int i = 0; i < this.ambalaze.size() ; i++) {
            if (this.ambalaze.get(i).getBarkod().equals(barkod)){
                this.ambalaze.remove(i);
            }
        }
    }

    private double vratiSaPopustima(double popust){
        double novaCena = 0;
        for (int i = 0; i < this.ambalaze.size() ; i++) {
            novaCena += this.ambalaze.get(i).cenaArtikla() - (this.ambalaze.get(i).cenaArtikla() * popust/100);
        }
        return novaCena;
    }

    public double ukupnaCena(SuperKartica superKartica){
        return vratiSaPopustima(superKartica.getPopust());
    }

}
