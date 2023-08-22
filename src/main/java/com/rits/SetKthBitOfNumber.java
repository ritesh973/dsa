package com.rits;

/**
 * @author rits
 * @created on 20/02/2023
 * @project dsa
 */
public class SetKthBitOfNumber {
    static int setKthBit(int N,int K){
        int value = 1<<K;
        return N | value;
    }
    public static void main(String[] args) {
        System.out.println(setKthBit(10,2));

    }
}
