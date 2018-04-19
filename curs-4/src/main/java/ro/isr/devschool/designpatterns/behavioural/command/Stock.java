package ro.isr.devschool.designpatterns.behavioural.command;

/**
 * Created by Mucefix on 10/04/18.
 */
public class Stock {
    private String name = "STOCK";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock name: "+name+ " quantity "+quantity+ "bought");
    }
    public void sell(){
        System.out.println("Stock name: "+name+ " quantity "+quantity+ "sold");
    }

}
