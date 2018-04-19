package ro.isr.devschool.designpatterns.behavioural.chainofresponsibility;

/**
 * Created by Mucefix on 10/04/18.
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Writing message to file: "+message);
    }
}
