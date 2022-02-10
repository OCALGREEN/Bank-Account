
public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(); 
        BankAccount acc2 = new BankAccount(); 

        acc1.depositCheckingBalance(5000); 
        acc1.depositSavingsBalance(2000); 
        acc1.withdrawCheckingBalance(3000); 

        acc2.depositCheckingBalance(3000); 
        acc2.depositSavingsBalance(500); 
        acc2.withdrawSavingsBalance(250); 

        System.out.println(acc1.getUserSavingsAndChecking());  
        System.out.println(acc2.getUserSavingsAndChecking()); 
        System.out.println(acc1.getTotalSavingsAndChecking()); 






    }
}