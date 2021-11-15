package inheritance;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ref->child class  obj->child class
		IronManV2 im2 = new IronManV2();
		
		//ref->parent obj->parent class
		IronManV1 im1 = new IronManV1();
		im2.canfly();
		
		im2.missile();//can be inherited but not able override
		
       im2.unibeam();
       System.out.println(im1.arcReactor);
       System.out.println(im2.ai);
       
       
       //ref->parent     obj->child       
       IronManV1 suit = new IronManV2();//this is possible bcz ironmanv2 is ironman v1 as it is its child but improved one
       suit.canfly();
       
       
       System.out.println(im2.helmet);
       System.out.println(im1.helmet);
       
       
	}

}
