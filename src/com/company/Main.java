package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 1000;
        System.out.println(myValue);

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Vale = " + myMinIntValue);
        System.out.println("Integer Max Vale = " + myMaxIntValue);

        // Putting a larger value than what the max value causes an Overflow
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        // Putting a value smaller than the minimum value in Java causes an Underflow
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        //computer skips back to the minimum or maximum number.

        //another way to write a number albeit not commonly used
        int differentInt = 1_000_000_000;
        System.out.println(differentInt);

        //byte occupies 8 bits. Has width of 8.
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        //short occupies 16 buts. Has width of 16.
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        //long occupies 32 bits. Has width of 32.
        long myLongValue = 100L;
        System.out.println(myLongValue);
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        short bigShortLiteralValue = 32767;
        int mytTotal = (myMinIntValue /2);
        System.out.println(mytTotal);

        //byte myNewByteValue = (myMinByteValue /2); // problem occurs when number bigger than the default number

        //casting can be used to prevent these problems as it converts a number of one type to another.
        byte myNewByteValue = (byte)(myMinByteValue/2);

        short myNewShortValue = (short)(myMinShortValue /2);


        //create byte var and set to a valid byte number
        byte byteNum = 10;

        //create short var and set to valid short number
        short shortNum = 20;

        //create an int var and set to any valid int number.
        int intNum = 50;

        //create a long var and make it equal to 50000 plus 10 times the sum of the byte plus the short plus the
        // integer values.

        long longTotal = 50000L + 10 * ( byteNum + shortNum + intNum);
        System.out.println(longTotal);
    }

}
