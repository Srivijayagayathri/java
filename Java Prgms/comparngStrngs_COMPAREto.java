import java.util.*; 
  
public class comparngStrngs_COMPAREto{ 
    public static void main(String args[]) 
    { 
        String string1 = new String("vineetha"); 
        String string2 = new String("VINEETHA"); 
        String string3 = new String("vin"); 
        String string4 = null; 
        String string5 = new String("vin"); 
  
        // Comparing for String 1 != String 2 
        System.out.println("Comparing " + string1 + " and " + string2 
                           + " : " + string1.compareTo(string2)); 
						   
  
        /*// Comparing for String 2 = String 3 
        //System.out.println("Comparing " + string2 + " and " + string3 
                           //+ " : " + Objects.equals(string2, string3)); 
  
        // Comparing for String 1 != String 4 
        System.out.println("Comparing " + string3 + " and " + string4 
                           + " : " + Objects.equals(string3, string4)); 
  
        // Comparing for String 4 = String 5 
        //System.out.println("Comparing " + string4 + " and " + string5 
                          + " : " + Objects.equals(string4, string5)); */
    } 
} 