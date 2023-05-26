import java.util.Scanner;
	public class SumDigit {
	
		public static void main(String[] args) {
		Scanner chisomscan = new Scanner(System.in);
	
		System.out.print("Enter a number between 0 and 1000: ");
	
		int number=chisomscan.nextInt();
	
		int SumOfNumber = (number % 10) + ((number/10)%10) + ((number/100)%10);
	
		System.out.printf("The sum of the digits is %d%n", SumOfNumber);
	
	}
	
	
}
