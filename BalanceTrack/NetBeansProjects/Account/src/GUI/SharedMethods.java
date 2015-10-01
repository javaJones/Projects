package GUI;

import java.text.NumberFormat;
import java.util.Locale;

public class SharedMethods {
    
    public static boolean validateDblInput(String strValue) {
        try {
            Double.parseDouble(strValue.replace("$", "")); 
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }

    public static Double convertStringToDbl(String value) {
        return Double.parseDouble(value.replace("$", "")); 
    }

    public static String displayAsMoney(Double value) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        return nf.format(value);
    }

}
