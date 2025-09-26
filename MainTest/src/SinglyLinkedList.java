/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class SinglyLinkedList {
     private SinglyNode head;

    public void insertAtHead(int value) {
        SinglyNode newNode = new SinglyNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtTail(int value) {
        SinglyNode newNode = new SinglyNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        SinglyNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.data == value) {
            head = head.next;
            return;
        }
        SinglyNode current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Value " + value + " not found.");
        }
    }

    public void traverseForward() {
        SinglyNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
}
