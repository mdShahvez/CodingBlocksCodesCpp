package inheritance2;

public class Benz extends Car {
	
        public Benz()
        {
        	super("mercedes");//if i did not write this then mercedes did not pas to car class and did not assign to company name that why we us esuper to explicitly assign compnay name
        	                    //else we can also assign mercedes directly in car class;
        	System.out.println("benz ka constructor");
        }
//        public static void main(String[] args) {
//			Benz b = new Benz();
//			System.out.println(b.companyName);
//		}
	

}
