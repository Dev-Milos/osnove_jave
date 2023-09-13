package d12_09_2023;

public class Racun {
    private String brojRacuna;
    private String imePrezime;
    private double stanje;
    public void uplatiNaRacun(double dodajVrednost){
        this.stanje = this.stanje + dodajVrednost;
    }
    public void skiniSaRacuna(double skiniVrednost){
        this.stanje = this.stanje - skiniVrednost;
    }
    public void printStanje(){
        System.out.println(this.imePrezime + " - " + this.brojRacuna);
        System.out.println("Stanje na racunu je: " + this.stanje);
    }

    public double getStanje() {
        return stanje;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }
    public Racun (){

    }
    public Racun(String brojRacuna, String imePrezime, double stanje){
        this.brojRacuna = brojRacuna;
        this.imePrezime = imePrezime;
        this.stanje = stanje;
    }

}
