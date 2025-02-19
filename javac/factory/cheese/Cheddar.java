package javac.factory.cheese;

import java.time.LocalDate;

public class Cheddar extends Cheese {
	
	protected Cheddar(double price, LocalDate bestBeforeDate) {
		super("Cheddar", price, bestBeforeDate);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public LocalDate getBestBeforeDate() {
		return bestBeforeDate;
	}

}
