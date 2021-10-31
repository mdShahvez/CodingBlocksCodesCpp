package arraysDemo;

public class global {
	
	static int shahvez=6; //global declarition  here shahvez is  global so it can be accessed any where in this class

	
	private static void India() {
		// TODO Auto-generated method stub
        System.out.println("Shahvez is in India");
	}
	private static void UAE() {
		// TODO Auto-generated method stub
		System.out.println("Shahvez in uae now");

	}
	private static void USA() {
		// TODO Auto-generated method stub
		System.out.println("Shahvez in usa now");
	}
	private static void england() {
		// TODO Auto-generated method stub
		System.out.println("Shahvez in england now");
	}

	public static void main(String[] args) {
	
		System.out.println(shahvez);  //call shahvez here it'll print 6;obviously
		//now if i change shahvez =99;
		//here
		shahvez = 99;
		//and now i'll print shahvez;
		System.out.println(shahvez);//it'll print 99 here  bcz shahvez is global and when value is change so it i'll change for all
		
		
		//-------------------------------------------------------------------------------------------------------
		
		India();
		UAE();
		USA();
		england();
		//so on;
	}
	

}
