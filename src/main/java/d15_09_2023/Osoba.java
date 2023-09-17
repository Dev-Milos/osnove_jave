package d15_09_2023;

public class Osoba {
    protected String imePrezime;
    protected String JMBG;
    protected int godinaRodjenja;

    public Osoba() {
    }

    public Osoba(String imePrezime, String JMBG, int godinaRodjenja) {
        this.imePrezime = imePrezime;
        this.JMBG = JMBG;
        this.godinaRodjenja = godinaRodjenja;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getJMBG() {
        return JMBG;
    }

    public void setJMBG(String JMBG) {
        this.JMBG = JMBG;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }
    public void stampaj(){
        System.out.println(this.imePrezime + ", " + this.JMBG + ", " + this.godinaRodjenja);
    }
}
