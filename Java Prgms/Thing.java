public class Thing {
  
  private int a;
  
  public Thing(int x) {
    a = x;
  }
  
  public int geta() {
    return a;
  }
  
  public void print() {
    int b = 4;System.out.println(geta() + " " + b);
	
  }
  public static void main(String args[])
  {Thing f = new Thing(4);
	
  System.out.println(f.geta());}
  
}
