import org.mindrot.jbcrypt.BCrypt;

public class UserCredentials {
    private String username;  //  username
    private String passwordHash;  //  hashed password
    private double balance;  // account balance

    // Constructor: Username, password
    public UserCredentials(String username, String password) {
        this.username = username;
        this.passwordHash = BCrypt.hashpw(password, BCrypt.gensalt());  // Hash password
        this.balance = 1000;  // Give  1000 dollars
    }

    // Validate  password
    public boolean checkPassword(String password) {
        return BCrypt.checkpw(password, this.passwordHash);
    }

    // Change the user's password
    public void setPassword(String newPassword) {
        this.passwordHash = BCrypt.hashpw(newPassword, BCrypt.gensalt());
    }

    // (Deposit money)
    public void deposit(double amount) {
        this.balance += amount;
    }

    //  (Withdraw money)
    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // balance
    public double getBalance() {
        return this.balance;
    }

    // Get the username  the user///
    public String getUsername() {
        return username;
    }
}
