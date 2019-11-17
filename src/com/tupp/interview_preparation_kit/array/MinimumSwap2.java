package com.tupp.interview_preparation_kit.array;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 11/17/19.
 */
// https://www.hackerrank.com/challenges/minimum-swaps-2/problem
public class MinimumSwap2 {
    private static final Scanner scanner = new Scanner(System.in);

    // Solution Selection Sort not fast enough for an array with 100000 elements
    static int minimumSwaps(int[] arr) {
        int minimumSwaps = 0;
        int buffer;

        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPos]) minPos = j;
            }

            if (minPos != i) {
                buffer = arr[i];
                arr[i] = arr[minPos];
                arr[minPos] = buffer;

                minimumSwaps ++;
            }
        }

        return minimumSwaps;
    }

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] arr = new int[n];
//
//        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int arrItem = Integer.parseInt(arrItems[i]);
//            arr[i] = arrItem;
//        }
//
//        int res = minimumSwaps(arr);
//
//        bufferedWriter.write(String.valueOf(res));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();

        int arr[] = {7, 1, 3, 2, 4, 5, 6};
        System.out.println("arr " + Arrays.toString(arr));
        int res = minimumSwaps(arr);
        System.out.println("res " + res);

    }
}
