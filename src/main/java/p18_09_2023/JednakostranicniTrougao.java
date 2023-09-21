package p18_09_2023;

public class JednakostranicniTrougao extends Figura {
    private double a;

    public JednakostranicniTrougao() {
    }

    public JednakostranicniTrougao(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double izracunajPovrsinu() {
        return (this.a * this.a) * 1.73205 / 4;
    }

    @Override
    public double izracunajObim() {
        return this.a * 3;
    }
}
