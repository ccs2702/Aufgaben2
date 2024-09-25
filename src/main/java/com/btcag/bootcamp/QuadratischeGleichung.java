package com.btcag.bootcamp;

import java.util.Scanner;

public class QuadratischeGleichung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib einen Wert für a an.");
        double a = scanner.nextDouble();
        System.out.println("Gib einen Wert für b an.");
        double b = scanner.nextDouble();
        System.out.println("Gib einen Wert für c an.");
        double c = scanner.nextDouble();

        double rechnung = b * b - 4 * a * c;

        if (rechnung > 0) {
            System.out.println("Es gibt 2 Lösungen.");
        } else if (rechnung == 0) {
            System.out.println("Es gibt 1 Ergebnisse.");
        } else {
            System.out.println("Es gibt 0 Ergebnisse.");
        }
    }
}
