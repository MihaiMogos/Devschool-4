package ro.isr.devschool.designpatterns.behavioural.command;

/**
 * Created by Mucefix on 10/04/18.
 */
public class CommandDemo {

    public static void main(String[] args) {
        Stock stock = new Stock();

        Order buyStockOrder = new BuyStock(stock);
        Order sellStockOrder = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
        broker.placeOrders();
    }
}
