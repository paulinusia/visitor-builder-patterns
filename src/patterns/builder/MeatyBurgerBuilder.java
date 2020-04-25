package patterns.builder;

public class MeatyBurgerBuilder  extends BurgerBuilder{

	@Override
	public void buildBun() {
		burger.setBun("Regular Bun");
		System.out.println("Bun selected: " + burger.getBun());
		
	}

	@Override
	public void buildFilling() {
		burger.setFilling("Steak Patty");
		System.out.println("Filling selected: " + burger.getFilling());
		
		
	}

	@Override
	public void buildToppings() {
		burger.setFilling("Tomato, cheese, lettuce, bacon");
		System.out.println("Fillings selected:" + burger.getFilling());
		
	}

	@Override
	public void setPrice() {
		burger.setPrice(7.00);
		System.out.println("Price for burger: " + burger.getPrice());
		
	}
	
}
