package com.rits.basics;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 10/04/22
 */
public class FibonacciSeries {
    static int n1=0,n2=1,n3=0;

    //0,1,1
    public static void printFib(int n){
        if (n>0){
            n3 = n2+n1;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFib(n-1);
        }

    }

    public static void main(String[] args) {
        System.out.print(n1+" "+n2);
        int n =10;
        printFib(n-2);
        System.out.println("\n Last Fib Term: "+n3);
    }
}
