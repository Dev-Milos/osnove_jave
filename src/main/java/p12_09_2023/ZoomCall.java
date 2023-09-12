package p12_09_2023;

public class ZoomCall {
    private String callLink;
    private String password;
    private User host;
    private User guest;

    public String getPassword() {
        return password;
    }


    public String getCallLink() {
        return callLink;
    }



    public User getGuest() {
        return guest;
    }


    public void setGuest(User guest) {
        this.guest = guest;
    }
    public User getHost() {
        return host;
    }
    public ZoomCall(){

    }
    public ZoomCall(String callLink, String password, User host){
        this.callLink = callLink;
        this.password = password;
        this.host = host;
    }

    public void printInfo(){
        System.out.println("Zoom Call: " + this.callLink);
        System.out.println("Password: " + this.password);
        System.out.println("Host: " + this.host.getFullName());
        if (this.guest!=null){
            System.out.println("Guest " + this.guest.getFullName());
        }
        System.out.println("Maksimalno trajanje poziva je: " + this.getHost().callDuration());
        System.out.println("Tip licence je: ");
        this.host.printLicence();

    }
}
