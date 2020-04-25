package patterns.visitor;

import static org.junit.Assert.*;

import org.junit.Test;


public class VisitorTest {
	
	@Test
	public void testCost() {
		Fruit plum = new Fruit(2.00);
		Meat steak = new Meat(25.00);
		Toiletries shampoo = new Toiletries(10.00);
		
		assertEquals(2.00, plum.getCost(), 0.01);
		assertEquals(25.00, steak.getCost(), 0.01);
		assertEquals(10.00, shampoo.getCost(), 0.01);
		
	}
	


	public void testCostAll() {
		TaxVisitor taxation = new TaxVisitor();
		Fruit plum = new Fruit(2.00);
		Meat steak = new Meat(25.00);
		Toiletries shampoo = new Toiletries(10.00);
		
		taxation.setTaxAll(1.09);
		plum.accept(taxation);
		steak.accept(taxation);
		shampoo.accept(taxation);
		
		assertEquals(2.18, plum.getCost(), 0.01);
		assertEquals(27.25, steak.getCost(), 0.01);
		assertEquals(10.90, shampoo.getCost(), 0.01);
		
		
		
	}
	
	public void testCostTax() {
		TaxVisitor taxation = new TaxVisitor();
		Fruit plum = new Fruit(2.00);
		Meat steak = new Meat(25.00);
		Toiletries shampoo = new Toiletries(10.00);
		
		taxation.setTaxFruit(1.08);
		taxation.setTaxMeat(1.09);
		taxation.setTaxToiletries(10.00);
		
		plum.accept(taxation);
		steak.accept(taxation);
		shampoo.accept(taxation);
		
		assertEquals(2.16, plum.getCost(), 0.01);
		assertEquals(27.25, steak.getCost(), 0.01);
		assertEquals(11.00, shampoo.getCost(), 0.01);
		
	}

}
