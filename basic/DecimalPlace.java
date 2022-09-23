package basic;
import java.math.*;
public class DecimalPlace {
 public static void main(String[] args)
 {
    
     BigDecimal bigdecimal = new BigDecimal("2300.9856");
     int i = 3;
     BigDecimal changedvalue = bigdecimal.movePointRight(i);

     String result = "After applying decimal move right by move Distance " + i + " on " + bigdecimal + "\n New Value is " + changedvalue;
     System.out.println(result);
 }
}