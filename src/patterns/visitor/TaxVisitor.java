package patterns.visitor;

public class TaxVisitor implements Visitor{

	@Override
	public String visit(Fruit f) {
		return "Cost with tax: " + String.format("%.2f", (f.getCost() * 1.08));
	}

	@Override
	public String visit(Meat m) {
		
		return "Cost with tax: " + String.format("%.2f", (m.getCost() * 1.10));
	}

	@Override
	public String visit(Toiletries t) {
		
		return "Cost with tax: " + String.format("%.2f", (t.getCost() * 1.12));
	}

}
