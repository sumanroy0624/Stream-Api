package com.stream;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ParallelStream {
    static void main() {
        List<Long> list = Stream.iterate(1L, x -> x + 1L).limit(10).toList();

        Long date=System.currentTimeMillis();
        list.parallelStream()
                        .forEach(System.out::println);
        System.out.println(System.currentTimeMillis()-date+" ms");
//        System.out.println(sum.get());

    }
}
