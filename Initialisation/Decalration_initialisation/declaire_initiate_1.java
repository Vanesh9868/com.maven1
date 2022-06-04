package Decalration_initialisation; //1.declaration and initialisation of variable at one place

public class declaire_initiate_1 {
	
	String a = "yogesh";              // declaration and initialisation at one place
	String b = "manish";
	String c = "ramesh";
	String d = "raju@123456";
	String e = "ajay";

	int f =10;
	int g =20;
	int h =30;
	int i =40;
    int j =50;
	
/*
 * here we declaire the variable and initialise infront of it 
 * both declaration and intialisation done at one place
 *  
 * there are multiple way to declaire and initialise the variable
 * 
 * 1.declaire and initilise at one place
 * 2.declaire at one place initialise at other place
 *    a. declaire variable in class  & initialise in method 
 *    b. declaire variable in class  & initialise in mainmethod
 *     
 */
	public static void main(String[] args) {
		
		declaire_initiate_1 x = new declaire_initiate_1 ();
		
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
