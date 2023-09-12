package p11_09_2023;

public class Film {
    private String naziv;
    private int godina;
    private Reziser reziser;




    public void stampaj(){
        System.out.println(this.naziv);
        System.out.println(this.godina);
        if (this.reziser!=null){
            System.out.println(this.reziser);
        }
    }

    public Film(){

    }
    public Film(String naziv,int godina, Reziser reziser){
        this.naziv = naziv;
        this.godina = godina;
        this.reziser = reziser;
    }
    public Film(String naziv,int godina) {
        this.naziv = naziv;
        this.godina = godina;
    }
    public String getNaziv(){
        return naziv;
    }
    public void setNaziv(String newNaziv){
        this.naziv = newNaziv;
    }
    public int getGodina(){
        return godina;
    }
    public void setGodina(int newGodina){
        this.godina = newGodina;
    }

    public void setReziser(Reziser reziser){
        this.reziser = reziser;
    }
    public void jeRezirao(Reziser reziser){

    }
}
