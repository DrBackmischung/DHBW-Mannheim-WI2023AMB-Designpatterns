package javac.factory.cheese;

public enum CheeseType {
	
	GOUDA("GOUDA"),
	CHEDDAR("CHEDDAR");
	
	public final String name;
	
	private CheeseType(String name) {
		this.name = name;
	}

}
