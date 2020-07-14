
public class child1 extends Parent1 {
	public void start()
	{
		super.start();
		System.out.println("BMW START");
		//super.start();
	}

	
	public void stop()
	{
		System.out.println("BMW STOP");
	}
	public void newmethod()
	{
		System.out.println("new child method");
	}
	public static void main(String[] args) {
		//from parent class object you cannot access the non overriden child  method
		Parent1 obj2 = new Parent1();
		obj2.start();
		obj2.stop();
	obj2.newparentmethod();
	System.out.println("using parent object cannot access the new child method");
	obj2.vehicle();
	 System.out.println("child class");
	
	//by default when you extend the class all methods will be available.
		child1  obj =new child1();
	
	 obj.start();
	 obj.stop();
	 obj.newmethod();

	 obj.vehicle();
	 //child class object  is reffered by the parent class reference variable
	 System.out.println("runtime polymorphism");
	 Parent1 obj3= new child1();
	 obj3.start();
	 obj3.stop();
	 obj3.newparentmethod();
	 obj3.vehicle();
	 System.out.println("using runtime polymorphism ");
	 System.out.println("cannot access the child class, not overriden methods");
	
	 
		
		
	
	}
}
