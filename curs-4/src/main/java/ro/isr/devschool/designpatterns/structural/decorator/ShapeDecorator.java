package ro.isr.devschool.designpatterns.structural.decorator;

import lombok.AllArgsConstructor;

/**
 * Created by Mucefix on 10/04/18.
 */
@AllArgsConstructor
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    @Override
    public void draw(){ decoratedShape.draw();}

}
