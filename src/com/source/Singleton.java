package com.source;

public class Singleton {
	/* private static Singleton single_instance = new Singleton(); */ //Early loading (1st way)
	
	private static Singleton single_instance = null; //Lazy loading  (2nd Way)
	
	private static long diff = 0;
	public String s;
	
	private Singleton() {   //By using new Singleton() can't create the object
		s = "Hello I am a string part of Singleton class"; 
		System.out.println("Private Constactor Created");
	}
	
	
	//This is not Thread safe.Means if we work with multiple thread then we get
	//two object at time(2nd Way)
	/*
	 * public static Singleton getInstance() {
	 * 
	 * if(single_instance == null) {
	 * 
	 * single_instance = new Singleton();
	 * 
	 * } return single_instance; }
	 */
	
			/*
			 * Here we can also used synchronized keyword but it takes more time to execute.
			 * So if this method call 100 times then timecomplexity will raise 100times(3rd Way)
			 */
	 
	 
	/*
	 * public static synchronized Singleton getInstance() {  
	 * 
	 * if(single_instance == null) {
	 * 
	 * single_instance = new Singleton();
	 * 
	 * } return single_instance; }
	 */

	 //Double Checked locking pattern(4th way)
	public static  Singleton getInstance() {
		
		if(single_instance == null) {
			synchronized(Singleton.class) {
				if(single_instance == null)  
					single_instance = new Singleton();
			}
			
		}
		return single_instance;
	}
	
	
	
}
