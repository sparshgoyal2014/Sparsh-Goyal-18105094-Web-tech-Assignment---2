package com.company;

public class CountingSort {
    void countSort(int arr[])
    {
        int n = arr.length;

        int result[] = new int[n];

        int count[] = new int[21];

        for (int i = 0; i < 21; i++)
            count[i] = 0;


        for (int i = 0; i < n; ++i)
            count[arr[i]]++;

        for (int i = 1; i <= 20; ++i)
            count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            result[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < n; ++i)
            arr[i] = result[i];
    }

    // Driver method
    public static void main(String args[])
    {
        CountingSort sort = new CountingSort();
        int arr[] = {2,3,4,5,6,6,6,8,7,4,4,1,4,2,4,3,4,3};

        sort.countSort(arr);

        System.out.print("Sorted array is ");
        for(int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
    }
}