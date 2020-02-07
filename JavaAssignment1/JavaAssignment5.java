import java.util.Scanner;

public class JavaAssignment5 {

	public static void main(String[] args) {
		
		
		Scanner str = new Scanner(System.in);
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Name : - ");
		String name = str.nextLine() ;
		System.out.print("Enter the Marks 1 : - ");
		double num1 = num.nextDouble() ;
		System.out.print("Enter the Marks 2 : - ");
		double num2 = num.nextDouble() ;
		System.out.print("Enter the Marks 3 : - ");
		double num3 = num.nextDouble() ;
		
		
	   double average = (num1+num2+num3)/3;
			
		
        
	   if (average>=60 && num1>=40 && num2>=40 &&num3>=40)
		   System.out.println(name+" has scored First Class ");
	   
	   else if(average<60 && average>=50 && num1>=40 && num2>=40 &&num3>=40)
		   System.out.println(name+" has scored Second Class ");
	   
	   else if (average<50 && average >=40 && num1>=40 && num2>=40 &&num3>=40)	
		   System.out.println(name+" is PASS ");
	   
	   else 
		   System.out.println(name+" Failed , Better Luck Next Time");
			
	}

}
