package ie.gmit;

import java.math.BigInteger;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class FibonacciImplementation extends UnicastRemoteObject implements RemoteFibonacci 
{
	
	public FibonacciImplementation() throws RemoteException
	{
		
	}

	public String getFibonacciSequence(int length) throws RemoteException 
	{
		if (length < 0) 
		{
			return " ";
        }
		
		else if(length == 1)
		{
			return "0";
		}
		
        else 
        {
        	return getFibonacciSequence(length-1)+getFibonacciSequence(length-2);
        }
	}
	
	private static ArrayList<BigInteger> fibonacciCache = new ArrayList<BigInteger>();
	{
		fibonacciCache.add(BigInteger.ZERO);
		fibonacciCache.add(BigInteger.ONE);
		
	}
	
	public static BigInteger fibonacci(int n)
	{
	     if (n >= fibonacciCache.size()) 
	     {
	    	 fibonacciCache.add(n, fibonacci(n-1).add(fibonacci(n-2)));
	     }
	     return fibonacciCache.get(n);
	  }

}
