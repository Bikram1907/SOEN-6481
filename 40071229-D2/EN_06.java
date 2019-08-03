import java.util.ArrayList;
import java.util.Scanner;

public class EN_06 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		boolean f=false;
		ArrayList<Double> al=new ArrayList<>();
		while(f==false) {
			double a=0;
			double b=0;
			System.out.println( " Enter first operand (Rational number or pi): ");
			String str=sc.nextLine();
			if(str.equalsIgnoreCase("pi")) {
				 a= 3.141592653589793;
			}
			else
			{
				 a= Double.parseDouble(str);
			}
			System.out.println("Enter the operator (+,-,*,/) : " );
			String str2=sc.nextLine();
			System.out.println("Enter second operand (Rational number or pi): ");
			String str3=sc.nextLine();
			if(str3.equalsIgnoreCase("pi")) {
				 b= 3.141592653589793;
			}
			else
			{
				 b= Double.parseDouble(str3);
			}
			double r=0;
			if(str2.equalsIgnoreCase("+")) {
				r=a+b;
				System.out.println("Result : " +r);
			}
			else if(str2.equalsIgnoreCase("-")) {
				r=a-b;
				System.out.println("Result : " +r);
			}
			else if(str2.equalsIgnoreCase("*")) {
				r=a*b;
				System.out.println("Result : " +r);
			}
			else if(str2.equalsIgnoreCase("/")) {
				r=a/b;
				System.out.println("Result : " +r);
			}
			else {
				System.out.print(" INVALID INPUT ");
			}
			System.out.print("Press S to save the result or \n c to continue or \n q to quit ");
			String str4=sc.nextLine();
			if(str4.equalsIgnoreCase("s")) {
				al.add(r);
				System.out.print(" Result Saved " +al);
				System.out.print("\n");
			}
			else if(str4.equalsIgnoreCase("c")) {
				f=false;
				System.out.print("\n");
			}
			else if(str4.equalsIgnoreCase("q"))
			{
				f=true;
			}
			else
			{
				System.out.println("INVALID OUTPUT");
				System.out.print("\n");
			}
		}
	}
}
