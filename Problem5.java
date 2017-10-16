package assignment3;

import static java.lang.Math.*;
import java.text.DecimalFormat;

public class Problem5 
{
	public static double standardDeviation(double[] n, int numberUsed)
	{
		double deviation = 0, a = 0;
		for(int i =0; i < numberUsed; i++)
			a += n[i];
		a = a/(double)numberUsed;
		for(int i =0; i < numberUsed; i++)
			deviation += pow((n[i] - a), 2);
		deviation = sqrt(deviation/numberUsed);
		return deviation;
	}
	public static void main(String[] args)
	{
		DecimalFormat formatter = 
				new DecimalFormat("#0.0###############");
		String[] deviation = new String[5];
		double[] d = {2.0,2.0,2.0,2.0};
		double[] d1 = {2.0,2.0,2.0,4.0};
		double[] d2 = {2.0,2.0,2.0};
		double[] d3 = {2.0,0.0,2.0,4.0};
		double[] d4 = {2.0,0.0,2.0};
		deviation[0] = 
				formatter.format(standardDeviation(d, d.length));
		deviation[1] = 
				formatter.format(standardDeviation(d1, d1.length));
		deviation[2] = 
				formatter.format(standardDeviation(d2, d2.length));
		deviation[3] = 
				formatter.format(standardDeviation(d3, d3.length));
		deviation[4] = 
				formatter.format(standardDeviation(d4, d4.length));
		System.out.printf("--------------------Configuration:"
				+ " <Default>--------------------%n" + 
				"Standard deviation of {2.0,2.0,2.0,2.0} = %s%n" + 
				"Standard deviation of {2.0,2.0,2.0,4.0} = %s%n" + 
				"Standard deviation of {2.0,2.0,2.0} = %s%n" + 
				"Standard deviation of {2.0,0.0,2.0,4.0} = %s%n" + 
				"Standard deviation of {2.0,0.0,2.0} = %s%n"
				, deviation[0], deviation[1], deviation[2], 
				deviation[3], deviation[4]);
	}

}
