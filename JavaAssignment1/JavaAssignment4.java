import java.util.Scanner;

public class JavaAssignment4 {

	public static void main(String[] args) {
		
		
		Scanner num = new Scanner(System.in);
		System.out.print("Enter an number 1 : - ");
		double D1 = num.nextDouble() ;
		
		System.out.print("Enter an number 2 : - ");
		double D2 = num.nextDouble() ;
		
		System.out.print("Enter an number 3 : - ");
		double D3 = num.nextDouble() ;
		
		
		if(D1>D2 && D1>D3) {System.out.println("Largest Number is : " +D1);}
		else if(D2>D1 && D2>D3) {System.out.println("Largest Number is : " +D2);}
		else if(D3>D1 && D3>D2) {System.out.println("Largest Number is : " +D3);}
		else System.out.println("Two or more numbers cannot be same ");
		
		if(D1<D2 && D2<D3 || D1>D2 && D2>D3) {System.out.println("second Largest Number is : " +D2);}
		else if(D2<D1 && D1<D3 ||D2>D1 && D1>D3 ) {System.out.println("second Largest Number is : " +D1);}
		else if(D3>D1 && D2>D3 || D2<D3 && D3<D1 ) {System.out.println("second Largest Number is : " +D3);}
		else System.out.println("Two or more numbers cannot be same "); 
		
			
	}

}
