package com.stream;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
    static void main() {
        Predicate<Integer> isEven=(x)->x%2==0;
        System.out.println(isEven.test(3));

        Function<Integer,Integer> doubleIt=(x)->2*x;
        Function<Integer,Integer>tripleIt=(x)->3*x;

        System.out.println(doubleIt.andThen(tripleIt).apply(3));

        Consumer<Integer>consumer=(x)-> System.out.println("Hello world");
        consumer.accept(90);

        Supplier<Integer>supplier=()->78;
        System.out.println(supplier.get());


    }
}
