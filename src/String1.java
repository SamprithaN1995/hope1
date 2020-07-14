
public class String1 {
	public static void main(String args[]) {
		String s =" Java training";
		
	System.out.println(s.charAt(2));
	System.out.println(s.indexOf("a"));
	System.out.println(s.substring(2, 7));
	//System.out.println(s.substring(5));
	System.out.println(s.concat("rahul teaches"));
	//to remove the white spaces
	System.out.println(s.trim());
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s.length());
	String arr[] =s.split(" ");
	for(int i=0;i<arr.length;i++)
	{
System.out.println(arr[i]);
   
	
	}
	}

}
