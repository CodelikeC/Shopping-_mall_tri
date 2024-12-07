// Transaction/Sold.java
package transaction;

import java.util.ArrayList;
import java.util.List;

import Staff.utils;

public class Sold 
{
    private List<String> transactions = new ArrayList<>();

    public void addTransaction(String transaction) {
        transactions.add(transaction);
        utils.saveTransaction(transaction);
    }

    public void displayTransactions() {
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
