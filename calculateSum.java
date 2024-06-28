package Function_method;

import java.util.*;
//function defination
public class calculateSum {
    public static int sum(int a,int b)  //parameters or formal parameter
    {
        int sum=a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum1=sum(a,b);  //argument or actual parameters
        System.out.println("sum is:" +sum1);
    }    
}
