// Staff/Utils.java
package Staff;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class utils 
{
    private static final String PASSWORD_FOLDER = "password";
    private static final String SOLD_FOLDER = "sold";

    static {
        new File(PASSWORD_FOLDER).mkdir();
        new File(SOLD_FOLDER).mkdir();
    }

    public static void savePassword(String username, String password) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PASSWORD_FOLDER + "/" + username + ".txt"))) {
            bw.write(password);
        } catch (IOException e) {
            System.out.println("Error saving password: " + e.getMessage());
        }
    }

    public static String readPassword(String username) {
        try (BufferedReader br = new BufferedReader(new FileReader(PASSWORD_FOLDER + "/" + username + ".txt"))) {
            return br.readLine();
        } catch (IOException e) {
            return null;
        }
    }

    public static void saveTransaction(String transaction) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(SOLD_FOLDER + "/transactions.txt", true))) {
            bw.write(transaction + "\n");
        } catch (IOException e) {
            System.out.println("Error saving transaction: " + e.getMessage());
        }
    }
}
