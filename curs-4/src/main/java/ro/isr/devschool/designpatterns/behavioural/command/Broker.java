package ro.isr.devschool.designpatterns.behavioural.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mucefix on 10/04/18.
 */
public class Broker {
    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order){ orders.add(order);}

    public void placeOrders(){
        for(Order order: orders){
            order.execute();
        }
        orders.clear();
    }
}
