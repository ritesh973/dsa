package com.rits.basics;

import com.rits.utils.InputUtil;

/**
 * @author rits
 * @created on 14/02/2023
 * @project dsa
 */
public class DecimalToBinary {

    static int decimalToBinary1(int decimalNumber){
        double res = 0;
        int i = 0;
        while (decimalNumber > 0){
            int digit = decimalNumber % 2;
            res = digit*Math.pow(10,i++)+res;
            decimalNumber = decimalNumber/2;
        }
        return (int)res;

    }
    static int decimalToBinary2(int decimalNumber){
        double res = 0;
        int i = 0;
        while (decimalNumber > 0){
            int digit = decimalNumber & 1;
            res = digit*Math.pow(10,i++)+res;
            decimalNumber = decimalNumber>>1;
        }
        return (int)res;

    }
    static int binaryToDecimal(int decimalNumber){
        double decimal = 0;
        int i = 0;
        while (decimalNumber > 0){
            int digit = decimalNumber % 10;
            decimal = digit*Math.pow(2,i++)+decimal;
            decimalNumber = decimalNumber/10;
        }
        return (int)decimal;

    }
    public static void main(String[] args) {
        int number = InputUtil.readInt();
        System.out.println(decimalToBinary1(number));
        System.out.println(decimalToBinary2(number));
        System.out.println(binaryToDecimal(decimalToBinary2(number)));

    }
}
