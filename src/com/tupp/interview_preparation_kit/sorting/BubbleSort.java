package com.tupp.interview_preparation_kit.sorting;

import java.util.*;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 11/16/19.
 */
// https://www.hackerrank.com/challenges/ctci-bubble-sort/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=sorting
public class BubbleSort {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int numSwaps = 0;
        int buffer;

        for (int i = 0; i < a.length; i++) {
            for (int j = a.length-1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    buffer = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = buffer;
                    numSwaps ++;
                }
            }

        }

        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);
    }

    public static void main(String[] args) {
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] a = new int[n];
//
//        String[] aItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int aItem = Integer.parseInt(aItems[i]);
//            a[i] = aItem;
//        }
//
//        countSwaps(a);
//
//        scanner.close();

        int arr[] = {3, 2, 1};
        System.out.println("arr " + Arrays.toString(arr));
        countSwaps(arr);

    }
}
