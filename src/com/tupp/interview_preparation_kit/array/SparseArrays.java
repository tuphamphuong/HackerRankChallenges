package com.tupp.interview_preparation_kit.array;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 12/17/19.
 */
// https://www.hackerrank.com/challenges/sparse-arrays/problem
public class SparseArrays {
    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] arr = new int[queries.length];

        for (int i= 0; i < strings.length; i++){

        }

        return arr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int stringsCount = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        String[] strings = new String[stringsCount];
//
//        for (int i = 0; i < stringsCount; i++) {
//            String stringsItem = scanner.nextLine();
//            strings[i] = stringsItem;
//        }
//
//        int queriesCount = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        String[] queries = new String[queriesCount];
//
//        for (int i = 0; i < queriesCount; i++) {
//            String queriesItem = scanner.nextLine();
//            queries[i] = queriesItem;
//        }

        String[] strings = {"aba", "baba", "aba", "xzxb"};
        String[] queries = {"aba", "xzxb", "ab"};
        int[] res = matchingStrings(strings, queries);
        System.out.println("res " + Arrays.toString(res));

//        for (int i = 0; i < res.length; i++) {
//            bufferedWriter.write(String.valueOf(res[i]));
//
//            if (i != res.length - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
