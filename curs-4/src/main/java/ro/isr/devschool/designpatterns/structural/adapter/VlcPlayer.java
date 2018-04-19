package ro.isr.devschool.designpatterns.structural.adapter;

/**
 * Created by Mucefix on 10/04/18.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {
        System.out.println("Playing mp4 file. Name: "+ filename);
    }

    @Override
    public void playMp4(String filename) {
        throw new UnsupportedOperationException();
    }
}
