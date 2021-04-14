package com.algo;

public class BinarySearch {

    int binarySearch(int arr[], int start, int end, int x) {

        if (end >= start && start<arr.length-1) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, start, mid - 1, x);

            return binarySearch(arr, mid + 1, end, x);
        }
        return -1;
    }

    // Driver method to test above
    public static void main(String args[])
    {
        long startTime =  System.nanoTime();
        BinarySearch recur = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 17, 40, 25};
        int n = arr.length;
        int x = 17;
        int result = recur.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index: " + result);
        long endTime =  System.nanoTime();
        long time = startTime + endTime;
        System.out.println("Time taken: " + time);
    }
}

