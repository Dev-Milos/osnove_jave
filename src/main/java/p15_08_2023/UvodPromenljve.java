package p15_08_2023;

public class UvodPromenljve {

    public static void main(String[] args) {

        String firstName; //deklaracija

        firstName = "Milos"; // inicijalizacija

        String lastName = "Josifovic"; // d + i

        int yearOfBirth = 2000;
        int currentYear = 2023;
        float avg = 5.8f;
        double average = 5.8;
        boolean active = true;

        int age = currentYear - yearOfBirth;

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Active: " + active);

    }
}
