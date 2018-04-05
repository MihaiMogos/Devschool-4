package ro.isr.devschool.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mucefix on 05/04/18.
 */
public class ShapeCache {

    private static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId){
        /*we do not want to return the object existing in the cache,
        because that has a state that we do not want to change.
        Instead, we deliver a "similar" one by cloning
        something from the cache*/
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        System.out.println(circle);
        Square square = new Square();
        square.setId("2");
        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(circle.getId(), circle);
        shapeMap.put(square.getId(), square);
        shapeMap.put(rectangle.getId(), rectangle);
    }

}
