package com.rits.practice;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 28/11/22
 */
public class DigitCount {
    public static void main(String[] args) {
        int num = 1234567;
        int count = 0;
        while (num>0){
            num = num / 10;
            count++;
            System.out.println(num);
        }
        System.out.println("Digit Count is : " +count);
    }
}
