package exceptionHandling;

public class UserBuildStack {
	
	
	protected int [] data;             //this is  only refrence 
    private int topOfStack;
    
    //when user did not pass any capacity of stack we made a 5 capacity stack by default
    public UserBuildStack() {
    	this.data = new int[5];  //default capacity of stack is 5;
 	    this.topOfStack=-1;
 	   
    }
    
    //when it passes the capacity we make that capacity stack
    public UserBuildStack(int capacity) {
    	this.data=new int[capacity];
    	this.topOfStack=-1;
    }
    
    public int  size() {
    	return this.topOfStack+ 1;
    }
    
    public boolean isEmpty() {
    	return this.size()==0;
    }
    
    public boolean isFull()
    {
    	return this.size() == this.data.length;
    }
    
    public void push(int value) throws Exception {
    	if(isFull())
    	{
    		throw new Exception("Already full");
    	}
    	this .topOfStack++;
    	data[topOfStack]=value;
    	
    }

    public int pop() throws Exception{
    	if(isEmpty())
    	{
    		throw new Exception("already empty!!");          // here it is wrong to return a value baz that value may be present in stack but as we dont know exception handling we'll do it later
    	}
    	int temp=data[topOfStack];
    	data[topOfStack]=0;
    	topOfStack--;
    	return temp;
    }
    
    public int peek() {
    	if(isEmpty())
    	{
    		System.out.println("already empty");
    		return -1 ;           // here it is wrong to return a value baz that value may be present in stack but as we dont know exception handling we'll do it later
    	}
    	int temp=data[topOfStack];
    	return temp;
    	
    	
    }
    
    public void display() {
    	for(int i=topOfStack;i>=0;i--)
    	{
    		System.out.print(data[i]+" ");
    	}
    	System.out.println();
    }
  }
