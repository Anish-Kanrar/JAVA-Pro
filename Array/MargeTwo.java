import java.util.*;

public class MargeTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        int a1[]=new int[3];
        int a2[]=new int[4];
        int c[]=new int[7];
        int i,k=0;
        
        System.out.println("Enter the value into first array: ");
        for(i=0;i<3;i++){
            a1[i]=sc.nextInt();
        }
        System.out.println("Enter the value into second array: ");
        for(i=0;i<4;i++){
            a2[i]=sc.nextInt();
        }
        for(i=0;i<3;i++){
            c[k]=a1[i];
            k++;
        }
        for(i=0;i<4;i++){
            c[k]=a2[i];
            k++;
        }
        System.out.println("After merge the array is:");
        for(i=0;i<7;i++){
            System.out.print(c[i]+" ");
        }
    }
}
