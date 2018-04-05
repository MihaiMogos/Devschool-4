package ro.isr.devschool.designpatterns.creational.factory;

/**
 * Created by Mucefix on 05/04/18.
 */
public class ShapeFactory {

    public static Shape getShape(String shapeType){
        if( shapeType == null ) return null;
        switch (shapeType){
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default: return null;
        }
    }

}
