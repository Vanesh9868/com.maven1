package eDay10_access_modifier_child2; 

/*
 * with inheritance protected acessmodifier can also access outside package
 * 
 * default acess modifier cant acess outside package
 * 
 */

import eDay10_access_modifier.parent;

public class module2 extends parent  {
	
	public static void main (String [] args) {

		module2 z = new module2 ();

		System.out.println(z.a);                  // public        
		System.out.println(z.b);                  // protected
//		System.out.println(z.c);                  // default
//		System.out.println(z.d);                  // private  
		
	
	}

}
