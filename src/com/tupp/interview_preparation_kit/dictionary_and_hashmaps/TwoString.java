package com.tupp.interview_preparation_kit.dictionary_and_hashmaps;

import java.io.*;
import java.util.*;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 11/11/19.
 */
// https://www.hackerrank.com/challenges/two-strings/problem
public class TwoString {

    private static final Scanner scanner = new Scanner(System.in);

    static String twoStrings(String s1, String s2) {
        int len = s1.length() < s2.length() ? s1.length() : s2.length();
        int charExist[] = new int[26];

        // This solution on work with a-zA-Z only

        // Check chars exist in Arrays
        for (int i = 0; i < len; i++) {
            int index = s1.charAt(i) - 'a';
            charExist[index] = 1;
        }

        for (int i = 0; i < len; i++) {
            int index = s2.charAt(i) - 'a';
            if (charExist[index] > 0)
                return "YES";

        }
        return "NO";
    }

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int q = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int qItr = 0; qItr < q; qItr++) {
//            String s1 = scanner.nextLine();
//
//            String s2 = scanner.nextLine();
//
//            String result = twoStrings(s1, s2);
//
//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
//        }
//
//        bufferedWriter.close();
//
//        scanner.close();

//        Case 1
        String s1 = "a1";
        String s2 = "b1";
        String result = twoStrings(s1, s2);
        System.out.println("result " + result);
    }
}
