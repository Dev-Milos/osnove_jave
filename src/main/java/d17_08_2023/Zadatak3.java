package d17_08_2023;

import java.util.Scanner;

public class Zadatak3 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the expected URL: ");
        String expectedUrl = s.next();

        System.out.println("Enter the actual URL: ");
        String actualUrl = s.next();

        System.out.println("Enter Error Code: ");
        String ErrorCode = s.next();

        if(!expectedUrl.equals(actualUrl)){

            System.out.println("Assertion Error: Expected " + expectedUrl + "but got " + actualUrl);
            System.out.print("Error Code: " + ErrorCode);


        }
        else {

            System.out.println("1 Test passed");

        }




    }


}
