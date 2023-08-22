package com.rits.basics;

/**
 * @author rits
 * @created on 20/02/2023
 * @project dsa
 */
public class PrintPrimeNumbers {
    static void printPrimes(int n){
        for (int i = 1; i <= n; i++) {
            if (PrimeOrNot.isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printPrimes(10);
    }
}
