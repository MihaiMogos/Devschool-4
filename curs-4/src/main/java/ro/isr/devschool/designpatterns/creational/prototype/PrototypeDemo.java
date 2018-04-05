package ro.isr.devschool.designpatterns.creational.prototype;

/**
 * Created by Mucefix on 05/04/18.
 */
public class PrototypeDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedCircle = ShapeCache.getShape("1");
        System.out.println("Shape: "+ clonedCircle.getType());
        System.out.println(clonedCircle);
    }

}
