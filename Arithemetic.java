import java.util.Scanner;

	public class Arithemetic {
	
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter first integer:");
	int number1 = scan.nextInt();
	
	System.out.print("Enter second integer:");
	int number2 = scan.nextInt();
	
	System.out.print("Enter third integer:");
	int number3 = scan.nextInt();
	 
	int sum = number1 + number2 + number3;
	
	double average = sum / 3;
	
	int product = number1 * number2* number3;
	
	int smallest = number1;
	int largest = number2;
	
	if(number1 < number2);
	if(number1 < number3);
	if(number3 > number2);
	
	System.out.printf("sum:%d%n",sum);
	System.out.printf("average:%.2f%n",average);
	System.out.printf("product:%d%n",product);
	System.out.printf("smallest:%d%n",smallest);
	System.out.printf("largest:%d%n",largest);
	
	}
	
	
}
