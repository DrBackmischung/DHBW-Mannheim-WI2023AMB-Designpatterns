package src.factory.cheese;

public abstract class Cheese {
	
	protected String name;
	protected double price;
	protected int bestBeforeDate;
	
	protected Cheese(String name, double price, int bestBeforeDate) {
		this.name = name;
		this.price = price;
		this.bestBeforeDate = bestBeforeDate;
	}
	
	public abstract String getName();
	public abstract double getPrice();
	public abstract int getBestBeforeDate();
	
}
