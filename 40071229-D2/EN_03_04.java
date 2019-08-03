import java.util.Scanner;

public class EN_03_04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean f=false;
		while(f==false) {
			double a=0;
			double b=0;
			System.out.println( " Enter first operand (Rational number or pi): ");
			String str=sc.nextLine();
			if(str.equalsIgnoreCase("pi")) {
				System.out.println("Type D if you want to choose precision of pi or c to continue");
				String str5=sc.nextLine();
				if(str5.equalsIgnoreCase("D"))
				{
				 System.out.println("Till how many decimal places : ");
				 String dps=sc.nextLine();
				 int dp=Integer.parseInt(dps);
				 switch (dp) {
				 case 2: a=3.14;
				 break;
				 case 3: a=3.142;
				 break;
				 case 4: a=3.1416;
				 break;
				 case 5: a=3.14159;
				 break;
				 case 6: a=3.141593;
				 break;
				 case 7: a=3.1415927;
				 break;
				 case 8: a=3.14159265;
				 break;
				 case 9: a=3.141592654;
				 break;
				 case 10: a=3.1415926536;
				 break;
				 case 11: a=3.14159265359;
				 break;
				 case 12: a=3.141592653590;
				 break;
				 case 13: a=3.1415926535898;
				 break;
				 case 14: a=3.14159265358979;
				 break;
				 case 15: a=3.141592653589793;
				 break;
				 default: System.out.println("Invalid input");
				 }
				}
				else {
				 a= 3.141592653589793;
				}
			}
			else
			{
				 a= Double.parseDouble(str);
			}
			System.out.println("Enter the operator (+,-,*,/) : \n or = to just calculate the value of pi");
			String str10=sc.nextLine();
			double Result=0;
			if(str10.equals("=")) {
				Result=a;
				System.out.println(a);
			}
			else {
				System.out.println("Enter second operand (Rational number or pi): ");
				String str3=sc.nextLine();
				if(str3.equalsIgnoreCase("pi")) {
					System.out.println("Type D if you want to choose precision of pi or c to continue");
					String str5=sc.nextLine();
					if(str5.equalsIgnoreCase("D"))
					{
					 System.out.println("Till how many decimal places : ");
					 String dps2=sc.nextLine();
					 int dp2=Integer.parseInt(dps2);
					 switch (dp2) {
					 case 2: b=3.14;
					 break;
					 case 3: b=3.142;
					 break;
					 case 4: b=3.1416;
					 break;
					 case 5: b=3.14159;
					 break;
					 case 6: b=3.141593;
					 break;
					 case 7: b=3.1415927;
					 break;
					 case 8: b=3.14159265;
					 break;
					 case 9: b=3.141592654;
					 break;
					 case 10: b=3.1415926536;
					 break;
					 case 11: b=3.14159265359;
					 break;
					 case 12: b=3.141592653590;
					 break;
					 case 13: b=3.1415926535898;
					 break;
					 case 14: b=3.14159265358979;
					 break;
					 case 15: b=3.141592653589793;
					 break;
					 default: System.out.println("Invalid input");
					 }
					}
					else {
					 b= 3.141592653589793;
					}
				}
				else
				{
					 b= Double.parseDouble(str3);
				}
				double r=0;
				if(str10.equalsIgnoreCase("+")) {
					r=a+b;
					System.out.println("Result : " +r);
				}
				else if(str10.equalsIgnoreCase("-")) {
					r=a-b;
					System.out.println("Result : " +r);
				}
				else if(str10.equalsIgnoreCase("*")) {
					r=a*b;
					System.out.println("Result : " +r);
				}
				else if(str10.equalsIgnoreCase("/")) {
					r=a/b;
					System.out.println("Result : " +r);
				}
				else {
					System.out.print(" INVALID INPUT ");
				}
			}
			System.out.print("Press c to continue or \n q to quit ");
			String str8=sc.nextLine();
			if(str8.equalsIgnoreCase("c")) {
				f=false;
				System.out.print("\n");
			}
			else if(str8.equalsIgnoreCase("q"))
			{
				f=true;
				System.out.print("\n");
			}
		}
	}
}
