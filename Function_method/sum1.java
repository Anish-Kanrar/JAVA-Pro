package Function_method;

import java.util.*;
//Overloading using parameters
// public class sum1 {
//     public static int sum(int a,int b){
//         return a+b;
//     }
//     public static int sum(int a,int b,int c){
//         return a+b+c;
//     }
//     public static void main(String args[]){
//         System.out.println(sum(2,5));
//         System.out.println(sum(1,4,5));
//     }
    
// }


//Overloading using datatypes
public class sum1 {
    public static int sum(int a,int b){
        return a+b;
    }
    //func to cal float sum
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println(sum(2,5));
        System.out.println(sum(1.9f,4.5f));
    }
    
}

