package d11_09_2023;

public class Author {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public Author(){

    }
    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void print(){
        System.out.println(this.firstName + " " + this.lastName);
    }

}
