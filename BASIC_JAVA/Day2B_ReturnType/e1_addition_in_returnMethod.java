package Day2B_ReturnType;

public class e1_addition_in_returnMethod {
	
	int add (int a,int b) {	
		return a+b;	
	}
	
	int sub (int a,int b) {	
		return a-b;	
	}
	int mul (int a,int b) {	
		return a*b;	
	}
	int div (int a,int b) {	
		return a/b;	
	}
	int mod (int a,int b) {	
		return a%b;	
	}
	
	public static void main(String[] args) {

		e1_addition_in_returnMethod obj = new e1_addition_in_returnMethod ();
		
		System.out.println(obj.add(10, 20));
		System.out.println(obj.sub(20, 10));
		System.out.println(obj.mul(10, 10));
		System.out.println(obj.div(100,10));
		System.out.println(obj.mod(50, 3));
		
		
	}

}
