package Day2B_ReturnType;

public class return_method {
	
	int M1 (int a) {
		
		System.out.println(a);
		
		return a;
	}
	
	
	int M2 (int b, int c) {

		System.out.println(b);
		System.out.println(c);
		
		return b;
	}
	
	
	int M3 (int d) {
		
		System.out.println(d);
		
		
		return 200;	
	}
	
	
	
	

	public static void main(String[] args) {

		
		return_method obj = new return_method ();
		
		obj.M1(10);
		
		obj.M2(20,30);
		obj.M3(100);
		
		
	}

}
