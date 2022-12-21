package com.rits.practice;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 28/11/22
 */
public class FindFactorial {

    public static int getFact(int n){
        int res = 1;
        if (n == 0 || n==1)
            return res;
        res = n;
        while (n>1){
            res = res*(n-1);
            n--;
        }
        return res;
    }
    public static int getTrialingZerosInFact(int n){
        int res = 0;
        for (int i=5; i<=n;i=i*5){
            res = res+n/i;
        }
        return res;
    }
    public static int getFactRec(int n){
        if (n == 0 || n==1)
            return 1;
        return n*getFact(n-1);
    }




    public static void main(String[] args) {
        int num = 10;
        System.out.println("Factorial of "+num+" is :"+getFact(num));
        System.out.println("Factorial of "+num+" is :"+getFactRec(0));
        System.out.println("Trial Zeo count in  "+num+" is :"+getTrialingZerosInFact(10));

    }
}
