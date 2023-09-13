package d12_09_2023;

public class Contract {
    private String date;
    private FizickoLice seller;
    private FizickoLice buyer;
    private double price;
    private String address;
    public Contract(){

    }
    public Contract(String date, FizickoLice buyer, FizickoLice seller, double price, String address){
        this.date = date;
        this.buyer = buyer;
        this.seller = seller;
        this.price = price;
        this.address = address;
    }
    public double profitPercentage(){
        if (this.seller.isAguiredAsset()){
            return this.price = this.price * 0.03;
        }else return this.price = this.price * 0.02;
    }
    public double agencyProfit(){
        return 1000 + this.price * profitPercentage();
    }
    public void printContract(){
        System.out.println("Dana " + this.date + "god sklopljen je ugovor izmedju " + this.seller.getFullName() + " i " +
                this.buyer.getFullName() + " o kupovini nekretnine " + this.address + " po ceni od " +
                this.price + " pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost od " +
                agencyProfit());
    }

}
