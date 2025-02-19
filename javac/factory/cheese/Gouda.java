package javac.factory.cheese;

import java.time.LocalDate;

public class Gouda extends Cheese {
	
	protected Gouda(double price, LocalDate bestBeforeDate) {
		super("Gouda", price, bestBeforeDate);
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
