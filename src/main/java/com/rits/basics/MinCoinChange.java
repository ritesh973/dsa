package com.rits.basics;

import java.util.Arrays;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 17/05/22
 */
public class MinCoinChange {

    public static int minCoinChange(int[] coins){
        Arrays.sort(coins);
        int changeAlreadyCreated = 0;
        for (int coin : coins) {
            int changeToBeCreated = changeAlreadyCreated + 1;
            if (coin > changeToBeCreated) {
                return changeToBeCreated;
            }
            changeAlreadyCreated += coin;
        }
        return changeAlreadyCreated+1;

    }
    public static void main(String[] args) {
        int[] coins = new int[]{1,2,5};
        System.out.println(minCoinChange(coins));

        //1 1 =>1 =>2=> 3 =>4

    }
}
