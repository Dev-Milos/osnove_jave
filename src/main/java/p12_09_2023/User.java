package p12_09_2023;

public class User {
    private String fullName;
    private String licence;

    public User(){

    }
    public User(String fullName){
        this.fullName = fullName;
        this.licence = "Basic";

    }
    public String getFullName(){
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String licenceType(int prepaid) {

        if (prepaid == 100){
            return this.licence = "Pro";
        } else if (prepaid==150) {
            return this.licence = "Premium";
        }
        else return this.licence = "Basic";
    }
    public void resetLicence(){
        this.licence = "Basic AF";
    }
    public int callDuration(){
        if (this.licence.equalsIgnoreCase("Basic")|| this.licence.equalsIgnoreCase("Basic AF")){
            return 40;
        } else if (this.licence.equalsIgnoreCase("Pro")) {
            return 240;
        }else return 1440;
    }
    public void print(){
        System.out.println(this.fullName);
    }
    public void printLicence(){
        System.out.println(this.licence);
    }
}
