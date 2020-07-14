

public class StaticMethod1 {
	
	
int rollno;
String name;
static String collname ="NMIT";	
	
StaticMethod1(int r,String n)
{
	rollno=r;
	name=n;
}
	public void display()
	{
		System.out.println(rollno +"," + name + "," + collname);
	}
	
	
	static void change()
	{
		//even passing an argument also will work
	  //collname = cname;
		collname ="dnsit";
	}
	
public static void main(String[] args) {
				
StaticMethod1  obj = new StaticMethod1(112,"ammu");
StaticMethod1  obj2= new StaticMethod1(132,"suma");
obj.display();
obj2.display();

obj.change();
obj.display();
obj2.display();
		
	}

}
