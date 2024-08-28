import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        int a[]=new int[10];
        int i,even=0,odd=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value into array:");
        for(i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<10;i++){
            if(a[i]%2 == 0){
                even=even+a[i];
            }
            else{
                odd=odd+a[i];
            }
        }
        // for(i=0;i<10;i++){
        //     if(a[i]%2 != 0){
        //         odd=odd+a[i];
        //     }
        // }
        System.out.println("Sum of even:"+even);
        System.out.println("Sum of even:"+odd);

    }
}
