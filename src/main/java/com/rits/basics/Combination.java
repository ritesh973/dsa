package com.rits.basics;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 10/04/22
 */
public class Combination {
    static int combi(int n, int r){
        return (getFact(n)/(getFact(r)*getFact(n-r)));
    }
    public static int getFact(int n){
        if (n>0){
            return n * getFact(n-1);
        }else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int n = 5, r= 3;
        System.out.println(combi(n,r));
    }
}
