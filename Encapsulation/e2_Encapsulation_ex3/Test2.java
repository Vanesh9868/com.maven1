package e2_Encapsulation_ex3;

public class Test2 {

	
	public  int m1 (int a , int b)          // here variable should be initialise
	{
		int sum= a+b;

		return sum;
	}
	
	public void sendkeys (int c , int d)
	{
		
		int sum = c+d;
		
		System.out.println(sum);
		
	}
	

	public static void main(String[] args) {

		Test2 x = new Test2 ();
		
		System.out.println(x.m1(10,20));
		
		x.sendkeys(10 ,10);
		
		
		
		
		
	}

}
