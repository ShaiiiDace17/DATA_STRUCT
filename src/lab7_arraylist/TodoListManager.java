/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7_arraylist;
import java.util.*;

public class TodoListManager {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(Task t) {
        tasks.add(t);
    }

    public void removeTask(String desc) {
        tasks.removeIf(t -> t.getDescription().equalsIgnoreCase(desc));
        System.out.println("Removed task: " + desc);
    }

    public void sortByPriority() {
        tasks.sort(Comparator.comparingInt(Task::getPriority));
    }

    public void sortAlphabetically() {
        tasks.sort(Comparator.comparing(Task::getDescription));
    }

    public void displayTasks() {
        System.out.println("To-Do List:");
        for (Task t : tasks) t.display();
    }
}

