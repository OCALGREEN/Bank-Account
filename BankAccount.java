
public class BankAccount {

    // member variables
    private double checkingBalance = 0; 
    private double savingsBalance = 0;

    // static member variables
    public static int numOfAccounts = 0; 
    public static double totalMoneyStored = 0; 

    // constructors
    public BankAccount() {
        numOfAccounts++; 
    }

    // getters
    public double getCheckingBalance() {
        return checkingBalance; 
    }
    public double getSavingsBalance() {
        return savingsBalance; 
    }
    public String getUserSavingsAndChecking() {
        return "User's Savings Balance: " + this.savingsBalance + " Checking Balance: " + this.checkingBalance; 
    }
    public String getTotalSavingsAndChecking() {
        return "Total Number of Users: " + numOfAccounts + " Total Ammount of Cash: " + totalMoneyStored; 
    }

    // methods
    public void depositCheckingBalance(double money) {
        this.checkingBalance += money; 
        this.totalMoneyStored += money; 
    }
    public void depositSavingsBalance(double money) {
        this.savingsBalance += money; 
        this.totalMoneyStored += money; 
    }

    public void withdrawCheckingBalance(double money) {
        this.checkingBalance -= money; 
        this.totalMoneyStored -= money; 
    }
    public void withdrawSavingsBalance(double money) {
        this.savingsBalance -= money; 
        this.totalMoneyStored -= money; 
    }








}