package ro.isr.devschool.designpatterns.creational.prototype;

public class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a " + this.type);
    }

    public Square() {
        this.type = "Square";
    }
}
