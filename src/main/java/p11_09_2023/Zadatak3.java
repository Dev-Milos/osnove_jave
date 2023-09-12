package p11_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {


        Film film = new Film("Sokak", 2019);
        Reziser reziser = new Reziser("Milos","Josifovic",22,film);

        film.stampaj();
        reziser.stampaj();




    }
}
