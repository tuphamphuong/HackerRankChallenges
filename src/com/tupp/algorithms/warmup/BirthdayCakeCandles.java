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
// https://www.hackerrank.com/challenges/birthday-cake-candles/problem
public class BirthdayCakeCandles {
    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int result = 0;

        Arrays.sort(ar);
        System.out.println("ar " + Arrays.toString(ar));

        int max = ar[ar.length - 1];
        System.out.println("max " + max);

        for (int i = ar.length - 1; i >= 0; i--) {
            if (ar[i] == max) result ++;
            else break;
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int arCount = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] ar = new int[arCount];
//
//        String[] arItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < arCount; i++) {
//            int arItem = Integer.parseInt(arItems[i]);
//            ar[i] = arItem;
//        }
//
//        int result = birthdayCakeCandles(ar);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();

        int ar[] = {3, 2, 1, 3};

        int result = birthdayCakeCandles(ar);
        System.out.println("result " + result);
    }
}
