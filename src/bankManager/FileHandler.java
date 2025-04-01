package bankManager;

import java.io.*;
import java.util.*;

public class FileHandler {
    public static List<Account> loadAccountsFromFile(String filePath) {
        List<Account> accounts = new ArrayList<>();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] accountInfo = line.split(", ");
                String accountNumber = accountInfo[0];
                String name = accountInfo[1].replace("\"", "");
                String age = accountInfo[2].replace("\"", "");
                double balance = Double.parseDouble(accountInfo[3]);

                Account account = new Account(accountNumber, name, age, balance);
                accounts.add(account);

            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Failed to close the reader: " + e.getMessage());
            }
        }

        return accounts;
    }
}
