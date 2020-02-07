import java.util.Scanner;

public class JavaAssignment7 {

	public static void main(String[] args) {
		
		
		Scanner num = new Scanner(System.in);
		System.out.print("Enter an Alphabhet : - ");
		String character = num.nextLine() ;
		
		char alphabet =  character.charAt(character.length()-1);
		
		System.out.print(alphabet+" is a ");
		switch (alphabet) {
		
		case 'a'  : System.out.print("vowel");break;
		case 'e' : System.out.print("vowel");break;
		case 'i' : System.out.print("vowel");break;
		case 'o' : System.out.print("vowel");break;
		case 'u' : System.out.print("vowel");break;
		
		case 'A'  : System.out.print("vowel");break;
		case 'E' : System.out.print("vowel");break;
		case 'I' : System.out.print("vowel");break;
		case 'O' : System.out.print("vowel");break;
		case 'U' : System.out.print("vowel");break;
		
		default : System.out.print("consonant");break;
		
		
		}
			
		
		
		
			
	}

}
