package p18_09_2023;

public abstract class Figura {
    public abstract double izracunajPovrsinu();

    public abstract double izracunajObim();

    public void stampaj() {
        System.out.println("Povrsina je: " + this.izracunajPovrsinu());
        System.out.println("Obim je: " + this.izracunajObim());
    }
}
