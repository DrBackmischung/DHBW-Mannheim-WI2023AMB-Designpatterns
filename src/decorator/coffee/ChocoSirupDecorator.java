package src.decorator.coffee;

public class ChocoSirupDecorator extends SirupDecorator {
	
	public ChocoSirupDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Chocolate Sirup";
    }

}
