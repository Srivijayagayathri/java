import java.util.*;
class Factorial
{ 	public static void main(String[] args)
	{	Scanner get=new Scanner(System.in);
		int a;
		System.out.println("enter the number:");
		a=get.nextInt();
		int i=1,f=1;
		for(i=1;i<=a;i++)
		{	 f= f*i;
			}
		System.out.println(f);
		
	}
}