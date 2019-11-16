package com.tupp.interview_preparation_kit.warmup;

import java.io.*;
import java.util.*;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 11/9/19.
 */
// https://www.hackerrank.com/challenges/sock-merchant/problem
public class SockMerchant {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> numberOfSockPerColor = new HashMap();

        for(int i=0; i<n; i++){
            System.out.println("i " + i);
            int x = ar[i];

            if (!numberOfSockPerColor.containsKey(x)) {
                numberOfSockPerColor.put(x, 1);
            } else {
                numberOfSockPerColor.put(x, numberOfSockPerColor.get(x) + 1);
            }
        }

        int numberOfPair = 0;
        for (Map.Entry<Integer, Integer> entry : numberOfSockPerColor.entrySet()){
            numberOfPair += Math.floor(entry.getValue() / 2);
        }

        return numberOfPair;
    }

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] ar = new int[n];
//
//        String[] arItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int arItem = Integer.parseInt(arItems[i]);
//            ar[i] = arItem;
//        }

        int n = 9;
        int ar[] = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        int result = sockMerchant(n, ar);
        System.out.println("Result " + result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}