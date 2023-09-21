package d18_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer(240,30,95,720);

        Control timeControl = new TimeControl(true);
        Control audioControl = new AudioControl(true);
        Control qualityControl = new QualityOptimizerControl(15);

        timeControl.performAction(videoPlayer);
        audioControl.performAction(videoPlayer);
        qualityControl.performAction(videoPlayer);

        audioControl.performAction(videoPlayer);
        audioControl.performAction(videoPlayer);
        audioControl.performAction(videoPlayer);
        audioControl.performAction(videoPlayer);
        audioControl.performAction(videoPlayer);
        audioControl.performAction(videoPlayer);

        videoPlayer.printInfo();




    }
}
