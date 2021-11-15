package oopsClassObj;

public class ThisKeyword {
	
	
	
	int helmet = 1;
	int hands=2;
	int legs=2;
	String arcReactor = "pallidium";
	String ai;  //here if we not hardcode jarvis then we use this keyword to set.
	
	public void setAI() {
		// TODO Auto-generated method stub
		this.ai = "jarvis"; //if we not write this here then also no problem compiler write it by own in background ;
	}
	
	
	
	
//	public void setAI(String ai) {
//		// TODO Auto-generated method stub
//		ai = "jarvis"; //if we not write this here then also no problem compiler write it by own in background ;
//	}
	
//	public void setAI() {
//		// TODO Auto-generated method stub
//		String ai = "jarvis"; //if we not write this here then also no problem compiler write it by own in background ;
//	}
	
	
	//so here we had created local ai in both upper fun in that case when we print th1.ai
	//again output = null.
	
	//if we set ai like this then we set ai but not current obj's ai that is global
	//thats why we use this keyword;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		
//		
		
		

	}


