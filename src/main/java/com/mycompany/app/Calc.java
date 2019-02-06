import java.util.Scanner;

public class Calc{
	public static void main(String args[]){
		float a,b,res;
		char choice,ch;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("1. Add two numbers");
			System.out.println("2. Substract two numbers");
			System.out.println("3. Exit\n");
			System.out.println("Enter the choice: ");
			choice = scan.next().charAt(0);
			switch(choice){
				case '1' : System.out.print("Enter the numbers: ");
							a = scan.nextFloat();
							b = scan.nextFloat();
							res = a+b;
							System.out.println("Result = "+res);
							break;

				case '2' : System.out.print("Enter the numbers: ");
							a = scan.nextFloat();
							b = scan.nextFloat();
							res = a-b;
							System.out.println("Result = "+res);
							break;	

				case '3' : System.exit(0);
							break;


				default : System.out.println("Invalid choice!!!");
							break;						
			}
			System.out.println("----------------------------");
		} while(choice!=2);
	}
}
