package ro.isr.devschool.designpatterns.behavioural.strategy;

import lombok.AllArgsConstructor;
import lombok.Setter;

/**
 * Created by Mucefix on 10/04/18.
 */
@AllArgsConstructor
public class Context {

    @Setter
    private Strategy strategy;

    public void executeStrategy(int num1, int num2){
        System.out.println("The result is: "+strategy.doOperation(num1,num2));
    }

}
