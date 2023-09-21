package d19_09_2023;

public class SuperKartica {
    public String brojKartice;
    public String imePrezime;
    public double popust;

    public SuperKartica(String brojKartice, String imePrezime, double popust) {
        this.brojKartice = brojKartice;
        this.imePrezime = imePrezime;
        this.popust = popust;
    }

    public SuperKartica() {
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }


    public void stampaj(){
        System.out.println("Broj kartice: " + this.brojKartice + "Vlasnik: " + this.imePrezime);
    }
}
