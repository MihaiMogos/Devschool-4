package ro.isr.devschool.designpatterns.creational.prototype;

import lombok.ToString;

/**
 * Created by Mucefix on 05/04/18.
 */
public class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    public Circle(){
        type = "Circle";
    }

}
