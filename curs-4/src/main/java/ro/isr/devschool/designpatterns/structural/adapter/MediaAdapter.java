package ro.isr.devschool.designpatterns.structural.adapter;

/**
 * Created by Mucefix on 10/04/18.
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if( "vlc".equalsIgnoreCase(audioType) ){
            advancedMediaPlayer = new VlcPlayer();
        }else if ("mp4".equalsIgnoreCase(audioType)){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String filename){
        if( "vlc".equalsIgnoreCase(audioType) ){
            advancedMediaPlayer.playVlc(filename);
        }else if( "mp4".equalsIgnoreCase(audioType)){
            advancedMediaPlayer.playMp4(filename);
        }
    }
}
