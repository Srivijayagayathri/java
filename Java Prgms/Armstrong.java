import java.util.*;
import java.lang.Math;
class Armstrong
{
	public static void main(String args[])
{
	int sum=0,i,temp,p=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number to find whether it's armstrong or not");
	int num=sc.nextInt();
	temp=num;
	while(num!=0)
	{
		num=num/10;
		p++;
	}
	num=temp;
	while(num!=0)
	{
	  i=num%10;
	  sum+=Math.pow(i,p);
	  num=num/10;
	}
	if(temp==sum)
	  System.out.println(sum+" number is armstrong");
	  else
	  System.out.println(sum+" number is not armstrong");
}
}