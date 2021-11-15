package exceptionHandling;

public class MultipleCatches {

	public static void main(String[] args) {
		
		try {
		int a=5/2;
		System.out.println(a);
//			int[] arr = new int[5];
//			arr[6]=7;
			
//			String s ="Shahvez";
//			s.charAt(9);
		
		}catch(ArithmeticException e) {
			System.out.println("divide by 0 is not allowed");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("invalid array  index");
			
		}catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("invalid index of string");
		}
		finally {
			System.out.println("runs in every situation");
		}
		System.out.println("outside every try and catch block");//but this line dosent run if we write return in above code.thats whay use finally block to put statement in this block so they runs alwys
		

	}

}
