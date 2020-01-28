class Draw
{	int r,l,b;
	double area;
	Draw() //Default constructor
	{	r=1;
		l=0;b=0;
		}
	Draw(int y)//parametrised constructor
	{	r=y;l=0;b=0; }
	Draw(int lx,int ly)
	{ r=0;l=lx;b=ly;}
	
	void circle() //Method
	{ area=3.14*r*r;
	System.out.println("Area of circle"+area); }
	void rectangle()
	{ area=l*b;
		System.out.println("rectangle area="+area);
		}
		
	public static void main(String args[])
	{	Draw dr=new Draw();
		dr.circle();
		Draw d2=new Draw(5,10);
		d2.rectangle();
	}
}
	
	