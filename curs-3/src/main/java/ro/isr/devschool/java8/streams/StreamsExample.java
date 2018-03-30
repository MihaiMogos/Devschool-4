package ro.isr.devschool.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Mucefix on 29/03/18.
 */
public class StreamsExample {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
          new Person(23,"Cristi"),
          new Person(27, "Catalin"),
          new Person(20, "Claudia"),
          new Person(21, "Laura"),
          new Person(24, "Ciprian"),
          new Person(19, "Mihai"),
          new Person(22, "Cristian"),
          new Person(25, "Dorian"),
          new Person(23, "Roxana"),
          new Person(23, "Radu"),
          new Person(25, "Alex")
        );

        int sumOfAge = 0;
        int numberOfPersons = 0;
        for(Person person:persons){
                if( person.getAge() >20){
                numberOfPersons ++;
                sumOfAge += person.getAge();
            }
        }
        double averageAge = (double)sumOfAge/numberOfPersons;


        //now with streams
        OptionalDouble averageOptional = persons.stream().mapToInt(Person::getAge)
                                                         .filter(age -> age > 20)
                                                         .average();

        System.out.println("Media varstei este: "+averageAge);
        System.out.println("Media varstei folosind streams: "+averageOptional.getAsDouble());

        //Varstele de peste 20 ani
        List<Integer> personAgesAbove20 = persons.stream().map(person -> person.getAge())
                                                          .filter(age -> age > 20)
                                                          .collect(Collectors.toList());

        //persoanele de peste 20 ani
        List<Person> personsAbove20 = persons.stream()
                                                .filter(person -> person.getAge() > 20)
                                                .collect(Collectors.toList());
        personsAbove20.forEach(person -> System.out.println(person));
        //personsAbove20.forEach(System.out::println);
    }
}
