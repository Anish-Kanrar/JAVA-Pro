import java.util.*;

public class maxMin {
    public static void main(String []args){
        int a[]=new int[5];
        int i,max;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value into array:");
        for(i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        max=a[0];
        for(i=0;i<5;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        int min=a[0];
        for(i=0;i<5;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("Max of array:"+max);
        System.out.println("Minimum of array:"+min);
    }
}
