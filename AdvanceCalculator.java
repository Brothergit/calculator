package coding;

import java.util.Scanner;

public class AdvanceCalculator
{
	Scanner sc= new Scanner(System.in);
	int number1, number2,choice;
	public void input()
	{
		System.out.println("Enter the number 1: ");
		number1=sc.nextInt();
		System.out.println("Enter the number 2: ");
		number2=sc.nextInt();
	}
	public void addition(int a,int b)
	{
		System.out.println("Addition of two number is : "+(a+b));
		System.out.println("-----------------------------------");
	}
	public void subtraction(int a,int b)
	{
		System.out.println("Subtraction of two number is : "+(a-b));
		System.out.println("-----------------------------------");
	}
	public void multiplication(int a,int b)
	{
		System.out.println("Multiplication of two number is : "+(a*b));
		System.out.println("-----------------------------------");
	}
	public void division(int a,int b)
	{
		while(b==0)
		{
			System.out.println("\nPlease enter the non zero integer: ");
			b=sc.nextInt();
		}
		System.out.println("Division of two number is : "+(a/b));
		System.out.println("-----------------------------------");
	}
	
	public void yourChoice()
	{
		System.out.print("\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n\n");
		System.out.println("Enter your desired option from above menu:");
		choice=sc.nextInt();
		allOperation();
	}
	public void allOperation()
	{

		switch(choice)
		{
			case 1:
				addition(number1,number2);
				break;
			
			case 2:
				subtraction(number1,number2);
				break;

			case 3:
				multiplication(number1,number2);
				break;

			case 4:
				division(number1,number2);
				break;
	
			default:
				System.out.println("Plaese enter the valid option: ");
				break;
			
		}

	}
	public void newChoice()
	{
		System.out.println("\nPlease select desired option\n");
		System.out.println("1. Enter the new numbers\n2. Perform the different option on the same numbers\n3. Return to main menu");
		int newchoice=sc.nextInt();
		if(newchoice != 0 && newchoice <= 2)
		{
			if(newchoice==1)
			{
				input();
				yourChoice();
				newChoice();
			}
			else if(newchoice==2)
			{
				yourChoice();
				newChoice();
			}
		}
		else
			mainMenu();
	}
	
	public void mainMenu()
	{
		while(true)
		{
			System.out.println("---Welcome to the Calculator application---\n");
			input();              
			yourChoice();                  
			newChoice();     
		}
	}

	public static void main(String[] args) 
	{
		AdvanceCalculator ac=new AdvanceCalculator();
		ac.mainMenu();
	}

}
