import java.util.Scanner;

public class JavaAssignment12{

	public static void main(String[] args) {
	
		
		Scanner str = new Scanner(System.in);
		int sum =0;
		
		
		System.out.print("Enter the starting number : ");
		int num1 = str.nextInt();
		
		System.out.print("Enter the ending number : ");
		int num2 = str.nextInt();
		
		String series = new String();
		
		
		
		if (num1 == 1)
			num1 = num1+1;
		
		if (num1 == 0)
			num1 = num1+2;
		
		if (num1<num2)
		{
			System.out.print("Required series of Prime Numbers is : ");
		if (num1==2)
			{sum =sum+2; System.out.print(2+" , ");}
		if (num1>=2 && num1<=3)
			{sum = sum+3;System.out.print(3+" , ");}
		if (num1>=2 && num1<=11)
			for (int i = num1;i<=num2;i++)
			{			if(i%2!=0 && i%3!=0)
			{sum = sum+i;
			System.out.print(i+" , ");}
	}
		
		
		if (num1>11) {
		for (int i = num1;i<=num2;i++) {
			
			if (i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0 && i%11!=0)
			{		sum = sum+i;
				System.out.print(i+" , ");
		}
		}
		}
		System.out.println("");
		System.out.println("Sum of Primes :- "+sum);
	
		
		}else System.out.println("Please enter ending number greater than starting number...");
	}

}
