
public class Constructors1 {
	//instance variable
	//this instance variable can 
	int puppyage;
	String name1 ;
	//no return type for constructors
	
	public Constructors1(String name) {
		
		//System.out.println(name);
		name1 = name;
	}
	
	public void setAge(int age)
	{
		puppyage=age;
	}
	//now puppy age will have value
	public int getAge()
	{
		return puppyage;
	}
	public static void main(String args[]) {
		
		Constructors1 obj = new Constructors1("tommy");
		obj.setAge(5);
		System.out.println(obj.getAge());
		System.out.println("name is" + obj.name1 + "age is " + obj.puppyage );

		
		
	}

}
