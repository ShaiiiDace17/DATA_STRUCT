/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7_arraylist;

import java.util.*;

public class ProductInventory {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void removeProduct(String name) {
        products.removeIf(p -> p.getName().equalsIgnoreCase(name));
        System.out.println("Removed product: " + name);
    }

    public void sortByPrice() {
        products.sort(Comparator.comparingDouble(Product::getPrice));
    }

    public void displayAll() {
        System.out.println("Product List:");
        for (Product p : products) p.display();
    }

    public double computeTotalValue() {
        double total = 0;
        for (Product p : products) total += p.totalValue();
        return total;
    }
}
