package d14_09_2023;

public class Ispit {
    private String nazivPredmeta;
    private double ocena;
    private String ImePrezimeProf;

    public Ispit(String nazivPredmeta, double ocena, String imePrezimeProf) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
        this.ImePrezimeProf = imePrezimeProf;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public String getImePrezimeProf() {
        return ImePrezimeProf;
    }

    public void setImePrezimeProf(String imePrezimeProf) {
        ImePrezimeProf = imePrezimeProf;
    }
    public boolean ispitPolozen(){
        if (this.ocena > 4){
            return true;
        }else return false;
    }
    public void stampajIspit(){
        System.out.println(this.nazivPredmeta + " - " + this.ImePrezimeProf + " - " + this.ocena);
    }

}
