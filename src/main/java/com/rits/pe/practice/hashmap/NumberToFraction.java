package com.rits.pe.practice.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rits
 * @created on 08/01/2024
 * @project dsa
 */
public class NumberToFraction {
    public static String fractionToDecimal (int numerator, int denominator) {
        String result = "";
        Map<Integer,Integer> map = new HashMap<>();
        if (numerator == 0 || denominator == 0){
            return "0";
        }
        if (numerator < 0 ^ denominator < 0){
            result += "-";
        }
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);

        int quotient = numerator/denominator;
        result +=quotient;
        int remainder = (numerator % denominator) * 10;
        if (remainder == 0){
            return result;
        }else {
            result +=".";
            while (remainder != 0){
                if (map.containsKey(remainder)){
                    int beginning = map.get(remainder);
                    String left = result.substring(0, beginning);
                    String right = result.substring(beginning, result.length());
                    result = left + "(" + right + ")";
                    return result;

                }else {
                    map.put(remainder, result.length());
                    quotient = remainder / denominator;
                    result += String.valueOf(quotient);
                    remainder = (remainder % denominator) * 10;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(fractionToDecimal(-4,-2));
    }
}
