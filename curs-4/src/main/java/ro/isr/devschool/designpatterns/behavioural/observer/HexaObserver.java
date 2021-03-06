package ro.isr.devschool.designpatterns.behavioural.observer;

/**
 * Created by Mucefix on 10/04/18.
 */
public class HexaObserver extends Observer{
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: "+ Integer.toHexString(subject.getState()));
    }
}