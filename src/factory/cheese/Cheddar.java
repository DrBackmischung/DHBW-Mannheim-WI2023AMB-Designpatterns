package src.factory.cheese;

public class Cheddar extends Cheese {
	
	protected Cheddar(double price, int bestBeforeDate) {
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
	public int getBestBeforeDate() {
		return bestBeforeDate;
	}

}
