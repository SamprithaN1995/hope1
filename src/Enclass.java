
public class Enclass {

	public static void main(String[] args) {
		
		Encapsulate obj = new Encapsulate();
		obj.setage(20);
		obj.setname("sampritha");
		obj.setsalary(37899);
		System.out.println(obj.salary);
		System.out.println("age :" + obj.getage() +"," + "name :" + obj.getname() +"," + "salary" + obj.getsalary());
		
	}
}
