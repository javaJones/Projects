package account;

public class SavingsAccount extends Account {
    /* Constructors */
    public SavingsAccount(double vbalance, double vinterestrate)
    {
       super(vbalance);
       setInterestRate(vinterestrate);
    } 
    
    /* Instance Variables */
    double interestrate;
    
    /* Get-Set Methods */
    public final double getInterestRate()
    {
        return interestrate;
    } 
    
    public final boolean setInterestRate(double newinterestrate)
    {
        if (newinterestrate >= 0 && newinterestrate <= 1)
        {
           interestrate = newinterestrate;
           return true;
        } else {  
            return false;
        }
    } 
    
    /* Methods */
    @Override
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
    
    @Override
    public boolean debit(double debitAmount)
    {
        if (debitAmount > 0 && !(debitAmount > getBalance()))
        {
            setBalance(balance - debitAmount);
            return true;
        } else {
            return false; 
        }//End if Statment
    }//End debit Method
    
    public double calculateInterest()
    {
        return getBalance() * getInterestRate();
    } 
}
