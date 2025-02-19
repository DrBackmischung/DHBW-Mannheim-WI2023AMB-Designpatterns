package javac.decorator.coffee;

public class MintSirupDecorator extends SirupDecorator {
	
	public MintSirupDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Mint Sirup";
    }

}
