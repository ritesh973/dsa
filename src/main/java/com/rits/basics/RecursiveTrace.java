package com.rits.basics;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 26/03/22
 */
public class RecursiveTrace {
    public static void main(String[] args) {
        test(10000);
    }

    private static void test(int n){
        if (n>0){

            test(n-1);
            System.out.println("Printing "+n);
            test(n-1);


        }

    }
}

