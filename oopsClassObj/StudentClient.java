package oopsClassObj;

public class StudentClient {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.println(s1.belt);
		System.out.println(s2.hand);
		
		
		//now i print uniform for both obj or for both student it'll print white
		System.out.println(s1.uniform);
		System.out.println(s2.uniform);

		s1.uniform="blue";
		
		System.out.println(s1.uniform);
		System.out.println(s2.uniform);//now it is blue for both if we change for one it will change for all bcz it is static global
		                               // but its look like we are changing uniform for object as we write (s1.uniform)
		                               // so the crrt style is Student.uniform="blue";
		                                                    //className variableName
		                              //now this is for whole class.
		
		
		//so jin variable s ko hame share karana he unhe ham static banate he
	}

}
