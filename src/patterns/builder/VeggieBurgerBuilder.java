package patterns.builder;

public class VeggieBurgerBuilder extends BurgerBuilder {

	@Override
	public void buildBun() {
		burger.setBun("Whole Wheat");
		System.out.println("Bun selected: " + burger.getBun());
		
	}

	@Override
	public void buildFilling() {
		burger.setFilling("Bean Patty");
		System.out.println("Filling selected: " + burger.getFilling());
		
		
	}

	@Override
	public void buildToppings() {
		burger.setFilling("Tomato, onion, lettuce");
		System.out.println("Fillings selected:" + burger.getFilling());
		
	}

	@Override
	public void setPrice() {
		burger.setPrice(10.00);
		System.out.println("Price for burger: " + burger.getPrice());
		
	}
	
	
}
