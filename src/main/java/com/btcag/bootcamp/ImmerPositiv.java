package com.btcag.bootcamp;

import java.util.Scanner;

public class ImmerPositiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib eine Zahl an:");
        int zahl = scanner.nextInt();

        if (zahl < 0) {
            zahl = zahl * -1;
        }

        System.out.println(zahl);
    }

}
