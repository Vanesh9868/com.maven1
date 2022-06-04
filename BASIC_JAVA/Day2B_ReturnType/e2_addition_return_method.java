package Day2B_ReturnType;

public class e2_addition_return_method {
	
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

		e2_addition_return_method obj = new e2_addition_return_method ();
		
		System.out.println("addition of 10+20-->"+obj.add(10, 20));
		System.out.println("subtraction of 20-30-->"+obj.sub(20, 10));
		System.out.println("multipication of 10*10-->"+obj.mul(10, 10));
		System.out.println("division of 100/10-->"+obj.div(100,10));
		System.out.println("modulus of 50%3-->"+obj.mod(50, 3));
		
		
	}

}
