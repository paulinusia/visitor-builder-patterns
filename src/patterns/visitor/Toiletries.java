package patterns.visitor;

public class Toiletries implements GroceryItem {
	private double cost;
	
	public Toiletries(double cost) {
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
