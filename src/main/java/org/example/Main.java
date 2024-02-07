package org.example;

import org.example.recursion.Factorial;
import org.example.sorting.Sorting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    private static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main (String[] args) {
//        log.info("Start!");
//        for(int i = 1; i <= 5; i++) {
//            log.info("i = {}", i);
//        }
//        log.info("Finish!");

















//        // todo: recursion example
//        long value = 5;
//        Factorial factorial = new Factorial();
//        long factorialResult = factorial.factorial(value);
//        log.info("Factorial {} equal {}", value, factorialResult);






















//        // todo: sorting examples
//        int arrayLength = 1000;
//        Integer[] array = generateRandomArray(arrayLength);
//        log.info("Before sorting {}", Arrays.toString(array));
//        long startTime = System.currentTimeMillis();
//        log.info("Start time = {}", startTime);
////        // todo: bubble sorting
////        Sorting.bubbleSort(array);
////        // todo: selection sorting
////        Sorting.selectionSort(array);
////        // todo: insert sorting
////        Sorting.insertSort(array);
////        // todo: cocktail sorting
////        Sorting.cocktailSort(array);
////        // todo: quick sorting
////        Sorting.quickSort(array, 0, arrayLength - 1);
//        long endTime = System.currentTimeMillis();
//        log.info("End time = {}", endTime);
//        log.info("After sorting {}",  Arrays.toString(array));
//        log.info("TIME = {}", endTime - startTime);
    }

    public static Integer[] generateRandomArray(int n){
        List<Integer> list = new ArrayList<>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++)
        {
            list.add(random.nextInt(1000));
        }
        return list.toArray(Integer[]::new);
    }
}