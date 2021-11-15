package inheritance;

public class IronManV2 extends IronManV1 {

	
	String ai ="jarvis";
	int helmet;
	public IronManV2() {
		this.helmet=2;
	}
	
	//sirf apne aap ko better banane ke lie over ride karte he
	@Override
	public void canfly() {
		// TODO Auto-generated method stub
		super.canfly();
		System.out.println("child become better now ironman v2 can fly");
	}
    
	public void unibeam() {
		// TODO Auto-generated method stub
		System.out.println("shoot with unibeam");

	}
}
