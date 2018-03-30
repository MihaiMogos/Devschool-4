package ro.isr.devschool.java8.lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mucefix on 29/03/18.
 */
public class ConsumerExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ana"); names.add("Are");
        names.add("Mere"); names.add("Multe");
        //names.forEach(name -> System.out.println(name));
        names.forEach(System.out::println);
    }
}
