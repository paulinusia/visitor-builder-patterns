package patterns.visitor;

public class VisitorPattern {

	public static void main(String[] args) {
		TaxVisitor tax = new TaxVisitor();
		Fruit apple = new Fruit(1.00);
		Meat chicken = new Meat(8.00);
		Toiletries tp = new Toiletries(5.00);
		
		System.out.println("Apple " + apple.accept(tax));
		System.out.println("Chicken " + chicken.accept(tax));
		System.out.println("Toilet paper " + tp.accept(tax));
	
		

	}

}
