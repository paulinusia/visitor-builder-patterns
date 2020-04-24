package patterns.visitor;

public class Meat implements GroceryItem {
	private double cost;
	
	
	public Meat(double cost) {
		this.cost = cost;
	}
	


	@Override
	public double getCost() {
		return cost;
	}
	@Override
	public String accept(Visitor v) {
		return v.visit(this);
	}
}
