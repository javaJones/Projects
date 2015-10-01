package GUI;

import java.io.*;
import account.CheckingAccount;

public class FileHandler {
    
    //Constructor
    public FileHandler(String fileLocation, String fileExtension) {
        setFileLoc(fileLocation);
        setFileType(fileExtension);
    }
    
    //Instance Variables
    private String fileloc = new String();
    private String filetype = new String();
        
    //Getters & Setters
    public final void setFileLoc(String location) {
        if (String.valueOf(Character.toChars(92)).equals(location.substring(location.length() - 1))) {
            fileloc = location;
        } else {
            fileloc = location + String.valueOf(Character.toChars(92));
        }   
        System.out.println(fileloc);
    }
    
    public final String getFileLoc() {
        return fileloc;
    }
        
    public final void setFileType(String fileExtension) {
        if (".".equals(fileExtension.substring(0))) {
            filetype = fileExtension;
        } else {
            filetype = String.format(".%s", fileExtension);
        }
    }
    
    public final String getFileType() {
        return filetype;
    }
    
    public String getFullPath(String fileName) {
        return String.format("%s%s%s",getFileLoc(), fileName, getFileType());
    }
    //Local Methods
    
    public String writeToDisk(CheckingAccount accountNumber) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(getFullPath(accountNumber.getAccountNumber()), false));
            oos.writeObject(accountNumber);
            oos.close();
            return "Success";
        } catch (FileNotFoundException ex) {
            return String.format("Write Method: File %s not found: \n Error Message: %s",getFullPath(accountNumber.getAccountNumber()),ex.toString());
        } catch (IOException ex) {
            return String.format("File IO Exception 1: \n Error Message: %s",ex.toString());
        }
    }
    
    public CheckingAccount readFromDisk(String accountNumber) throws ClassNotFoundException, FileNotFoundException, IOException {
         try {
             CheckingAccount taccount;
             try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(getFullPath(accountNumber)))) {
                 taccount = (CheckingAccount)ois.readObject();
             }
            return taccount;
         } catch (FileNotFoundException ex) {
             throw new FileNotFoundException(String.format("Read Method: File %s not found: \n Error Message: %s",getFullPath(accountNumber),ex.toString()));
         } catch (IOException ex) {
            throw new IOException(String.format("File IO Exception 2: \n Error Message: %s",ex.toString()));
         } catch (ClassNotFoundException ex) {
            throw new IOException(String.format("File IO Exception 3: \n Error Message: %s",ex.toString()));
        }
    }
    
    public Boolean checkAccountExist(String accountNumber) {
        File tempfile = new File(getFullPath(accountNumber));
        return tempfile.exists();
    }
}
