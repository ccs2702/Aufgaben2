package com.btcag.bootcamp;

import java.util.Scanner;

public class VierGewinnt {

    public static final int zeilen = 6;
    public static final int spalten = 7;
    public static final char leer = ' ';
    public static final char spieler1 = 'X';
    public static final char spieler2 = 'O';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String spielereins;
        String spielerzwei;

        // Namen erfassen und validieren
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
        } while ((spielereins.length() < 3 || spielereins.length() > 15) || (spielerzwei.length() < 3 || spielerzwei.length() > 15));

        // Das Spielfeld wird initialisiert
        char[][] feld = new char[zeilen][spalten];

        for (int Y = 0; Y < zeilen; Y++) {

            for (int X = 0; X < spalten; X++) {
                feld[Y][X] = leer;
            }
            System.out.println();
        }

        // Spielstart
        boolean spielzug1 = true;
        boolean spielLaeuft = true;

        while (spielLaeuft) {
            Spielfeld(feld); // Spielfeld anzeigen

            char aktuellerSpieler = spielzug1 ? spieler1 : spieler2;
            String aktuellerSpielerName = spielzug1 ? spielereins : spielerzwei;

            // Zug abfragen
            System.out.println(aktuellerSpielerName + ", geben Sie eine Spalte von 1-7 an.");
            int spalte;

            while (true) {
                spalte = scanner.nextInt() - 1;

                if (spalte >= 0 && spalte < spalten && feld[0][spalte] == leer) {
                    break;
                } else {
                    System.out.println("Ungültige Eingabe. Wähle eine freie Spalte (1 - " + spalten + ".");
                }
            }

            // Steine werden platziert
            for (int zeile = zeilen - 1; zeile >= 0; zeile--) {
                if (feld[zeile][spalte] == leer) {
                    feld[zeile][spalte] = aktuellerSpieler;
                    break;
                }
            }

            // Prüfen auf Sieg oder Unentschieden
            if (sieg(feld, aktuellerSpieler)) {
                Spielfeld(feld);
                System.out.println(aktuellerSpielerName + " (" + aktuellerSpieler + ") hat gewonnen!");
                spielLaeuft = false;
            } else if (unentschieden(feld)){
                Spielfeld(feld);
                System.out.println("Das Spiel endet unentschieden!");
                spielLaeuft = false;
            }

            spielzug1 = !spielzug1; // Wechsel des Spielers
        }
    }

    // Das Spielfeld wird ausgegeben
    public static void Spielfeld(char[][] feld) {
        for (int Y = 0; Y < zeilen; Y++) {
            for (int X = 0; X < spalten; X++) {
                System.out.print("[" + feld[Y][X] + "]");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Siegesprüfung
    public static boolean sieg(char[][] feld, char spieler) {
        for (int Y = 0; Y < zeilen; Y++) {
            for (int X = 0; X < spalten - 3; X++) {
                if (feld[Y][X] == spieler && feld[Y][X + 1] == spieler && feld[Y][X + 2] == spieler && feld[Y][X + 3] == spieler) {
                    return true;
                }
            }
        }

        for (int Y = 0; Y < zeilen - 3; Y++) {
            for (int X = 0; X < spalten; X++) {
                if (feld[Y][X] == spieler && feld[Y + 1][X] == spieler && feld[Y + 2][X] == spieler && feld[Y + 3][X] == spieler) {
                    return true;
                }
            }
        }

        for (int Y = 0; Y < zeilen - 3; Y++) {
            for (int X = 0; X < spalten - 3; X++) {
                if (feld[Y][X] == spieler && feld[Y + 1][X + 1] == spieler && feld[Y + 2][X + 2] == spieler && feld[Y + 3][X + 3] == spieler) {
                    return true;
                }
            }
        }

        for (int Y = 0; Y < zeilen - 3; Y++) {
            for (int X = 3; X < spalten; X++) {
                if (feld[Y][X] == spieler && feld[Y + 1][X - 1] == spieler && feld[Y + 2][X - 2] == spieler && feld[Y + 3][X - 3] == spieler) {
                    return true;
                }
            }
        }

        return false;
    }

    // Es wird nach Unentschieden geprüft
    public static boolean unentschieden(char[][] feld) {
        for (int Y = 0; Y < zeilen; Y++) {
            if (feld[0][Y] == leer) {
                return false;
            }
        }
        return true;
    }
}


