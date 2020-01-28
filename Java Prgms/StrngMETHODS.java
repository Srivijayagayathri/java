import java.util.*;
class StrngMETHODS
{
	public static void main(String args[])
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter two strings");
		String str1=sc.next();
		String str2=sc.next();
		int l=str1.length();
		System.out.println("String2 length="+str2.length());
		System.out.println("String1 to Upper="+str1.toUpperCase());
		System.out.println("String1 Lower="+str1.toLowerCase());
		System.out.println("String2 Upper="+str2.toUpperCase());
		System.out.println("String2 Lower="+str2.toLowerCase());
		int n=str1.compareTo(str2);
		System.out.println("**************using compreTo*******************");
		if(n>0)
			System.out.println(str2+" is bigger");
		else if(n<0)
			System.out.println(str1+" is bigger");
		else
			System.out.println(" Both are equal");
		int c=str1.compareToIgnoreCase(str2);
		System.out.println("************using compareToIgnoreCase******************");
		if(c>0)
			System.out.println(str2+" is bigger");
		else if(c<0)
			System.out.println(str1+" is bigger");
		else
			System.out.println(" Both are equal");
		System.out.println("-------------equals-----------");
		System.out.println(str1 == str2); 
        System.out.println(str1.equals(str2)); 
		System.out.println("******************string concatenation********************");
	    String str4=str1.concat(str2);
		System.out.println(str4);
		System.out.println("---------------using charAt()----------------");
  
        int l1 = str1.length(); 
        int l2 = str2.length(); 
        int lmin = Math.min(l1, l2); 
  
        for (int i = 0; i < lmin; i++) { 
            int str1_ch = (int)str1.charAt(i); 
            int str2_ch = (int)str2.charAt(i); 
  
            if (str1_ch != str2_ch) { 
                System.out.println( str1_ch - str2_ch); 
            } 
        } 
  
        // Edge case for strings like 
        // String 1="Geeks" and String 2="Geeksforgeeks" 
        if (l1 != l2) { 
            System.out.println( l1 - l2); 
        } 
  
        // If none of the above conditions is true, 
        // it implies both the strings are equal 
        else { 
           System.out.println("0"); 
        } 
		
	}	
	
}

		