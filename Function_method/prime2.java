package Function_method;

import java.util.*;

public class prime2 {
    // only for n>=2
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)) {//true
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        //System.out.println(isPrime(6)); // function call
        primesInRange(20); //2 to 20
    }
}
