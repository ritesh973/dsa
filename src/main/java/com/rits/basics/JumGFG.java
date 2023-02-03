package com.rits.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JumGFG {
public static void main (String[] args) throws IOException
        {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//
//        while(t-- > 0){
//        int size = Integer.parseInt(br.readLine());
//        String[] arrStr = ((String)br.readLine()).split("\\s+");
        int[] arr= {2, 3, 1, 1, 2, 4, 2, 0, 1, 1}   ;
//        for(int i = 0;i<arr.length;i++){
//        arr[i] = Integer.parseInt(arrStr[i]);
//        }
        System.out.println(new Solution().minJumps(arr));
        }
        }

        //}

// } Driver Code Ends


class Solution{
    /*static int minJumps(int[] arr){
        int jumpCount = 0;
        if (arr.length == 1 || arr.length == 0){
            return jumpCount;
        }
        int toBeJump=arr[0];
        int i=0;
        for (; i < arr.length;) {
            if (toBeJump == 0){
                return -1;
            }
            if(i+toBeJump > arr.length){
                return jumpCount;
            }
            for (int j = i; j <= toBeJump; j++) {
                if (j==toBeJump){
                    toBeJump = arr[j];
                    break;
                }
                i++;
            }
            jumpCount++;
        }
        return jumpCount;
    }*/

    static int minJumps(int[] arr){
        if (arr.length <= 1){
            return 0;
        }
        int toBeJump=arr[0];
        if (toBeJump == 0){
            return -1;
        }
        int maxReach = arr[0];
        int jumpCount = 1;
        for (int i=1; i < arr.length;i++) {
            if(i == arr.length-1){
                return jumpCount;
            }
            maxReach = Math.max(maxReach, i + arr[i]);
            toBeJump--;
            if (toBeJump == 0) {
                jumpCount++;

                if (i >= maxReach)
                    return -1;

                toBeJump = maxReach - i;
            }
        }
        return -1;
    }

}