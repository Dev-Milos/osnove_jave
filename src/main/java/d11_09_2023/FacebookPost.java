package d11_09_2023;

public class FacebookPost {
    private String description;
    private User user;
    public FacebookPost(){

    }
    public FacebookPost(String description, User user){
        this.description = description;
        this.user = user;
    }
    public void printPost(){
        System.out.println(this.user.getFirstName() + this.user.getLastName());
        System.out.println(this.description);
    }

}
