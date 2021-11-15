package inheritance;

public class IronManV1 {
	
	
	int helmet;
    int legs=2;
    int hands=2;
    String arcReactor="pallidium";
    
    public IronManV1() {     //using constructor
    	this.helmet=1;
    }
    
    public void canfly()
    {
  	  System.out.println("not able to fly");
    }
    
    final public void missile() {
		// TODO Auto-generated method stub
         System.out.println("shoot missile");
	}
    private void flamethrow()
    {
  	  System.out.println("can throw flame");
    }

	

}
