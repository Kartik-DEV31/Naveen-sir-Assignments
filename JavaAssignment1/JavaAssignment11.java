
import java.util.Scanner;

public class JavaAssignment11 {

	public static void main(String[] args) {
	
		
		Scanner str = new Scanner(System.in);
		
		
		
		System.out.print("Enter the number : ");
		int num = str.nextInt();
		
		String series = new String();
		
		for (int i = 1;i<=num;i++) {
			
			if (i%2==0)
				{series += ", -"+i+" , "; continue;}
			else 
				{series += i;continue;}
		}
		
		System.out.println("Required series is : "+series);
	
		
	}

}
