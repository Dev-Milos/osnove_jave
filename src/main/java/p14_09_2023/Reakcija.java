package p14_09_2023;

public class Reakcija {
    private String tipReakcije;
    private String imePrezimeKorisnika;

    public Reakcija(String tipReakcije, String imePrezimeKorisnika) {
        this.tipReakcije = tipReakcije;
        this.imePrezimeKorisnika = imePrezimeKorisnika;

    }

    public Reakcija() {
    }

    public String getTipReakcije() {
        return tipReakcije;
    }

    public void setTipReakcije(String tipReakcije) {
        this.tipReakcije = tipReakcije;
    }

    public String getImePrezimeKorisnika() {
        return imePrezimeKorisnika;
    }

    public void setImePrezimeKorisnika(String imePrezimeKorisnika) {
        this.imePrezimeKorisnika = imePrezimeKorisnika;
    }

}
