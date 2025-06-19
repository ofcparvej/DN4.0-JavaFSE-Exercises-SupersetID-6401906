import java.util.*;


class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "[" + productId + ", " + productName + ", " + category + "]";
    }
}

public class ProductSearch {

    // [ --------------------------------------Searching Via ProductId------------------------------------   ]

    // Search by ID (Linear)
    public static Product linearSearch(Product[] products, int productId) {
        for (Product p : products) {
            if (p.productId == productId)
                return p;
        }
        return null;
    }

    // Search by Id (Binary Search)
    public static Product binarySearch(Product[] products, int productId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].productId == productId) {
                return products[mid];
            }

            if (products[mid].productId < productId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }


   // [-------------------------------------- Searching Via Product Name------------------------------------  ]

    //Search by Name(Linear Search)
    public static Product searchByNameLinear(Product[] products, String name) {
        name = name.toLowerCase(); // Make search case-insensitive

        for (Product product : products) {
            if (product.productName.toLowerCase().equals(name)) {
                return product;
            }
        }
        return null; // Not found
    }

    // Search by Name (Binary Search)
    public static Product searchByNameBinary(Product[] products, String name) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));   //sorted
        int left = 0, right = products.length - 1;
        name = name.toLowerCase();

        while (left <= right) {
            int mid = left + (right - left) / 2;
            String midName = products[mid].productName.toLowerCase();
            int cmp = name.compareTo(midName);  //return int
            if (cmp == 0)
                return products[mid];
            else if (cmp < 0)
                right = mid - 1; // smaller string
            else
                left = mid + 1;
        }
        return null;
    }

    // [-------------------------------------- Searching Via Product Category------------------------------  ]

    // Search by Category (Linear)
    public static List<Product> searchByCategory(Product[] products, String category) {
        List<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.category.equalsIgnoreCase(category))
                result.add(p);
        }
        return result;
    }

    // Binary Search
    public static List<Product> searchByCategoryBinary(Product[] products, String category) {
        category = category.toLowerCase();
        // Sort the array by category (case-insensitive)
        Arrays.sort(products, Comparator.comparing(p -> p.category.toLowerCase()));

        List<Product> result = new ArrayList<>();
        int left = 0;
        int right = products.length - 1;

        // Standard binary search to find one matching category
        while (left <= right) {
            int mid = left + (right - left) / 2;
            String midCategory = products[mid].category.toLowerCase();
            int cmp = category.compareTo(midCategory);

            if (cmp == 0) {
                // Match found at mid — now search adjacent elements
                // Include the mid element
                result.add(products[mid]);

                // Search left side
                int i = mid - 1;
                while (i >= 0 && products[i].category.equalsIgnoreCase(category)) {
                    result.add(0, products[i]); // Add at beginning to preserve order
                    i--;
                }

                // Search right side
                int j = mid + 1;
                while (j < products.length && products[j].category.equalsIgnoreCase(category)) {
                    result.add(products[j]);
                    j++;
                }

                return result;
            } else if (cmp < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result; // Will be empty if no match found
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Product " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Category: ");
            String category = sc.nextLine();
            products[i] = new Product(id, name, category);
        }


        System.out.println("\nSearch By:");
        System.out.println("1. ID");
        System.out.println("2. Name");
        System.out.println("3. Category");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter Product ID to search: ");
                int id = sc.nextInt();
                Product resultByIdLinear = linearSearch(products, id);
                Product resultByIdBinarySearch = binarySearch(products, id);
                System.out.println(resultByIdLinear != null ? ("LinearSearch :" + resultByIdLinear) : "Product not found (Linear Search)");
                System.out.println(resultByIdBinarySearch != null ? ("BinarySearch :" + resultByIdBinarySearch) : "Product not found  (Binary Search)");
                break;

            case 2:
                System.out.print("Enter Product Name to search: ");
                String name = sc.nextLine();
                Product resultByNameLinearSearch = searchByNameLinear(products, name);
                Product resultByNameBinarySearch = searchByNameBinary(products, name);
                System.out.println(resultByNameLinearSearch != null ? ( "Linear Search :" + resultByNameLinearSearch) : "Product not found");
                System.out.println(resultByNameBinarySearch != null ? ( "Linear Search :" + resultByNameBinarySearch) : "Product not found");
                break;

            case 3:
                System.out.print("Enter Category to search: ");
                String category = sc.nextLine();
                List<Product> resultsByCategoryLinear = searchByCategory(products, category);
                List<Product> resultsByCategoryBinary = searchByCategory(products, category);
                if (resultsByCategoryLinear.isEmpty()) {
                    System.out.println("No products found in this category.");
                } else {
                    System.out.println("Products found (Linear Search):");
                    for (Product p : resultsByCategoryLinear)
                        System.out.println(p);
                }

                if (resultsByCategoryBinary.isEmpty()) {
                    System.out.println("No products found in this category.");
                } else {
                    System.out.println("Products found (Binary Search):");
                    for (Product p : resultsByCategoryBinary)
                        System.out.println(p);
                }
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}