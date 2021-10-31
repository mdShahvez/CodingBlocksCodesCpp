package arraysDemo;

public class Case1 {

	public static void main(String[] args) {
		int[] arr1 = new int [4];
		int[] arr2 = new int[3];
		
		System.out.println("address of arr1 before swap "+" "+arr1);
		System.out.println("address of arr2 before swap "+" "+arr2);
		
		int[] temp = arr1;
		arr1=arr2;
		arr2 = temp;
		
		
		System.out.println("address of arr1 after swap "+" "+arr1);
		System.out.println("address of arr2 after swap "+" "+arr2);
		
		
		

	}

}
