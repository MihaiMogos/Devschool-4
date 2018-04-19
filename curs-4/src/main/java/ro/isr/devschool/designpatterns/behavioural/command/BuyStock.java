package ro.isr.devschool.designpatterns.behavioural.command;

import lombok.AllArgsConstructor;

/**
 * Created by Mucefix on 10/04/18.
 */
@AllArgsConstructor
public class BuyStock implements Order{
    private Stock stock;

    public void execute(){
        stock.buy();
    }

}
