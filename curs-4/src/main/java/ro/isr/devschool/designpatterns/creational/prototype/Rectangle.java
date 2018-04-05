package ro.isr.devschool.designpatterns.creational.prototype;

/**
 * Created by Mucefix on 05/04/18.
 */
public class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }

    public Rectangle(){
        type = "Rectangle";
    }


}

