package d12_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        FizickoLice buyer = new FizickoLice("Nemanja Nemanjic","0639143225235","1212324340069",true);
        FizickoLice seller = new FizickoLice("Milos Josifovic", "10000006845","14120004383",true);
        Contract contract = new Contract("08_08_2023",buyer ,seller , 2000000, "Bul. Oslobodjenja 55");


        contract.printContract();
        System.out.println("Procenat zarade prodavca: " + contract.profitPercentage());


    }

}
