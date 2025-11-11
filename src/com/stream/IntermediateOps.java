package com.stream;

import java.util.ArrayList;
import java.util.List;

public class IntermediateOps {
    static void main() {
        List<Integer> marks=List.of(1,2,4,5,6,7,8,9,3,2);
        // 1. filter
        System.out.println("filter-> "+marks.stream().filter((x)->x>5).toList());

        // 2. map
        System.out.println("map-> "+marks.stream().map((x)->x+10).filter((x)->x>16).toList());

        // 3. Sorted
        System.out.println("sorted-> "+marks.stream().sorted().toList());

        // 4. Distinct
        System.out.println("distinct-> " +marks.stream().distinct().sorted().toList());

        // 5. Limit
        System.out.println("limit-> "+marks.stream().limit(4).toList());

        // 6. skip
        System.out.println("skip-> "+marks.stream().skip(6).toList());

        // 7. Peak
        marks.stream().peek(System.out::println);
    }
}
