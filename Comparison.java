import java.util.Scanner;
	public class Comparison {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter first integer; ");
	int number1 = scan.nextInt();
	
	System.out.print("Enter second integer; ");
	int number2 = scan.nextInt();
	
	if (number1 == number2) {
	   System.out.printf("%d == %d%n", number1 , number2);
	   }
	   
	if (number1 != number2) {
	   System.out.printf("%d != %d%n", number1 , number2);
	}
	
	if (number1 < number2) {
	   System.out.printf("%d  < %d%n", number1 , number2);
	 }
	    
	if (number1 > number2) {
	   System.out.printf("%d > %d%n", number1 , number2);
	}
	   
	if (number1 <= number2) {
	   System.out.printf("%d <= %d%n", number1 , number2);
	}
	   
	if (number1 >= number2) {
	   System.out.printf("%d >= %d%n", number1 , number2);
	 }
	   
       }

}
	
	

