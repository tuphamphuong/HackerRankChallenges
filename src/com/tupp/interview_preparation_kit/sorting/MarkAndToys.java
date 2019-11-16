package com.tupp.interview_preparation_kit.sorting;

import java.io.*;
import java.util.*;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 11/16/19.
 */
// https://www.hackerrank.com/challenges/mark-and-toys/problem
public class MarkAndToys {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        int result = 0, total = 0;
        Arrays.sort(prices);
        System.out.println("prices sorted" + Arrays.toString(prices));
        for (int i=0; i < prices.length; i++) {
            if ((total + prices[i]) < k) {
                total += prices[i];
                result ++;
                System.out.println("total " + total + " k " + k);
            } else break;

        }
        System.out.println("total " + total);
        return result;
    }

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] nk = scanner.nextLine().split(" ");
//
//        int n = Integer.parseInt(nk[0]);
//
//        int k = Integer.parseInt(nk[1]);
//
//        int[] prices = new int[n];
//
//        String[] pricesItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int pricesItem = Integer.parseInt(pricesItems[i]);
//            prices[i] = pricesItem;
//        }
//
//        int result = maximumToys(prices, k);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();

        int n = 7;
        int k = 50;
        int prices[] = {1, 12, 5, 111, 200, 1000, 10};
        System.out.println("prices " + Arrays.toString(prices));
        int result = maximumToys(prices, k);
        System.out.println("result " + result);
    }
}
