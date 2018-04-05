package ro.isr.devschool.designpatterns.creational.prototype;

/**
 * Created by Mucefix on 05/04/18.
 */
public class Square extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }

    public Square(){
        type = "Square";
    }


}
