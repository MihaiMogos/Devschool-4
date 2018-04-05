package ro.isr.devschool.designpatterns.creational.factory;

/**
 * Created by Mucefix on 05/04/18.
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        Shape shapeCircle = ShapeFactory.getShape("circle");
        shapeCircle.draw();
        Shape shapeSquare = ShapeFactory.getShape("square");
        shapeSquare.draw();
    }
}
