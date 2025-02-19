package javac.factory.cheese;

import java.time.LocalDate;

public abstract class Cheese {
	
	protected String name;
	protected double price;
	protected LocalDate bestBeforeDate;
	
	protected Cheese(String name, double price, LocalDate bestBeforeDate) {
		this.name = name;
		this.price = price;
		this.bestBeforeDate = bestBeforeDate;
	}
	
	public abstract String getName();
	public abstract double getPrice();
	public abstract LocalDate getBestBeforeDate();
	
}
