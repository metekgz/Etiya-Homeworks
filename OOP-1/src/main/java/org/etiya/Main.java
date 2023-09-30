package org.etiya;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(1);
        product.setName("Keyboard");
        product.setDescription("Logitech Laptop");
        product.setPrice(12000);
        product.setStockAmount(2);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        Overloading overloading = new Overloading();
        System.out.println("Number: " + overloading.methodOverload(4,8));

    }
}