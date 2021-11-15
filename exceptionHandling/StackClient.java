package exceptionHandling;

public class StackClient {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		UserBuildStack st = new UserBuildStack();
		st.push(10);
		st.push(30);
		st.push(50);
		st.push(20);
		st.push(60);
		st.push(90);

	}

}
//now its fine 
//only problem is its not dynamic; 