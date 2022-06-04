package Method_String_ReturnType;

public class String_Return1 {
	
	public String m1()
	{
		return "drink water";
		
	}
	
	public String m1(int a)
	{
		return "drink milk";
		
	}
	
	public String m1(String b)
	{
		return "drink softdrink";
		
	}
	
	public String m2()
	{
		return "m2";
		
	}
	
	public String m3()
	{
		return "m3";
		
	}
	
	

	public static void main(String[] args) {
		
		
		int a=100;
		
		 String_Return1 x = new  String_Return1 ();
		 
		String m1 = x.m1();
		String m1a = x.m1(12);
		String m1b = x.m1("abc");
		String m2 = x.m2();
		String m3 = x.m3();
		 
		 System.out.println(m1);
		 System.out.println(m1a);
		 System.out.println(m1b);
		 System.out.println(m2);
		 System.out.println(m3);

		 
		 
		 
		 

	}

}



