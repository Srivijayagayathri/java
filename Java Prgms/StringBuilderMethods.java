import java.util.*;
class StringBuilderMethods
{	public static void main(String args[])
	{	
		StringBuilder sbf = new StringBuilder("H");
		System.out.println("***********StringBuilder**********");
		System.out.println("builder= "+sbf);
		System.out.println("length= "+sbf.length());
		System.out.println("capacity= "+sbf.capacity());
		//System.out.println("ensure capacity= "+sbf.ensureCapacity());
		System.out.println("Appending= "+sbf.append("i"));
		System.out.println("Replace= "+sbf.replace(1,3,"JAVA"));
		System.out.println("Delete= "+sbf.delete(1,3));
		System.out.println("insert=" +sbf.insert(1,"h"));
		System.out.println("Reverse= "+sbf.reverse());
		
		
	}
}
		