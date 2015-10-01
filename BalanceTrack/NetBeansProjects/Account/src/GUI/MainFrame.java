package GUI;

import account.CheckingAccount;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.MessageFormat;
import javax.swing.*;

public class MainFrame extends JFrame{
    
    private String accountnum;
    private Double checkamount;
    private Double depositamount;
    private Double ebalance;
    
    private JTextField txtaccountnum;
    private JTextField txtcheckAmount;
    private JTextField txtdepositAmount;
    private JTextField txtendingBalance;
    
    private JButton btnOk;
    private JButton btnReset;
    private JButton btnClose;
    
    private FileHandler f;
    private CheckingAccount acct;
       
    public MainFrame(String frameName, Integer width, Integer height) {
        super(frameName);
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f = new FileHandler(String.format("\\\\JONESY-PC\\Users\\Jonesy\\Documents"),"acct");
        
        txtaccountnum = new JTextField(10);
        txtaccountnum.setHorizontalAlignment(JTextField.LEFT);
        
        txtcheckAmount = new JTextField(10);
        txtcheckAmount.setHorizontalAlignment(JTextField.RIGHT);
        txtcheckAmount.setEditable(false);
        
        txtdepositAmount = new JTextField(10);
        txtdepositAmount.setHorizontalAlignment(JTextField.RIGHT);
        txtdepositAmount.setEditable(false);
        
        txtendingBalance = new JTextField(10);
        txtendingBalance.setHorizontalAlignment(JTextField.RIGHT);
        txtendingBalance.setEditable(false);
        
        btnOk = new JButton("Save");
        btnOk.setEnabled(false);
        btnOk.setPreferredSize(new Dimension(111, 30));
        
        btnReset = new JButton("Reset");
        btnReset.setEnabled(false);
        btnReset.setPreferredSize(new Dimension(111, 30));
        
        btnClose = new JButton("Exit");
        btnClose.setPreferredSize(new Dimension(111, 30));
        
        setActionListenerEvents();
        defineLayout();
        
    }
    
private void displayErrorMessage(String estr, String title) {
    JOptionPane.showMessageDialog(null, estr, title, JOptionPane.ERROR_MESSAGE);
}

private void displayMessage(String estr, String title) {
    JOptionPane.showMessageDialog(null, estr, title, JOptionPane.INFORMATION_MESSAGE);
}

private void allowAccountActions() {
    txtaccountnum.setEditable(false);
    txtcheckAmount.setEditable(true);
    txtdepositAmount.setEditable(true);
    btnOk.setEnabled(true);
    btnReset.setEnabled(true);
    txtcheckAmount.requestFocus();
    txtendingBalance.setText(SharedMethods.displayAsMoney(acct.getBalance()));
}

private void reset() {
    acct = null;
    txtaccountnum.setText("");
    txtaccountnum.setEditable(true);
    
    txtcheckAmount.setText("");
    txtcheckAmount.setEditable(false);
    
    txtdepositAmount.setText("");
    txtdepositAmount.setEditable(false);
    
    btnOk.setEnabled(false);
    btnReset.setEnabled(false);
    txtaccountnum.requestFocus();
    txtendingBalance.setText("");  
}

 private void setActionListenerEvents() {
     
     txtaccountnum.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
                if (f.checkAccountExist(txtaccountnum.getText())) {
                    try {
                        acct = f.readFromDisk(txtaccountnum.getText());
                        allowAccountActions();
                    } catch (ClassNotFoundException ex) {
                        displayErrorMessage(ex.toString(), "ClassNotFoundException");
                    } catch (FileNotFoundException ex) {
                        displayErrorMessage(ex.toString(), "FileNotFoundException");
                    } catch (IOException ex) {
                        displayErrorMessage(ex.toString(), "FileIOException");
                    }
                } else {
                    acct = new CheckingAccount(0, 0, txtaccountnum.getText());
                    allowAccountActions();
                }
         }     
     });
     
    txtcheckAmount.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             if (SharedMethods.validateDblInput(txtcheckAmount.getText())) {
                 checkamount = SharedMethods.convertStringToDbl(txtcheckAmount.getText());
                 if (acct.debit(checkamount)) {
                     txtendingBalance.setText(SharedMethods.displayAsMoney(acct.getBalance()));
                     txtcheckAmount.setText("");
                 } else {
                     displayErrorMessage(MessageFormat.format("You have insufficent funds to withdrawl the amount of {0}. You current balance is {1}", SharedMethods.displayAsMoney(checkamount), SharedMethods.displayAsMoney(acct.getBalance())), "Insufficent Funds");
                     txtcheckAmount.setText("");
                 }
                 //txtcheckAmount.setText(SharedMethods.displayAsMoney(checkamount));
                 //JOptionPane.showMessageDialog(null, MessageFormat.format("Check Amount is {0}", txtcheckAmount.getText())); 
             }    else {
               displayErrorMessage(MessageFormat.format("Value of {0} is not a valid money value", txtcheckAmount.getText()), "Invalid Money Value");
               txtcheckAmount.setText("");
             }
         }     
     });
    
    txtdepositAmount.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             if (SharedMethods.validateDblInput(txtdepositAmount.getText())) {
                 depositamount = SharedMethods.convertStringToDbl(txtdepositAmount.getText());
                 //txtdepositAmount.setText(SharedMethods.displayAsMoney(depositamount));
                 acct.credit(depositamount);
                 txtendingBalance.setText(SharedMethods.displayAsMoney(acct.getBalance()));
                 txtdepositAmount.setText("");
                 //JOptionPane.showMessageDialog(null, MessageFormat.format("Deposit Amount is {0}", txtdepositAmount.getText())); 
             }    else {
               displayErrorMessage(MessageFormat.format("Value of {0} is not a valid money value", txtdepositAmount.getText()), "Invalid Money Value");               txtdepositAmount.setText("");
             }
         }     
     });
        
     btnOk.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             String result = f.writeToDisk(acct);
             if (result.equals("Success")) {
                 displayMessage(MessageFormat.format("Account Number {0} was successfuly saved to disk",acct.getAccountNumber()),"Account Saved");
             } else {
                 displayErrorMessage(result, "Exception Error");
             }
         }
     });
     
     btnReset.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             reset();
         }
     });
     
     btnClose.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             dispose();
         }
     });
 }
    
  private void defineLayout() {
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx = 0;
        gc.gridy = 0;
        

        //Row 1 Column 1 - Beginning Balance Label
        gc.gridx = 0;
        gc.gridy ++;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Accout Number: "), gc);
        
        //Row 1 Column 2 - Beginning Balance Text Field
        gc.gridx ++;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.CENTER;
        add(txtaccountnum, gc);
        
        //Row 2 Column 1 - Check Amount Label
        gc.gridx = 0;
        gc.gridy ++;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Check Amount: "), gc);
        
        //Row 2 Column 2 - Check Amount Text Field
        gc.gridx ++;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.CENTER;
        add(txtcheckAmount, gc);
                
        //Row 3 Column 1 - Deposit Amount Label
        gc.gridx = 0;
        gc.gridy ++;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Deposit Amount: "), gc);
        
        //Row 3 Column 2 - Deposit Amount Field
        gc.gridx ++;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.CENTER;
        add(txtdepositAmount, gc);
        
        //Row 4 Column 1 - Ending Balance Label
        gc.gridx = 0;
        gc.gridy ++;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;      
        add(new JLabel("Ending Balance: "), gc);
        
        //Row 4 Column 2 - Ending Balance Field
        gc.gridx ++;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.CENTER;
        add(txtendingBalance, gc);
                
        //Row 5 Column 2 - Save Button
        gc.gridx = 1;
        gc.gridy ++;
        gc.weightx = 1;
        gc.weighty = .5;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.CENTER;
        add(btnOk, gc);
        
        //Row 6 Column 2 - Save Button
        gc.gridx = 1;
        gc.gridy ++;
        gc.weightx = 1;
        gc.weighty = .5;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.CENTER;
        add(btnReset, gc);
        
        //Row 7 Column 2 - Exit Button
        gc.gridx = 1;
        gc.gridy ++;
        gc.weightx = 1;
        gc.weighty = .5;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.CENTER;
        add(btnClose, gc);
  }
          
    
}
