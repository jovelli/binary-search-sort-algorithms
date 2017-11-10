package com.springboot.binarysearch;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class BinarySearch {

    @Autowired
    private SortMethod sortMethod;

    public BinarySearch(SortMethod sortMethod) {
        this.sortMethod = sortMethod;
    }

    public boolean apply(int[] numbers, int n ) {
        boolean result;
        IntPredicate p = (int x) -> x == n;

        int[] numbersSorted = sortMethod.sort(numbers);

        System.out.println("numbersSorted " + Arrays.toString(numbersSorted));

        System.out.printf("\nSort Method Used: %s", sortMethod.toString());

        result = IntStream.of(numbersSorted).anyMatch(p);

        return result;
    }
}
