package com.rits.basics;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 27/03/22
 */
public class FactorialRecursion {
    public static void main(String[] args) {
        System.out.println(getFact(4));
    }

    public static int getFact(int n){
        if (n>0){
            return n * getFact(n-1);
        }else {
            return 1;
        }
    }

}
