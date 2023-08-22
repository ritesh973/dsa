package com.rits.utils;

import com.rits.common.TreeNode;

import java.util.Scanner;

/**
 * @author rits
 * @created on 14/02/2023
 * @project dsa
 */
public class InputUtil {

    private static Scanner sc = new Scanner(System.in);
    public static int readInt(){
        System.out.println("Enter the value");
        Integer data = sc.nextInt();
        return data;
    }
}
