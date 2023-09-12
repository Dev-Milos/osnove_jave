package p12_09_2023;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Sastojak>ingredients = new ArrayList<>();
        System.out.println("Enter number of ingredients: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter an ingredient name");
            String ingredientName = s.next();
            System.out.println("Enter price of the ingredient");
            int price = s.nextInt();
            ingredients.add(i, new Sastojak(ingredientName,price));


        }
        for (int i = 0; i < ingredients.size(); i++) {
            System.out.println(ingredients.get(i).getIngredientName() + ingredients.get(i).getPrice());
        }






    }


}
