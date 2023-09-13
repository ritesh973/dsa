package com.rits.leetcode.leetcode1_40;

import java.util.HashSet;
import java.util.Set;

/**
 * @author rits
 * @created on 12/09/2023
 * @project dsa
 */
public class LTC36 {

    public static boolean printSmallSudoku(char[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.'){
                    for (int val = 1; val <9; val++) {
                        if (!isSafe(i,j,board,board[i][j])){
                           return false;
                        }
                    }
                }
            }

        }
        return true;
    }

    private static boolean isSafe(int row, int col, char[][] board, int val) {
        for (int k = 0; k <board.length ; k++) {
            if (board[row][k] == val && board[row][k] != '.'){
                return false;
            }
            if (board[col][k] == val && board[col][k] != '.'){
                return false;
            }
            if (board[3*(row/3)+k/3][3*(col/3)+k%3] == val && board[3*(row/3)+k/3][3*(col/3)+k%3] !='.'){
                return false;
            }
        }
        return true;
    }

    public static boolean isValidSudoku(char[][] board) {
        Set seen = new HashSet<>();
        for (int i = 0; i <9 ; ++i) {
            for (int j = 0; j <9; ++j) {
                char curVal = board[i][j];
                if (curVal != '.'){
                    if (!seen.add(curVal+" in row "+i) ||
                            !seen.add(curVal+" in column "+j) ||
                            !seen.add(curVal+" found in sub box "+i/3 + "-"+j/3)){
                        return false;
                    }

                }
            }
        }
        return true;
    }
    public static void main(String[] args) {

        char board[][] = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'},

        };
        System.out.println(isValidSudoku(board));

    }
}
