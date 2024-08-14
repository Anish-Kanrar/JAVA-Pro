package loop;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //find the largest of three number
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

//        int max=a;
//        if(b>max)
//            max=b;
//        if(c>max)
//            max=c;

     /*   int max=0;
          if(a>b) 
            max=a;
          else 
            max=b;

          if(c>max)
            max=c;
    */

          int max=(Math.max(c,Math.max(a,b)));
          System.out.println("max of three:"+max);

         // System.out.println(Math.max(89,93));   //Math.max
    }
}

//10
//20
//30
//max of three:30
