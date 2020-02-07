import java.util.Scanner;

public class JavaAssignment2 {

	public static void main(String[] args) {
		
		
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the number 1 : - ");
		double D1 = num.nextDouble() ;
		System.out.print("Enter the number 2 : - ");
		double D2 = num.nextDouble() ;
		System.out.print("Enter the number 3 : - ");
		double D3 = num.nextDouble() ;
		
		
		double D =   ((D1>D2) ? (D1>D3 ? D1:D3):(D2>D3 ?D2:D3)  );
			System.out.println("Largest Number : "+D);
		
	
		
		
		
	}

}
