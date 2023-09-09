package d08_09_2023;

public class Proizvod {
    public String naziv;
    public double cena;
    public double weightInGrams;

    public void stampajPodatke(){
        System.out.println(this.naziv + " , " + this.cena + " , " + this.weightInGrams);
    }
    public void povecajCenu(double povecanje){
        this.cena = this.cena + povecanje;
    }
    public double vratiCenuSaPopustom(double popust){
        double cenaSaPopustom;
        return cenaSaPopustom = this.cena * (1-popust/100);
    }
    public double racunajPostarinu(){
        double cenaPostarine;
        if (this.weightInGrams<100){
            return cenaPostarine = 200;
        } else if (this.weightInGrams > 100 && this.weightInGrams <500) {
            return cenaPostarine = 400;
        }else return cenaPostarine = 1000;

    }


}
