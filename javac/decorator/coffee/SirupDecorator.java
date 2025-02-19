package javac.decorator.coffee;

public abstract class SirupDecorator extends CoffeeDecorator {
	
	public SirupDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.25; 
    }

}
