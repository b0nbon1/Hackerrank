/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package algorithmsDataStructures;

import algorithmsDataStructures.algorithms.sorting.BubbleSort.BubbleSort;

import java.util.Arrays;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        BubbleSort bs = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        bs.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
