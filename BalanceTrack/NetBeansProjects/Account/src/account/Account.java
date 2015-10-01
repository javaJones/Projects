package account;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;

public abstract class Account implements Serializable {

    /*
     *          Class Constructors
     */
    public Account()
    {
        setBalance(0);
    }
    
    public Account(double startingBalance)
    {
        setBalance(startingBalance);
    }
    
    public Account(double startingBalance, String accountNumber) {
        setBalance(startingBalance);
        setAccountNumber(accountNumber);
    }
    
    /*
     *          Instance Variables
     */
    double balance;
    String accountnumber;
    
    /*
     *          Get/Set Methods
     */
  
    public final boolean setBalance(double setBalanceValue)
    {
        if (setBalanceValue >= 0)
        {
            balance = setBalanceValue;
            return true;
        } else {
            return false;
        }
    }
    
    public final double getBalance()
    {
        return balance;
    }
    
    public final void setAccountNumber(String number) {
        accountnumber = number;
    }
    
    public final String getAccountNumber() {
        return accountnumber;
    }
    
    /*
     *          Class Methods
     */  
    
    public abstract boolean credit(double creditAmount);
    
    public abstract boolean debit(double debitAmount);
    
    public static String convertToMoney(double value)
    {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        return nf.format(value);
    }
    
    /* old methods
    public boolean credit(double creditAmount)
    {
        if (creditAmount > 0)
        {
            setBalance(balance + creditAmount);
            return true;
        } else {
            return false; 
        }//End if Statment
    } //End credit Method
    
    public boolean debit(double debitAmount)
    {
        if (debitAmount > 0 && !(debitAmount > getBalance()))
        {
            setBalance(balance - debitAmount);
            return true;
        } else {
            return false; 
        }//End if Statment
    }//End debit Method */
}
