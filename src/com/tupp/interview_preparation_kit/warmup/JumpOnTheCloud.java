package com.tupp.interview_preparation_kit.warmup;

import java.io.*;
import java.util.*;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 11/12/19.
 */
// https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
public class JumpOnTheCloud {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int count = 0;
        for (int i=0; i < c.length - 1;){

            // The last jump
            if (i == (c.length -2)) {
                i++;
                count++;
                break;
            } else {
                if (c[i + 2] == 1) {
                    i += 1;
                } else {
                    i += 2;
                }
                System.out.println("i " + i);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] c = new int[n];
//
//        String[] cItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int cItem = Integer.parseInt(cItems[i]);
//            c[i] = cItem;
//        }
//
//        int result = jumpingOnClouds(c);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();

//        int c[] = {0, 0, 0, 0, 1, 0};
        int c[] = {0, 0, 0, 1, 0, 0};
        System.out.println("c[] " + Arrays.toString(c));
        int result = jumpingOnClouds(c);
        System.out.println("result " + result);
    }
}
