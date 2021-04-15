package com.algo;

import org.junit.Test;

import java.util.Random;

public class MergeSortTest {

    private int[] getRandomArray(int size, int lowBound, int highBound) {
        return new Random().ints(size, lowBound, highBound).toArray();
    }

    int[] numbers = getRandomArray(100000,0,100000);

    QuickSort quick = new QuickSort();
    BubbleSort bubble = new BubbleSort();
    MergeSort merge = new MergeSort();

    @Test
    public void quickSortTime() {
        long start = System.currentTimeMillis();
        quick.quicksort(numbers);
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("QuickSort takes: " + time + "ms");
    }

    @Test
    public void bubbleSortTime() {
        long start = System.currentTimeMillis();
        bubble.bubbleSort(numbers);
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("BubbleSort takes: " + time + "ms");
    }

    @Test
    public void mergeSortTime() {
        long start = System.currentTimeMillis();
        merge.sort(numbers);
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("MergeSort takes: " + time + "ms");
    }
}
