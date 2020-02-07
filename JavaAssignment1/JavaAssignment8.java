import java.util.Scanner;

public class JavaAssignment8 {

	public static void main(String[] args) {
	
		
		Scanner n = new Scanner(System.in);
		int sum= 0;
		
		System.out.print("Enter the number : ");
		int num = n.nextInt();
		
		for (int i = 1;i<=num;i++) {
			if (i%2!=0)
				sum = sum+i;
		}
			
		
		System.out.println("sum of all odd numbers till "+num+" is : "+sum);
	
	
	
	}

}
