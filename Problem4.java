package assignment1;
/**
Problem 4
@authors Keith Docka, Isse Nur, Xavier Jackson
CSCI 1700-01
*/
public class BigJava 
{
	public static void main(String[] args)
	{
		String j2 = "JJ", j3 = "JJJ", j7 = "JJJJJJJ",a2 = "aa", a8 = "aaaaaaaa",v2 = "VV", 
			   v3 = "VVV";
		System.out.println("  "+j7+"\n  "+j7);
		System.out.println("    "+j3+"  "+a8+"  "+v2+"   "+v2+"  "+a8);
		System.out.println("    "+j3+"  "+a8+"  "+v2+"   "+v2+"  "+a8);
		System.out.println(j2+"  "+j3+"  "+a2+"    "+a2+"  "+v2+"   "+v2+"  "+a2+"    "+a2);
		System.out.println(j2+"  "+j3+"  "+a8+"  "+v2+"   "+v2+"  "+a8);
		System.out.println(j7+"  "+a2+"    "+a2+"   "+v2+" "+v2+"   "+a2+"    "+a2);
		System.out.println(j7+"  "+a2+"    "+a2+"    "+v3+"    "+a2+"    "+a2);
	}

}
