/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author awhisenhunt
 */

//Imported Libraries
import java.util.Random;


public class Timetest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Random Number Generator Variables
        Random rand = new Random();
        int randvalue;
    //Showing Class Header Information
      //showHeader();
      
    //Initalize the Object and show starting values
      System.out.println("|--------------------------------------------------|");
      System.out.println("|           Instantiating Time Class               |");
      System.out.println("|--------------------------------------------------|");
      Time testTime1 = new Time();
      System.out.printf("%ntestTime1 object created from Time.Class");
      Time testTime2 = new Time();
      System.out.printf("%ntestTime2 object created from Time.Class");
      Time testTime3 = new Time();
      System.out.printf("%ntestTime3 object created from Time.Class");
      Time testTime = new Time();
      System.out.printf("%ntestTime object created from Time.Class%n%n");
      /*
    //Show Inital Values
      System.out.println("|--------------------------------------------------|");
      System.out.println("|              Test Default Values                 |");
      System.out.println("|--------------------------------------------------|");
      //Show default values using get methods
      System.out.println("1. Show Default Values by using get methods:");
      System.out.printf("     Time.class Response: Hours value is %s%n",testTime.getHours());
      System.out.printf("     Time.class Response: Minutes value is %s%n",testTime.getMinutes());
      System.out.printf("     Time.class Response: Seconds value is %s%n",testTime.getSeconds());
      //Show default universal time
      System.out.printf("%n2. Show Default Universal Time:%n");
      System.out.printf("     Default Universal Time is: ");
      testTime.printUniversal();
      System.out.printf("%n");
      //Show default standard time
      System.out.printf("%n3. Show Default Standard Time:%n");
      System.out.printf("     Default Standard Time is: ");
      testTime.printStandard();
      System.out.printf("%n");
      
      System.out.printf("%n%n");
         */
    //Test get/set Methods
      System.out.println("|--------------------------------------------------|");
      System.out.println("|              Test get/set Methods                |");
      System.out.println("|--------------------------------------------------|");
      //Show default values using get methods
      System.out.println("1. Test set/get hours with 3 random values from 0 to 23:");
      //Test set hours #1
      randvalue = rand.nextInt(24);
      System.out.printf("     Call setHours(%d)%n",randvalue);
      testTime1.setHours(randvalue);
      System.out.printf("     getHours = %s%n",testTime1.getHours());
      System.out.printf("%n");
      //Test set hours #2
      randvalue = rand.nextInt(24);
      System.out.printf("     Call setHours(%d)%n",randvalue);
      testTime2.setHours(randvalue);
      System.out.printf("     getHours = %s%n",testTime2.getHours());
      System.out.printf("%n");
      //test set hours #3
      randvalue = rand.nextInt(24);
      System.out.printf("     Call setHours(%d)%n",randvalue);
      testTime3.setHours(randvalue);
      System.out.printf("     getHours = %s%n",testTime3.getHours());
      System.out.printf("%n");
      
      System.out.println("2. Test set/get Minutes with 3 random values from 0 to 59:");
      //Test set Minutes #1
      randvalue = rand.nextInt(60);
      System.out.printf("     Call setMinutes(%d)%n",randvalue);
      testTime1.setMinutes(randvalue);
      System.out.printf("     getMinutes = %s%n",testTime1.getMinutes());
      System.out.printf("%n");
      //Test set Minutes #2
      randvalue = rand.nextInt(60);
      System.out.printf("     Call setMinutes(%d)%n",randvalue);
      testTime2.setMinutes(randvalue);
      System.out.printf("     getMinutes = %s%n",testTime2.getMinutes());
      System.out.printf("%n");
      //test set Minutes #3
      randvalue = rand.nextInt(60);
      System.out.printf("     Call setMinutes(%d)%n",randvalue);
      testTime3.setMinutes(randvalue);
      System.out.printf("     getMinutes = %s%n",testTime3.getMinutes());
      System.out.printf("%n");
      
      System.out.println("3. Test set/get Seconds with 3 random values from 0 to 59:");
      //Test set Minutes #1
      randvalue = rand.nextInt(60);
      System.out.printf("     Call setSeconds(%d)%n",randvalue);
      testTime1.setSeconds(randvalue);
      System.out.printf("     getSeconds = %s%n",testTime1.getSeconds());
      System.out.printf("%n");
      //Test set Minutes #2
      randvalue = rand.nextInt(60);
      System.out.printf("     Call setSeconds(%d)%n",randvalue);
      testTime2.setSeconds(randvalue);
      System.out.printf("     getSeconds = %s%n",testTime2.getSeconds());
      System.out.printf("%n");
      //test set Minutes #3
      randvalue = rand.nextInt(60);
      System.out.printf("     Call setSeconds(%d)%n",randvalue);
      testTime3.setSeconds(randvalue);
      System.out.printf("     getSeconds = %s%n",testTime3.getSeconds());
      System.out.printf("%n");
      
    //Test SetTime, PrintUniversal, Print Standard      
      System.out.println("|--------------------------------------------------|");
      System.out.println("|         Test setTime & Print Methods             |");
      System.out.println("|--------------------------------------------------|");
      //System.out.println("|The following will call set time and then print   |");
      //System.out.println("|the universal and standard time for each call to  |");
      //System.out.println("|the setTime method.                               |"); 
      //System.out.println("|--------------------------------------------------|");
      //System.out.println("|setTime(int Hours, int Minutes, int Seconds)      |");
      //System.out.printf("|--------------------------------------------------|%n%n");
      //Testing Set Time For 00,00,00
      System.out.println("Testing setTime(00,00,00)");
      testTime1.setTime(00,00,00);
      System.out.printf("  Universal Time is: ");
      testTime1.printUniversal();
      System.out.printf("%n");
      System.out.printf("   Standard Time is: ");
      testTime1.printStandard();
      System.out.printf("%n%n");
      
      //Testing Set Time For 00,00,01
      System.out.println("Testing setTime(00,00,01)");
      testTime2.setTime(00,00,01);
      System.out.printf("  Universal Time is: ");
      testTime2.printUniversal();
      System.out.printf("%n");
      System.out.printf("   Standard Time is: ");
      testTime2.printStandard();
      System.out.printf("%n%n");
      
      //Testing Set Time For Random Hour 0 to 11, & Random Min/Sec 0 to 59
      
      //Testing Set Time For 11,59,59
      System.out.println("Testing setTime(11,59,59)");
      testTime3.setTime(11,59,59);
      System.out.printf("  Universal Time is: ");
      testTime3.printUniversal();
      System.out.printf("%n");
      System.out.printf("   Standard Time is: ");
      testTime3.printStandard();
      System.out.printf("%n%n");
      
      //Testing Set Time For 12,00,00
      System.out.println("Testing setTime(12,00,00)");
      testTime1.setTime(12,00,00);
      System.out.printf("  Universal Time is: ");
      testTime1.printUniversal();
      System.out.printf("%n");
      System.out.printf("   Standard Time is: ");
      testTime1.printStandard();
      System.out.printf("%n%n");
      
      //Testing Set Time For 12,00,01
      System.out.println("Testing setTime(12,00,01)");
      testTime2.setTime(12,00,01);
      System.out.printf("  Universal Time is: ");
      testTime2.printUniversal();
      System.out.printf("%n");
      System.out.printf("   Standard Time is: ");
      testTime2.printStandard();
      System.out.printf("%n%n");
      
      //Testing Set Time For Random Hour 12 to 23, & Random Min/Sec 0 to 59
      
      //Testing Set Time For 23,59,59
      System.out.println("Testing setTime(23,59,59)");
      testTime3.setTime(23,59,59);
      System.out.printf("  Universal Time is: ");
      testTime3.printUniversal();
      System.out.printf("%n");
      System.out.printf("   Standard Time is: ");
      testTime3.printStandard();
      System.out.printf("%n%n");
      
      
    //Testing Errors   
    //Set random values for all current time classes
    testTime1.setTime(rand.nextInt(24),rand.nextInt(60),rand.nextInt(60));
    testTime2.setTime(rand.nextInt(24),rand.nextInt(60),rand.nextInt(60));
    testTime3.setTime(rand.nextInt(24),rand.nextInt(60),rand.nextInt(60));
      System.out.println("|--------------------------------------------------|");
      System.out.println("|                Test Error Handling               |");
      System.out.printf("|--------------------------------------------------|%n%n");
      //Test Incorrect Hours
      System.out.println("1. Test set/get hours with -1 and 24 error values:");
      //Test set hours with -1
      System.out.printf("     Hours = %s%n",testTime1.getHours());
      System.out.printf("     Call setHours(-1)%n");
      testTime1.setHours(-1);
      System.out.printf("     Hours = %s%n",testTime1.getHours());
      System.out.printf("%n");
      //Test set hours with 24
      System.out.printf("     Hours = %s%n",testTime2.getHours());
      System.out.printf("     Call setHours(24)%n");
      testTime2.setHours(24);
      System.out.printf("     Hours = %s%n",testTime2.getHours());
      System.out.printf("%n");
      
      //Test Inncorrect Minutes
      System.out.println("2. Test set/get minutes with -1 and 60 error values:");
      //Test set Minutes with -1
      System.out.printf("     Minutes = %s%n",testTime3.getMinutes());
      System.out.printf("     Call setMinutes(-1)%n");
      testTime3.setMinutes(-1);
      System.out.printf("     Minutes = %s%n",testTime3.getMinutes());
      System.out.printf("%n");
      //Test set Minuteswith 60
      System.out.printf("     Minutes = %s%n",testTime1.getMinutes());
      System.out.printf("     Call setMinutes(60)%n");
      testTime1.setMinutes(60);
      System.out.printf("     Minutes = %s%n",testTime1.getMinutes());
      System.out.printf("%n");
      
      //Test Inncorrect Seconds
      System.out.println("3. Test set/get seconds with -1 and 60 error values:");
      //Test set Seconds with -1
      System.out.printf("     Seconds = %s%n",testTime2.getSeconds());
      System.out.printf("     Call setSeconds(-1)%n");
      testTime2.setSeconds(-1);
      System.out.printf("     Seconds = %s%n",testTime2.getSeconds());
      System.out.printf("%n");
      //Test set Seconds with 60
      System.out.printf("     Seconds = %s%n",testTime3.getSeconds());
      System.out.printf("     Call setSeconds(60)%n");
      testTime3.setSeconds(60);
      System.out.printf("     Seconds = %s%n",testTime3.getSeconds());
      System.out.printf("%n");
      
      //Test set time for 24:00:00
      System.out.println("4. Test setTime for 24:00:00");
      System.out.printf("     Time is: ");
      testTime1.printUniversal();
      System.out.printf(" (");
      testTime1.printStandard();
      System.out.printf(")");
      System.out.printf("%n     Call setTime(24,00,00)%n");
      testTime1.setTime(24,00,00);      
      System.out.printf("     Time is: ");
      testTime1.printUniversal();
      System.out.printf(" (");
      testTime1.printStandard();
      System.out.printf(")");
      System.out.printf("%n%n");
      
      //Test set time for 12:60:01
      System.out.println("5. Test setTime for 12:60:01");
      System.out.printf("     Time is: ");
      testTime2.printUniversal();
      System.out.printf(" (");
      testTime2.printStandard();
      System.out.printf(")");
      System.out.printf("%n     Call setTime(12,60,01)%n");
      testTime2.setTime(12,60,01);      
      System.out.printf("     Time is: ");
      testTime2.printUniversal();
      System.out.printf(" (");
      testTime2.printStandard();
      System.out.printf(")");
      System.out.printf("%n%n");
      
      //Test set time for 3:45:99
      System.out.println("6. Test setTime for 3:45:99");
      System.out.printf("     Time is: ");
      testTime3.printUniversal();
      System.out.printf(" (");
      testTime3.printStandard();
      System.out.printf(")");
      System.out.printf("%n     Call setTime(3,45,99)%n");
      testTime3.setTime(3,45,99);      
      System.out.printf("     Time is: ");
      testTime3.printUniversal();
      System.out.printf(" (");
      testTime3.printStandard();
      System.out.printf(")");
      System.out.printf("%n%n");
      
     
    }//End Main Method
    
    /*static void showHeader()
    {
      System.out.printf("%n");
      System.out.println("|--------------------------------------------------|");
      System.out.println("|                 Header Information               |");
      System.out.println("|--------------------------------------------------|");
      System.out.println("|Class Name: Timetest.Class                        |");
      System.out.println("|@author:      Andrew Whisenhunt                   |");
      System.out.println("|@version:     1.0.0                               |");
      System.out.println("|Last Updated: 09/03/2013                          |");
      System.out.println("|                                                  |");
      System.out.println("|Purpose:                                          |");
      System.out.println("|     Test the Time.Class capabilities, and methods|");
      System.out.println("|--------------------------------------------------|");
      System.out.printf("%n");
    }//End showHeader method */
}
