import java.util.*;

public class bubbleSort {
    public static void bubble(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        } // System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 11, 8, 9, 55, 99 };
        bubble(arr);
        printArr(arr);
    }

}


//Time complexity->O(n^2)