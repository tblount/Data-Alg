package com.algo;

import java.util.Random;

public class QuickSort {
    public void quicksort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    private void quicksort(int[] array, int first, int last) {
        if (first < last) {
            int pivot = partition(array, first, last);

            // Recursive call
            quicksort(array, first, pivot - 1);
            quicksort(array, pivot + 1, last);
        }
    }

    private int partition(int[] input, int first, int last) {

        /*
         *notice how pivot is randomly selected this makes O(n^2)
         *very low probability
         */
        int pivot = first + new Random().nextInt(last - first + 1);

        swap(input, pivot, last);
        for (int i = first; i < last; i++) {
            if (input[i] <= input[last]) {
                swap(input, i, first);
                first++;
            }
        }

        swap(input, first, last);
        return first;
    }

    private void swap(int[] input, int a, int b) {
        int temp = input[a];
        input[a] = input[b];
        input[b] = temp;
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {

        int[] example = { 90, 6456, 20, 34, 65, -1, 54, -15,
                1, -999, 55, 529, 0 };
        System.out.println("Original Array");
        printArray(example);
        System.out.println("\n\nQuickSort");
        QuickSort sort = new QuickSort();
        sort.quicksort(example);
        printArray(example);

    }
}