package Function_method;

import java.util.*;

public class primeNumber {
    //only for n>=2
    public static boolean isPrime(int n) {
        //corner cases
        //2
        if(n == 2){
            return true;
        }

        // boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) { // completely dividing
                // isPrime=false;
                // break;
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(isPrime(7)); // function call
    }
}
