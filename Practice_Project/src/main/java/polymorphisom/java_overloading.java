package polymorphisom;

public class java_overloading 
{//From start here
	
   public static void Get_Journey(int a) 
   {
	System.out.println(a);
   }	

   public static void Get_plus(int a,int b) 
   {
	System.out.println(a+b);   
   }
   
   public static void Get_Result(int a,int b, int c) 
   {
	System.out.println(a*b-c);   
   }
	
	public static void main(String[] args) 
	{
	
	java_overloading obj= new java_overloading();
	obj.Get_Journey(40);
	obj.Get_plus(100, 20);
	obj.Get_Result(200, 30, 10);
	}
	
}//End us here
