package ifandelse;

import java.util.Scanner;

public class Condition 
{
	
    public static void main(String[] args) 
    {
    	
    Scanner Keyboard= new Scanner(System.in);
    System.out.println("Days of the week");
    System.out.println("what days is today");
    
    int day=0;
    day=Keyboard.nextInt();
    
    if( day==1)
    {
    System.out.println("Monday");	
    }
    
    else if ( day==2)
    {
    System.out.println("tuesday");	
    }
    
    else if ( day==3)
    {
    System.out.println("Wednesday");	
    }
    
    else if ( day==4)
    {
    System.out.println("thursday");	
    }
    
    else if ( day==5)
    {
    System.out.println("Friday");	
    }
    
    else if ( day==6)
    {
    System.out.println("Saturday");	
    }
    
    else if ( day==7)
    {
    System.out.println("Sunday");	
    }
    
    }	
    
}
