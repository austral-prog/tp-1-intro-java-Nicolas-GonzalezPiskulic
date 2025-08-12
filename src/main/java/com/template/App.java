package com.template;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        // TODO: Implement this method
        return (a + b);
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        // TODO: Implement this method
        return !(1==(number % 2));
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        // TODO: Implement this method
        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        } else {
            return 0;
        }
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        // TODO: Implement this method
        int boo = 1;
        int fer = n;
        while (fer > 0) {
            boo = boo * fer;
            fer -= 1;
        }
        return boo;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        // TODO: Implement this method
        return input.length();
    }

    // 6. Reverse a String
    public String reverse(String input) {
        // TODO: Implement this method
        return (new StringBuilder(input)).reverse().toString();
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        // TODO: Implement this method
        for ( int i = 2; i<number; i++) {
            if (number % i == 0) {
            return false;
            }
            }
        return true;
        }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        // TODO: Implement this method
        int buffer = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < buffer) {
                buffer = array[i];
            }
        }
    return buffer;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        // TODO: Implement this method
        int buffer = 0;
        for (int i = 0; i < array.length; i++) {
            buffer += array[i];
        }
    return buffer;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        // TODO: Implement this method
        return (((celsius*9)/5)+32);
    }
}
