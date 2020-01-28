import java.util.*;
class Solution
{	public static void main(String[] args)
	{	Scanner get=new Scanner(System.in);
		int a=get.nextInt();
 		if(a%2==0)
		{	if(a>=2 && a<=5)
			{	System.out.println("Not Weird");}
			else if(a>5 && a<=20)
			{	System.out.println("Weird");
			}
			else
			{ System.out.println("Not Weird");}
		}
		else
	{	System.out.println("Weird");	}
}}