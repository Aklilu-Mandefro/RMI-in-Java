import java.rmi.*;
import java.rmi.server.*;
import java.sql.*;


public class StudentClassImpl extends UnicastRemoteObject implements StudentClass

{
	
	
	public StudentClassImpl() throws RemoteException
	
		{
			
		super();	
			
		}
	public void insertDetails(String Namestu,String ClassStu,String yrs,String pro) throws RemoteException
	
		{ 
			String n1="";
			 String c1="";
			 String n3="";
			 String c3="";
			if(Namestu!=null && ClassStu!=null && yrs!=null && pro!=null){
			    n1 = Namestu;
			    c1 = ClassStu;
				n3 = yrs;
			    c3 = pro;
			}	
			
			try

             {
				
 System.out.println("Student is Registered Successfully!");
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

Connection con = DriverManager.getConnection
("jdbc:mysql://localhost/dsproject2", "root", "");

Statement st = con.createStatement();
              	int i = st.executeUpdate("insert into stutable values('"+n1+"','"+n3+"','"+c3+"','"+c1+"')");
             } 
             catch(Exception e)
                             {
								 System.out.println("Connection problem: "+e.getMessage());
							 }	
                             
         
			
			
		}		
		
		
}	