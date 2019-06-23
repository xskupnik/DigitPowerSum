/*
The number 512 is interesting because it is equal to the sum of its digits
raised to some power: 5 + 1 + 2 = 8, and 83 = 512. Another example of a number
with this property is 614656 = 284.

We shall define an to be the nth term of this sequence and insist that a number
must contain at least two digits to have a sum.

You are given that a2 = 512 and a10 = 614656.

Find a30.

*/
package com.dohnalovar;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DigitPowerSumBuilder dps = DigitPowerSumBuilder.getInstance();
        //System.out.println(dps.getSumOfDigits(BigInteger.valueOf(512)));
        System.out.println("10th term is " + dps.getNthTerm(10));
        System.out.println(dps.toString());

        /*
        It takes TOO LONG !!!

        found 1. term : 81
        found 2. term : 512
        found 3. term : 2401
        found 4. term : 4913
        found 5. term : 5832
        found 6. term : 17576
        found 7. term : 19683
        found 8. term : 234256
        found 9. term : 390625
        found 10. term : 614656
        found 11. term : 1679616
        found 12. term : 17210368
        found 13. term : 34012224
        found 14. term : 52521875
        found 15. term : 60466176
        found 16. term : 205962976
        found 17. term : 612220032
        */
    }
}
