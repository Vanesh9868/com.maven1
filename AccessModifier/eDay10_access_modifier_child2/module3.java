package eDay10_access_modifier_child2;  //outside package can acess only public access modifier

import eDay10_access_modifier.parent;

  public class module3  {

	public static void main(String[] args) {

	       
		       parent z = new parent ();
		       
		   	System.out.println(z.a);                //public
//	 	    System.out.println(z.b);                //protected
//		   	System.out.println(z.c);                //default
//		   	System.out.println(z.d);                //private
		   	
   
	}
}
