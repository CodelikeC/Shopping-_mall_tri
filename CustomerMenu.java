package Menu; 
import java.util.Scanner; 
import transaction.Product; 
import transaction.Shop; 
import transaction.Sold; 
import User.Customer;

public class CustomerMenu {
    public static void displayCustomerMenu(Customer customer, Shop shop, Sold sold) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Customer Menu: " + customer.getUsername());
            System.out.println("1. View Products");
            System.out.println("2. Search Product");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    shop.displayProducts();
                    break;
                case 2:
                    scanner.nextLine(); // Clear buffer
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    Product product = shop.searchProduct(name);
                    if (product != null) {
                        System.out.println("Found: " + product);
                        sold.addTransaction(customer.getUsername() + " bought " + product.getName());
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
