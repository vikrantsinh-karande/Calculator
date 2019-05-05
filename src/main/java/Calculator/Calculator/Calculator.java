package Calculator.Calculator;
import java.util.Scanner;

public class Calculator
{
	public static void main (String[] args)
	{
		Scanner IP = new Scanner(System.in);
		int x,y,ans;
		x = 17;
		y = 7;
		
		System.out.println("Welcome to the Calculator ! \n");
		System.out.println("Choose the below options:");
		System.out.println(" 1.ADD \n 2.Substract \n 3.Multiplication \n 4.Division");
		
		int Input = IP.nextInt();
		
		System.out.println("You chose option : " +Input);
		
		switch (Input) {
		case 1:
			ans = x + y;
			System.out.println("Answer is = " +ans);
			break;
			
		case 2:
			ans = x - y;
			System.out.println("Answer is = " +ans);
			break;
		
		case 3:
			ans = x * y;
			System.out.println("Answer is = " +ans);
			break;
			
		case 4:
			ans = x/y;
			System.out.println("Answer is = "+ans);
			break;
			
		default:
			System.out.println("Invalid option");
			break;
			
		}
	}
}