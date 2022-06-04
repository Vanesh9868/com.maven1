package e2_Encapsulation_ex2;

public class module2  {

	public static void main(String[] args) {

		module1 ref = new module1();
	
		ref.setA(10);
		ref.setB(20);
		ref.setC(30);
		ref.setD(40);
		ref.setE(50);

	System.out.println(ref.getA());
	System.out.println(ref.getB());
	System.out.println(ref.getC());
	System.out.println(ref.getD());
	System.out.println(ref.getE());
	
	
	}

}
