package ex01;

import java.util.Scanner;

public class Program
{

	public static void main(String[] args)
	{
		int number = 0;
		boolean check = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("-> ");
		number = sc.nextInt();
		
		if (number <= 1)
			System.err.println("IllegalArgument");
		
		int i = 2;
		while (i < number / 2)
		{
			if (number % i == 0)
			{
				check = false;
				break;
			}
			i++;
		}
		
		if (check == true)
			System.out.println("true " + i);
		else
			System.out.println("false " + i);

		sc.close();
		
	}

}
