package ro.isr.devschool.designpatterns.behavioural.iterator;

/**
 * Created by Mucefix on 10/04/18.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        for( Iterator<String> it = nameRepository.getIterator(); it.hasNext(); ){
            System.out.println("Name: "+it.next());
        }
    }
}
