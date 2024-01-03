package com.prathappractice.exceptionhandling;

public class Program1 {

	public static void main(String[] args) {

		System.out.println("program excecution start");
		
		int fnumber=9;
		int snumber=1;
		 int result=0;
		 
		try {
		 result= fnumber/snumber;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.toString());
		}
		
		
		 System.out.println("output is" +result);
		 
		 System.out.println("Program excecution ended");
		 
	}

}
