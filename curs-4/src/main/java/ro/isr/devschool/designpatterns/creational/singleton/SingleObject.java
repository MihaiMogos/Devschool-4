package ro.isr.devschool.designpatterns.creational.singleton;

public class SingleObject {

    // the only instance of the object

    private static SingleObject instance = new SingleObject();

    //constructor must be private, so that no object can be created from outside the class
    private SingleObject(){}

    public static SingleObject getMyInstance(){
        return instance;
    }

    private void showMessage() {
        System.out.println("I am single!");
    }
}
