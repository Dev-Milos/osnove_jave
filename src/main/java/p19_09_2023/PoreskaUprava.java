package p19_09_2023;

import java.util.ArrayList;

public class PoreskaUprava {
    private String imeGrada;
    private ArrayList<Objekat> objekti;
    public void dodajObjekat(Objekat objekat){
        this.objekti.add(objekat);
    }
    public Objekat najveciPorez(){
        double najveciPorez = this.objekti.get(0).porezObjekta();
        int pozicija = 0;
        for (int i = 0; i < this.objekti.size(); i++) {
            if (this.objekti.get(i).porezObjekta() > najveciPorez) {
                najveciPorez = this.objekti.get(i).porezObjekta();
                pozicija = i;
            }
        }
        return this.objekti.get(pozicija);
    }
    public Objekat najmanjiPorez(){
        double najmanjiPorez = this.objekti.get(0).porezObjekta();
        int pozicija = 0;
        for (int i = 0; i < this.objekti.size(); i++) {
            if (this.objekti.get(i).porezObjekta() < najmanjiPorez) {
                najmanjiPorez = this.objekti.get(i).porezObjekta();
                pozicija = i;
            }
        }
        return this.objekti.get(pozicija);
    }

}
