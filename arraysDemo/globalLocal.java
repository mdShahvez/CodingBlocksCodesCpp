package arraysDemo;

public class globalLocal {
	
	static int shahvez=6;//it is global;
	
	
	private static void India() {
		// TODO Auto-generated method stub
		int shahvez = 11;   //local shahvez sir india ka 
		System.out.println(shahvez);
     
	}
	private static void UAE() {
		// TODO Auto-generated method stub
		int shahvez = 22;     //local shahvez sirf uae ka and  so on 
		System.out.println(shahvez);

	}
	private static void USA() {
		// TODO Auto-generated method stub
		int shahvez = 33;
		System.out.println(shahvez);
	}
	private static void england() {
		// TODO Auto-generated method stub
		int shahvez = 44;
		System.out.println(shahvez);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(shahvez); //it'll print global one shahvez
		
		
		//baki function apne local shahvez ko print karege 
		India();
		USA();
		UAE();
		england();
		
		//so here when we call any fun that function print its local shshvez not global one .
		//bcz 
		//Global shahvez priority < local shshvez priority
		

	}

}
