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
// https://www.hackerrank.com/challenges/mini-max-sum/problem
public class MinMaxSum {
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long sumOfMid = 0;

        Arrays.sort(arr);
        // Sum of 3 mid elements
        for (int i = 1; i < arr.length - 1; i ++) {
            sumOfMid += arr[i];
        }

        long min = arr[0] + sumOfMid;
        long max = arr[arr.length - 1] + sumOfMid;


        System.out.println(min + " " + max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
