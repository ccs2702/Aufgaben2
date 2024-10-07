package com.btcag.bootcamp;

public class Turmspiel {
    public static void move(int n, int [][] stab, int startStab, int endStab, int extraStab) {

        if (n == 0) {
            return;
        }

        move(n - 1, stab, startStab, endStab, extraStab);

        moveScheibe(stab, startStab, endStab);

        move(n-1, stab, extraStab, endStab, startStab);
    }

    public static void moveScheibe(int[][] stab, int stab1, int stab2) {

    }

    public static void main(String[] args) {
        int [][] stab = {
                {1, 2, 3, 4},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
    }
}
