import java.util.*;
import java.util.function.IntUnaryOperator;

public class largestArray {
    public static int getLargest(int num[])
    { 
        int largest= Integer.MIN_VALUE;     //-infinity                                                                                                                                                                                                                                   ;  // -infinity
        for(int i=0;i<num.length;i++){
           if(largest < num[i]){
            largest = num[i];
           }
        }
        return largest;
    }

    public static void main(String args[]) {
        int num[] = { 1, 2, 3, 4, 599, 9 };
        System.out.println("largest value is:" + getLargest(num));
    }
}
