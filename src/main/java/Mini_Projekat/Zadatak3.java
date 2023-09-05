package Mini_Projekat;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
//Zamena Placeholdera u SQL Upitu**
//
//Napišite program koji obavlja zamenu placeholdera u SQL upitu.Za rešenje ovog zadatka,
// biće potrebno upoznati se sa upotrebom `replace` metode koju pruža `String` klasa u Javi.
//
//Program će sačuvati sledeće informacije:
//
//1. SQL upit (string) nad kojim će se obaviti zamena.
//2. Niz vrednosti (niz stringova) koje treba da se ubace umesto placeholdera u SQL upitu.
//
//Placeholder je označeno mesto u stringu na kom treba da se postavi prava vrednost iz niza vrednosti.
// Placeholderi su označeni kombinacijom `%` i pozicijom za zamenu. Na primer, ukoliko SQL upit izgleda ovako:
//
//INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)
// VALUES ('%0', '%1', '%2', '%3', '%4', '%5');
//
//i niz vrednosti je:
//Cardinal, Tom B. Erichsen, Skagen 21, Stavanger, 4006, Norway
//
//Nakon izvršenja zamene, dobiće se SQL upit:
//
//INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)
// VALUES ('Cardinal','Tom B. Erichsen','Skagen 21','Stavanger','4006','Norway');
//
//Ovaj program koristi `replace` metodu da zameni placeholder pozicije u SQL upitu sa stvarnim vrednostima iz niza.
        ArrayList<String> placeholderi = new ArrayList<>();
        placeholderi.add("Cardinal");
        placeholderi.add("Tom B. Erichsen");
        placeholderi.add("Skagen 21");
        placeholderi.add("Stavanger");
        placeholderi.add("4006");
        placeholderi.add("Norway");

        String sql_Upit = "INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)" +
                " VALUES VALUES ('%0', '%1', '%2', '%3', '%4', '%5');";

        sql_Upit = sql_Upit.replace("%", "");
        sql_Upit = sql_Upit.replace("0", placeholderi.get(0));
        sql_Upit = sql_Upit.replace("1", placeholderi.get(1));
        sql_Upit = sql_Upit.replace("2", placeholderi.get(2));
        sql_Upit = sql_Upit.replace("3", placeholderi.get(3));
        sql_Upit = sql_Upit.replace("4", placeholderi.get(4));
        sql_Upit = sql_Upit.replace("5", placeholderi.get(5));


        System.out.println(sql_Upit);


    }

}
