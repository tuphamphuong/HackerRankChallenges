package com.tupp.interview_preparation_kit.greedy;

import java.io.*;
import java.util.*;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 11/15/19.
 */
// https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem
public class MinimumAbsoluteDifferenceInAnArray {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the minimumAbsoluteDifference function below.
    static int minimumAbsoluteDifference(int[] arr) {
        int result = 2147483647;

        System.out.println("arr 1 " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("arr 3" + Arrays.toString(arr));

        for (int i=0; i< arr.length - 1; i ++) {
            int a = arr[i];
            int b = arr[i+1];
            int absDiff = Math.abs((b - a));

            System.out.println("a " + a + " b " + b + " absDiff " +  absDiff + " result " + result);
            if (result >= absDiff) {
                result = absDiff;
            }
        }

        return result;
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
//        int result = minimumAbsoluteDifference(arr);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();

        int arr[] = {1, -3, 71, 68, 17};
        int result = minimumAbsoluteDifference(arr);
        System.out.println("result " + result);

    }
}
