import java.rmi.*;

public interface StudentClass extends Remote

{
	
public void insertDetails(String nameStu,String classStu,String yrs,String pro) throws RemoteException;	
	
}




