package com.dohnalovar;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dohnalovar on 6/23/2019
 */
public class DigitPowerSumBuilder {

    List<BigInteger> sequence = new ArrayList<>();

    public BigInteger getNthTerm(int n) throws IndexOutOfBoundsException {
        if (n>0 && n<=sequence.size())
            return sequence.get(n-1);
        throw new IndexOutOfBoundsException("Invalid sequence index: "+n);
    }

    private static DigitPowerSumBuilder ourInstance = new DigitPowerSumBuilder();

    public static DigitPowerSumBuilder getInstance() {
        return ourInstance;
    }

    private BigInteger getSumOfDigits(BigInteger number) {
        BigInteger result = BigInteger.valueOf(0);
        String s = number.toString();

        for (int i = 0; i < s.length(); i++) {
            result = result.add(BigInteger.valueOf(Long.parseLong(s.substring(i, i+1))));
        }

        return result;
    }

    private DigitPowerSumBuilder() {

        int i = 0;
        BigInteger number = BigInteger.valueOf(11);
        while (i<15) {
            //System.out.println(number);
            BigInteger sum = getSumOfDigits(number);
            if (!sum.equals(BigInteger.valueOf(1))) {
                int j = 2;
                int test;
                while ((test = sum.pow(j).compareTo(number)) < 0) {
                    j++;
                }
                if (test == 0) {
                    sequence.add(number);
                    i++;
                    System.out.println("found "+ i +". term : " + number);
                }
            }
            number = number.add(BigInteger.valueOf(1));
        }
    }

    @Override
    public String toString() {
        return "DigitPowerSumBuilder{" +
            "sequence=" + sequence +
            '}';
    }
}
