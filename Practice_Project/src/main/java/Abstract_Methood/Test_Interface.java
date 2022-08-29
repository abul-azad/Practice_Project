package Abstract_Methood;

public class Test_Interface extends My_Interface 
{

	@Override
	public void get_user_id() {
		System.out.println("I need My user id");
		
	}

	@Override
	public void get_password() {
		System.out.println("I need my passsword");
		
	}

	@Override
	public void get_Browser() {
	System.out.println("I want to use google chorome");
		
	}
    public static void main(String[] args) 
    {
	
	Test_Interface obj= new Test_Interface ();
	
	obj.get_user_id();
	obj.get_password();
	obj.get_Browser();
	
	}
	
	
}
