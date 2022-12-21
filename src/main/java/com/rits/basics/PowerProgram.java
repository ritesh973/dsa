package com.rits.basics;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 10/04/22
 */
public class PowerProgram {

    static int power(int base, int pow){
        if (pow != 0){
            return (power(base,pow-1)*base);
        }else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
}
