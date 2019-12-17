package com.tupp.algorithms.warmup;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 11/22/19.
 */
// https://www.hackerrank.com/challenges/time-conversion/problem
public class TimeConversion {
    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String result = null;
        boolean isAM = s.contains("AM");

        s = s.replaceAll("AM", "").replaceAll("PM", "");
        System.out.println("s " + s);

        String s1[] = s.split(":");
        System.out.println("s1 " + Arrays.toString(s1));

        int hour = Integer.valueOf(s1[0]);
        if (isAM) {
            if (hour == 12) hour = 0;
        } else if (!isAM) {
            if (hour != 12) hour = hour + 12;
        }
        int min = Integer.valueOf(s1[1]);
        int sec = Integer.valueOf(s1[2]);

        result = String.format("%02d", hour) + ":" + String.format("%02d", min) + ":" + String.format("%02d", sec);
        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = scan.nextLine();
//
//        String result = timeConversion(s);
//
//        bw.write(result);
//        bw.newLine();
//
//        bw.close();

        String s = "12:40:22AM";
        String result = timeConversion(s);
        System.out.println("result " + result);
    }
}
