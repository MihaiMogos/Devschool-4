package ro.isr.devschool.designpatterns.creational.singleton;

/**
 * Created by Mucefix on 05/04/18.
 */
public class SingletonDemo {

    public static void main(String[] args) {
        SingleObject objectOne = SingleObject.getInstance();
        System.out.println(objectOne);

        SingleObject objectTwo = SingleObject.getInstance();
        System.out.println(objectTwo);
    }
}
