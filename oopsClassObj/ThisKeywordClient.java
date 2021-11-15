package oopsClassObj;

public class ThisKeywordClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword th1 = new ThisKeyword();
		ThisKeyword th2 = new ThisKeyword();
		
		System.out.println(th1.ai);     //herev we got null bcz in memory first memory will be assigned to obj or instance variable 
		                                 // and when it'll reach to ai he'll see that it is not declared thats why we got null here.
		
		th1.setAI();//now here we call set ai now itll set its value to jarves
		            //but here we did'nt pas any argument so how'd it is able to chnage the ai in memory
		  //so it is actually when we write th1.setAI() it automatically pass th1 in braces		 so he's know that which obj's ai he has to chnage ;
		System.out.println(th1.ai);
		System.out.println(th2.ai); // here u can see that this obj's ai is null here
		
		
		
		//this keyword change the value  of  current obj
		//implicitly andar hi andar wo pass ho jayga th1 braces me
		

	}

}
