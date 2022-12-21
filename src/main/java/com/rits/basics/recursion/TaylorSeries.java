package com.rits.basics.recursion;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 03/06/22
 */
public class TaylorSeries {
    static double p=1,f=1;
    static double r;
    static double e(int x,int n){
        if (n==0){
            return 1;
        }
        r = e(x,n-1);
        p = p*x;
        f = f*n;
        return r+p/f;

    }
    public static void main(String[] args) {

        System.out.println(e(3,10));
    }
}
