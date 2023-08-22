package com.rits.basics;

/**
 * @author rits
 * @created on 07/02/2023
 * @project dsa
 */
public class PrimeOrNot {
    static boolean isPrime(int n){
        for (int i = 2; i <n ; i++) {
            if (n%i == 0)
                return false;
        }
        return true;
    }
    static int optimisedIsPrime(int n){
        if (n == 2 || n == 3){
            return 1;
        }
        if (n < 1 || n % 2 == 0 || n % 3 == 0){
            return 0;
        }
        for (int i = 5; i*i <=n ; i+=6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(8));
        System.out.println(isPrime(577));

    }
}
