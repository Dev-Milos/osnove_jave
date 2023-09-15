package p15_09_2023;

public class Profesor extends Osoba{
    private String nazivPredmeta;
    private double plata;

    public Profesor() {
    }

    public Profesor(String nazivPredmeta, double plata) {
        this.nazivPredmeta = nazivPredmeta;
        this.plata = plata;
    }
    public void povecajPlatu(double procenatPovecanja){
        this.plata = this.plata + this.plata * procenatPovecanja/100;
    }
    public void stampajProfu(){
        System.out.println(this.imePrezime);
        System.out.println(this.JMBG);
        System.out.println(this.nazivPredmeta);
        System.out.println(this.plata);
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public double getPlata() {
        return plata;
    }
}
