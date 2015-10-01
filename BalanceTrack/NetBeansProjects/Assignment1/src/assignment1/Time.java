/*
 * *****************************************************************************
 *                                    HEADER
 * *****************************************************************************
 * @author Andrew Whisenhunt
 * @version 1.0.0
 *  Last Updated: 09/03/2013
*/

/*
 * *****************************************************************************
 *                               Version Updates:
 * *****************************************************************************
 * Versoin: 1.0.0 - 09/03/2013 RW
 * Original Assignment Parameters
 * Create a class called Time that includes three instance variables all of type 
 * int; hour, minute and seconds.  All the instance variables should be private.  
 * Provide a set and a get method for each instance variable.  Also provide a 
 * setTime() method with all three parameters.  For example you should be able 
 * to say the following to set the time to 11:15:00
 * 
 * Time classTime = new Time()
 * classTime.setTime(11, 15, 00)
 * 
 * Provide a method printUniversal() to display the time in 24 hour format.  
 * Provide another method printStandard() to display the time in 12 hour format 
 * with AM and PM.
 * 
 * The names of the methods for the Time class are as follows:
 * 
 * getHours
 * getMinutes
 * getSeconds
 * setHours
 * setMinutes
 * setSeconds
 * setTime
 * printUniversal
 * printStandard
 * 
 * The instance variables for the class are:
 * 
 * int hours
 * int minutes
 * int seconds
 * 
 * There should be NO OTHER instance variables or methods in the class.
 * 
 * Create a test class TimeTest that demonstrates class Time’s capabilities.  
 * Create several Time objects and display each object’s time in both universal 
 * and standard format. 
 * 
 * In addition, be certain that TimeTest tests ALL aspects of the class to show 
 * that it is working properly in all respects.  (i.e. all methods should be 
 * used)
 */
package assignment1;


public class Time {
 /*
 * *****************************************************************************
 *                               Global Constructors
 * *****************************************************************************    
*/    

    
 /*
 * *****************************************************************************
 *                               Instance Variables
 * *****************************************************************************    
*/    
    /*
     * hours   - int - Holds the hour value 0 to 23
     * minutes - int - Holds the minutes value 0 to 59
     * seconds - int - Holds the seconds value 0 to 59
     */
    //private int hours;
    //private int minutes;
    //private int seconds; 
    private int ssm;

 
 /*
 * *****************************************************************************
 *                               Get/Set Methods
 * *****************************************************************************    
*/   
    /*
     * Methods for getting and setting private instance variables
     * values.
     */   
    public int getHours()
    {
        //take ssm and divide it by 3600 to calculate the
        //the nume of hours stored in ssm
        return ssm / 3600;
    } //End Method getHours
    
    public int getMinutes()
    {
        //take ssm and subtract out the number of hours
        //stored in ssm. Then take the remainder and divide
        //by 60 to calculate the number minutes stored in 
        //ssm
        return (ssm - (getHours() * 3600))/60;  
    } //End Method getMinutes

    public int getSeconds()
    {
        //take ssm and subtract out the number of hours
        //stored in ssm. Then take the remaidner and subtract
        //out the number of minutes. What is left is the number
        //of seconds.
        return ((ssm - (getHours() * 3600)) - (getMinutes() * 60)); 
    } //End Method getSeconds

    public void setHours(int thours)
    {
        /*//Set IV hours to passed value stored in thours
        if (validateTime(thours, "Hours"))  
        {
            //If validateTime returns True then set variable
            hours = thours;
            System.out.printf("Time.class Response: Hours set to %s\n",outputAsString(thours));
        } else {
            //If validateTime returns false then print message
            System.out.printf("Error:     Class: Time.class     Message: The value of %d is not a valid hour value. Hour values range from 0 to 23.%n",thours);
        }//End If*/
        
        //Subtract out the number of hours stored
        //Then add the seconds for the number of hours
        //requested by the user
        if (thours < 23 && thours >= 0)
        {
            ssm -= getHours() * 3600;
            ssm += thours * 3600;
        }
    } //End Method setHours

    public void setMinutes(int tminutes)
    {
        /*//Set IV minutes to passed value stored in tminutes
        if (validateTime(tminutes, "Minutes"))  
        {
            //If validateTime returns True then set variable
            minutes = tminutes;
            System.out.printf("Time.class Response: Minutes set to %s\n",outputAsString(tminutes));
        } else {
            //If validateTime returns false then print message
            System.out.printf("Error:     Class: Time.class     Message: The value of %d is not a valid minute value. Minute values range from 0 to 59%n",tminutes);
        }//End If*/
        
        if (tminutes < 60 && tminutes >= 0)
        {
            ssm -= getMinutes() * 60;
            ssm += tminutes * 60;
        }
    } //End Method setMinutes
    
    public void setSeconds(int tseconds)
    {
        /*//Set IV seconds to passed value stored in tseconds
        if (validateTime(tseconds, "Seconds"))  
        {
            //If validateTime returns True then set variable
            seconds = tseconds;
            System.out.printf("Time.class Response: Seconds set to %s\n",outputAsString(tseconds));
        } else {
            //If validateTime returns false then print message
            System.out.printf("Error:     Class: Time.class     Message: The value of %d is not a valid second value. Second values range from 0 to 59%n",tseconds);
        }//End If */
        
        if (tseconds < 60 && tseconds >= 0)
        {
            ssm -= getSeconds();
            ssm += tseconds;
        }
    } //End Method setSeconds

 
    
     /*
 * *****************************************************************************
 *                               Class Methods
 * *****************************************************************************    
*/   

    public void setTime(int thours, int tminutes, int tseconds)
    {
        //Use set procedures to store temp values passed in
        //if (validateTime(thours, "Hours") && validateTime(tminutes, "Minutes") && validateTime(tseconds, "Seconds")) {
        setHours(thours);
        setMinutes(tminutes);
        setSeconds(tseconds); 
        //} else {
        //    System.out.printf("Error:     Class: Time.class     Message: The suuplied time %s:%s:%s is not a valid time. Time ranges from 00:00:00 to 23:59:59%n",outputAsString(thours),outputAsString(tminutes),outputAsString(tseconds));
        //}
       
    } //End Method setTime
    
    public void printUniversal()
    {
        //Return the time in Military Format (23 hour format)
        System.out.printf("%s:%s:%s",outputAsString(getHours()),outputAsString(getMinutes()),outputAsString(getSeconds()));
    } //End Method printUniversal
    
    public void printStandard()
    {
        //Local Variables
        int thour = getHours();
        String period = " ";
        
        //Determine AM/PM based off current hour
        if (thour >= 0 && thour < 12) 
        {
            //thour is between 0 and 11
            period = "AM";
        } else if (thour > 12 && thour < 24) {
            //thour is between 13 and 23 aka 1pm to 11pm
            thour = thour - 12;
            period = "PM";
        } else {
            //by process of elimination thour is 12 because only hours in the range
            //of 0 to 23 can be validated by the validateTime routine
            period = "PM";
        }//End Hours If 
        
        //Return the time in standard time (12 hour AM/PM format)
        System.out.printf("%s:%s:%s %s",outputAsString(thour),outputAsString(getMinutes()),outputAsString(getSeconds()), period);
    } //End Method printStandard
    
    public String outputAsString(int value)
    {
        if (value > 9) 
        {
            return Integer.toString(value);
        } else {
            return String.format("0%s", Integer.toString(value));
        } //End If-Else Statment
    }//End Method converstToString
    
   /* public boolean validateTime(int value, String timetype)
    {
        if (timetype == "Hours") {
                if (value >= 0 && value < 24) 
                {
                    return true;
                } else {
                    return false;
                }//End Hours If  
        } else if (timetype == "Minutes" || timetype == "Seconds") {
                if (value >= 0 && value < 60) 
                {
                    return true;
                } else {
                    return false;
                }//End Minutes/Seconds If   
        } 
        return false;
    }//End Mehtod validateTime */
    

} //End Time Class
