package Day3_Object;

public class object {
	
    int pass1=111111;                           // variable declairing an initialize
    int pass2=222222;
    int pass3=333333;
    int pass4=444444;
    int pass5=555555;

	
	String name1 = "yogesh";                    // variable declairing an initialize 
	String name2 = "anil";
	String name3 = "raju";
	String name4 = "rohan";
	String name5 = "mohan";
	

	
public static void main(String[] args) {
		
		object ref = new object ();                  // object
		
		System.out.println(ref.pass1);                // variable call
		System.out.println(ref.pass2);
		System.out.println(ref.pass3);
		System.out.println(ref.pass4);
		System.out.println(ref.pass5);
	
		System.out.println();
		
		System.out.println(ref.name1);
		System.out.println(ref.name2);
		System.out.println(ref.name3);
		System.out.println(ref.name4);
		System.out.println(ref.name5);

		
	
	}

}
