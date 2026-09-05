import java.util.*;

class Account {
    private int accountNumber;
    private String holderName;
    private double balance;

    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }

    public void displayAccount() {
        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : ₹" + balance);
    }
}

public class BankAccountManagement {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Account> accounts = new ArrayList<>();

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== BANK ACCOUNT MANAGEMENT =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    createAccount();
                    break;

                case 2:
                    depositMoney();
                    break;

                case 3:
                    withdrawMoney();
                    break;

                case 4:
                    checkBalance();
                    break;

                case 5:
                    displayAllAccounts();
                    break;

                case 6:
                    System.out.println("Thank you for using the Bank System!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }

    static void createAccount() {

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        Account account = new Account(accNo, name, balance);

        accounts.add(account);

        System.out.println("Account created successfully!");
    }

    static Account findAccount(int accNo) {

        for (Account account : accounts) {

            if (account.getAccountNumber() == accNo) {
                return account;
            }
        }

        return null;
    }

    static void depositMoney() {

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        Account account = findAccount(accNo);

        if (account != null) {

            System.out.print("Enter amount to deposit: ");
            double amount = sc.nextDouble();

            account.deposit(amount);

        } else {
            System.out.println("Account not found!");
        }
    }

    static void withdrawMoney() {

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        Account account = findAccount(accNo);

        if (account != null) {

            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);

        } else {
            System.out.println("Account not found!");
        }
    }

    static void checkBalance() {

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        Account account = findAccount(accNo);

        if (account != null) {
            account.displayAccount();
        } else {
            System.out.println("Account not found!");
        }
    }

    static void displayAllAccounts() {

        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
            return;
        }

        System.out.println("\n===== ALL ACCOUNTS =====");

        for (Account account : accounts) {
            account.displayAccount();
        }
    }
}