/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */

import java.util.Scanner;

public class DATA2F {
     public static int linearSearchInt(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // found
            }
        }
        return -1; // not found
    }

    // Linear Search for Strings
    public static int linearSearchString(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(target)) { 
                return i; // found
            }
        }
        return -1; // not found
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Basic Linear Search (Numbers)
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.print("Enter a number to search: ");
        int target = sc.nextInt();
        int result = linearSearchInt(numbers, target);
        if (result != -1) {
            System.out.println("Number " + target + " found at index " + result);
        } else {
            System.out.println("Number " + target + " not found.");
        }

        // 2. Student ID Lookup
        int[] studentIDs = {2021, 2022, 2023, 2024, 2025};
        System.out.print("\nEnter a Student ID to search: ");
        int searchID = sc.nextInt();
        int idPos = linearSearchInt(studentIDs, searchID);
        if (idPos != -1) {
            System.out.println("Student ID " + searchID + " found at index " + idPos);
        } else {
            System.out.println("Student ID " + searchID + " not found.");
        }

        // 3. Library Book Finder with duplicate counting
        int[] bookCodes = {111, 222, 333, 111, 444, 111};
        System.out.print("\nEnter a Book Code to search: ");
        int searchBook = sc.nextInt();
        int count = 0;
        for (int code : bookCodes) {
            if (code == searchBook) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Book code " + searchBook + " found, copies available: " + count);
        } else {
            System.out.println("Book code " + searchBook + " not found.");
        }

        // 4. Attendance Checking (searching names)
        sc.nextLine(); // consume newline
        String[] names = {"Shaira", "Mark", "Anna", "James", "Rose"};
        System.out.print("\nEnter student name for attendance: ");
        String searchName = sc.nextLine();
        int nameIndex = linearSearchString(names, searchName);
        if (nameIndex != -1) {
            System.out.println(searchName + " is present at index " + nameIndex);
        } else {
            System.out.println(searchName + " is absent.");
        }

        sc.close();
    }
}
    