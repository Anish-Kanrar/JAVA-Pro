package Function_method;

import java.util.*;

public class swap {
    public static void swapNumber(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a is= " + a);
        System.out.println("b is= " + b);
    } 

    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        swapNumber(a, b);

    }
}
//call by value