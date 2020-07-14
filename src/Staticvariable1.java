
public class Staticvariable1 {
	
	int count;
	static int timer;
	
	//for static variables ,memory will be allocated only once.
	//same value is retained
	//not like the instance variable 
	//new instances of values will not be created 
	
Staticvariable1() 
	{
	System.out.println("inside the constructor");
	System.out.println("before incrementing the count" +count);
		count++;
		System.out.println("count value " +count);
		
		timer++;
		System.out.println("timer value  " +timer);
	}
	
public static void main(String[] args) {
	
	Staticvariable1 obj = new Staticvariable1();
	System.out.println("in maain method count " + obj.count);
	System.out.println("in maain method timer" + obj.timer);                    
		System.out.println("after creating new object");
	Staticvariable1 obj2 = new Staticvariable1();
	System.out.println("in maain method count " + obj2.count);
	System.out.println("in maain method timer " + obj2.timer); 
	System.out.println(" in main method accessing using first object ,count value is " + obj.count);
	System.out.println(" in main method accessing using first object ,timer value is " + obj.timer);
	//static variable can be accessed even like =>classname.object
	System.out.println(Staticvariable1.timer);
	}

}
