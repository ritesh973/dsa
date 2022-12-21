package com.rits.basics.recursion;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 03/06/22
 */
public class FindFact {
    static int findFact(int n){
        if (n == 0)
            return 1;
        return findFact(n-1)*n;
    }
    public static void main(String[] args) {
        System.out.println(findFact(5));
    }
}
