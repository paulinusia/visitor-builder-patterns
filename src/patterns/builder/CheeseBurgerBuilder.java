package patterns.builder;

public class CheeseBurgerBuilder extends BurgerBuilder {
	@Override
	public void buildBun() {
		burger.setBun("White Bread Bun");
		System.out.println("Bun selected: " + burger.getBun());
		
	}

	@Override
	public void buildFilling() {
		burger.setFilling("Beef Patty");
		System.out.println("Filling selected: " + burger.getFilling());
		
		
	}

	@Override
	public void buildToppings() {
		burger.setFilling("Tomato, cheese, onion");
		System.out.println("Fillings selected:" + burger.getFilling());
		
	}

	@Override
	public void setPrice() {
		burger.setPrice(8.00);
		System.out.println("Price for burger: " + burger.getPrice());
		
	}
	

}
