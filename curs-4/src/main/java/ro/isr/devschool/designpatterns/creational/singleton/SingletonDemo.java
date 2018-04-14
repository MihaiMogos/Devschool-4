package ro.isr.devschool.designpatterns.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {

        //enum is singleton by default
        SingleObject singleObject = SingleObject.getMyInstance();

        System.out.println(singleObject);

        SingleObject singleObject2 = SingleObject.getMyInstance();

        System.out.println(singleObject2);
    }
}
