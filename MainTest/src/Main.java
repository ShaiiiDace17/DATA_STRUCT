/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== Singly Linked List ===");
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertAtHead(10);
        sll.insertAtTail(20);
        sll.insertAtTail(30);
        System.out.print("Forward: ");
        sll.traverseForward();
        sll.deleteByValue(20);
        System.out.print("After deleting 20: ");
        sll.traverseForward();

        System.out.println("\n=== Doubly Linked List ===");
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtHead(5);
        dll.insertAtTail(15);
        dll.insertAtTail(25);
        System.out.print("Forward: ");
        dll.traverseForward();
        System.out.print("Backward: ");
        dll.traverseBackward();
        dll.deleteByValue(15);
        System.out.print("After deleting 15 (Forward): ");
        dll.traverseForward();
        System.out.print("After deleting 15 (Backward): ");
        dll.traverseBackward();
    }
    }
    

