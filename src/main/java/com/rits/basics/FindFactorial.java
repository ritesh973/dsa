package com.rits.basics;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 27/03/22
 */
public class FindFactorial {
    public static int getFactNonRec(int n){
        int fact = 1;
        if (n==0 || n==1){
            return fact;
        }
        for (int i = 1; i <=n ; i++) {
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(getFact(4));
        System.out.println(getFactNonRec(4));
    }


    public static int getFact(int n){
        if (n>0){
            return n * getFact(n-1);
        }else {
            return 1;
        }
    }

}
