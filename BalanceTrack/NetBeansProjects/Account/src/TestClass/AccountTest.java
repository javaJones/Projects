package TestClass;
/*
import account.Account;
import java.text.NumberFormat;
import java.util.Locale;
*/
public class AccountTest {
   
    /*
    public static void main(String[] args) {
        Account accountTest = new Account();
        Account accountTest2 = new Account(1000.00);
        boolean results = false;
        
        System.out.println("Inital Account Balances");
        System.out.printf("Account 1 Balance = %s%n", convertToMoney(accountTest.getBalance()));
        System.out.printf("Account 2 Balance = %s%n", convertToMoney(accountTest2.getBalance()));
        
        System.out.printf("%nTesting Credit Method%n%n");
        System.out.println("Add $20.00 to account 1");
        System.out.printf("Account 1 Balance = %s%n", convertToMoney(accountTest.getBalance()));
        accountTest.credit(20);
        System.out.printf("Account 1 Balance = %s%n", convertToMoney(accountTest.getBalance()));
        System.out.printf("%nAdd $512.46 to account 2%n");
        System.out.printf("Account 1 Balance = %s%n", convertToMoney(accountTest2.getBalance()));
        accountTest2.credit(512.46);
        System.out.printf("Account 1 Balance = %s%n", convertToMoney(accountTest2.getBalance()));
        
        System.out.printf("%nTesting Debit Method%n%n");
        System.out.println("Withdrawl $20.00 from account 1");
        System.out.printf("Account 1 Balance = %s%n", convertToMoney(accountTest.getBalance()));
        accountTest.debit(20);
        System.out.printf("Account 1 Balance = %s%n", convertToMoney(accountTest.getBalance()));
        System.out.printf("%nWithdrawl $512.46 from account 2%n");
        System.out.printf("Account 1 Balance = %s%n", convertToMoney(accountTest2.getBalance()));
        accountTest2.debit(512.46);
        System.out.printf("Account 1 Balance = %s%n", convertToMoney(accountTest2.getBalance()));
        
        System.out.printf("%nTesting Error Handling%n%n");
        System.out.println("Attempt to Overdraft Account 1 by withdrawaling $20.00");
        accountTest.setBalance(1);
        System.out.printf("Account 1 Balance = %s%n", convertToMoney(accountTest.getBalance()));
        results = accountTest.debit(20);
        if (results) {
           System.out.printf("No Overdraft: Account 1 Balance is currently %s%n", convertToMoney(accountTest.getBalance())); 
        } else {
            System.out.printf("Warning: Insufficent funds account balance is currently %s%n", convertToMoney(accountTest.getBalance())); 
        }

        System.out.printf("%n");
        System.out.println("Attempt to pass negative values to credit & debit methods");
        accountTest.setBalance(accountTest2.getBalance());
        System.out.printf("Account 1 Balance = %s%nAttempting to Credit -100.00%n", convertToMoney(accountTest.getBalance()));
        results = accountTest.credit(-100.00);
        if (results) {
           System.out.printf("Credit Successful: Account 1 Balance is currently %s%n", convertToMoney(accountTest.getBalance())); 
        } else {
            System.out.printf("Credit Failed: Account 1 Balance is currently %s%n", convertToMoney(accountTest.getBalance())); 
        }
        
        System.out.printf("%n");
        System.out.printf("Account 2 Balance = %s%nAttempting to Debit -0.01%n", convertToMoney(accountTest2.getBalance()));
        results = accountTest2.debit(-0.01);
        if (results) {
           System.out.printf("Debit Successful: Account 2 Balance is currently %s%n", convertToMoney(accountTest2.getBalance())); 
        } else {
            System.out.printf("Debit Failed: Account 2 Balance is currently %s%n", convertToMoney(accountTest2.getBalance())); 
        }
        
        System.out.printf("%n");
        System.out.println("Attempt to credit 0");
        System.out.printf("Account 1 Balance = %s%nAttempting to Credit 0%n", convertToMoney(accountTest.getBalance()));
        results = accountTest.debit(0);
        if (results) {
           System.out.printf("Credit Successful%n"); 
        } else {
            System.out.printf("Credit Failed%n"); 
        }
        
        System.out.printf("%n");
        System.out.println("Attempt to debit 0");
        System.out.printf("Account 2 Balance = %s%nAttempting to debit 0%n", convertToMoney(accountTest2.getBalance()));
        results = accountTest2.debit(0);
        if (results) {
           System.out.printf("Debit Successful%n"); 
        } else {
            System.out.printf("Debit Failed%n"); 
        }
    }
    
    public static String convertToMoney(double value)
    {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        return nf.format(value);
    }
*/
}
