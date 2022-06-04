package Method_boolean_ReturnType;

public class boolean_Returns {
	
	public boolean m1 ()
	{
		return false;
		
	}
	
	public boolean m1 (String b)
	{
		return true;
		
	}
	
	public boolean m2 ()
	{
		return false;
		
	}
	
	public boolean m2 (String b)
	{
		return true;
		
	}
	
	public boolean m3 ()
	{
		return false;
		
	}
	
	public boolean m3 (String b)
	{
		return true;
		
	}
	
	

	public static void main(String[] args) {

		boolean_Returns b = new boolean_Returns ();
		
		boolean m1 = b.m1();
		boolean m1b = b.m1(null);
		boolean m2 = b.m2();
		boolean m2b = b.m2(null);
		boolean m3= b.m3();
		boolean m3b= b.m3(null);
		
		
		System.out.println(m1);
		System.out.println(m1b);
		System.out.println(m2);
		System.out.println(m2b);
		System.out.println(m3);
		System.out.println(m3b);

		
		
		
	}

}




