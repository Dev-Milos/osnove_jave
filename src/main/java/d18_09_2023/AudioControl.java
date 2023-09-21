package d18_09_2023;

public class AudioControl extends Control{
    private boolean VolumeUpOrDown;

    public AudioControl(boolean volumeUpOrDown) {
        VolumeUpOrDown = volumeUpOrDown;
    }

    public boolean isVolumeUpOrDown() {
        return VolumeUpOrDown;
    }

    public void setVolumeUpOrDown(boolean volumeUpOrDown) {
        VolumeUpOrDown = volumeUpOrDown;
    }

    @Override
    public void performAction(VideoPlayer videoPlayer) {
        if (this.VolumeUpOrDown){
            videoPlayer.setSoundVolume(videoPlayer.getSoundVolume()+1);
            if (videoPlayer.getSoundVolume() > 100){
                videoPlayer.setSoundVolume(100);
            }
        } else if (!this.VolumeUpOrDown) {
            videoPlayer.setSoundVolume(videoPlayer.getSoundVolume()-1);
            if (videoPlayer.getSoundVolume() < 1){
                videoPlayer.setSoundVolume(1);
            }
        }
    }
}
