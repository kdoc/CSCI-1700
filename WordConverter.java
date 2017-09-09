package assignment1;

public class WordConverter 
{
	public static void main(String[] args)
	{
		int position = 0;
		String phrase = "I hate you.";
		System.out.println("The line of text to be changed is:\n" + phrase);
		position = phrase.indexOf("hate");
		String end = phrase.substring(position + "hate".length());
		System.out.println("I have rephrased that line to read:");
		System.out.println(phrase.substring(0, position) + "love" + end);
	}

}
