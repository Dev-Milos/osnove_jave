package p15_09_2023;


public class Zadatak1 {
    public static void main(String[] args) {
        Student student = new Student("0894",10000);
        student.setImePrezime("Milos Josifovic");
        student.setJMBG("1213123213300");

        Student student2 = new Student("0594",15000);
//        student2.imePrezime = "Petar Petrovic";
//        student2.JMBG = "123123141000";
        student2.setImePrezime("Petar Petrovic");
        student2.setJMBG("1231231323000");

        Profesor profesor = new Profesor("Filozofija",35000);
//        profesor.imePrezime = "Marko Markovic";
//        profesor.JMBG = "1234311241000";
        profesor.setImePrezime("Marko Markovic");
        profesor.setJMBG("123213134000");

        Profesor profesor2 = new Profesor("Biologija",40000);
//        profesor2.imePrezime = "Pera Peric";
//        profesor2.JMBG = "12343112314130";
        profesor2.setImePrezime("Pera Peric");
        profesor2.setJMBG("1232103300034");

        student.stampajStudenta();
        student2.stampajStudenta();

        profesor.stampajProfu();
        profesor2.stampajProfu();

        student.uplatiSkolarinu(9500);
        student2.uplatiSkolarinu(13000);

        profesor.povecajPlatu(30);
        profesor2.povecajPlatu(5);

        student.stampajStudenta();
        student2.stampajStudenta();

        profesor.stampajProfu();
        profesor2.stampajProfu();


    }
}
