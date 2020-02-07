import java.math.BigInteger;
import java.util.Scanner;

public class JavaAssignment14 {
	static int n=0;

	public static void main(String[] args) {
	
		
		Scanner str = new Scanner(System.in);
		
		
		
		System.out.print("Enter the number : ");
		int num = str.nextInt();
		n=num;
		
		BigInteger factorial = new BigInteger("1");
		if (num>=0) {
			Factorial(factorial , num);
		
		
		}
	
		else System.out.println(" Please enter a non negative INTEGER ");
		
		
	}
	
	public static  void Factorial(BigInteger factorial , int num ) {
		 BigInteger factor =  factorial;
		
		 int num1 =num;
		
		 
		factor = factor.multiply(BigInteger.valueOf(num1));
		num1--;
		
		if (num1>0)
		{
			
			Factorial(factor,num1);
			
			
		}
		else 
			System.out.println("Factorial of "+n+" is : "+factor);
		
		
			
	}

}
