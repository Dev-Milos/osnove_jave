package d11_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        User user = new User("Milos ", "Josifovic");
        FacebookPost facebookPost = new FacebookPost("What a wonderful day! ", user);

        user.printUser();
        facebookPost.printPost();

    }
}
