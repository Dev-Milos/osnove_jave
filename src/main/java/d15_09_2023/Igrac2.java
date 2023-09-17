package d15_09_2023;

import java.util.ArrayList;

public class Igrac2 extends Osoba2{
    private int broj;
    private String pozicija;
    ArrayList<Karton>nizKartona;
    private boolean kapiten;

    public Igrac2(String imePrezime, String JMBG, int godRodjenja) {
        super(imePrezime, JMBG, godRodjenja);
    }

    public Igrac2(String imePrezime, String JMBG, int godRodjenja, int broj, String pozicija, boolean kapiten) {
        super(imePrezime, JMBG, godRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
        this.nizKartona = new ArrayList<>();
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }
    public void dodajKarton(Karton karton){
        nizKartona.add(karton);

    }
    public int brojZutih(){
        int suma = 0;
        for (int i = 0; i < nizKartona.size(); i++) {
            if (nizKartona.get(i).equals("Zuti")){
                suma ++;
            }
        }
        return suma;
    }
    public int brojCrvenih(){
        int suma = 0;
        for (int i = 0; i < nizKartona.size(); i++) {
            if (nizKartona.get(i).equals("Crveni")){
                suma ++;
            }
        }
        return suma;
    }

    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println(this.broj + this.pozicija + this.kapiten);
    }

}
