package com.springboot.binarysearch;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

@Component
public class BinarySearch {

    @Autowired
    private SortMethod sortMethod;

    private int[] numbers;

    public BinarySearch(SortMethod sortMethod) {
        this.sortMethod = sortMethod;
    }

    public boolean apply(int[] numbers, int n ) {
        boolean result;

        this.numbers = sortMethod.sort(numbers);
        result = search(0, this.numbers.length - 1, n);

        System.out.println(Arrays.toString(this.numbers));

        return result;
    }

    //Complexity log(numbers.length)
    private boolean search(int begin, int end, int n) {
        boolean result;

        int pivot = (begin + end) / 2;

        if ( n == numbers[pivot] ) return true;
        if ( begin >= end ) return false;

        if  ( n > numbers[pivot] ) {
            result = search(pivot + 1, end, n);
        } else {
            result = search(begin, pivot - 1, n);
        }

        return result;
    }
}
