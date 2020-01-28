import java.util.*;
class StringBufferMethods
{	public static void main(String args[])
	{	
		StringBuffer sbf = new StringBuffer("H");
		System.out.println("***********StringBuffer**********");
		System.out.println("buffer= "+sbf);
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
		