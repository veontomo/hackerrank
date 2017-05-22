package com.veontomo;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        in.nextLine();
        String line = in.nextLine();


        int[] numbers = Arrays.stream(line.split("\\s+", -1)).mapToInt(Integer::parseInt).toArray();
        insertIntoSorted2(numbers);

    }

    private static void insertIntoSorted2(int[] ar) {
        for (int i = 1; i < ar.length; i++) {
            insertIntoSorted(ar, i);
            printArray(ar);
        }
    }

    private static void insertIntoSorted(int[] numbers, int pos) {
//        int pos = numbers.length - 1;
        int elem = numbers[pos];
        while (pos > 0 && numbers[pos - 1] > elem) {
            numbers[pos] = numbers[pos - 1];
            pos--;
        }
        numbers[pos] = elem;
    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
