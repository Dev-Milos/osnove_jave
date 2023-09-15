package p15_09_2023;

public class Student extends Osoba{
    private String brojIndeksa;
    private double dugZaSkolarinu;

    public Student(String brojIndeksa, double dugZaSkolarinu) {
        this.brojIndeksa = brojIndeksa;
        this.dugZaSkolarinu = dugZaSkolarinu;
    }

    public Student() {
    }
    public void uplatiSkolarinu(double iznosUplate){
        this.dugZaSkolarinu -= iznosUplate;
    }
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Broj indeksa: " + this.brojIndeksa);
        System.out.println("Dug za skolarinu: " + this.dugZaSkolarinu);

    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public double getDugZaSkolarinu() {
        return dugZaSkolarinu;
    }
}
