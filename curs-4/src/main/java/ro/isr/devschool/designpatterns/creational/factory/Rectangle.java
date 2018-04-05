package ro.isr.devschool.designpatterns.creational.factory;

/**
 * Created by Mucefix on 05/04/18.
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}