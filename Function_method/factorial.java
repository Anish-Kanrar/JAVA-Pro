package Function_method;
import java.util.*;

public class factorial {
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }return f;  //factorial of f
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    int x=fact(n);
    System.out.println("factorial is:"+x);
    }    
}
