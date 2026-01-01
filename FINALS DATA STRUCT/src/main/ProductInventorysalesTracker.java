/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package main;

import java.util.*;

/**
 *
 * @author User
 */
public class ProductInventorysalesTracker {
    static ArrayList<Product> productList = new ArrayList<>();
    static HashMap<String, Product> productMap = new HashMap<>();
    static Queue<Sale> salesQueue = new LinkedList<>();
    static Stack<String> undoStack = new Stack<>();
    static Scanner sc = new Scanner(System.in);
    
   
    

   
    public static void main(String[] args) {
         preloadProducts();
        int choice;
        do {
            System.out.println("\n════════ PRODUCT INVENTORY & SALES TRACKER ════════");
            System.out.println("1. View Products");
            System.out.println("2. Add Product");
            System.out.println("3. Search Product");
            System.out.println("4. Sort Products by Price");
            System.out.println("5. Add Sale to Queue");
            System.out.println("6. Process Sale");
            System.out.println("7. Undo Last Action");
            System.out.println("8. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> viewProducts();
                case 2 -> addProduct();
                case 3 -> searchProduct();
                case 4 -> sortProducts();
                case 5 -> addSale();
                case 6 -> processSale();
                case 7 -> undoAction();
                case 8 -> System.out.println("Thank you for using the system!");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 8);
    }

    static void preloadProducts() {
        addDefault(new Product("01", "Rice", 55.00, 100));
        addDefault(new Product("02", "Sugar", 70.00, 80));
        addDefault(new Product("03", "Coffee", 120.00, 50));
        addDefault(new Product("04", "Milk", 65.00, 60));
        addDefault(new Product("05", "Bread", 45.00, 40));
        addDefault(new Product("06", "Flower", 60.00, 50));
        addDefault(new Product("07", "Flour", 90.00, 20));
        addDefault(new Product("08", "Wine", 450.00, 35));
        addDefault(new Product("09", "Plates", 64.00, 24));
        addDefault(new Product("10", "Chocolate", 99.00, 43));
    }

    static void addDefault(Product p) {
        productList.add(p);
        productMap.put(p.id, p);
    }

    static void viewProducts() {
        System.out.println("\nID       NAME            PRICE     QTY");
        System.out.println("────────────────────────────────────────");
        for (Product p : productList) {
            p.display();
        }
    }

    static void addProduct() {
        System.out.print("Enter Product ID: ");
        String id = sc.next();
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        Product p = new Product(id, name, price, qty);
        productList.add(p);
        productMap.put(id, p);
        undoStack.push("Added product " + id);
        System.out.println("Product successfully added!");
    }

    static void searchProduct() {
        System.out.print("Enter Product ID: ");
        String id = sc.next();
        if (productMap.containsKey(id)) {
            productMap.get(id).display();
        } else {
            System.out.println("Product not found!");
        }
    }

    static void sortProducts() {
        for (int i = 0; i < productList.size() - 1; i++) {
            for (int j = 0; j < productList.size() - i - 1; j++) {
                if (productList.get(j).price > productList.get(j + 1).price) {
                    Product temp = productList.get(j);
                    productList.set(j, productList.get(j + 1));
                    productList.set(j + 1, temp);
                }
            }
        }
        System.out.println("Products sorted by price!");
    }

    static void addSale() {
        System.out.print("Enter Product ID: ");
        String id = sc.next();
        System.out.print("Enter Quantity Sold: ");
        int qty = sc.nextInt();

        salesQueue.add(new Sale(id, qty));
        undoStack.push("Added sale for product " + id);
        System.out.println("Sale added to queue!");
    }

    static void processSale() {
        if (salesQueue.isEmpty()) {
            System.out.println("No sales to process!");
            return;
        }

        Sale sale = salesQueue.poll();
        Product p = productMap.get(sale.productId);

        if (p != null && p.quantity >= sale.quantitySold) {
            p.quantity -= sale.quantitySold;
            undoStack.push("Processed sale for product " + sale.productId);
            System.out.println("Sale processed successfully!");
        } else {
            System.out.println("Sale failed!");
        }
    }

    static void undoAction() {
        if (undoStack.isEmpty()) {
            System.out.println("No action to undo!");
        } else {
            System.out.println("Undo Action: " + undoStack.pop());
        }
    }
    
}
