package com.rits.basics;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 22/03/22
 */
public class ReverseString {
    public static void main(String[] args) {
        String original = "Ritesh Kumar Singh";
        System.out.println("Original String : "+original);
        String reversedString = reverseString(original);
        System.out.println("Reversed String : "+reversedString);


    }
    private static String reverseString(String originalString){
        String reversedString = "";
        for (int i = originalString.length()-1; i>=0; i--){
            reversedString += originalString.charAt(i);
        }
        return reversedString;
    }
}
