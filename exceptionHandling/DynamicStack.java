package exceptionHandling;

public class DynamicStack extends UserBuildStack {
	
    @Override
    public void push(int value) throws Exception {
    	if(isFull()) {
    		//increase capacity alws double the capacity
    		int[] newData = new int[data.length*2] ;
    		for(int i=0;i<data.length;i++)
    		{
    			newData[i]=data[i];//data se new data arr me copy kardia
    		}
    		data=newData; //name change kia  pehle data arr me the ab new data arr me he
    	}
    	super.push(value);   //else here we call parent constructor to add value.
    	
    } 
    public static void main(String[] args) throws Exception {
		DynamicStack ds = new DynamicStack();
		for(int i=1;i<100;i++)
		{
			ds.push(i);
		}
		ds.display();
				
	}
}
