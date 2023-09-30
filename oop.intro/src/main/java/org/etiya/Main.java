package org.etiya;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int number1;
        int number2;
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Laptop");
        //product1.price = 12000;

        Product product2 = new Product();
        // product2.id = 1;
        //product2.name = "Laptop";
        //product2.price = 12000;


        List<Product> products = new ArrayList<>();
        products.add(product1);
        for (Product producs : products) {
            System.out.println();
        }
    }
}