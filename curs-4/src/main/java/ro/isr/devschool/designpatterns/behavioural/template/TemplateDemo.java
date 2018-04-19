package ro.isr.devschool.designpatterns.behavioural.template;

/**
 * Created by Mucefix on 10/04/18.
 */
public class TemplateDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println("Another Game");
        Game football = new Football();
        football.play();
    }
}
