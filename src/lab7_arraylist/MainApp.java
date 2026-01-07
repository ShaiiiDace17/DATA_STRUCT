/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7_arraylist;

/**
 *
 * @author caryd
 */

public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== LAB 7: USING ARRAYLISTS ===");

        // ===============================
        // Task 1 & 2: Students
        // ===============================
        StudentManager sm = new StudentManager();
        sm.addStudent(new Student(101, "Alice", 90.0));
        sm.addStudent(new Student(102, "Ben", 85.5));
        sm.addStudent(new Student(103, "Carla", 95.0));
        sm.displayAll();

        sm.updateGrade(102, 88.0);
        sm.sortByGradeDescending();
        System.out.println("\nSorted by Grade (Descending):");
        sm.displayAll();

        sm.sortByName();
        System.out.println("\nSorted by Name (Alphabetical):");
        sm.displayAll();

        sm.removeById(101);
        sm.displayAll();

        // ===============================
        // Practice Problem 2: Product Inventory
        // ===============================
        System.out.println("\n=== PRODUCT INVENTORY ===");
        ProductInventory pi = new ProductInventory();
        pi.addProduct(new Product("Laptop", 55000, 2));
        pi.addProduct(new Product("Mouse", 500, 10));
        pi.addProduct(new Product("Keyboard", 1200, 5));
        pi.displayAll();
        System.out.println("Total Inventory Value: ₱" + pi.computeTotalValue());
        pi.sortByPrice();
        System.out.println("\nAfter sorting by price:");
        pi.displayAll();

        // ===============================
        // Practice Problem 3: To-Do List Manager
        // ===============================
        System.out.println("\n=== TO-DO LIST MANAGER ===");
        TodoListManager todo = new TodoListManager();
        todo.addTask(new Task("Finish Lab 7", 1));
        todo.addTask(new Task("Review Notes", 3));
        todo.addTask(new Task("Submit Report", 2));
        todo.displayTasks();

        System.out.println("\nSorted by Priority:");
        todo.sortByPriority();
        todo.displayTasks();

        System.out.println("\nSorted Alphabetically:");
        todo.sortAlphabetically();
        todo.displayTasks();
    }
}

