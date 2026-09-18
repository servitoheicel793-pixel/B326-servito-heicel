package com.joysistvi.stage3.day26;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoSimulator {

    public static void main(String[] args) {
        removeDuplicate();
    }

    public static void removeDuplicate() {
        Set<Integer> lottoNumbers = new HashSet<>();
        Random random = new Random();

        while (6 > lottoNumbers.size()) {
            int generatedRandomNumber = random.nextInt(58) + 1;
            lottoNumbers.add(generatedRandomNumber);
        }

        lottoNumbers.forEach(System.out::println);

    }
}

/*
        // Lotto: 6 numbers : 1 - 58
        Random random = new Random();
        int[] lottoNumbers = new int[6];

        for (int i = 0; i < lottoNumbers.length; i++) {
            for(int j = 0; j <= i; j++) {
                if (!(lottoNumbers[i] == lottoNumbers[j])) {
                    int generatedNum = random.nextInt(58) + 1;
                    lottoNumbers[i] = generatedNum;
                }
            }
        }

        for (int lottoNumber : lottoNumbers) {
            System.out.println(lottoNumber);
        }
 */
