package p19_09_2023;

public abstract class Objekat {
    protected String adresa;
    protected double povrsinaObjekta;
    protected double zona;

    public Objekat() {
    }

    public Objekat(String adresa, double povrsinaObjekta, double zona) {
        this.adresa = adresa;
        this.povrsinaObjekta = povrsinaObjekta;
        this.zona = zona;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getPovrsinaObjekta() {
        return povrsinaObjekta;
    }

    public void setPovrsinaObjekta(double povrsinaObjekta) {
        this.povrsinaObjekta = povrsinaObjekta;
    }

    public double getZona() {
        return zona;
    }

    public void setZona(double zona) {
        this.zona = zona;
    }
    public double koeficijent(){
        double koeficijent = 0;
        if (this.zona == 1){
            koeficijent = 1.4;
        } else if (this.zona == 2) {
            koeficijent = 1.1;
        } else if (this.zona == 3) {
            koeficijent = 1.05;
        }
        return koeficijent;
    }
    public abstract double porezObjekta();
    public abstract void stampaj();
}
