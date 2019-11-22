package com.tupp.interview_preparation_kit.miscellaneous;

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
// https://www.hackerrank.com/challenges/ctci-big-o/problem
public class Primality {
    // Complete the primality function below.
    public static String primality(int n) {
        if (n < 2) {
            return "Not prime";
        } else if (n == 2) {     // account for even numbers now, so that we can do i+=2 in loop below
            return "Prime";
        } else if (n % 2 == 0) { // account for even numbers now, so that we can do i+=2 in loop below
            return "Not prime";
        }

        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) { // skips even numbers for faster results
            if (n % i == 0) {
                return "Not prime";
            }
        }

        return "Prime";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int pItr = 0; pItr < p; pItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String result = primality(n);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
