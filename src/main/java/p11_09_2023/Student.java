package p11_09_2023;

public class Student {
    private String ime;
    private String prezime;
    private int brojIndeksa;
    private boolean daLiBudzet;

    public String getIme(){
        return ime;
    }
    public void setIme(String newIme){
        this.ime = newIme;
    }
    public String getPrezime(){
        return prezime;
    }
    public void setPrezime(String newPrezime){
        this.prezime = newPrezime;
    }
    public int getBrojIndeksa(){
        return brojIndeksa;
    }
    public void setBrojIndeksa(int newBrojIndeksa){
        this.brojIndeksa = newBrojIndeksa;
    }
    public boolean getDaLiBudzet(){
        return daLiBudzet;
    }
    public void setDaLiBudzet(boolean newDaLiBudzet){
        this.daLiBudzet = newDaLiBudzet;
    }
    public void stampajPodatke(){
        System.out.println(this.ime + this.prezime + this.brojIndeksa + this.daLiBudzet);
    }
}
