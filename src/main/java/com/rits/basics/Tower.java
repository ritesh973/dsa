package com.rits.basics;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 10/04/22
 */
public class Tower {
    static void toh(int n,char from_rod,char to_rod,char aux_rod){

        if (n ==1){
            System.out.println("Move disc 1 from "+from_rod+" to "+to_rod);
            return;
        }
        toh(n-1,from_rod,aux_rod,to_rod);
        System.out.println("Move disc "+n+" from "+from_rod+" to "+aux_rod);
        toh(n-1,aux_rod,to_rod,from_rod);

    }
    public static void main(String[] args) {
        int n = 3;
        toh(n,'A','C','B');

    }
}
