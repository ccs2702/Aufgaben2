package com.btcag.bootcamp;

import java.util.Scanner;

public class Schaltjahre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jahr = scanner.nextInt();

        if (jahr % 4 == 0) {
            if (jahr % 100 == 0 && jahr % 400 != 0) {
                System.out.println(jahr + " ist kein Schaltjahr.");
            } else {
                System.out.println(jahr + " ist ein Schaltjahr.");
            }
        } else {
            System.out.println(jahr + " ist kein Schaltjahr.");
        }
    }
}
