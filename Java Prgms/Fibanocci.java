import java.util.*;
import java.lang.Math;
class Fibanocci
{
	public static void main(String args[])
{

	    int[] fib=new int[5];
	int a=0;
	int b=1;
	int c,i;
	for(i=0;i<5;i++)
	{
	c=a+b;
	fib[i]=c;

	a=b;
	b=c;


	}
	for(i=0;i<5;i++)
	{
	System.out.println(fib[i]);

}
}
}