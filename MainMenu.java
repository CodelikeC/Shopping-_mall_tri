package Menu; 
import Menu.CustomerMenu; 
import Menu.SellerMenu; 
import java.util.Scanner; 
import transaction.Shop; 
import transaction.Sold; 
import User.Customer; 
import User.Seller;
public class MainMenu {
    public static void displayMenu() 
    {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();
        Sold sold = new Sold();

        while (true) {
            System.out.println("Welcome to Online Shopping Mall");
            System.out.println("1. Login as Customer");
            System.out.println("2. Login as Seller");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String customerUsername = scanner.nextLine();
                    Customer customer = new Customer(customerUsername);
                    CustomerMenu.displayCustomerMenu(customer, shop, sold);
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    String sellerUsername = scanner.nextLine();
                    Seller seller = new Seller(sellerUsername);
                    SellerMenu.displaySellerMenu(seller, shop);
                    break;
                case 3:
                    System.out.println("Thank you for visiting!");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}

