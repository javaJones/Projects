package account;

public class CheckingAccount extends Account {
    /* Constructors */
    public CheckingAccount(double vbalance, double vfee)
    {
       super(vbalance);
       setFee(vfee);
    } 
    
    public CheckingAccount(double vbalance, double vfee, String accountNumber) {
        super(vbalance, accountNumber);
        setFee(vfee);
    }
    
    /* Instance Variables */
    double fee;
    
    /* Get-Set Methods */
    public final double getFee()
    {
        return fee;
    } 
    
    public final boolean setFee(double vfee)
    {
        if (vfee >= 0)
        {
           fee = vfee;
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
        if ((debitAmount + getFee()) > 0 && !((debitAmount + getFee()) > getBalance()))
        {
            setBalance(balance - (debitAmount + getFee()));
            return true;
        } else {
            return false; 
        }//End if Statment
    }//End debit Method
    
}
