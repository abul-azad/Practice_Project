package encapsul;

public class Encapsul_Method 
{
	private int x;
	private int y;
	private int z;
	
	public int getX() 
	{
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	
   public static void main(String[] args) 
   {
	   Encapsul_Method obj= new Encapsul_Method();
	   obj.getX();
	   obj.getY();
	   obj.getZ();
	   
	   obj.setX(50);
	   obj.setY(20);
	   obj.setZ(500);
	   System.out.println(obj.getX());
	   System.out.println(obj.getY());
	   System.out.println(obj.z);
	
   }
	
}

