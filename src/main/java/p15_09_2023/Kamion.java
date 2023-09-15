package p15_09_2023;

public class Kamion extends Vozilo{

    private int nosivost;



    public Kamion() {
    }



    public int getNosivost() {
        return nosivost;
    }

    public void setNosivost(int nosivost) {
        this.nosivost = nosivost;
    }
    public void stampaj(){
        System.out.println(this.registracija);
        System.out.println(this.marka);
        System.out.println(this.brzina);
        System.out.println(this.nosivost);
    }
}
