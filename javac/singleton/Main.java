package javac.singleton;

public class Main {
	
	public static void main(String[] args) {
//		Singleton s = new Singleton();
		
		Singleton s1 = Singleton.getInstance();
		s1.doSomething();
		
		Singleton s2 = Singleton.getInstance();
		s2.doSomething();
		
		System.out.println("Are s1 and s2 the same thing?");
		System.out.println(s1 == s2);
	}

}
