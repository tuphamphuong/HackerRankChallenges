package com.tupp.interview_preparation_kit.warmup;

import java.io.*;
import java.util.*;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 11/13/19.
 */
// https://www.hackerrank.com/challenges/repeated-string/problem
public class RepeatedString {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long result = 0;

        int lengthOfS = s.length();

        long numberOfAInS = countNumberOfA(s);
        System.out.println("numberOfAInS " + numberOfAInS);

        long largerNumberOfA = (n / lengthOfS) * numberOfAInS ;
        System.out.println("largerNumberOfA " + largerNumberOfA);

        long restStringLength = n % lengthOfS;
        System.out.println("restStringLength " + restStringLength);

        long restNumberOfA = 0;
        if (restStringLength != 0) {
            String theRestString = s.substring(0, (int) restStringLength);
            System.out.println("theRestString " + theRestString);

            restNumberOfA = countNumberOfA(theRestString);
            System.out.println("restNumberOfA " + restNumberOfA);
        }

        // First solution: java.lang.OutOfMemoryError: Java heap space
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < n; i ++) {
//            stringBuilder.append(s);
//        }
//        System.out.println("stringBuilder " + stringBuilder);

        result = largerNumberOfA + restNumberOfA;
        return result;
    }

    public static long countNumberOfA (String s){
        long numberOfA = 0;
        // Count number of a in s
        char c[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            System.out.println("c[i] " + c[i]);
            if (c[i] == 'a'){
                numberOfA ++;
            }
        }
        return numberOfA;
    }

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = scanner.nextLine();
//
//        long n = scanner.nextLong();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        long result = repeatedString(s, n);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//        scanner.close();

//        String s = "a";
//        long n = 1000000000000l;

        String s = "aba";
        long n = 10;

        long result = repeatedString(s, n);
        System.out.println("result " + result);

    }
}
