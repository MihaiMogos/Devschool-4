package ro.isr.devschool.designpatterns.structural.decorator;

/**
 * Created by Mucefix on 10/04/18.
 */
public class Circle  implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
