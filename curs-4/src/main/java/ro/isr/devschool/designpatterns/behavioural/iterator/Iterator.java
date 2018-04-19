package ro.isr.devschool.designpatterns.behavioural.iterator;

/**
 * Created by Mucefix on 10/04/18.
 */
public interface Iterator<T> {
    public boolean hasNext();
    public T next();
}
