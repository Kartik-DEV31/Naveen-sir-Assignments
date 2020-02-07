import java.util.Scanner;

public class JavaAssignment9 {

	public static void main(String[] args) {
	
		
		Scanner str = new Scanner(System.in);
		
		String reversed = new String(); 
		
		System.out.print("Enter the number : ");
		String num = str.nextLine();
		
		for (int i = num.length()-1;i>=0;i--) {
			
			reversed += num.charAt(i);
			
		}
			
		
		System.out.println("Reverse of "+num+" is : "+reversed);
	
	
	
	}

}
