package d18_09_2023;

public class VideoPlayer {
    private double videoLenght;
    private double currentTime;
    private double soundVolume;
    private double videoQuality;

    public VideoPlayer(double videoLenght, double currentTime, double soundVolume, double videoQuality) {
        this.videoLenght = videoLenght;
        this.currentTime = currentTime;
        this.soundVolume = soundVolume;
        this.videoQuality = videoQuality;
    }

    public VideoPlayer() {
    }

    public double getVideoLenght() {
        return videoLenght;
    }

    public void setVideoLenght(double videoLenght) {
        this.videoLenght = videoLenght;
    }

    public double getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(double currentTime) {
        this.currentTime = currentTime;
    }

    public double getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(double soundVolume) {
        this.soundVolume = soundVolume;
    }

    public double getVideoQuality() {
        return videoQuality;
    }

    public void setVideoQuality(double videoQuality) {
        this.videoQuality = videoQuality;
    }
    public void printInfo(){
        System.out.println("Trenutno vreme videa: " + this.currentTime);
        System.out.println("Jacina zvuka: " + this.soundVolume);
        System.out.println("Kvalitet videa: " + this.videoQuality + "p");
    }
}
