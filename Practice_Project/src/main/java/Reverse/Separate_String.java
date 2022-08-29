package Reverse;

public class Separate_String 
{
	String Name="Mathmatics2022";
	
	public static void main(String[] args) 
	{
	String Name="Mathmatics2022";	
	String Value=Name.replaceAll("[^A-Za-z]", "");
	System.out.println(Value);
	String Number=Name.replaceAll("[^0-20]", "");
	System.out.println(Number);
		
		
	}
	
}
