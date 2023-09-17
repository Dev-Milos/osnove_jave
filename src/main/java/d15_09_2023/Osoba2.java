package d15_09_2023;

public class Osoba2 {

    protected String imePrezime;
    protected String JMBG;
    protected int godRodjenja;

    public Osoba2() {
    }

    public Osoba2(String imePrezime, String JMBG, int godRodjenja) {
        this.imePrezime = imePrezime;
        this.JMBG = JMBG;
        this.godRodjenja = godRodjenja;
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

    public int getGodRodjenja() {
        return godRodjenja;
    }

    public void setGodRodjenja(int godRodjenja) {
        this.godRodjenja = godRodjenja;
    }
    public void stampaj(){
        System.out.println(this.imePrezime + this.JMBG + this.godRodjenja);
    }
}
