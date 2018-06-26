/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rise;

import java.util.Scanner;

/**
 *
 * @author RadioactiveScript
 */
class CustomerInfo {

    private String name;
    private String gender;
    private int balance;
    public static Scanner sc = new Scanner(System.in);

    public CustomerInfo(String name, String gender, int balance) {
        this.name = name;
        this.gender = gender;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void showMenu(CustomerInfo c) {
        System.out.println("\n " + c.getName() + " Please choose appropriate number for following operations: ");
        System.out.println("1. For Withdraw");
        System.out.println("2. For Deposit");
        System.out.println("3. For Balance Inquiry");
        System.out.println("4. For Chnage your name");
        System.out.println("5. EXIT");

        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Enter amount to be withdrawn: ");
                int amount = sc.nextInt();
                c.withdraw(amount);
                break;
            }
            case 2: {
                System.out.println("Enter Amount to deposit: ");
                int amount = sc.nextInt();
                c.deposit(amount);
                break;
            }
            case 3: {
                System.out.println("Your current balance is: " + c.getBalance());
                break;
            }
            case 4: {
                System.out.println("Enter your new name : " + c.getName());
                String newName = sc.next();
                c.setName(newName);
            }
            break;

            case 5: {
                System.out.println("Thank you " + c.getName() + " for visiting RISE Bank");
                System.exit(0);
            }
            break;
            default:
                System.out.println("System is Busy ");
                break;
        }
        showMenu(c);
    }

    public void withdraw(int amount) {

        int temp = getBalance() - amount;
        if (temp < 0) {
            System.out.println("Not enough balance: ");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("Widthdraw Sucess.");
        }
    }

    public void deposit(int amount) {
        int Balance = getBalance();
        Balance += amount;
        setBalance(Balance);
        System.out.println("Deposit successful: ");
    }

    public void changeName(String newName) {
        setName(newName);
    }
    
    public static String getGender(String gender){
        String gender_ = "Mr. ";
        if(gender.equalsIgnoreCase("F")){
            gender_ = "Miss. ";
            return gender;
        }
        return gender_;
    }

}

public class Bank {

    public static void main(String[] args) {
        CustomerInfo customerInfo;
        Scanner sc = new Scanner(System.in);

        String name;
        String gender;
        int initialBalance;
        System.out.println("\nWelcome to RISE Bank");

        System.out.println("Enter name and gender: ");
        name = sc.next();
        gender = sc.next();

        System.out.println("Thank you " +CustomerInfo.getGender(gender)+ name);
        System.out.println("Enter your initial amount: ");
        initialBalance = sc.nextInt();

        customerInfo = new CustomerInfo(name, gender, initialBalance);
        customerInfo.showMenu(customerInfo);
    }
}
