package p08_09_2023;

public class Auto {
    public String vozac;
    public String marka;
    public int brojVrata;
    public double potrosnjaNa100Km;
    public double trenutnaBrzina;
    public int godinaProizvodnje;
    public int mesecProizvodnje;
    public int kubikaza;

    public boolean klima;
    public double maxBrzina;
    public String regisstracija;
    public void stampaj(){
        System.out.println(this.vozac);
        System.out.println(this.marka + " - " + this.brojVrata + " vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnjaNa100Km + " | na 100km");
        System.out.println(this.trenutnaBrzina + "km/h je trenutna brzina");
        System.out.println("Cena registracije " + this.cenaRegistracije());
        System.out.println("Old timer " + this.oldTimer());
    }
    public boolean prekoracenje(int ogranicenje){
        if (this.trenutnaBrzina>ogranicenje){
            return true;
        }
        else return false;
    }
    public int kazna(int ogranicenje){

        int kazna = 0;
        if (this.prekoracenje(ogranicenje)){
            for (int i = ogranicenje; i < this.trenutnaBrzina; i++) {
                kazna += 1000;
            }
        }
        return kazna;
    }
    public boolean oldTimer(){
        return this.godinaProizvodnje < 1950;
//        if (this.godinaProizvodnje < 1950 ){
//            return true;
//        }
//        else return false;
    }
    public boolean registracijaIstekla(int trenutniMesec){
        return this.mesecProizvodnje != trenutniMesec;
//        if (this.mesecProizvodnje != trenutniMesec){
//            return true;
//        }else return false;

    }
    public double cenaRegistracije(){
        double cena;
        if (this.kubikaza<2000){
            return cena = this.kubikaza * 100;
        } else{
            return cena = this.kubikaza*100+this.kubikaza*1.3;
        }
    }
    public void dodajGas(){
        this.trenutnaBrzina = this.trenutnaBrzina + 10;
    }
    public void koci(){
        if (this.trenutnaBrzina>10){
            this.trenutnaBrzina = this.trenutnaBrzina - 10;
        }

    }
    public double trenutnaPotrosnja(){
        double trenutnaPotrosnja;
        if (this.klima){
           return this.potrosnjaNa100Km = this.trenutnaBrzina/100 * this.potrosnjaNa100Km * 1.2;
        } else{
            return this.potrosnjaNa100Km = this.trenutnaBrzina/100 * this.potrosnjaNa100Km;
        }
    }
    public void stampajTablu(){
        double crtice = this.trenutnaBrzina*100/this.maxBrzina;
        for (int i = 0; i < 100; i++) {
            if (i<crtice){
                System.out.println("|");
            }else {
                System.out.println(".");
            }
        }
        System.out.println(this.trenutnaBrzina + " / " + this.maxBrzina + "km/h");
    }
}
