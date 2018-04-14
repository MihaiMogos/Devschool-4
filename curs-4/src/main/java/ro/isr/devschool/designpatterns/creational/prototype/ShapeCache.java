package ro.isr.devschool.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    private static Map<String, Shape> shapeMap = new HashMap<String, Shape>();

    public static Shape getShape(String shapeId) {
        // we do not want to return the object existing in the cache
        //because that has a state that we do not want to change
        //instead, we deliver a "similar" one by cloning something from the cache

        Shape cashShape = shapeMap.get(shapeId);
        return (Shape) cashShape.clone();
    }

    public static void loadCash() {
        Circle circle = new Circle();
        circle.id = "1";
        System.out.println(circle);
        Rectangle rectangle = new Rectangle();
        rectangle.id = "2";
        Square square = new Square();
        square.id = "3";

        shapeMap.put(circle.id, circle);
        shapeMap.put(rectangle.id, rectangle);
        shapeMap.put(square.id, square);
    }
}
