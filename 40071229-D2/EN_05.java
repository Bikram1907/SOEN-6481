import java.util.Scanner;

public class EN_05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean f=false;
		while(f==false) {
			System.out.print("To quickly calculate Area, type Area \n");
			String str=sc.nextLine();
			if(str.equalsIgnoreCase("area")) {
				System.out.print("Enter radius : ");
				String str2=sc.nextLine();
				double rad=Double.parseDouble(str2);
				if(rad>=0) {
					double r=3.14*rad;
					r=r*rad;
					System.out.println("Area is : " +r);
				}
				else
				{
					System.out.print("INVALID RADIUS");
					System.out.print("\n");
				}
				
			}
			System.out.print("Press c to continue or \n q to quit ");
			String str4=sc.nextLine();
			if(str4.equalsIgnoreCase("c")) {
				f=false;
				System.out.print("\n");
			}
			else if(str4.equalsIgnoreCase("q"))
			{
				f=true;
				System.out.print("\n");
			}

		}
		
	}

}
