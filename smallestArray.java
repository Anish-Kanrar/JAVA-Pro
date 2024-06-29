import java.util.*;

public class smallestArray {
    public static int getSmallest(int num[]) {
        int i;
        int smallest = Integer.MAX_VALUE;
        for (i = 0; i < num.length; i++) {
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        return smallest;     
    }

    public static void main(String args[]) {
        int num[] = { 16, 11, 2, 3, 4, 5, 57 };
        int x = getSmallest(num);
        System.out.println("Smallest number is: " + x);
    }
}
