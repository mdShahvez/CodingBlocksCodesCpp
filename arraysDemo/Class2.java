package arraysDemo;

public class Class2 {
	
	private static void swapinfun(int n1,int n2) {
		// TODO Auto-generated method stub
		int temp = n1;
		n1=n2;
		n2=temp;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 5;
		
		swapinfun(a,b);
		
		System.out.println(a+" "+b);
		
		//here swap is not done successsfully swap only take place in fun but not visible in main;
		
		
		
	}

}
