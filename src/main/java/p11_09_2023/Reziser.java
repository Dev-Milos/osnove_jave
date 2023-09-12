package p11_09_2023;

public class Reziser {
    private String ime;
    private String prezime;
    private int starost;
    private Film reziraoFilm;

    public void stampaj(){
        System.out.println(this.ime);
        System.out.println(this.prezime);
        System.out.println(this.starost);
        if (this.reziraoFilm!=null){
            System.out.println("Rezirao je film: " + this.reziraoFilm.getNaziv());
            System.out.println("Godina izdanja je " + this.reziraoFilm.getGodina());
            this.reziraoFilm.stampaj();
        }
    }
    public Reziser(){

    }
    public Reziser(String ime, String prezime, int starost, Film reziraoFilm){
        this.ime = ime;
        this.prezime = prezime;
        this.starost = starost;
        this.reziraoFilm = reziraoFilm;

    }
    public String getIme(){
        return this.ime;
    }
    public void setIme(String newIme){
        this.ime = newIme;
    }
    public String getPrezime(){
        return this.prezime;
    }
    public void setPrezime(String newPrezime){
        this.prezime = newPrezime;
    }
    public int getStarost(){
        return starost;
    }
    public void setStarost(int newStarost){
        this.starost = newStarost;
    }
    public void setReziraoFilm(Film reziraoFilm){
        this.reziraoFilm = reziraoFilm;
    }
    public Film getReziraoFilm(){
        return this.reziraoFilm;
    }
}
