import java.util.Scanner;

public class football {
	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter Touchdown Passes");
		double TD = x.nextDouble(); 
		System.out.println("Enter Passing Yards");
		double Yards = x.nextDouble();
		System.out.println("Enter Interceptions");
		double INT = x.nextDouble();
		System.out.println("Enter Number of Completions");
		double Comp = x.nextDouble(); 
		System.out.println("Enter Number of Passing Attempts");
		double ATT = x.nextDouble(); 
		double a = ((Comp/ATT)-.3)*5;
		double b = ((Yards/ATT)-3)*.25;
		double c = (TD/ATT)*20;
		double d = (2.375-((INT/ATT)*25));
		double PR = ((a+b+c+d)/6)*100;
		System.out.println("Passer Rating is " + Double.toString(PR));
		
	}
}
