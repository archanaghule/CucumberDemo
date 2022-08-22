package arrays.com;

import java.util.Scanner;

public class FizzBuzzProgram {

	public static void main(String[] args) {
		
		/*
		 * Rules of the FizzBuzz Game The rules of the FizzBuzz game are very simple.
		 * 
		 * Say Fizz if the number is divisible by 3.
		 *  Say Buzz if the number is divisible by 5
		 * Say FizzBuzz if the number is divisible by both 3 and 5. 
		 * Return the number itself, if the number is not divisible by 3 and 5.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int number = scanner.nextInt();
		
		// suppose user enter number is 15
		
		for(int i=1;i<=number;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("FizzBuzz");
			}
			else if(i%3==0)
			{
				System.out.println("Fizz");
			}
			else if(i%5==0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(i);
			}
			
			System.out.println(" "+" ");
		}
		

	}

}
