import java.util.*;
class Strngcompare_length
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
		if(n>0)
			System.out.println(str2+"is bigger");
		else if(n<0)
			System.out.println(str1+"is bigger");
		else
			System.out.println(str1,str2+" is equal");
	}
}

		