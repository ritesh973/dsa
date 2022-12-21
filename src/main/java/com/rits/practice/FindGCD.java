package com.rits.practice;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 29/11/22
 */
public class FindGCD {
    static int GCD(int a,int b){
        if (b == 0)
            return a;
        return GCD(b,a%b);
    }
    public static void main(String[] args) {
        System.out.println(GCD(4,6));
    }
}
