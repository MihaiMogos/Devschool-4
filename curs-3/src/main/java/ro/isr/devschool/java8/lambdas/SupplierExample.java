package ro.isr.devschool.java8.lambdas;

import java.util.function.Supplier;

/**
 * Created by Mucefix on 29/03/18.
 */
public class SupplierExample {

    public static void main(String[] args) {
        Supplier<String> i = () -> "java8";
        System.out.println(i.get());
    }
}
