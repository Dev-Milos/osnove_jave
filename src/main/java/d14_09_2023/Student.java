package d14_09_2023;

import java.util.ArrayList;

public class Student {
    private String brojIndeksa;
    private String imePrezime;
    private String tipStudija;
    private ArrayList<Ispit> nizIspita;

    public Student(String brojIndeksa, String imePrezime, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.imePrezime = imePrezime;
        this.tipStudija = tipStudija;
        this.nizIspita = new ArrayList<>();
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getNizIspita() {
        return nizIspita;
    }
    public void dodajIspit(Ispit nizIspita){
        this.nizIspita.add(nizIspita);
    }
    public double racunajProsek(){
        double polozeniIspiti = 0;
        double suma = 0;
        for (int i = 0; i < nizIspita.size(); i++) {
            suma += this.nizIspita.get(i).getOcena();
            if (this.nizIspita.get(i).ispitPolozen()){
                polozeniIspiti ++;
            }
        }
        return suma / polozeniIspiti;
    }
    public void stampajPodatke(){
        System.out.println(this.brojIndeksa + " - " + this.imePrezime + " - " + this.tipStudija);
        for (int i = 0; i < this.nizIspita.size(); i++) {
            System.out.println(this.nizIspita.get(i).getNazivPredmeta() +
                    " - " + this.nizIspita.get(i).getImePrezimeProf() + " - " + this.nizIspita.get(i).getOcena());
        }
        System.out.println("Prosecna ocena: " + this.racunajProsek());
    }

}
