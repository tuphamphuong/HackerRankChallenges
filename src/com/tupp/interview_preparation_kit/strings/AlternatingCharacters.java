package com.tupp.interview_preparation_kit.strings;

import java.io.*;
import java.util.*;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 11/14/19.
 */
public class AlternatingCharacters {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        int result = 0;

        char lastValidChar = s.charAt(0);

        for (int i = 1; i < s.length(); i++){
            if (lastValidChar == s.charAt(i)) {
                result ++;
            } else {
                lastValidChar = s.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int q = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int qItr = 0; qItr < q; qItr++) {
//            String s = scanner.nextLine();
//
//            int result = alternatingCharacters(s);
//
//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
//        }
//
//        bufferedWriter.close();
//
//        scanner.close();

        String s = "AAAA";

        int result = alternatingCharacters(s);
        System.out.println("\nresult " + result);
    }
}
