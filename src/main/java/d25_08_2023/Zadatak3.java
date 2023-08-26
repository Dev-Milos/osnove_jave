package d25_08_2023;

public class Zadatak3 {
    public static void main(String[] args) {
//Napisati metodu koja stampa podatke o korisniku u formatu:
//JMBG: [jmbg]
//Ime: [ime]
//Prezime: [prezime]
//God. rodjenja: [god]
//Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.
        podaci("32132334434359", "Pera", "Peric", 2000, true );
    }
    public static void podaci(String jmbg, String ime, String prezime, int godRodjenja, boolean active){
        System.out.println(jmbg);
        System.out.println(ime);
        System.out.println(prezime);
        System.out.println(godRodjenja);
        System.out.println(active);
    }
}
