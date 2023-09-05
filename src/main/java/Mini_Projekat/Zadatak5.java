package Mini_Projekat;

import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//Generisanje Random Passworda sa Specijalnim Karakterom**
//Napišite program koji simulira automatsko generisanje random passworda.
//Korisnik će uneti željenu dužinu passworda, a program će kreirati i ispisati password
// koji zadovoljava te parametre. Ovaj zadatak zahteva
// implementaciju različitih metoda za generisanje karaktera i passworda.
//generisiRandomKarakter: Ova metoda generiše i vraća random karakter.
// Metoda koristi niz stringova sa elementima koji predstavljaju mala slova,
// velika slova i brojeve (niz je sa fiksnim vrednostima).
// Random bira jedan element iz niza i vraća ga kao povreatnu vrednost (string). Ova metoda nema ulazne parametre.
//generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter.
// Metoda koristi niz stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim vrednostima).
// Random bira jedan element iz niza i vraća ga kao string. Ova metoda nema ulazne parametre.
//Glavni program:
//   - Korisnik unosi dužinu passworda i informaciju da li treba sadržati specijalan karakter.
//   - Koristeći metodu `generisiPassword`, program generiše i ispisuje password.
        System.out.println(generisiPassword());













    }
    public static String generisiRandomKarakter(){
        String svi_Karakteri = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        Random random = new Random();

        int indeks_karaktera = random.nextInt(svi_Karakteri.length());
        return String.valueOf(svi_Karakteri.charAt(indeks_karaktera));

    }
    public static String generisiRandomSpecijalniKarakter(){
        String specijalni_Karakteri = "@#&*!";
        Random random = new Random();
        int indeks_Specijalnog_Karaktera = random.nextInt(specijalni_Karakteri.length());
        return String.valueOf(specijalni_Karakteri.charAt(indeks_Specijalnog_Karaktera));
    }
    public static String generisiPassword(){
        Scanner s = new Scanner(System.in);

        String password = "";

        System.out.println("Unesite duzinu passworda: ");
        int pwd_Lenght = s.nextInt();

        System.out.println("Da li zelite da sadrzi specijalan karakter ( true/false ): ");
        boolean special_Char = s.hasNext();
        Random random = new Random();




        for (int i = 0; i < pwd_Lenght ; i++) {
            password = password + generisiRandomKarakter();

        }
        if (special_Char){
            password = password.replaceFirst(String.valueOf(password.charAt(random.nextInt(password.length())))
                    ,generisiRandomSpecijalniKarakter());
        }

        return password;
    }










}
