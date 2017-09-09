package assignment1;

public class CalorieCalculator 
{
	public static void main(String[] args)
	{
		double weightLbs = 150.0, weightKg = weightLbs / 2.2, calRun = 0, calBBall = 0,
			   calSleep = 0;
		calRun = 0.0175 * 10 * weightKg * 30;
		calBBall = 0.0175 * 8 * weightKg * 30;
		calSleep = 0.0175 * weightKg * 360;
		System.out.println("Welcome to the Calorie Calculator.\nFor a " + weightLbs + " person:");
		System.out.println("This person burned an estimated " + calRun + " calories running.");
		System.out.println("This person burned an estimated " + calBBall + 
				           " calories playing basketball.");
		System.out.println("This person burned an estimated " + calSleep + " calories sleeping.");
		System.out.println("Total calories expended = " + (calRun + calBBall + calSleep));
	}

}
