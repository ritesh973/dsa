package com.rits.basics.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author rits
 * @created 03/02/2023
 * @project dsa
 */
public class PatterPrint {
    public static void main(String[] args) throws IOException {
        System.out.printf("Provide value of N ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        /*System.out.println("Printing Full Pyramid");
        for (int row = 0; row < n; row++)
        {
            //Space
            for (int col=0; col < n-row-1; col++)
            {
                System.out.print(" ");
            }
            //Star
            for (int col = 0; col < row+1; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Printing Inverted Full Pyramid");
        for (int row = 0; row < n; row++)
        {
            for (int col=0; col < n-row-1; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
            for ( int col = 0; col < row+1; col++)
            {
                System.out.print(" ");
            }

        }
        System.out.println();*/

        /*System.out.println(" Full Pyramid");
        for (int row = 0; row < n; row++)
        {
            //Space
            for (int col=0; col < n-row-1; col++)
            {
                System.out.print(" ");
            }
            //Star
            for (int col = 0; col < row+1; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int row = 0; row < n; row++)
        {
            for (int col=0; col < n-row; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
            for ( int col = 0; col < row+1; col++)
            {
                System.out.print(" ");
            }

        }
        System.out.println();*/


       /* System.out.println("Hollow Diamond");
        for (int row = 0; row < n; row++)
        {
            //Space
            for (int col=0; col < n-row-1; col++)
            {
                System.out.print(" ");
            }
            //Star
            for (int col = 0; col < 2*row+1; col++)
            {
                if (col == 0 || col == 2*row) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int row = 0; row < n; row++)
        {

            for (int col=0; col < row; col++)
            {
                System.out.print(" ");
            }

            //Star
            for (int col = 0; col < 2*n-2*row-1; col++)
            {
                if (col == 0 || col == 2*n-2*row-2) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();



        }*/



 //       System.out.println("*******Hollow Stylish Diamond");
//        ********** **********
//        *********   *********
//        ********     ********
//        *******       *******
//        ******         ******
//        *****           *****
//        ****             ****
//        ***               ***
//        **                 **
//        *                   *
//        *                   *
//        **                 **
//        ***               ***
//        ****             ****
//        *****           *****
//        ******         ******
//        *******       *******
//        ********     ********
//        *********   *********
//        ********** **********
   /*     for (int row = 0; row < n; row++)
        {
            //Space
            for (int col=0; col < n-row; col++)
            {
                System.out.print("*");
            }
            //Space
            for (int col = 0; col < 2*row+1; col++)
            {
                    System.out.print(" ");

            }
            for (int col=0; col < n-row; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //Down Half
        for (int row = 0; row < n; row++)
        {
            //Space
            for (int col=0; col < row+1; col++)
            {
                System.out.print("*");
            }
            //Space
            for (int col = 0; col < 2*n-2*row-1; col++)
            {
                System.out.print(" ");

            }
            for (int col=0; col < row+1; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/


 //       System.out.println("Fancy pattern");
//        1
//        2*2
//        3*3*3
//        4*4*4*4
//        5*5*5*5*5
//        5*5*5*5*5
//        4*4*4*4
//        3*3*3
//        2*2
//        1
/*        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(i+1);
                if (j!=i){
                    System.out.print("*");
                }
                
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(n-i);
                if (j!=n-i-1){
                    System.out.print("*");
                }

            }
            System.out.println();
        }*/
        System.out.println("Fancy Character Pattern");
//        A
//        ABA
//        ABCBA
//        ABCDCBA
//        ABCDEDCBA
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                int ans = j+1;
                char ch = (char) ('A'+ans-1);
                System.out.print(ch);
            }
            for (int j = i; j > 0; j--) {
                int ans = j;
                char ch = (char) ('A'+ans-1);
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println();
    }

}
