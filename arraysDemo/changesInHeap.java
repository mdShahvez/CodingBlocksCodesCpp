package arraysDemo;

public class changesInHeap {
	private static void changeColor(char[]shahvez,int index) {
		// TODO Auto-generated method stub
		
		if(index==shahvez.length)
		{
			return;
		}
		shahvez[index] = 'w';  //ab ye array ke andar gya then index pe gya aur color change kardia ab ye change persist karega.
		                   //andar ghus ke change karoge to wo change persist karega
		
		changeColor(shahvez,index+1);    //this will change the whole color in array
		
		shahvez[index]='B';   //now this is back track if i want the same color in my array so i had to back track;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] shahvez = {'B','B','B'};
		System.out.println(shahvez[0]);//print value at 0th index
		
        changeColor(shahvez,0);//here 0 is index  here we call fun
        
        System.out.println(shahvez[0]); 
        
        for(char value:shahvez)
        {
        	System.out.println(value);
        }
        //heap---> arr ----> index-----> change kia ----->persist karega.
	}

}
