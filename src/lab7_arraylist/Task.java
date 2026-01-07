/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7_arraylist;

public class Task {
    private String description;
    private int priority; // 1 = high, 2 = medium, 3 = low

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() { return description; }
    public int getPriority() { return priority; }

    public void display() {
        System.out.println("Task: " + description + " | Priority: " + priority);
    }
}

