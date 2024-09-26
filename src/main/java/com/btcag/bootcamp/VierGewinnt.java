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

                System.out.println("Spieler 1: \n");
                System.out.println(spielereins);
                System.out.println("Spieler 2: \n");
                System.out.println(spielerzwei);

            }
        } while ((spielereins.length() < 3 || spielereins.length() > 15) && (spielerzwei.length() < 3 || spielerzwei.length() > 15));


    }
}
