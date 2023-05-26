import java.util.Scanner;

	public class IntegerNumber{
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Enter first integer:");
		int number1 = scan.nextInt();
	
		System.out.print("Enter second integer:");
		int number2 = scan.nextInt();
	
		int square1 = number1 * number1;
		
		int square2 = number2 * number2;
		
		int sum = square1 + square2;
		
		int difference = square1 - square2;
	
		System.out.printf("%d%n",sum);
		System.out.printf("%d%n",difference);
		
		
	
	}
	
	
}
