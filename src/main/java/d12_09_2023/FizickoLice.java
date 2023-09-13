package d12_09_2023;

public class FizickoLice {
    private String fullName;
    private String idNumber;
    private String jmbg;
    private boolean aguiredAsset;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJmbg() {
        return jmbg;
    }

    public boolean isAguiredAsset() {
        return aguiredAsset;
    }

    public void setAguiredAsset(boolean aguiredAsset) {
        this.aguiredAsset = aguiredAsset;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public FizickoLice(){


    }
    public FizickoLice(String fullName, String idNumber, String jmbg, boolean aguiredAsset){
        this.fullName = fullName;
        this.idNumber = idNumber;
        this.jmbg = jmbg;
        this.aguiredAsset = aguiredAsset;
    }
    public void printInfo(){
        System.out.println(this.fullName + ", " + this.idNumber);
    }

}
