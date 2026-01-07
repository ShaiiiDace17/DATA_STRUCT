/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7_arraylist;

import java.util.*;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void updateGrade(int id, double newGrade) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setGrade(newGrade);
                System.out.println("Updated " + s.getName() + "'s grade to " + newGrade);
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void removeById(int id) {
        students.removeIf(s -> s.getId() == id);
        System.out.println("Removed student with ID " + id);
    }

    public void searchByName(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                s.display();
                return;
            }
        }
        System.out.println("No student found with name " + name);
    }

    public void sortByGradeDescending() {
        students.sort((a, b) -> Double.compare(b.getGrade(), a.getGrade()));
    }

    public void sortByName() {
        students.sort(Comparator.comparing(Student::getName));
    }

    public void displayAll() {
        System.out.println("Student Records:");
        for (Student s : students) s.display();
    }
}
