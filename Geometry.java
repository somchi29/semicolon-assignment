import java .util.Scanner;

public class Distance {
	public static void main(String [] args) {
	
	Scanner chisomscan = new Scanner(System.in);
	
	System.out.print("Enter the driving distance: ");
	double drivingDistance = chisomscan.nextDouble();
	
	System.out.print("Enter miles Per gallon: ");
	double milesPerGallon = chisomscan.nextDouble();
	
	System.out.print("Enter price per gallon ");
	double pricePerGallon = chisomscan.nextDouble();
	
	double costOfDriving = drivingDistance*(pricePerGallon / milesPerGallon);
	
    System.out.printf(" The cost of driving is %f%n", costOfDriving);
	
	}
	
	
}
