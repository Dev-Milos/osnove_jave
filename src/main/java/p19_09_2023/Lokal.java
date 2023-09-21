package p19_09_2023;

public class Lokal extends Objekat{
    public Lokal() {
    }

    public Lokal(String adresa, double povrsinaObjekta, double zona) {
        super(adresa, povrsinaObjekta, zona);
    }

    @Override
    public double porezObjekta() {
        if (zona == 1){
            return koeficijent() * this.povrsinaObjekta * 1.3;
        } else if (zona==2) {
            return koeficijent() * this.povrsinaObjekta * 1.3;
        } else if (zona == 3) {
            return koeficijent() * this.povrsinaObjekta * 1.3;
        }else return 0;
    }

    @Override
    public void stampaj() {
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Povrsina Lokala: " + this.povrsinaObjekta);
        System.out.println("Zona: " + this.zona);
    }

}
