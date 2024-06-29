import java.util.*;

public class BinarySearch {
    public static int binary(int num[], int key) {
        int lb = 0, ub = num.length - 1;
        while (lb <= ub) {
            int mid = (lb + ub) / 2;

            // comparisons
            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] < key) { // right
                lb = mid + 1;
            } else { // left
                ub = mid - 1;

            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int num[] = { 1, 2, 3, 4, 5, 6, 7 };
        int key = 6;
        int x = binary(num, key);
        System.out.println("Index of key is:" + x);
    }
}
