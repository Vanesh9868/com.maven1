package Decalration_initialisation; // Declaire variable in class & Initialise in main method

public class test2 {
	
	String a;                                  //Declairation
	String b;
	String c;
	String d;
	String e;
	
	int f;
	int g;
	int h;
	int i;
	int j;

	
	
	public static void main(String[] args) {

		test2 x = new test2 ();                // object creation of class
		
		x.a="yogesh";                          // initialisation of Variable
		x.b="ajay";
		x.c="manish";
		x.d="manish@123456";
		x.e="ramesh";
		
		x.f=10;
		x.g=20;
		x.h=30;
		x.i=40;
		x.j=50;
		
		System.out.println(x.a);
		System.out.println(x.b);
		System.out.println(x.c);
		System.out.println(x.d);
		System.out.println(x.e);
		
		System.out.println(x.f);
		System.out.println(x.g);
		System.out.println(x.h);
		System.out.println(x.i);
		System.out.println(x.j);

		
		
		
	}

}
