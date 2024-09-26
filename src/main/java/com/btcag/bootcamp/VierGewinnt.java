package com.btcag.bootcamp;

import java.util.Scanner;

public class VierGewinnt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String spielereins;
        String spielerzwei;

        do {
            System.out.println("Gib den Namen für Spieler 1 an: ");
            spielereins = scanner.nextLine();
            System.out.println("Gib den Namen für Spieler 2 an: ");
            spielerzwei = scanner.nextLine();

            if ((spielereins.length() < 3 || spielereins.length() > 15) || (spielerzwei.length() < 3 || spielerzwei.length() > 15)) {

                System.out.println("Der Name darf nicht weniger als 3 Zeichen, oder mehr als 15 Zeichen lang sein.");

            } else {

                System.out.println("Spieler 1:");
                System.out.println(spielereins + "\n");
                System.out.println("Spieler 2:");
                System.out.println(spielerzwei + "\n");

            }
        } while ((spielereins.length() < 3 || spielereins.length() > 15) && (spielerzwei.length() < 3 || spielerzwei.length() > 15));

        int zeilen = 6;
        int spalten = 7;

        for (int Y = 0; Y < zeilen; Y++) {

            for (int X = 0; X < spalten; X++) {
                System.out.print("[ ] ");
            }
            System.out.println();
        }
    }
}
