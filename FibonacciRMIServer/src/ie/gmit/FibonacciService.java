package ie.gmit;

import java.rmi.*;

public interface FibonacciService extends Remote{
	public String getMessage(int length) throws RemoteException;
}