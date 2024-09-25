package com.btcag.bootcamp;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib eine Stelle der Fibonaccifolge an: ");
        int zahl = scanner.nextInt();
        System.out.println("Gib ein limit an, wie viele Stellen der Fibonaccifolge ausgeführt werden sollen: ");
        int limit = scanner.nextInt();

        while (zahl < limit) {
            zahl++;
            int result = fibonacci(zahl);
            System.out.println(zahl + ": " + result);
        }
    }
}
