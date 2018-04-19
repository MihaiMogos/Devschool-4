package ro.isr.devschool.designpatterns.behavioural.observer;


/**
 * Created by Mucefix on 10/04/18.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
