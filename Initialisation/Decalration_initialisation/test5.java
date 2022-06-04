package Decalration_initialisation;

public class test5 {

	String a ;
	String b ;
	String c ;
	String d ;

	String e ;
	
	String  m1 ()
	{
		a="yogesh";
		b="dhanya";
		c="ajay";
		d="manish";
		
		return b;
	}
	
	 void m2()
	{
		String d="100";
		System.out.println(d);
	}
	
	public static void main(String[] args) {

		test5 x = new test5 ();

		System.out.println(x.m1());
		
		x.m2();
		
	}

}
