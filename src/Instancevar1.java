class Instancevar1
{
	//instance variable
	//for instance variable everytime when you create a object => memory will be allocated
	int count;
	String name;
	//static int timecounter;
	
	public void Add()
	{
		System.out.println("Inside the method" + count);
		count++;
		//timecounter++;
		System.out.println("after incrementing" + count);
		//System.out.println(timecounter);
		
	}
	
	Instancevar1(String name1)
	{
	name = name1;
			
	}
	
	
	
public Instancevar1() {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
	//whenver we are using instance variables we should know that
	//once the new object is created
	//memory will be allocated freshly to that 
	//so different instance of the object will be stored
	
	Instancevar1 obj2= new Instancevar1();
	obj2.Add();
	System.out.println("in main method " +obj2.count);
	obj2.Add();
	System.out.println("in main method " +obj2.count);
	
System.out.println("creating a new object");
Instancevar1 obj3= new Instancevar1();
System.out.println("before calling a method" + obj3.count);
obj3.Add();
System.out.println("in a main method" +obj3.count);
System.out.println("in a main method using first object value is " + obj2.count);
	//obj.Add();
	
	Instancevar1 obj4 = new Instancevar1("sam");
	System.out.println(obj4.name);
	Instancevar1 obj5 = new Instancevar1("giri");
	System.out.println(obj5.name);
	System.out.println(obj4.name);

	
}
	
}