import org.mindrot.jbcrypt.BCrypt;

import java.util.Scanner;

public class BankApp {
    static UserCredentials currentUser = null;

    // run main menu
    public static void run(Scanner scanner) {
        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // consume new line

            if (choice == 1) {
                login(scanner);
            } else if (choice == 2) {
                register(scanner);
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option!");
            }
        }
    }

    // Login method
    public static void login(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // User validation--
        UserCredentials user = getUser(username);
        if (user != null && user.checkPassword(password)) {
            currentUser = user;
            System.out.println("Login successful!");
            userMenu(scanner);
        } else {
            System.out.println("Invalid username or password!");
        }
    }

    // Register method for new user**
    public static void register(Scanner scanner) {
        System.out.print("Enter new username: ");
        String username = scanner.nextLine();

        System.out.print("Enter new password: ");
        String password = scanner.nextLine();

        //  new user
        UserCredentials newUser = new UserCredentials(username, password);
        addUser(newUser);  // Add new user

        System.out.println("Registration successful!");
    }

    // User menu-
    public static void userMenu(Scanner scanner) {
        while (true) {
            System.out.println("\nUser Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Change Password");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Logout");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // new line

            if (choice == 1) {
                checkBalance();
            } else if (choice == 2) {
                changePassword(scanner);
            } else if (choice == 3) {
                depositMoney(scanner);
            } else if (choice == 4) {
                withdrawMoney(scanner);
            } else if (choice == 5) {
                System.out.println("Logging out...");
                currentUser = null;  // Log out user
                break;
            } else {
                System.out.println("Invalid option!");
            }
        }
    }

    // Check balance
    public static void checkBalance() {
        System.out.println("Your current balance is: $" + currentUser.getBalance());
    }

    // Change password method
    public static void changePassword(Scanner scanner) {
        System.out.print("Enter your current password: ");
        String oldPassword = scanner.nextLine();

        if (currentUser.checkPassword(oldPassword)) {
            System.out.print("Enter new password: ");
            String newPassword = scanner.nextLine();
            currentUser.setPassword(newPassword);
            System.out.println("Password changed successfully!");
        } else {
            System.out.println("Invalid current password!");
        }
    }

    // Deposit money method
    public static void depositMoney(Scanner scanner) {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();  // consume new line

        if (amount > 0) {
            currentUser.deposit(amount);
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    // Withdraw money method
    public static void withdrawMoney(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();  // consume new line

        if (amount > 0 && currentUser.getBalance() >= amount) {
            currentUser.withdraw(amount);
            System.out.println("Successfully withdrew $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Add user to the system (this could be stored in a database or list)
    public static void addUser(UserCredentials user) {
        //// In a real application, this would store the user in a database or a list.///
        // For simplicity, we are not implementing that part here.
    }

    // Get user by username
    public static UserCredentials getUser(String username) {
        /// In a real application, this would search a database or list.//
       /// // For simplicity, we're returning a fixed user for testing purposes.//
        if (username.equals("user1")) {
            return new UserCredentials("user1", "password1");
        }
        return null;  // User not found
    }
}
