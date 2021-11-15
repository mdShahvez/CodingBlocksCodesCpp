package exceptionHandling;

public class ExceptionHandlingDemo {
	
	public static void employee(int linesOfCode) {  
		try {
			if(linesOfCode>2500)
			{
				throw new Exception("Ham nhi karte!!");//here new exception is obj and its refrence is below
			}
		}
		catch(Exception e){
		   System.out.println("ham milkar hi banalenge");
		}
		System.out.println("hum bana lenge");
		
	}
	
	public static void assistant(int linesOfCode) {
		System.out.println("Hello employees i have a job for you");
		employee(linesOfCode);
//          try {
//			employee(linesOfCode);
//		  } 
//          catch (Exception e) {  //this exception e is refrence variable  [employee e = new exception()];
//			
//			System.out.println(e.getMessage());
//			System.out.println("so i have to meke it by own");
//		}
	}

	public static void main(String[] args) {
		System.out.println("hello Assistant i have a job for you");
        assistant(3000);
        System.out.println("promotion!!");
//		try {
//			assistant(3000);
//			System.out.println("promotion!!");
//		} catch (Exception e) {
//			
//			System.out.println(e.getMessage());
//			System.out.println("you are fired");
//		}
		//System.out.println("congo assistant you have promoted");
	}

}
