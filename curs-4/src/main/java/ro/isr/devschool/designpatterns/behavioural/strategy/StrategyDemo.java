package ro.isr.devschool.designpatterns.behavioural.strategy;

/**
 * Created by Mucefix on 10/04/18.
 */
public class StrategyDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());

        context.executeStrategy(1,2);
        context.setStrategy(new OperationMultiply());
        context.executeStrategy(1,2);
        context.setStrategy(new OperationSubstract());
        context.executeStrategy(1,2);

    }
}
