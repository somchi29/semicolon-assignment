import java.util.Scanner;

public class Acceleration{
	public static void main(String[] args){
	Scanner chisomscan = new Scanner(System.in);
	
	System.out.print("Enter v0, v1, and t ");
	
	double StartVelocity=chisomscan.nextDouble();
	double EndVelocity=chisomscan.nextDouble();
	double time=chisomscan.nextDouble();
   
	
	double acceleration= (EndVelocity- StartVelocity)/time;
     
	System.out.printf("the average acceleratio is: %.4f%n",acceleration);
   
   
       }
   
   }
