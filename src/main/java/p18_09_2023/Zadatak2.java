package p18_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        StudentOsnovnih studentOsnovnih = new StudentOsnovnih();
        StudentMaster studentMaster = new StudentMaster();

        studentOsnovnih.setPunoIme("Milos Josifovic");
        studentOsnovnih.setBrIndeksa("123123");
        studentOsnovnih.setGodStudija(4);

        studentMaster.setPunoIme("Pera Peric");
        studentMaster.setBrIndeksa("123414");
        studentMaster.setGodStudija(4);

        studentOsnovnih.stampaj();

        studentMaster.stampaj();
    }
}
