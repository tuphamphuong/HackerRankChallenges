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
// https://www.hackerrank.com/challenges/staircase/problem
public class Staircase {
    // Complete the staircase function below.
    static void staircase(int n) {
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                if (j < (n - 1) - i) {
                    System.out.print(" ");
                } else System.out.print("#");

                if (j == n -1) System.out.print("\n");
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
