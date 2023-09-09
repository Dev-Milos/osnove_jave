package d08_09_2023;

public class FacebookPost {
    public String username;
    public String whichProfile;
    public String textOfPost;
    public int likeNum;
    public int shareNum;

    public void like() {
        this.likeNum += 1;
    }

    public void dislike() {
        this.likeNum -= 1;
        if (this.likeNum < 0) {
            this.likeNum = 0;
        }
    }

    public void share() {
        shareNum += 1;
    }
    public void printPost(){
        System.out.println(this.username + ">>>" + this.whichProfile);
        System.out.println(this.textOfPost);
        System.out.println("Likes " + "(" + this.likeNum + ") " + "| " + "Shares " + "(" + this.shareNum + ")");
    }
}
