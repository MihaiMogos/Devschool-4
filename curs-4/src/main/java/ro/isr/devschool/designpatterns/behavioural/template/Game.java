package ro.isr.devschool.designpatterns.behavioural.template;

/**
 * Created by Mucefix on 10/04/18.
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }
}
