package com.rits.basics.recursion;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 01/06/22
 */
public class Recursion1 {
    static int data = 0;
    static int printRecursive(int n){
        if (n>0){
            data++;
            return printRecursive(n-1)+data;
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(printRecursive(5));
    }
}
