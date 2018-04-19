package ro.isr.devschool.designpatterns.behavioural.strategy;

/**
 * Created by Mucefix on 10/04/18.
 */
public class OperationMultiply implements Strategy {

    @Override
    public int doOperation(int num1, int num2){ return num1 * num2;}
}