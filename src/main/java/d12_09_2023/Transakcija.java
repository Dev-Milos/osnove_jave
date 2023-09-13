package d12_09_2023;

public class Transakcija {
    private String idTransakcije;
    private Racun saRacun;
    private Racun naRacun;

    public Racun getNaRacun() {
        return naRacun;
    }

    public String getIdTransakcije() {
        return idTransakcije;
    }

    public void setIdTransakcije(String idTransakcije) {
        this.idTransakcije = idTransakcije;
    }

    public Racun getSaRacun() {
        return saRacun;
    }

    public Transakcija(){

    }
    public Transakcija(String idTransakcije, Racun saRacun, Racun naRacun){
        this.idTransakcije = idTransakcije;
        this.saRacun = saRacun;
        this.naRacun = naRacun;
    }
    public double vracajProviziju(Racun saRacun){
        if ()
    }
}
