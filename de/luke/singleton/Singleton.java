package de.luke.singleton;

public class Singleton {
	
	private Singleton() {};
	private static Singleton instance;
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		} 
		return instance;
	}
	
	public void doSomething() {
		System.out.println("I am a Singleton!");
	}
	
}
