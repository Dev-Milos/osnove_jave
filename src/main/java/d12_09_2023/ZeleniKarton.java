package d12_09_2023;

public class ZeleniKarton {
    private String punoImeStudenta;
    private String brojIndeksa;
    private String predmet;
    private String punoImeProfesora;
    private double ocena;
    private boolean ispitPolozen;

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getPunoImeProfesora() {
        return punoImeProfesora;
    }

    public void setPunoImeProfesora(String punoImeProfesora) {
        this.punoImeProfesora = punoImeProfesora;
    }

    public String getPunoImeStudenta() {
        return punoImeStudenta;
    }

    public void setPunoImeStudenta(String punoImeStudenta) {
        this.punoImeStudenta = punoImeStudenta;
    }
    public void stampaj(){
        System.out.println(this.predmet + " - " + this.ocena);
        System.out.println("Student: " + this.punoImeStudenta + ", " + this.brojIndeksa);
        System.out.println("Profesor: " + this.punoImeProfesora);

    }
    public ZeleniKarton(){

    }
    public ZeleniKarton(String punoImeStudenta, String punoImeProfesora, String brojIndeksa, String predmet, double ocena){
        this.punoImeStudenta = punoImeStudenta;
        this.punoImeProfesora = punoImeProfesora;
        this.brojIndeksa = brojIndeksa;
        this.predmet = predmet;
        this.ocena = ocena;
    }
    public boolean ispitPolozen(){
        if (this.ocena >= 5){
            return this.ispitPolozen;
        }
        else return !this.ispitPolozen;
    }

}
