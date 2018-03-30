package ro.isr.devschool.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by Mucefix on 29/03/18.
 */
public class StreamsExercise {

    public static void main(String[] args) {
        List<String> collection = Arrays.asList("My","name","is","John","Doe");

        //convert elements to uppercase
        collection.stream().map(String::toUpperCase).collect(Collectors.toList());

    }
}
