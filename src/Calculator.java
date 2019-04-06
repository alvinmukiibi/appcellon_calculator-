import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("***** APPCELLON CALCULATOR *****");
		Calculator calc = new Calculator();
		System.out.println("Select Operation");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		
		System.out.print("Enter Choice (1/2/3/4) : ");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		//choice = calc.validateChoice(choice);
		System.out.print("Enter First Number: ");
		int firstNumber = input.nextInt();
		System.out.print("Enter Second Number: ");
		int secondNumber = input.nextInt();
		
		
		double result = calc.doCalculation(choice, firstNumber, secondNumber);
		if(result == 0){
			System.out.println("Invalid Input, Silly");
		}
		System.out.println(result);
		
		
		
	}
	
	public int doCalculation(int choice, int firstNumber, int secondNumber){
		switch(choice){
		case 1:
			return (firstNumber + secondNumber);
		case 2:
			return (firstNumber - secondNumber);
		case 3:
			return (firstNumber * secondNumber);
		case 4:
			return (firstNumber / secondNumber);
		default:
			return 0;
				
		}
	}

}
