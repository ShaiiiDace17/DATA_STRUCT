/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[10];
        int size = 5; 
        
        arr[0] = 12;
        arr[1] = 5;
        arr[2] = 30;
        arr[3] = 7;
        arr[4] = 18;

        System.out.println("Initial Array:");
        displayArray(arr, size);

        // Task 1: Insert at position (insert 99 at index 2)
        int pos = 2, value = 99;
        for (int i = size - 1; i >= pos; i--) {
            arr[i + 1] = arr[i]; // shift right
        }
        arr[pos] = value;
        size++;
        System.out.println("\nAfter Inserting 99 at index 2:");
        displayArray(arr, size);

        // Task 2: Delete at position (delete element at index 3)
        int delPos = 3;
        for (int i = delPos; i < size - 1; i++) {
            arr[i] = arr[i + 1]; // shift left
        }
        size--;
        System.out.println("\nAfter Deleting element at index 3:");
        displayArray(arr, size);

        // Task 3: Find Maximum and Minimum
        int max = arr[0], min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("\nMaximum value: " + max);
        System.out.println("Minimum value: " + min);
    }

    public static void displayArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        
    }
    
}
