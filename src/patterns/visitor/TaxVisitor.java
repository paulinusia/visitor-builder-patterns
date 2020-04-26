package patterns.visitor;

public class TaxVisitor implements Visitor{
	private double fruitTax;
	private double meatTax;
	private double toiletriesTax;
	
	@Override
	public String visit(Fruit f) {
		return "Cost with tax: " + String.format("%.2f", (f.getCost() * fruitTax));
	}

	@Override
	public String visit(Meat m) {
		
		return "Cost with tax: " + String.format("%.2f", (m.getCost() * meatTax));
	}

	@Override
	public String visit(Toiletries t) {
		
		return "Cost with tax: " + String.format("%.2f", (t.getCost() * toiletriesTax));
	}
	
	public void setTaxAll(double tax){
		fruitTax = tax;
		meatTax = tax;
		toiletriesTax = tax;
		
	}
	
	public void setTaxFruit(double tax){fruitTax  = tax;}
	
	public void setTaxMeat(double tax){ meatTax = tax;}
	
	public void setTaxToiletries(double tax){ toiletriesTax = tax;}

}
