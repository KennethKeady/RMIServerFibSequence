package ie.gmit;

import java.rmi.*;
import java.rmi.registry.*;

public class FibonacciServer {
	public static void main(String[] args) throws Exception{
		Remote fs = new FibonacciImplementation();
		LocateRegistry.createRegistry(1050);
		Naming.rebind("fibonacciService", fs);
		System.out.println("Server ready.");
	}
}