package rersemethod;

public class Separate_method 
{
	String Name="Jurnalist2022";
	
	public static void main(String[] args) 
	{
	String Name="Jurnalist2022";
	String Value=Name.replaceAll("[^A-Za-z^]","");
	System.out.println(Value);
	String Number=Name.replace("[^0-20]", "");
	System.out.println(Number);
		
	}
	
}
