package com.stream;

import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperation {
    static void main() {
        List<String> list=List.of("SUMAN","SUMANA","ROY","123");
        // 1. ToList
        System.out.println(list.stream().toList());
        // 2. Collect
        System.out.println(list.stream().collect(Collectors.toSet()));
        // 3. count
        System.out.println(list.stream().count());
    }
}
