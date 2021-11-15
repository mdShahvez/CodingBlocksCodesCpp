package inheritance2;

public class Benz2 extends Benz {
	
	public Benz2()
	{
		System.out.println("Benz2 ka constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Benz2  b = new Benz2();
		System.out.println(b.companyName);

	}

}
