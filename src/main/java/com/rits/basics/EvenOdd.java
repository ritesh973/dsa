package com.rits.basics;

/**
 * @author rits
 * @created on 20/02/2023
 * @project dsa
 */
public class EvenOdd {
    static boolean isEven(int num){
        return  ((num&1) == 0)? true:false;
    }
    public static void main(String[] args) {
        System.out.println( "Is Even : "+ isEven(7));

    }
}
