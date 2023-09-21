package p19_09_2023;

public class Zgrada extends Objekat{
    private double brojStanova;

    public Zgrada(double brojStanova) {
        this.brojStanova = brojStanova;
    }

    public Zgrada(String adresa, double povrsinaObjekta, double zona, double brojStanova) {
        super(adresa, povrsinaObjekta, zona);
        this.brojStanova = brojStanova;
    }

    public Zgrada() {
    }

    public double getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(double brojStanova) {
        this.brojStanova = brojStanova;
    }

    public Zgrada(String adresa, double povrsinaObjekta, double zona) {
        super(adresa, povrsinaObjekta, zona);
    }

    @Override
    public double porezObjekta() {
        if (zona == 1){
            return koeficijent() * this.povrsinaObjekta * this.brojStanova;
        } else if (zona==2) {
            return koeficijent() * this.povrsinaObjekta * this.brojStanova;
        } else if (zona == 3) {
            return koeficijent() * this.povrsinaObjekta * this.brojStanova;
        }else return 0;
    }

    @Override
    public void stampaj() {
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Broj stanova: " + this.brojStanova);
        System.out.println("Povrsna Zgrade: " + this.povrsinaObjekta);
        System.out.println("Zona: " + this.zona);

    }
}
