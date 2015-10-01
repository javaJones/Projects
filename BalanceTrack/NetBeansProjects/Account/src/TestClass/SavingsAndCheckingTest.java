package TestClass;

import account.Account;
import account.CheckingAccount;
import account.SavingsAccount;


public class SavingsAndCheckingTest {
    
    public static void main(String[] args) {
        /* Variables */
        CheckingAccount checking = new CheckingAccount(0,0);
        SavingsAccount savings = new SavingsAccount(0,.06);        
        System.out.println("Inital Account Balances");
        System.out.printf("Checking Balance = %s%n", Account.convertToMoney(checking.getBalance()));
        System.out.printf(" Savings Balance = %s%n", Account.convertToMoney(savings.getBalance()));
        
        /* Test Get Set Methods */
        System.out.printf("%n");
        System.out.println("Set & Get Balances");
        System.out.printf("Set Checking Balance = $100.00");
        if (checking.setBalance(100)) { System.out.printf("  - Successful; Checking Balance %s%n", Account.convertToMoney(checking.getBalance())); 
        } else { System.out.printf("  - Failed%n"); }
        System.out.printf("Set Savings Balance  = $100.00");
        if (savings.setBalance(100)) { System.out.printf("  - Successful; Savings Balance %s%n", Account.convertToMoney(savings.getBalance())); 
        } else { System.out.printf("  - Failed%n"); }
        
        /* Savings Test */
        System.out.printf("%n");
        System.out.println("Test Savings Class");
        System.out.printf("Set Interest Rate  = .1");
        savings.setInterestRate(.1);
        System.out.printf(", Interest Rate is now %s%n", savings.getInterestRate()); 
        System.out.printf("Set Interest Rate  = 1.1,");
        if (savings.setInterestRate(1.1)) { System.out.printf("  - Successful; Interest Rate is now %s%n", savings.getInterestRate());
        } else { System.out.printf("  - Failed; Not a valid Interest Range%n"); }
        System.out.printf("Set Interest Rate  = -.1,");
        if (savings.setInterestRate(-.1)) { System.out.printf("  - Successful; Interest Rate is now %s%n", savings.getInterestRate());
        } else { System.out.printf("  - Failed; Not a valid Interest Range%n"); }
        System.out.printf("Balance is %s, Interest Rate is %s, Calculated Interest is %s%n", Account.convertToMoney(savings.getBalance()), savings.getInterestRate(), Account.convertToMoney(savings.calculateInterest()));
        System.out.printf("%nTest Debit Method %n");
        System.out.printf("           Balance is %s%n", Account.convertToMoney(savings.getBalance())); 
        System.out.printf("   Amount to Debit is $5.00%n");
        if (savings.debit(5)) { System.out.printf("       New Balance is %s%n%n", Account.convertToMoney(savings.getBalance())); 
        } else { System.out.printf("  - Failed; Amount not debited%n%n"); }
        System.out.printf("           Balance is %s%n", Account.convertToMoney(savings.getBalance())); 
        System.out.printf("   Amount to Debit is -$5.00%n");
        if (savings.debit(-5)) { System.out.printf("       New Balance is %s%n%n", Account.convertToMoney(savings.getBalance())); 
        } else { System.out.printf("  Failed; Amount not debited%n%n"); }
        System.out.printf("%nTest Credit Method %n");
        System.out.printf("           Balance is %s%n", Account.convertToMoney(savings.getBalance())); 
        System.out.printf("   Amount to Credit is $25.00%n%n");
        if (savings.credit(25)) { System.out.printf("       New Balance is %s%n", Account.convertToMoney(savings.getBalance())); 
        } else { System.out.printf("  - Failed; Amount not credited%n"); }
        System.out.printf("           Balance is %s%n", Account.convertToMoney(savings.getBalance())); 
        System.out.printf("   Amount to Credit is -$25.00%n");
        if (savings.credit(-25)) { System.out.printf("       New Balance is %s%n%n", Account.convertToMoney(savings.getBalance())); 
        } else { System.out.printf("  Failed; Amount not credited%n%n"); }
        
        
        /* Checking Test */
        System.out.printf("%n");
        System.out.println("Test Checking Class");
        System.out.printf("Set Fee  =  $1.00");
        checking.setFee(1);
        System.out.printf(", Fee is now %s%n", Account.convertToMoney(checking.getFee())); 
        System.out.printf("Set Fee  = -$1.00,");
        if (checking.setFee(-1)) { System.out.printf("  - Successful; Fee is now %s%n", Account.convertToMoney(checking.getFee()));
        } else { System.out.printf("  - Failed; Not a valid Fee Range%n"); }
        System.out.printf("%nTest Debit Method %n");
        System.out.printf("           Balance is %s%n", Account.convertToMoney(checking.getBalance())); 
        System.out.printf("               Fee is %s%n", Account.convertToMoney(checking.getFee()));
        System.out.printf("   Amount to Debit is $5.00%n");
        if (checking.debit(5)) { System.out.printf("       New Balance is %s%n%n", Account.convertToMoney(checking.getBalance())); 
        } else { System.out.printf("  - Failed; Amount not debited%n%n"); }
        System.out.printf("           Balance is %s%n", Account.convertToMoney(checking.getBalance())); 
        System.out.printf("               Fee is %s%n", Account.convertToMoney(checking.getFee()));
        System.out.printf("   Amount to Debit is -$5.00%n");
        if (checking.debit(-5)) { System.out.printf("       New Balance is %s%n%n", Account.convertToMoney(checking.getBalance())); 
        } else { System.out.printf("  Failed; Amount not debited%n%n"); }
        System.out.printf("%nTest Credit Method %n");
        System.out.printf("           Balance is %s%n", Account.convertToMoney(checking.getBalance())); 
        System.out.printf("   Amount to Credit is $15.00%n");
        if (checking.credit(15)) { System.out.printf("       New Balance is %s%n%n", Account.convertToMoney(checking.getBalance())); 
        } else { System.out.printf("  - Failed; Amount not credited%n%n"); }
                System.out.printf("           Balance is %s%n", Account.convertToMoney(checking.getBalance())); 
        System.out.printf("   Amount to Credit is -$25.00%n");
        if (checking.credit(-25)) { System.out.printf("       New Balance is %s%n", Account.convertToMoney(checking.getBalance())); 
        } else { System.out.printf("  Failed; Amount not credited.%n"); }
        
    } // End Main
}// End SavingsAndCheckingTest Class
