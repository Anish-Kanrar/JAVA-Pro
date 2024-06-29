//List of element of the same type placed in a contiguous memory location.

import java.util.*;

public class ArraysCC {

    public static void update(int marks[],int nonChangable ) {
        nonChangable=10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
        System.out.println(nonChangable);
    }

    public static void main(String args[]) {
        int marks[] = { 99, 97, 96 };
        int nonChangable = 5;
        update(marks, nonChangable);
        System.out.println(nonChangable);
        // print our nonChangablemarks
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " ");
        }
        System.out.println();
    }
}