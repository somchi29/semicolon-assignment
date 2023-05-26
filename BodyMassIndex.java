import java.util.Scanner;
	public class BodyMassIndex{
	public static void main(String[] args){
	
	Scanner chisomscan = new Scanner(System.in);
	
	System.out.print("enter your weight in pound ");
	double weight=chisomscan.nextDouble();
	
	System.out.print("enter your height in inches ");
	double height=chisomscan.nextDouble();
	
	double bodyMassIndex= (weight*0.45359237)/((height*0.0254)*(height*0.0254));
	
	System.out.printf("BMI is %.4f/n",bodyMassIndex);
	
	
	}
	
	
}
