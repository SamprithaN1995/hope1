
public class method_versus_constr1 {
	int a=0;
int b=0;


	 public method_versus_constr1(int num) {
		// TODO Auto-generated constructor stub
		a=num; 
	}
	 
	 //using method assigned the value
	 public int sum(int value)
		{
			b=value;
			//System.out.println(b);
			return b;
		}
	 
	  
	 
	public static void main(String args[]) {
	method_versus_constr1 a1 = new method_versus_constr1(3);
	
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a1.sum(15));
		System.out.println(a1.b);
	}
}
