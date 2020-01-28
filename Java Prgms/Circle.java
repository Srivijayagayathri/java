public class Circle
{	public double x,y,r;
	//constructor
	public Circle(double centreX,double centreY, double radius)
	{	x=centreX;
		y=centreY;
		r=radius;
	}
	public Circle(double radius)
	{x=0;y=0;r=radius;}
	public Circle()
	{x=0;y=0;r=1.0;}
	//Methods to return circumference and area
	public double circumference()
	{ return 2*3.14*r;}
	public double area()
	{ return 3.14*r*r; }

/*public static void main(String[] args)
{	Circle c=new Circle(2,2,2);
System.out.println(c);}*/
//public class TestCircles
	public static void main(String args[])
	{	Circle circleA= new Circle(10.0,12.0,20.0);
		Circle  circleB= new Circle(2.0,2.0,2.0);
		circleA.circumference();
		circleB.circumference();
	}
}
 