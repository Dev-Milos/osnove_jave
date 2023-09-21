package p19_09_2023;

public class Kuca extends Objekat{
    private double brojClanova;

    public Kuca(double brojClanova) {
        this.brojClanova = brojClanova;
    }

    public Kuca(String adresa, double povrsinaObjekta, double zona, double brojClanova) {
        super(adresa, povrsinaObjekta, zona);
        this.brojClanova = brojClanova;
    }

    public double getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(double brojClanova) {
        this.brojClanova = brojClanova;
    }

    @Override
    public double porezObjekta() {
        if (zona == 1){
            return this.koeficijent() * this.povrsinaObjekta;
        } else if (zona==2) {
            return this.koeficijent() * this.povrsinaObjekta;
        } else if (zona == 3) {
            return this.koeficijent() * this.povrsinaObjekta;
        }else return 0;
    }

    @Override
    public void stampaj() {
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Broj clanova: " + this.brojClanova);
        System.out.println("Povrsna Kuce: " + this.povrsinaObjekta);
        System.out.println("Zona: " + this.zona);
    }
}
