package com.rits.leetcode.leetcode1_40;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author rits
 * @created on 29/08/2023
 * @project dsa
 */
public class LTC30 {
    public static List<Integer> findSubstring(String s, String[] words) {
        if (s == null || s.length() == 0 || words == null || words.length == 0) return new ArrayList<>();

        Map<String,Integer> freqMap = new HashMap<>();
        for (String word: words) {
            freqMap.put(word,freqMap.getOrDefault(word,0)+1);
        }
        int wordLength = words[0].length();
        int wordCount = words.length;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= (s.length()-(wordCount*wordLength)) ; i++) {
            Map<String,Integer> seenWord = new HashMap<>();
            for (int j = 0; j < wordCount; j++) {
                int wordIndex = i+j*wordLength;
                String word = s.substring(wordIndex,wordIndex+wordLength);
                if (!freqMap.containsKey(word)){
                    break;
                }
                seenWord.put(word,seenWord.getOrDefault(word,0)+1);

                if (seenWord.get(word) > freqMap.getOrDefault(word,0)){
                    break;
                }
                if (j+1 == wordCount){
                    result.add(i);
                }
                
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String words[] = {"foo","bar"};
        System.out.println(findSubstring(s,words));

    }
}
