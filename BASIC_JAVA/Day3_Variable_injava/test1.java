package Day3_Variable_injava;

public class test1 {

	public static void main(String[] args) {
		
   storage_test1 ref = new storage_test1 ();
                                                           // variable initialization
	    ref.email="yogesh";
		ref.password=123456;
		ref.button="click";

                                                            // variable calling
		System.out.println(ref.email);
		System.out.println(ref.password);
		System.out.println(ref.button);
		
		
	}

}
