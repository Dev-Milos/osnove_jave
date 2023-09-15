package p14_09_2023;

import java.util.ArrayList;

public class FacebookPost {
    private String imePrezimeObjavio;
    private String tekstObjave;
    private ArrayList<Reakcija> reakcije;

    public FacebookPost(String imePrezimeObjavio, String tekstObjave) {
        this.imePrezimeObjavio = imePrezimeObjavio;
        this.tekstObjave = tekstObjave;
        this.reakcije = new ArrayList<>();
    }

    public ArrayList<Reakcija> getReakcije() {
        return reakcije;
    }

    public String getImePrezimeObjavio() {
        return imePrezimeObjavio;
    }

    public void setImePrezimeObjavio(String imePrezimeObjavio) {
        this.imePrezimeObjavio = imePrezimeObjavio;
    }

    public String getTekstObjave() {
        return tekstObjave;
    }

    public void setTekstObjave(String tekstObjave) {
        this.tekstObjave = tekstObjave;
    }
    private double brojReakcija(String tipReakcije){
        double brojReakcija = 0;
        for (int i = 0; i < reakcije.size(); i++) {
            if (this.reakcije.get(i).getTipReakcije().equals(tipReakcije)) {
                brojReakcija++;
            }
        }
        return brojReakcija;
    }
    public void stampajPodatke(){
        System.out.println(this.imePrezimeObjavio);
        System.out.println(this.tekstObjave);
        System.out.println("Smajli " + this.brojReakcija("Smajli") + " | Like "  +
                this.brojReakcija("Like") + " | Srce " + this.brojReakcija("Srce"));
    }
    public void dodajReakciju(Reakcija newReakcija){
        this.reakcije.add(newReakcija);
    }

}
