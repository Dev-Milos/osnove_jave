package p15_08_2023;

public class Zadatak3 {

    public static void main(String[] args) {
//        Napisati program koji na ekranu stampa podatke u formatu:
            //[IME I PREZIME]
            //[BROJ TELEFONA], [ULICA I BROJ], [GRAD]
            //[EMAIL]
        String firstLastName = "Milos Josifovic";
        String phoneNum = "+381644931881";
        String address = "Mitrovacka1D";
        String city = "Novi Sad";
        String email = "josifovicmilos77@gmail.com";
        System.out.println("[" + firstLastName + "]");
        System.out.print("[" + phoneNum + "]" + ",");
        System.out.print("[" + address + "]" + ",");
        System.out.println("[" + city + "]");
        System.out.print("[" + email +  "]");


    }
}
