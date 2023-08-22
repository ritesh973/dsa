package com.rits.basics.pattern;

import com.rits.utils.InputUtil;

/**
 * @author rits
 * @created on 14/02/2023
 * @project dsa
 */
public class HollowTriangle {
    static void printTriangle(int n){
        for (int i = 0; i<n;i++){
            for (int j = 0; j < i; j++) {
                if (i == n - 1 || j == 0 || j == i - 1) {
                    System.out.print(j + 1 + "");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void printInverseTriangle(int n){
        for (int i = 0; i<n;i++){
            for (int j = 0; j < n-i; j++) {
                if (i == 0 || i == n-1 || j==0 || j==n-i-1) {
                    System.out.print(j + 1 + "");
                }else{
                    System.out.print(" ");
                }
                }
            System.out.println();
            }
            System.out.println();
        }

    static void printPatternTriangle(int n){
        int k = n;
        for (int i = 0; i<n;i++){
            int c = 1;
            for (int j = 0; j < k; j++) {
                if (j<n-i-1) {
                    System.out.print(" ");
                }else if(j < n-1){
                    System.out.print(c++);
                }else{
                    System.out.print(c--);
                }
            }
            k++;
            System.out.println();
            }

            System.out.println();
    }
    static void printPattern2(int n){


        int mid = ((2*n-1)/2);
        for (int i = 0; i<2*n-1;i++){
            if(i<=mid) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            }else {
                for (int k = 0 ; k < (2*n-1)-i ; k++) {
                System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println();
    }
    public static void main(String[] args) {
        int i = InputUtil.readInt();
        //printTriangle(i);
        //printInverseTriangle(i);
        //printPatternTriangle(i);
        printPattern2(i);


    }
}
