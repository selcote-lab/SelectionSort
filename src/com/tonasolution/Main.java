package com.tonasolution;

public class Main {

    public static void main(String[] args) {

        int[] array = { 20, 35, -15, 7, 55, 1, -22 };


        for ( int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex --) {

            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {

                if (array[i] > array[largest]) {
                    largest = i;
                }

                if(i == lastUnsortedIndex) {
                    swap(array, largest, lastUnsortedIndex);
                }


            }
        }


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void swap(int[] array, int i, int j) {

        if(i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
