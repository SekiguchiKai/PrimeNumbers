package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// これだとかなり冗長で速度が遅い
public class Main {

    public static void main(String[] args) {

        int countOfPrimeNumber = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(bufferedReader.readLine());
            for (int i = 0; i < n; i++) {
                if (isPrimeNumber(Integer.parseInt(bufferedReader.readLine()))) {
                    countOfPrimeNumber++;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }


        System.out.println(countOfPrimeNumber);

    }

    private static boolean isPrimeNumber(int targetNumber) {
        int counter = 0;
        for (int i = 1; i <= targetNumber; i++) {
            if (targetNumber % i == 0) {
                counter++;
            }
        }
        // 1と自分しかない
        if (counter == 2) {
            return true;
        }
        return false;
    }
}
