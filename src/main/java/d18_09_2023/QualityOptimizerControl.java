package d18_09_2023;

public class QualityOptimizerControl extends Control{
    private double netSpeed;

    public QualityOptimizerControl(double netSpeed) {
        this.netSpeed = netSpeed;
    }

    public QualityOptimizerControl() {
    }

    public double getNetSpeed() {
        return netSpeed;
    }

    public void setNetSpeed(double netSpeed) {
        this.netSpeed = netSpeed;
    }

    @Override
    public void performAction(VideoPlayer videoPlayer) {
        if (this.netSpeed * 10.1 <= 144){
            videoPlayer.setVideoQuality(144);
        } else if (this.netSpeed * 10.1 > 144 && this.netSpeed * 10.1 <= 240) {
            videoPlayer.setVideoQuality(240);
        } else if (this.netSpeed * 10.1 > 240 && this.netSpeed * 10.1 <=360) {
            videoPlayer.setVideoQuality(360);
        }else if (this.netSpeed * 10.1 > 360 && this.netSpeed * 10.1 <=480) {
            videoPlayer.setVideoQuality(480);
        }else if (this.netSpeed * 10.1 > 480 && this.netSpeed * 10.1 <=720) {
            videoPlayer.setVideoQuality(720);
        }else if (this.netSpeed * 10.1 > 720 && this.netSpeed * 10.1 <=1080) {
            videoPlayer.setVideoQuality(1080);
        }
    }
}
