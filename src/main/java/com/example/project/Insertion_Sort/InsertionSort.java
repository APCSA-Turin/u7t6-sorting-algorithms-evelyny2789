package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        for (int i = 1; i < elements.length ; i++){
            int index =i;
            int temp = elements[i]; 
            while (index > 0 && temp < elements[index - 1]){
                elements[index] = elements[index - 1]; 
                index--;
            }
            elements[index] = temp; 
        } 
        return elements; 
    }

   
    public static void selectionSort(int[] elements) {
        int count = 0; 
        for (int i = 0; i < elements.length - 1; i++){
            int min = i; 
            for (int j = i + 1; j < elements.length; j++){
                count++; 
                if (elements[j] < elements[min]){
                    min = j; 
                }
            }
            int notMin = elements[i]; 
            elements[i] = elements[min]; 
            elements[min] = notMin; 
        }
        System.out.println("Selection sort " + count);    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        for (int i = 1; i < words.size(); i++){
            String temp = words.get(i); 
            int ind = i; 
            while(ind > 0 && temp.compareTo(words.get(ind - 1)) < 0){
                words.set(ind, words.get(ind - 1)); 
                ind--; 
            }
            words.set(ind, temp); 
        }
        return words; 
    }

    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        for (int i = 0; i<words.size() -1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(j).compareTo(words.get(minIndex))<0) {
                    minIndex = j;
                }
            }
            String temp = words.get(i);
            words.set(i, words.get(minIndex));
            words.set(minIndex, temp);
        }
        return words; 
    }


    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }

}