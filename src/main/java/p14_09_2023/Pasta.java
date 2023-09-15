package p14_09_2023;

import java.util.ArrayList;

public class Pasta {
    private ArrayList<Sastojak> sastojci;



    public Pasta() {
        this.sastojci = new ArrayList<>();
    }
    public void dodajSastojak(Sastojak newSastojak){
        this.sastojci.add(newSastojak);
    }
    public double cenaPaste(){
        double cenaPaste = 0;
        for (int i = 0; i < sastojci.size(); i++) {
            cenaPaste += sastojci.get(i).getCena();
        }
        return cenaPaste;
    }
    public void stampajPaste(){
        System.out.println("Pasta je sa sastojcima: ");
        for (int i = 0; i < sastojci.size(); i++) {
            System.out.println(this.sastojci.get(i).getNaziv() + " - " + this.sastojci.get(i).getCena());
            System.out.print("Cena paste je " + this.cenaPaste() + ".din");
        }
    }
    public void obrisiSastojak(String sastojak){
        for (int i = 0; i < sastojci.size(); i++) {
            if (this.sastojci.get(i).getNaziv().equals(sastojak)){
                this.sastojci.remove(i);
            }
        }
    }
}
