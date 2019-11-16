package com.tupp.interview_preparation_kit.dictionary_and_hashmaps;

import java.util.*;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 11/14/19.
 */
// https://www.hackerrank.com/challenges/ctci-ransom-note
public class RansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        String result = "Yes";

        Map<String, Integer> magazineMap = new HashMap<String, Integer>();
        for (String s : magazine) {
            if (!magazineMap.containsKey(s)) magazineMap.put(s, 1);
            else magazineMap.put(s, magazineMap.get(s) + 1);
        }

//        for(Map.Entry<String, Integer> e: magazineMap.entrySet()){
//            System.out.println("magazineMap key " + e.getKey() + " value " + e.getValue());
//        }

        Map<String, Integer> noteMap = new HashMap<String, Integer>();
        for (String s : note) {
            if (!noteMap.containsKey(s)) noteMap.put(s, 1);
            else noteMap.put(s, noteMap.get(s) + 1);
        }

//        for(Map.Entry<String, Integer> e: noteMap.entrySet()){
//            System.out.println("magazineMap key " + e.getKey() + " value " + e.getValue());
//        }

        for (Map.Entry<String, Integer> entry : noteMap.entrySet()) {
            if (!magazineMap.containsKey(entry.getKey())) {
                result = "No";
                break;
            } else if (entry.getValue() > magazineMap.get(entry.getKey())) {
                result = "No";
                break;
            }
        }

        System.out.println(result);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        String[] mn = scanner.nextLine().split(" ");
//
//        int m = Integer.parseInt(mn[0]);
//
//        int n = Integer.parseInt(mn[1]);
//
//        String[] magazine = new String[m];
//
//        String[] magazineItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < m; i++) {
//            String magazineItem = magazineItems[i];
//            magazine[i] = magazineItem;
//        }
//
//        String[] note = new String[n];
//
//        String[] noteItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            String noteItem = noteItems[i];
//            note[i] = noteItem;
//        }
//
//        checkMagazine(magazine, note);
//
//        scanner.close();

        String magazine[] = {"give", "me", "one", "grand", "today", "night"};
        String note[] = {"give", "me", "one", "grand"};
        checkMagazine(magazine, note);
    }
}

