package org.example.sorting;

public class Sorting {

    public static void bubbleSort(Integer[] array) {
        boolean isSorted = false;
        int temp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    public static void selectionSort(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            int position = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    position = j;
                    min = array[j];
                }
            }
            array[position] = array[i];
            array[i] = min;
        }
    }

    public static void insertSort(Integer[] array) {
        for (int left = 0; left < array.length; left++) {
            int key = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (key < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = key;
        }
    }

    public static void cocktailSort(Integer[] array) {
        boolean isSwapped = true;
        int start = 0;
        int end = array.length;

        while (isSwapped == true) {
            isSwapped = false;
            for (int i = start; i < end - 1; ++i) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSwapped = true;
                }
            }
            if (isSwapped == false)
                break;
            isSwapped = false;
            end = end - 1;

            for (int i = end - 1; i >= start; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSwapped = true;
                }
            }
            start = start + 1;
        }
    }

    public static void quickSort(Integer[] array, int low, int high) {
        if (low >= high) return;
        int pivot = array[low + (high - low) / 2];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) quickSort(array, low, j);
        if (high > i) quickSort(array, i, high);
    }
}
