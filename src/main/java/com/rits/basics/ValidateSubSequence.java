package com.rits.basics;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 25/04/22
 */
public class ValidateSubSequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
       int index = 0;
        for (Integer integer : array) {
            if (index == sequence.size()){
                break;
            }
            if (integer.equals(sequence.get(index))) {
                index++;
            }
        }
        return index == sequence.size();
    }

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(5, 1, 22,2);
        List<Integer> sequence = Arrays.asList(5,22,2);
        System.out.println(isValidSubsequence(array,sequence));

    }
}
