/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class DoublyLinkedList {
        private DoublyNode head;

    public void insertAtHead(int value) {
        DoublyNode newNode = new DoublyNode(value);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertAtTail(int value) {
        DoublyNode newNode = new DoublyNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        DoublyNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    public void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        DoublyNode current = head;
        while (current != null && current.data != value) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Value " + value + " not found.");
            return;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        }
    }

    public void traverseForward() {
        DoublyNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            if (current.next == null) break; // stop at last node
            current = current.next;
        }
        System.out.println();
    }

    public void traverseBackward() {
        if (head == null) return;
        DoublyNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    
}
