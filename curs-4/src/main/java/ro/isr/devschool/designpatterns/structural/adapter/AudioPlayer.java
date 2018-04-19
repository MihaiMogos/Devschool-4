package ro.isr.devschool.designpatterns.structural.adapter;

/**
 * Created by Mucefix on 10/04/18.
 */
public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String filename){
        if( "mp3".equalsIgnoreCase(audioType)){
            System.out.println("Playing mp3 file. Name: "+filename);
        }else if( "vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);
        }else{
            System.out.println("Invalid media. "+audioType+" not recognized");
        }
    }

}
