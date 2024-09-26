package com.btcag.bootcamp;

public class Sortieren {
    public static void sortieren(int[] array) {

        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

public static void printArray(int[] array) {
    for (int j : array) {
        System.out.println(j + " ");
    }
        System.out.println();
    }

    public static void main(String[] arg) {

        int[] intArray = {1, 5, 3, 19, 8};
        System.out.println("Unsortiert:");
        printArray(intArray);

        sortieren(intArray);

        System.out.println("Sortiert:");
        printArray(intArray);
    }
}