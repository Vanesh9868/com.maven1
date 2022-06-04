package eDay13_interface_abstraction;

public class parent implements child1,child2,child3 {
	
	public child1 click()
	{
		return null;
		
	}

	public static void main(String[] args) {
		
		parent z = new parent ();
		
		z.mulga1();
		z.mulga2();
		z.mulga3();
		
	}

	@Override
	public void mulga3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mulga2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mulga1() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void mulga1()
//	{
//         System.out.println(" muga1 = i am enineer ");		
//	}
//	
//
//	@Override
//	public void mulga2()
//	{
//         System.out.println(" mulga3 = i am driver ");		
//	}
//	
//	@Override
//	public void mulga3() 
//	{
//		System.out.println(" mulga3 = i am doctor ");
//	}

	
	
}
