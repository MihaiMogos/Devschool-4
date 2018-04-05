- Java 8 - default methods
- Programare functionala
    - lambda
    - streams
========

Lambdas
    - easier way to write anonymuous classes
    - functional interface - interface with only one abstract method
                           - optional @FunctionalInterface
    - type of a lambda - functional interface
    - creating an object IS NOT FREE: get memory, clean the memory, execute static initi
    alizer, execute static blocks, non static.......
        - by using lambdas you get rid of all these operations
    - java.util.function - rich set of functional interfaces - 43
    - 4 categories of functional interface:
        - Supplier
            - does not take any parameter and provides a new object
        - Consumer
            - expects an object as parameter and does not return anything
            - Lambda: Consumer<T> c = p -> System.out.println(p);
            - Method reference: Consumer<T> c = System.out::println
            - BiConsumer - takes two objects
        - Predicate
            - takes a parameter and returns a boolean
            - BiPredicate as well
            - has the methods: test + default: and, or, negate
        - Function
            - takes a parameter and returns an Object
            - BiFunction

========

Streams
    - typed interfaces; Streams are NOT COLLECTIONS; provides a way to process large
    amounts of data
    - parallel processing
    - pipelined, to avoid unnecessary intermediary computations
    - DOES NOT CONTAIN ANY DATA
    - an operation on a Stream that returns a Stream is called an intermediary operation
        - peek(Consumer), filter(Predicate), map()
    - final operations - MAY BE CALLED ONLY ONCE
        - forEach, max, min, collect
    - map -> uses a Function; takes a stream<Person> and returns a stream<Integer>
          -> Size of both streams is the same; what changes is the type of objects in the stream
    - filter -> uses a Predicate; takes a stream<Integer> and returns a stream<Integer>; does not change the type, but changes the SIZE
    - reduce -> reduction step, equivalent to SQL aggregation
             -> two types of reduction:
                   - basic: SQL operation - min, max, sum, average...
                   - Collectors: to a map, to a list, to a string....


                   test .