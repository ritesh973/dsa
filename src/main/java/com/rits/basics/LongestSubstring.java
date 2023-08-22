package com.rits.basics;

/**
 * @author rits
 * @created on 28/06/2023
 * @project dsa
 */
public class LongestSubstring {

    public  boolean areDistinct(String s, int start, int end){
        boolean visited[] = new boolean[26];
        for (int i = start; i <= end; i++) {
            if (visited[s.charAt(i)-'a'] == true)
                return false;
            visited[s.charAt(i)-'a'] = true;
        }
        return true;
    }


//    public int lengthOfLongestSubstring(String s) {
//        int res = 0;
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i; j < s.length(); j++) {
//                if (areDistinct(s,i,j))
//                    res = Math.max(res,j-i+1);
//            }
//        }
//        return res;
//    }
    public static int longestUniqueSubsttr(String str)
    {
        int n = str.length();

        // Result
        int res = 0;

        for(int i = 0; i < n; i++)
        {

            // Note : Default values in visited are false
            boolean[] visited = new boolean[256];

            for(int j = i; j < n; j++)
            {

                // If current character is visited
                // Break the loop
                if (visited[str.charAt(j)] == true)
                    break;

                    // Else update the result if
                    // this window is larger, and mark
                    // current character as visited.
                else
                {
                    res = Math.max(res, j - i + 1);
                    visited[str.charAt(j)] = true;
                }
            }

            // Remove the first character of previous
            // window
            visited[str.charAt(i)] = false;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(longestUniqueSubsttr("abcabcbb"));
    }
}
