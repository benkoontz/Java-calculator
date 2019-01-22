import java.util.Scanner;

// This program can add, subtract, multiply, or divide two numbers.
// First, choose an option to add, subtract, multiply, or divide.
// Next, enter your first number.
// Lastly, enter your second number.

public class apples {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int total = 0;
		int num1;
		int num2;
		int counter = 0;
		int option;
		 
		System.out.println("enter an option: 1 = add, 2 = subtract, 3 = multiply, 4 = divide");
		
		option = input.nextInt();
		
		
		switch (option) {
		
		case 1:
			System.out.println("enter first number");
			num1 = input.nextInt();
			System.out.println("enter secoond number");
			num2 = input.nextInt();
			total = num1 + num2;
			System.out.println("your result is " + total);
		break;
		case 2:
			System.out.println("enter first number");
			num1 = input.nextInt();
			System.out.println("enter secoond number");
			num2 = input.nextInt();
			total = num1 - num2;
			System.out.println("your result is " + total);
		break;
		case 3:
			System.out.println("enter first number");
			num1 = input.nextInt();
			System.out.println("enter secoond number");
			num2 = input.nextInt();
			total = num1 * num2;
			System.out.println("your result is " + total);
		break;
		case 4:
			System.out.println("enter first number");
			num1 = input.nextInt();
			System.out.println("enter secoond number");
			num2 = input.nextInt();
			total = num1 / num2;
			System.out.println("your result is " + total);
		break;
		default:
			System.out.println("didn't enter a correct option");
		}
		

	}
		
}
	

