package com.rits.basics.recursion;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 02/06/22
 */
public class NSum {
    static int nSum(int n){
        if (n<1){
            return 0;
        }else {
            return nSum(n-1)+n;
        }
    }
    public static void main(String[] args) {
        System.out.println(nSum(10));
    }
}
