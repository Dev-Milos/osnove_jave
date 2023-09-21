package p18_09_2023;

public class Pravougaonik extends Figura{
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Pravougaonik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Pravougaonik() {
    }

    @Override
    public double izracunajPovrsinu() {
        return this.a * this.b;
    }

    @Override
    public double izracunajObim() {
        return 2*this.a + 2*this.b;
    }
}
