package com.source;

public class DriverMain {

	public static void main(String[] args) {
		Singleton x = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		x.s = x.s.toUpperCase();

        System.out.println("String from x is " + x.s);  
        System.out.println("String from z is " + z.s); 
        System.out.println("\n"); 
        
        z.s = z.s.toLowerCase();
        

        System.out.println("String from x is " + x.s);  
        System.out.println("String from z is " + z.s); 
        System.out.println("\n"); 
        
        
		System.out.println(x);
		System.out.println(z);
		
	}
}
