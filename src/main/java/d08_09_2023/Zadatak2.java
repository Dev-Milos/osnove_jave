package d08_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        FacebookPost fb1 = new FacebookPost();
        FacebookPost fb2 = new FacebookPost();

        fb1.username = "Milos Josifovic";
        fb1.whichProfile = "Pera Peric";
        fb1.textOfPost = "Srecan rodjendan";
        fb1.likeNum = 170;
        fb1.shareNum = 40;
        fb1.printPost();
        fb1.like();
        fb1.share();
        fb1.dislike();
        fb1.dislike();
        fb1.printPost();

        fb2.username = "Uros Urosevic";
        fb2.whichProfile = "Marko Markovic";
        fb2.textOfPost = "Srecna slava";
        fb2.likeNum = 132;
        fb2.shareNum = 34;
        fb2.printPost();
        fb2.like();
        fb2.share();
        fb2.dislike();
        fb2.dislike();
        fb2.printPost();

    }
}
