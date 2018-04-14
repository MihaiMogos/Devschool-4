package ro.isr.devschool.designpatterns.creational.prototype;

import lombok.ToString;

public class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a " + this.type);
    }

    public Circle() {
        this.type = "Circle";
    }
}
