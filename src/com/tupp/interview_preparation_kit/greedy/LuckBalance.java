package com.tupp.interview_preparation_kit.greedy;

import java.io.*;
import java.util.*;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 11/15/19.
 */
// https://www.hackerrank.com/challenges/luck-balance/problem
public class LuckBalance {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {
        int result = 0;
        int totalLuck = 0;
        int totalUnimportantLuck = 0;
        int totalImportantLuck = 0;
        int totalImportantLoseLuck = 0;

        List<List<Integer>> importantContests = new ArrayList<>();
        for (int[] contest : contests) {
            List<Integer> aContest = new ArrayList<>();
            aContest.add(contest[0]);
            aContest.add(contest[1]);

            if (contest[1] == 1) {
                importantContests.add(aContest);
                totalImportantLuck += contest[0];
            } else totalUnimportantLuck += contest[0];

            totalLuck += contest[0];
        }
        System.out.println("importantContests " + importantContests + " totalLuck " + totalLuck + " totalUnimportantLuck " + totalUnimportantLuck + " totalImportantLuck " + totalImportantLuck);
        result = totalLuck;

        if (importantContests.size() == 0) return result;

        importantContests.sort((o1, o2) -> {
            int a = o1.get(0);
            int b = o2.get(0);
            return a < b ? -1 : a == b ? 0 : 1;
        });
        System.out.println("importantContests sorted" + importantContests);

        for (int i = 0; i < (importantContests.size() - k); i++) {
            System.out.println("i " + i + " k " + k + " totalImportantLoseLuck " + totalImportantLoseLuck);
            totalImportantLoseLuck += importantContests.get(i).get(0);
            result = result - (2 * importantContests.get(i).get(0));
        }
        System.out.println("totalImportantLoseLuck " + totalImportantLoseLuck);

        return result;
    }

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] nk = scanner.nextLine().split(" ");
//
//        int n = Integer.parseInt(nk[0]);
//
//        int k = Integer.parseInt(nk[1]);
//
//        int[][] contests = new int[n][2];
//
//        for (int i = 0; i < n; i++) {
//            String[] contestsRowItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int j = 0; j < 2; j++) {
//                int contestsItem = Integer.parseInt(contestsRowItems[j]);
//                contests[i][j] = contestsItem;
//            }
//        }
//
//        int result = luckBalance(k, contests);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();

        int k = 3;
        int contests[][] = {
                {5, 1},
                {2, 1},
                {1, 1},
                {8, 1},
                {10, 0},
                {5, 0},
        };
        System.out.println("contests " + Arrays.toString(contests));

        int result = luckBalance(k, contests);
        System.out.println("result " + result);
    }
}
