package patterns.visitor;

public interface GroceryItem {
	public double getCost();
	public String accept(Visitor v);
}
