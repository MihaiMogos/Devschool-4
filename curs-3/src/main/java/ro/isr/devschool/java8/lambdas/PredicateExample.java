package ro.isr.devschool.java8.lambdas;

import java.util.function.Predicate;

/**
 * Created by Mucefix on 29/03/18.
 */
public class PredicateExample {
    public static void main(String[] args) {
        //Predicate chain
        Predicate<String> p1 = s -> s.length() < 20;
        Predicate<String> p2 = s -> s.length() > 10;
        Predicate<String> p3 = p1.and(p2);
    }
}
