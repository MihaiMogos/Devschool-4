package ro.isr.devschool.designpatterns.structural.adapter;

/**
 * Created by Mucefix on 10/04/18.
 */
public class AdapterDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "Beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far awy.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }

}
