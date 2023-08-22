package com.rits.basics;

/**
 * @author rits
 * @created on 07/08/2023
 * @project dsa
 */
public class RegularExpressionMatching {

    /*public boolean isMatch(String s, String p) {
        int rows = s.length();
        int columns = p.length();
        /// Base conditions
        if (rows == 0 && columns == 0) {
            return true;
        }
        if (columns == 0) {
            return false;
        }
        // DP array
        boolean[][] dp = new boolean[rows + 1][columns + 1];
        // Empty string and empty pattern are a match
        dp[0][0] = true;
        // Deals with patterns with *
        for (int i = 2; i < columns + 1; i++) {
            if (p.charAt(i - 1) == '*') {
                dp[0][i] = dp[0][i - 2];
            }
        }
        // For remaining characters
        for (int i = 1; i < rows + 1; i++) {
            for (int j = 1; j < columns + 1; j++) {
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (j > 1 && p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2];
                    if (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1)) {
                        dp[i][j] = dp[i][j] | dp[i - 1][j];
                    }
                }
            }
        }
        return dp[rows][columns];
    }*/

    public boolean isMatch(String s, String p) {
        Boolean[][] memo = new Boolean[s.length()+1][p.length()];
        return isMatch(s,p,0,0,memo);
    }
    public boolean isMatch(String s, String p,int sIndex,int pIndex,Boolean[][] memo) {
        if (sIndex == s.length() && pIndex == p.length()){
            return true;
        }
        if (pIndex >= p.length()){
            return false;
        }
        if (memo[sIndex][pIndex] != null){
            return memo[sIndex][pIndex];
        }
        boolean characterMatch = sIndex < s.length() && (s.charAt(sIndex) == p.charAt(pIndex) || p.charAt(pIndex) == '.');
        boolean nextOneStar = pIndex+1 < p.length() && p.charAt(pIndex+1) == '*';
        final boolean isMatch;
        if (characterMatch){
            if (nextOneStar){
                isMatch = isMatch(s,p,sIndex,pIndex+2,memo) || isMatch(s,p,sIndex+1,pIndex,memo);
            }else {
                isMatch = isMatch(s,p,sIndex+1,pIndex+1,memo);

            }
        }else{
            if (nextOneStar){
                isMatch = isMatch(s,p,sIndex,pIndex+2,memo);

            }else {
                isMatch = false;

            }
        }
        memo[sIndex][pIndex] = isMatch;
        return isMatch;
    }


}
