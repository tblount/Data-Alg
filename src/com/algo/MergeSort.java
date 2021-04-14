package com.algo;

public class MergeSort {

    public int[] sort(int [] array){
        mergeSort(array, 0, array.length-1);
        return array;

    }

    private void mergeSort(int[] array, int first, int last) {

        // We need mid to divide problem into smaller size pieces
        int mid = (first + last) / 2;

        //If first < last the array must be recursively sorted
        if (first < last) {
            mergeSort(array, first, mid);
            mergeSort(array, mid + 1, last);
        }

        //merge solved pieces to get solution to original problem
        int a = 0, f = first, l = mid + 1;
        int[] temp = new int[last - first + 1];

        while (f <= mid && l <= last) {
            temp[a++] = array[f] < array[l] ? array[f++] : array[l++];
        }

        while (f <= mid) {
            temp[a++] = array[f++];
        }

        while (l <= last) {
            temp[a++] = array[l++];
        }

        a = 0;
        while (first <= last) {
            array[first++] = temp[a++];
        }
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }

    }

    public static void main(String[] args) {

        System.out.println("Original array:");
        int[] example = { 100, 30, 55, 62, 2, 42, 20, 9, 394, 1, 0 };
        printArray(example);

        System.out.println("\nMergesort");
        MergeSort merge = new MergeSort();
        merge.sort(example);
        printArray(example);

    }
}
