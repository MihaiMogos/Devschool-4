package ro.isr.devschool.designpatterns.creational.factory;

public class ShapeFactory {
    public static Shape getShape(String shapeType) {
        if(shapeType == null) {
            return null;
        }

        switch (shapeType) {
            case "circle": {
                return new Circle();
            }
            case "square": {
                return new Square();
            }
            case "rectangle": {
                return new Rectangle();
            }
            default: return null;
        }
    }
}
