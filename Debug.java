/*bailey spicer
**March 28, 2016
**bes2725@vccs.edu
**this program will ask the user which program they want to run, and then 
**execute a loop to 1) display 100 even numbers, 2)display 100 odd numbers or 3) show 
**diamond pattern*/

import java.util.Scanner;

public class Debug
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);

		int choice, count=1, shape=1;

		System.out.println("Please choose which program you wish to run: "
			+ "\n1) A program that will output the first 100 odd numbers."
			+ "\n2) A program that will output the first 100 even numbers. "
			+ "\n3) A program which will display a diamond patten. ");

		choice = in.nextInt();

		switch(choice)
		{
			case 1:
				for(int i=1; i<=100; i++)
				{
					System.out.println(i + ": " + ((i*2)-1));
				}
				break;
			case 2:
				do
				{
					System.out.println(count + ": " + (count*2));
					count++;
				}
				while (count<=100);
				break;
			case 3:
				while(shape<2)
				{
					System.out.println("   *  \n  *** \n *****\n  ***\n"
						+ "   *");
					shape++;
				}
				break;
			default:
				System.out.println("You've made an invalid choice.");
				break;
		}
					
	}
}
