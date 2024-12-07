// Menu/SellerMenu.java
package Menu;

import User.Seller;
import transaction.Product;
import java.util.Scanner;
import transaction.Shop;
import transaction.Sold;
import Menu.SellerMenu; 
public class SellerMenu 
{
    public static void displaySellerMenu(Seller seller, Shop shop) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Seller Menu: " + seller.getUsername());
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    scanner.nextLine(); // Clear buffer
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();

                    scanner.nextLine(); // Clear buffer
                    System.out.print("Enter category (ELECTRONICS, FASHION, GROCERY, HOME, SPORTS): ");

                    category category = category.valueOf(scanner.nextLine().toUpperCase());
                    shop.addProduct(new Product(name, price, category));

                    System.out.println("Product added.");
                    break;
                case 2:
                    shop.displayProducts();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}