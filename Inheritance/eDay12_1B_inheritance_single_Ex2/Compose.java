package eDay12_1B_inheritance_single_Ex2;

public class Compose extends login {
	
	String compose      = "click on compose";
    String to           ="click on to";
    String subject      = "click on subject";
    String massage      = "write the massage";
    String send         = "click on sent";
    
	public static void main(String[] args) {

		Compose X = new Compose();
		
          System.out.println(X.id);	
          System.out.println(X.pass);
          System.out.println(X.login);
          
          System.out.println(X.compose);
          System.out.println(X.to);
          System.out.println(X.subject);
          System.out.println(X.massage);
          System.out.println(X.send);
		
	}

}
