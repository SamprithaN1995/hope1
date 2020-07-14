import com.sun.org.apache.xml.internal.utils.StringComparable;

public class Stringreverse {
	
	public static void main(String args[]) {
		String s = "nayan";
		//do not give an empty space while declaring the empty string
		String t = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			t = t + s.charAt(i);
			

          //  System.out.println(t);
			
		}
		// System.out.println(t);
		 
		if(s.equals(t))
		{
			System.out.println("its a polindrome");
		}
		
		else
		{
			
	        System.out.println("its not a polindrome");		
		}
	}


}
