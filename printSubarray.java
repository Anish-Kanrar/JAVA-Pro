import java.util.*;

public class printSubarray {
    public static void subArray(int num[]){
        int ts=0;  //ts->total subarray
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){  //print
                    System.out.print(num[k] + " "); //subarray
                }
                ts++;
                System.out.println();
            }System.out.println();
        }System.out.println("total subarray= " +ts);
    }
    public static void main(String args[])
    {
        int num[]={2,4,6,8,10};
        subArray(num);
    }
    
}
