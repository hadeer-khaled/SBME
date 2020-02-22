
package sbme;
import java.util.Scanner ;
public class SBME {
  public static void main(String[] args) {
   float num1,num2;
   char operator  ;
   Scanner input = new Scanner(System.in);
    System.out.println("please enter the first number");
    num1= input.nextFloat();
    System.out.println("please enter the second number");
    num2=input.nextFloat();
    System.out.println("please enter an operator ");
   operator=input.next().charAt(0);
     if(operator=='+')
                     System.out.printf("RESULT=%f \n " ,num1+num2);
     else if(operator=='-')
                     System.out.printf("RESULT=%f \n " ,num1-num2);
     else if(operator=='*')
                     System.out.printf("RESULT=%f \n " ,num1*num2);
     else if(operator=='/')
                     System.out.printf("RESULT=%f \n " ,num1/num2);
     else if(operator=='%')
                     System.out.printf("RESULT=%f \n " ,num1%num2);
     else 
                     System.out.println("INVALID , PLEASE TRY AGAIN ") ; 
    }
    
}
