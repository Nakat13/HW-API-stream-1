package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> filteredList = new ArrayList<>();

        // realisation without Stream API
        for (Integer i : intList) {
            if (i > 0 && i % 2 == 0)
                filteredList.add(i);
        }
        Collections.sort(filteredList);
        System.out.println(filteredList);

        // realisation with Stream API
        StreamMain.stream.filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}
