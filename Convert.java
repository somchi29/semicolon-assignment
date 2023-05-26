import java.util.Scanner;
	public class Convert {
	public static void main(String[] args) {
	
	Scanner chisomscan = new Scanner(System.in);
	
	System.out.print("Enter a value for feet: ");
	
	
	double feet = chisomscan.nextDouble();
	

	double meter = feet *0.305;
	
	System.out.printf(" The meter is %.4f%n", meter);
	
	
	}
	
}
