package src.strategy;

import src.strategy.sort.MergeSort;
import src.strategy.sort.QuickSort;
import src.strategy.sort.Sorter;
import src.strategy.sort.BubbleSort;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
        Sorter sorter = new Sorter();

        int[] array = {34, 7, 23, 32, 5, 62};

        // Apply Bubble Sort
        sorter.setSorter(new BubbleSort());
        sorter.sortArray(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Apply Quick Sort
        array = new int[] {34, 7, 23, 32, 5, 62};  // Reset the array
        sorter.setSorter(new QuickSort());
        sorter.sortArray(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Apply Merge Sort
        array = new int[] {34, 7, 23, 32, 5, 62};  // Reset the array
        sorter.setSorter(new MergeSort());
        sorter.sortArray(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
	}

}
