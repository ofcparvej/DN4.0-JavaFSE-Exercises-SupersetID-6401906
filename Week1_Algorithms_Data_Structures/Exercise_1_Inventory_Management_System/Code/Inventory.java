import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory {
    private List<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    // Method to add a product
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method to update a product
    public void updateProduct(int productId, String productName, int quantity, double price) {
        boolean found = false;
        for (Product product : products) {
            if (product.getProductId() == productId) {
                product.setProductName(productName);
                product.setQuantity(quantity);
                product.setPrice(price);
                System.out.println("Product with ID: " + productId + " updated.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Invalid Product ID: " + productId);
        }
    }

    // Method to delete a product
    public boolean deleteProduct(int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                products.remove(product);
                System.out.println("Product with ID: " + productId + " removed.");
                return true;
            }
        }
        System.out.println("Invalid Product ID: " + productId);
        return false;
    }

    // Method to display all products
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products in inventory.");
            return;
        }
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();

        // Adding Products
        char makeEntry = 'y';
        while (makeEntry == 'y') {
            System.out.println("Enter the Product Details");

            System.out.print("Product ID: ");
            int productId = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Product Name: ");
            String productName = sc.nextLine();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            Product p = new Product(productId, productName, quantity, price);
            inventory.addProduct(p);

            System.out.print("Want to add another product [y/n]: ");
            makeEntry = sc.next().charAt(0);
            sc.nextLine(); // Consume newline
            System.out.println();
        }

        // Displaying products
        System.out.println("\nProducts in inventory:");
        inventory.displayProducts();

        // Updating a product
        System.out.print("\nEnter Product ID to update: ");
        int updateId = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.println("Enter Updated Values");

        System.out.print("Updated Product Name: ");
        String newProductName = sc.nextLine();

        System.out.print("Updated Quantity: ");
        int updatedQuantity = sc.nextInt();

        System.out.print("Updated Price: ");
        double updatedPrice = sc.nextDouble();

        inventory.updateProduct(updateId, newProductName, updatedQuantity, updatedPrice);

        // Displaying products after update
        System.out.println("\nProducts in inventory after update:");
        inventory.displayProducts();

        // Deleting a product
        System.out.print("\nEnter Product ID to delete: ");
        int deleteId = sc.nextInt();
        inventory.deleteProduct(deleteId);

        // Displaying products after deletion
        System.out.println("\nProducts in inventory after deletion:");
        inventory.displayProducts();

        sc.close();
    }
}
