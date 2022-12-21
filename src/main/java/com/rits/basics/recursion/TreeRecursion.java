package com.rits.basics.recursion;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 02/06/22
 */
public class TreeRecursion {
    static void printRecursion(int n){
        if (n>0){
            System.out.print(n+" ");
            printRecursion(n-1);
            printRecursion(n-1);
        }
    }
    public static void main(String[] args) {
        printRecursion(3);
    }
}
