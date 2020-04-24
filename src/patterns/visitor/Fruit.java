package patterns.visitor;

public class Fruit implements GroceryItem {


	private double cost;
	
	
	Fruit(double cost){
		this.cost = cost;
	}
	
	public double getCost() {
		return cost;
		
	}
	
	public String accept(Visitor v) {
		
		return v.visit(this);
	}

}
