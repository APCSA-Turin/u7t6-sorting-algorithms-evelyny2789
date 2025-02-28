package com.example.project.Insertion_Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrA = {63, 99, 27, 46, 48, 45, 88};
        InsertionSort.selectionSort(arrA);
        System.out.println(Arrays.toString(arrA));
        System.out.println();
        int[] arrB = {63, 99, 27, 46, 48, 45, 88};
        InsertionSort.insertionSort(arrB);
        System.out.println(Arrays.toString(arrB));
    }
}