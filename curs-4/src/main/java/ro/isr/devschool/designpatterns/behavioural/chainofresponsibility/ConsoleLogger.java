package ro.isr.devschool.designpatterns.behavioural.chainofresponsibility;

/**
 * Created by Mucefix on 10/04/18.
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Writing message to console: "+message);
    }
}
