package ro.isr.devschool.designpatterns.creational.prototype;

public class PrototypeDemo {

    public static void main(String[] args) {
        ShapeCache.loadCash();

        Shape cloneShape = ShapeCache.getShape("1");
        System.out.println(cloneShape);
    }
}
