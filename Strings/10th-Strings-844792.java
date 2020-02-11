import java.util.*;
class Tester{
            
            StringBuffer  str2;
            StringBuffer str1;
            char ch;
                    
            public StringBuffer insertString(String str1,String str2,char ch)
            {
                    StringBuffer sb=new StringBuffer();
                    this.str1=new StringBuffer(str1);
                    this.str2=new StringBuffer(str2);
                    this.ch=ch;
                    
                    int index=str1.indexOf(ch);
                    
                 if(index!=-1){
                    this.str1.insert(index,str2);
                   return this.str1;}
                  else 
                    {
                     
                   
                      System.out.print("entered char is not present in string");
                      return sb;
            }
}
}
class Main{
     public static void main(String[] args)
     {
                    Scanner input=new Scanner(System.in);
                    System.out.print("enter first string:");
                    String str1=input.nextLine();
                    System.out.print("enter second string:");
                    String str2=input.nextLine();
                    System.out.print("enter character at  which you to insert:");
                    char ch=input.next().charAt(0);
                   
                    Tester t=new Tester();
			StringBuffer strB = new StringBuffer() ;
                    strB=t.insertString(str1,str2,ch);

                    System.out.println(strB);

}
}



/* 
 * OutPut :- 
 *	 enter first string:kartik 
	enter second string:java
	enter character at  which you to insert:r
	kajavartik 
 * */

