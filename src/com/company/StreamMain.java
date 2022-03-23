package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {

    static List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
    static Stream<Integer> stream = intList.stream();

}
