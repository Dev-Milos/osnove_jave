package p18_09_2023;

public abstract class Student {
    protected String punoIme;
    protected String brIndeksa;
    protected int godStudija;

    public Student() {
    }

    public Student(String punoIme, String brIndeksa, int godStudija) {
        this.punoIme = punoIme;
        this.brIndeksa = brIndeksa;
        this.godStudija = godStudija;
    }


    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(String brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public int getGodStudija() {
        return godStudija;
    }

    public void setGodStudija(int godStudija) {
        this.godStudija = godStudija;
    }
    public abstract int cenaSkolarine();
    public abstract boolean budzet();
    public void stampaj(){
        System.out.println(this.punoIme + this.brIndeksa + this.godStudija);
        if (budzet()){
            System.out.println("Finansiranje: budzet" );
        }else System.out.println("Finansiranje: samofinansirajuci" + "Cena skolarine: " + this.cenaSkolarine());
    }
}
