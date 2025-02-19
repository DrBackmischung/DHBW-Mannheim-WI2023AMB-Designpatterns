package javac.decorator.coffee;

public class VanillaSirupDecorator extends SirupDecorator {
	
	public VanillaSirupDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Vanilla Sirup";
    }

}
