package eDay10_access_modifier;  //within package can't access private modifier

public class module1 {  
	
    public static void main(String[] args)   {
    	
    	parent z = new parent ();  //create object of parent class 
    	
    	System.out.println(z.a);                //public
    	System.out.println(z.b);                //protected
    	System.out.println(z.c);                //default
//    	System.out.println(z.d);                //private
    	    	
    }

 }

