package p11_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setIme("Milos");
        student1.setPrezime("Josifovic");
        student1.setBrojIndeksa(8069);
        student1.setDaLiBudzet(true);

        student1.stampajPodatke();

    }
}
