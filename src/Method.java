
public class Method extends SecondClass {

	public String getData() {
		
		//System.out.println("hello");
		return "hi";
		
	}

	// main  method
	public static void main(String args[]) {

  //object creation
   Method obj = new Method();
  // SecondClass obj2 = new SecondClass();
   
  
   System.out.print(obj.getData());
   //printing second class object
 
   obj.setData();
	}

}
