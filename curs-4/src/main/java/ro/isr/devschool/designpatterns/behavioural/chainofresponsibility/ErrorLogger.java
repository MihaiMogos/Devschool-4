package ro.isr.devschool.designpatterns.behavioural.chainofresponsibility;

/**
 * Created by Mucefix on 10/04/18.
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Writing message to Error Logger: "+message);
    }
}
