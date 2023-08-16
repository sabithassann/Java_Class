package javahome15_08_2023;

import abstructclass.BankAccount;
import abstructclass.CheckingAccount;
import abstructclass.SavingAccount;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PassBankDataToDatabase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter D for Saving deposit and W for withdraw");

        String input = sc.nextLine();

        if (input.equalsIgnoreCase("D") || input.equalsIgnoreCase("W")) {
            processTransaction(input);
        } else {
            System.out.println("Please enter valid data D or W");
        }

        sc.close();
    }

    public static void processTransaction(String input) {
        Scanner sc = new Scanner(System.in);
        Connection connection = null;

        try {
            String url = "jdbc:mysql://localhost:3306/bankdetails";
            String username = "root";
            String password = "sabit@1234";

            connection = DriverManager.getConnection(url, username, password);

            String insertQuery = "INSERT INTO bank (accountNumber, accountHolder, balance) VALUES (?, ?, ?)";

            String accountNum, accountHolder;
            double balance, deposit, withdraw;

            if (input.equalsIgnoreCase("D")) {
                System.out.println("Enter Account Number");
                accountNum = sc.nextLine();
                System.out.println("Enter Holder name");
                accountHolder = sc.nextLine();
                System.out.println("Enter Account Balance");
                balance = sc.nextDouble();
                System.out.println("Enter Deposit Amount");
                deposit = sc.nextDouble();
                System.out.println("Enter Withdraw Amount");
                withdraw = sc.nextDouble();

                BankAccount savingAccount = new SavingAccount(accountNum, accountHolder, balance);
                savingAccount.deposit(deposit);
                savingAccount.withdraw(withdraw);
            } else {
                System.out.println("Enter Account Number");
                accountNum = sc.nextLine();
                System.out.println("Enter Holder name");
                accountHolder = sc.nextLine();
                System.out.println("Enter Account Balance");
                balance = sc.nextDouble();
                System.out.println("Enter Deposit Amount");
                deposit = sc.nextDouble();
                System.out.println("Enter Withdraw Amount");
                withdraw = sc.nextDouble();

                BankAccount checkingAccount = new CheckingAccount(accountNum, accountHolder, balance);
                checkingAccount.deposit(deposit);
                checkingAccount.withdraw(withdraw);
            }

            // Insert data into the MySQL database
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                preparedStatement.setString(1, accountNum);
                preparedStatement.setString(2, accountHolder);
                preparedStatement.setDouble(3, balance);

                int rowAffected = preparedStatement.executeUpdate();
                System.out.println(rowAffected + " row(s) inserted");
            } catch (SQLException e) {
                System.out.println(e);
            }

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
