package ro.isr.devschool.designpatterns.structural.decorator;

/**
 * Created by Mucefix on 10/04/18.
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape){
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Using the decorated shape and adding a red border");
    }

}
