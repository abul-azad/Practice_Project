package polymorphisom;

public class Java_Overriding 
{//start from here
	 
	public double Get_homeloan()
	{
		return 7.3;
	}
	
	public double Get_studentloan() 
	{
		return 3.5;
	}
	
	public double Get_interestRate_Bofa() 
	{
	return 4.12;
		
	}
	
	public static void main(String[] args) 
	{
	
	Java_Overriding obj= new Java_Overriding ();
	obj.Get_homeloan();
	obj.Get_studentloan();
	obj.Get_interestRate_Bofa();
		
	System.out.println(obj.Get_homeloan());
	System.out.println(obj.Get_studentloan());
	System.out.println(obj.Get_interestRate_Bofa());
	}
   
	
}//End is here
