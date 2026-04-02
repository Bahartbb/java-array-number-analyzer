package com.bahar;

public class App {
    public static void main(String[] args) {

        int[] numbers = {4, 7, 2, 9, 1, 8};

        System.out.println("Numbers:");
        ArrayAnalyzer.printNumbers(numbers);

        System.out.println("------------");

        int sum = ArrayAnalyzer.sumNumbers(numbers);
        System.out.println("Sum: " + sum);

        int max = ArrayAnalyzer.findMax(numbers);
        System.out.println("Max: " + max);

        int min = ArrayAnalyzer.findMin(numbers);
        System.out.println("Min: " + min);

        double average = ArrayAnalyzer.averageNumbers(numbers);
        System.out.println("Average: " + average);


        int evenCount = ArrayAnalyzer.countEvenNumbers(numbers);
        System.out.println("Even numbers: " + evenCount);

        int oddCount = ArrayAnalyzer.countOddNumbers(numbers);
        System.out.println("Odd numbers: " + oddCount);
    }
}