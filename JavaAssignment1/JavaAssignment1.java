import java.util.Scanner;

public class JavaAssignment1 {

	public static void main(String[] args) {
		
		
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the number : - ");
		
		double D = num.nextDouble() ;
		int i = (int)(D);
		
		float f = (float)(D-i);
		
		System.out.println(i);
		System.out.println(f);
	}

}
