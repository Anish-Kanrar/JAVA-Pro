
import java.util.*;

public class linearSearch {
    public static int search(int num[], int key) {
        int i;
        for (i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int num[] = { 1, 2, 3, 4, 5, 6 };
        int key = 6;

        int index = search(num, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("key is at index: " + index);
        }
    }
}