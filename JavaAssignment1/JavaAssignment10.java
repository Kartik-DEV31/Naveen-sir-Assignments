import java.math.BigInteger;
import java.util.Scanner;

public class JavaAssignment10 {

	public static void main(String[] args) {
	
		
		Scanner str = new Scanner(System.in);
		
		
		
		System.out.print("Enter the number : ");
		int num = str.nextInt();
		
		BigInteger factorial = new BigInteger("1");
		if (num>=0) {
		for (int i = num;i>1;i--) {
			
			factorial = factorial.multiply(BigInteger.valueOf(i));
			
		}
			
		
		System.out.println("Factorial of "+num+" is : "+factorial);
		}
	
		else System.out.println(" Please enter a non negative INTEGER ");
		
		
	}

}
