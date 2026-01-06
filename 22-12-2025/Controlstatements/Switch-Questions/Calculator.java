//1.calculator 
//based on user choice:
//1-Addition
//2.Subtraction
//3.Multiplication
//4.Division
//Question:Write a Java program using switch-case to perform the operation 

import java.util.Scanner;

class Calculator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		double a =sc.nextDouble();
		
		System.out.print("Enter second number: ");
		double b=sc.nextDouble();
		
		System.out.println("Enter your choice: ");
        System.out.println("1-Addition");
        System.out.println("2-Subtraction");
        System.out.println("3-Multiplication");
        System.out.println("4-Division");
		
		  int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("Addition = " + (a + b));
                break;

            case 2:
                System.out.println("Subtraction = " + (a - b));
                break;

            case 3:
                System.out.println("Multiplication = " + (a * b));
                break;

            case 4:
                if(b != 0)
                    System.out.println("Division = " + (a / b));
                else
                    System.out.println("Error: Cannot divide by zero");
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
	