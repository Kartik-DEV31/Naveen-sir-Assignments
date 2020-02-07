
import java.util.Scanner;

public class JavaAssignment13 {

	public static void main(String[] args) {
	
		
		Scanner str = new Scanner(System.in);
		
		
		
		System.out.print("Enter the Array Size : ");
		int size = str.nextInt();
		int data[ ] = new int [size];
		
		
		System.out.print("Enter the data :- ");
		for (int i =0 ;i<size;i++)
		{
			
			
			data[i] = str.nextInt();			
		}
		
		System.out.print("Enter the Target Value :- ");	
		int target = str.nextInt();
		int count =1;
		
		for (int i =0 ;i<size;i++)
		{
			
			if (target == data[i]) {
				count--;
				System.out.println("Target found at index "+i);
				break;
			}
			
		}	
		
		if (count ==1)
		System.out.println("Target not present in Array....... ");
			
		
		
		
	}

}
