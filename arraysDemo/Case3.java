package arraysDemo;

public class Case3 {
	
	static int a=4;
	static int b=5; //these are global variable also called as shared variable which are accessable everywhere in class.
	
	private static void swap() {
		// TODO Auto-generated method stub
		int temp=a;
		a=b;
		b= temp;

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("address of a" + " "+a);
		System.out.println("address of b" + " "+b);
        swap();
        System.out.println("address of a "+" "+a);
        System.out.println("address of b "+" "+b);
        
	}

}
