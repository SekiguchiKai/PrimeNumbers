package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
        // 2は素数
        if (targetNumber == 2) {
            return true;
        } else if (targetNumber % 2 == 0) {
            // 2以外の偶数は必ず、合成数
            return false;
        } else {
            int i = 3;
            // 自然数は自身の平方根以下の1以外の約数(割り切れるやつ)をもたなければ、素数であるから
            while (i <= Math.sqrt(targetNumber)) {
                if (targetNumber % i == 0) {
                    return false;
                }
                // 偶数にならないように
                i = i + 2;
            }
        }
        return true;
    }

}
