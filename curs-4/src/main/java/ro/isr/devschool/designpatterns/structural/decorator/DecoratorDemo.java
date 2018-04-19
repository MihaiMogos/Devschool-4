package ro.isr.devschool.designpatterns.structural.decorator;

/**
 * Created by Mucefix on 10/04/18.
 */
public class DecoratorDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Drawing normal circle");
        circle.draw();

        circle = new RedShapeDecorator(new Circle());
        System.out.println("Drawing red circle");
        circle.draw();
    }
}
