package assignment3;

import java.util.*;
import java.text.*;

public class Problem1 
{
	public static void main(String[] args)
	{
		int score, count = 1;
		double total = 0, product = 1, max = -1,
				min = Integer.MAX_VALUE, average =0;
		DecimalFormat formatterObject = 
				new DecimalFormat("0.######E0");
		DecimalFormat formatterObject2 = 
				new DecimalFormat("0.0#############");
		Scanner keyboard = new Scanner(System.in);
		do {
				System.out.print("Enter score " + count
						+ ":");
				score = keyboard.nextInt();
				while(score > 100)
				{
					System.out.println("Error, score must "
							+ "be between 1 and 100.\n"
							+ "Please reenter score " + count
							+ ":");
					score = keyboard.nextInt();
				}
				if(score % 5 == 0 && score != 0)
					System.out.printf("%6s%d is a multiple "
							+ "of 5%n", " ", score);
				if(score > -1)
				{
					if(score < min)
						min = score;
					if(score > max)
						max = score;
					total += score;
					product *= score;
					count++;
				}
				else
					count--;//resets count to 
				//exclude negative input
			}while(score > -1);
		average = total / (count);
		System.out.println();
		System.out.printf("You entered %d scores.%n"
				+ "Sum of all scores = %.1f%n"
				+ "Product of all scores = %s%n"
				+ "Maximum score = %.1f%n"
				+ "Minimum score = %.1f%n"
				+ "Average score = %s%n"
				, count, total, formatterObject.format(product),
				max, min, formatterObject2.format(average));
		keyboard.close();
	}

}
