package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreationOfStream {
    static void main() {
        // From list
        List<Integer> list=List.of(1,2,3,4,5);
        Stream<Integer>listStream=list.stream();

        // From Array
        Integer[] arr={1,3,5,6,7};
        Stream<Integer> stream = Arrays.stream(arr);

        //Stream of
        Stream<String> StreamOf = Stream.of("SUMAN", "SUMANA", "ROY");
        String[] names={"SUMAN","SUMANA","ROY"};
        Stream<String> names1 = Stream.of(names);

        // Primitive Type
        int prem[]={1,2,4,5,6};
        IntStream stream1 = Arrays.stream(prem);
        stream1.forEach(System.out::print);
        System.out.println();
        //Infinite Stream
        Stream.iterate(1,(x)->x<=10,(x)->x+1).forEach(System.out::print);
        System.out.println();
        Stream.generate(()->Math.ceil(Math.random()*10)).limit(10).forEach(System.out::print);
        System.out.println();


}


}
