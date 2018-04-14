package ro.isr.devschool.designpatterns.creational.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("circle");
        circle.draw();

        Shape square = ShapeFactory.getShape("square");
        square.draw();
    }
}
