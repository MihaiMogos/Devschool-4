package ro.isr.devschool.designpatterns.creational.prototype;

public class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a " + this.type);
    }

    public Rectangle() {
        this.type = "Rectangle";
    }
}
