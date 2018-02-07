package com.springboot.binarysearch;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;

@Component
@Primary
public class QuickSortAlgorithmImpl implements SortMethod {

    private int[] numbers;

    public int[] sort(int[] numbers) {
        this.numbers = numbers;

        quickSort(0, numbers.length - 1);

        return this.numbers;
    }

    private void quickSort(int low, int high) {
        int i = low, j = high, temp;

        int pivot = this.numbers[low + (high - low) / 2];

        while ( i < j ) {
            while (numbers[i] < pivot) {
                i++;
            }

            while (numbers[j] > pivot) {
                j--;
            }

            if (j >= i) {
                temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;

                j--; i++;
            }
        }

        if (low < j) quickSort(low, j);
        if (high > i) quickSort(i, high);
    }

}
