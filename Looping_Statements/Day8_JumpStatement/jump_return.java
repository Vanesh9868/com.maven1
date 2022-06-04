package Day8_JumpStatement;

public class jump_return {
	
public String yogi () {return "yogesh prakash shinde"; }

	public static void main(String[] args) {

		for (int i=1;i<=10;i++)
	    {
		if (i==5) {continue;}
	
		System.out.println(i);
		 }
		
	jump_return obj = new jump_return ();

		System.out.println(obj.yogi());


	}

}
