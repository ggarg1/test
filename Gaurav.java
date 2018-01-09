import java.io.IOException;


public class Gaurav {

	 private static int count = 0;

	
	public static void main(String[] args) {
		
				System.out.println("This is Gaurav Garg testing using GIT");
				
				Process process =null;
		
			//System.out.println("This is Gaurav Garg testing using GIT");		
				try {
					process.getOutputStream().close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	
	public void doSomething() {
	    //...
	    count++;  // Noncompliant
	  }

	  
}
