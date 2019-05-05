package Calculator.Calculator;
import java.util.Scanner;

public class Calculator
{
	public static void main (String[] args)
	{
		Scanner IP = new Scanner(System.in);
		
		System.out.println("Welcome to the Calculator ! \n");
		System.out.println("Choose the below options:");
		System.out.println(" 1.ADD \n 2.Substract \n 3.Multiplication \n 4.Division");
		
		int Input = IP.nextInt();
		
		System.out.println("You chose option : " +Input);
		
		Calculator Obj = new Calculator();
		
		switch (Input) {
		case 1:
			Addition(7,17);
			break;
			
		case 2:
			Obj.Substraction(17,7);
			break;
		
		case 3:
			Obj.Multiplication(7, 17);
			break;
			
		case 4:
			Obj.Division(17, 7);
			break;
			
		default:
			System.out.println("Invalid option");
			break;
			
		}
	}
	
	static void Addition(int x,int y)
	{
		int ans;
		
		ans = x + y;
		System.out.println("Answer is = " +ans);
	}
	
	public void Substraction(int x,int y)
	{
		int ans;
		ans = x - y;
		System.out.println("Answer is = " +ans);
	}
	
	public void Multiplication(int x, int y)
	{
		int ans;
		ans = x * y;
		System.out.println("Answer is = " +ans);
	}
	
	public void Division(int x, int y)
	{
		int ans;
		ans = x/y;
		System.out.println("Answer is = "+ans);
	}
}