package oopsClassObj;

public class IronManClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IronManV1 im1 = new IronManV1();  // here we make obj using blue print which in same package but in another class
		                //obj/instance
		// and the characterstic of ironman v1 is called as {(instance variable) or (object variable)}
		
//---------------------------------------------------------------------------------------------------------------------------------		 
		new IronManV1(); //this is also an object but without refrence it is called as anonymus object that kind of obj cannot be accesed or used in another fun
		//can use oinly in same function or in same line 
		// jaha likege wahi banega aur wahi khtm ho jayga
		
		//for accessing characterstics
         System.out.println(im1.helmet);
         System.out.println(im1.hands);//and so on 
         //using dot we can access
         
         
 //----------------------------------------------------------------------
         // to access or to get we use dot .
         
         im1.canShoot();
         //im1.canfly(); is not accessable bcz it is private
         //we can access online those fun which are public not private .
         //puclic can be access in another class also;
         //private can access only in same class 
         
         
//to set ------------------------------------------------------------------
         
         im1.arcReactor = "vibranium";//now this will go in heap and change from pallidum to vibranium aur change persist karega kuki anadar gus ke kie
         System.out.println(im1.arcReactor);
         

	}

}
