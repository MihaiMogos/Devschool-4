package ro.isr.devschool.designpatterns.behavioural.iterator;

/**
 * Created by Mucefix on 10/04/18.
 */
public interface Container<T> {
    public Iterator<T> getIterator();
}
