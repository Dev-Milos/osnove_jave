package d18_09_2023;

public class TimeControl extends Control{
    private boolean whichSide;

    public TimeControl(boolean whichSide) {
        this.whichSide = whichSide;
    }

    public boolean isWhichSide() {
        return whichSide;
    }

    public void setWhichSide(boolean whichSide) {
        this.whichSide = whichSide;
    }

    @Override
    public void performAction(VideoPlayer videoPlayer) {
        if (videoPlayer.getVideoLenght() > 35 &&
                videoPlayer.getCurrentTime() < videoPlayer.getVideoLenght() - 15 &&
                videoPlayer.getCurrentTime() > 15){
            if (this.whichSide){
                videoPlayer.setCurrentTime(videoPlayer.getCurrentTime()+15);
            }else videoPlayer.setCurrentTime(videoPlayer.getCurrentTime()-15);
        }
    }
}
