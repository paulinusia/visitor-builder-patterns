package patterns.builder;

public abstract class BurgerBuilder {
protected Burger burger;
	
	public Burger getBurger() {
	 System.out.println("The Server has brought you your order!");
	    return burger;
	}
	
	public void createNewBurger() {
	        burger = new Burger();
	    }
	 
	public abstract void buildBun();
	public abstract void buildFilling();
	public abstract void buildToppings();
	public abstract void setPrice();


}
