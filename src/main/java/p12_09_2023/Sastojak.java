package p12_09_2023;

public class Sastojak {
    private String ingredientName;
    private double price;

    public double getPrice() {
        return price;
    }

    public String getIngredientName() {
        return ingredientName;
    }
    public Sastojak(){

    }
    public Sastojak(String ingredientName, double price){
        this.ingredientName = ingredientName;
        this.price = price;
    }

}
