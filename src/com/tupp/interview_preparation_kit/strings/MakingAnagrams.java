package com.tupp.interview_preparation_kit.strings;

import java.io.*;
import java.util.*;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 11/14/19.
 */
// https://www.hackerrank.com/challenges/making-anagrams/problem
public class MakingAnagrams {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int result = 0;

        Map<Character, Integer> aMap = new HashMap<Character, Integer>();
        for (char c : a.toCharArray()) {
            if (!aMap.containsKey(c)) aMap.put(c, 1);
            else aMap.put(c, (aMap.get(c) + 1));
        }
        int lengthOfA = 0;
        for(Map.Entry<Character, Integer> e: aMap.entrySet()){
            System.out.println("aMap key " + e.getKey() + " value " + e.getValue());
            lengthOfA += e.getValue();
        }
        System.out.println("a lengh " + a.length() + " lengthOfA " + lengthOfA);

        System.out.println("\n");

        Map<Character, Integer> bMap = new HashMap<Character, Integer>();
        for (char c : b.toCharArray()) {
            if (!bMap.containsKey(c)) bMap.put(c, 1);
            else bMap.put(c, (bMap.get(c) + 1));
        }
        int lengthOfB = 0;
        for(Map.Entry<Character, Integer> e: bMap.entrySet()){
            System.out.println("bMap key " + e.getKey() + " value " + e.getValue());
            lengthOfB += e.getValue();
        }
        System.out.println("b lengh " + b.length() + " lengthOfB " + lengthOfB);


        for (Map.Entry<Character, Integer> entry : aMap.entrySet()) {
            if (!bMap.containsKey(entry.getKey())) {
                result += entry.getValue();
            } else if (entry.getValue() != bMap.get(entry.getKey())) {
                // Just do it one time for both
                result += Math.abs(entry.getValue() - bMap.get(entry.getKey()));
            }
        }
        for (Map.Entry<Character, Integer> entry : bMap.entrySet()) {
            if (!aMap.containsKey(entry.getKey())) {
                result += entry.getValue();
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String a = scanner.nextLine();
//
//        String b = scanner.nextLine();
//
//        int res = makeAnagram(a, b);
//
//        bufferedWriter.write(String.valueOf(res));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();

//        String a = "cde";
//        String b = "abc";

        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

        int res = makeAnagram(a, b);
        System.out.println("\nres " + res);
    }
}

