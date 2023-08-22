package com.rits.basics.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rits
 * @created on 15/08/2023
 * @project dsa
 */
public class LTC13 {



    public static int romanToInt(String S) {
        Map<Character,Integer> charMap = new HashMap<>();
        charMap.put('I',1);
        charMap.put('V',5);
        charMap.put('X',10);
        charMap.put('L',50);
        charMap.put('C',100);
        charMap.put('D',500);
        charMap.put('M',1000);

            int ans = charMap.get(S.charAt(S.length()-1));
            for (int i = S.length()-2; i >= 0; i--) {
                if (charMap.get(S.charAt(i)) < charMap.get(S.charAt(i+1))){
                    ans -= charMap.get(S.charAt(i));
                }else{
                    ans += charMap.get(S.charAt(i));
                }
            }
            return ans;

    }

    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));

    }
}
