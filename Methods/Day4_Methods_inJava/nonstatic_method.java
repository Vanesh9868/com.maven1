package Day4_Methods_inJava;    //non static or instance method

public class nonstatic_method {
	
// access modifier - return type - method name () {    ;}
	
public void   cat   () {System.out.println("eat milk");}    

public void   horse () {System.out.println("run fast");}

public void   birds () {System.out.println("fly ");}   

public static void main(String[] args) {

  nonstatic_method Z = new nonstatic_method ();
                                                 //non static method
        Z.cat  ();                               //object name.method name();
        Z.horse();
        Z.birds();
		
	
	}

}
