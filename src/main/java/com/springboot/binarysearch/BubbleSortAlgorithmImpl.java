package com.springboot.binarysearch;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithmImpl implements SortMethod {

    public int[] sort(int[] numbers) {
        int temp;

        for (int i = 0; i < numbers.length -1 ; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        return numbers;
    }
}
