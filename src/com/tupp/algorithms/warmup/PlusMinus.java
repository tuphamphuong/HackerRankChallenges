package com.tupp.algorithms.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 11/22/19.
 */
// https://www.hackerrank.com/challenges/plus-minus/problem
public class PlusMinus {
    private static final Scanner scanner = new Scanner(System.in);

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        float numOfPositiveNumber = 0;
        float numOfNegativeNumber = 0;
        float numOfZeroNumber = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) numOfPositiveNumber++;
            else if (arr[i] < 0) numOfNegativeNumber++;
            else numOfZeroNumber++;
        }

        System.out.println(String.format(java.util.Locale.US, "%.6f", numOfPositiveNumber / arr.length));
        System.out.println(String.format(java.util.Locale.US, "%.6f", numOfNegativeNumber / arr.length));
        System.out.println(String.format(java.util.Locale.US, "%.6f", numOfZeroNumber / arr.length));
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
