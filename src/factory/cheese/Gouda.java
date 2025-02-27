package src.factory.cheese;

public class Gouda extends Cheese {
	
	protected Gouda(double price, int bestBeforeDate) {
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
	public int getBestBeforeDate() {
		return bestBeforeDate;
	}

}
