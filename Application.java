import java.util.Scanner;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        MetierProduitImpl metier = new MetierProduitImpl();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;


        metier.getAll();

        while (running) {
            System.out.println("\n--- PRODUCT MANAGEMENT MENU ---");
            System.out.println("1. Display the list of products");
            System.out.println("2. Search for a product by ID");
            System.out.println("3. Add a new product");
            System.out.println("4. Delete a product by ID");
            System.out.println("5. Save products to file");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    List<Product> list = metier.getAll();
                    if (list.isEmpty()) System.out.println("No products found.");
                    else list.forEach(System.out::println);
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    long idSearch = scanner.nextLong();
                    Product p = metier.findById(idSearch);
                    System.out.println(p != null ? p : "Product not found.");
                    break;

                case 3:
                    System.out.print("ID: "); long id = scanner.nextLong();
                    scanner.nextLine();
                    System.out.print("Name: "); String name = scanner.nextLine();
                    System.out.print("Brand: "); String brand = scanner.nextLine();
                    System.out.print("Price: "); double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Description: "); String desc = scanner.nextLine();
                    System.out.print("Stock: "); int stock = scanner.nextInt();

                    metier.add(new Product(id, name, brand, price, desc, stock));
                    System.out.println("Product added to list (don't forget to Save!).");
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    long idDel = scanner.nextLong();
                    metier.delete(idDel);
                    System.out.println("Product removed.");
                    break;

                case 5:
                    metier.saveAll();
                    System.out.println("Data saved to products.dat successfully.");
                    break;

                case 6:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}
