package com.veontomo;



import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        in.nextLine();
        String line = in.nextLine();
        int sum = Arrays.stream(line.split("\\s+", -1)).mapToInt(Integer::parseInt).sum();
        System.out.println(sum);

    }
}
