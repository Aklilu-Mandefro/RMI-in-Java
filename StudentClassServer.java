import java.rmi.*;
import java.rmi.server.*;

public class StudentClassServer

{

	public static void main(String args[])
	
		{
			
			try
			
				{
					
					//System.setSecurityManager(new RMISecurityManager());
					
					StudentClass h = new StudentClassImpl();
					Naming.rebind("server",h);
					System.out.println("Object Registered");
					
				}
				catch(Exception e)
				
					{
						
					}
			
				
		}	
	
	
	
}