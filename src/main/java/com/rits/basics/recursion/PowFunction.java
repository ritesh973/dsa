package com.rits.basics.recursion;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 03/06/22
 */
public class PowFunction {
    static int pow(int m, int n){
        if (n==0){
            return 1;
        }else {
            return pow(m,n-1)*m;
        }
    }
    static int pow1(int m, int n){
        if (n==0){
            return 1;
        }
        if (n%2 == 0){
            return pow1(m*m,n/2);
        }else {
            return m*pow1(m*m,n-1/2);
        }
    }
    public static void main(String[] args) {
        System.out.println(pow1(2,2));
    }
}
