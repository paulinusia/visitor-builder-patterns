package patterns.visitor;

import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAll {
	private TaxVisitor tax;
	private Fruit apple;
	private Meat chicken;
	private Toiletries tp;
	
	@Before
	public void setUp(){
		tax = new TaxVisitor();
		apple = new Fruit(1.00);
		chicken = new Meat(8.00);
		tp = new Toiletries(5.00);
	}

	@Test
	public void testAppleVistor() {
		String t = apple.accept(tax);
		assertEquals(t, "Cost with tax: 1.08");
	}
	
	@Test
	public void testChickenVisitor() {
		String t = chicken.accept(tax);
		assertEquals(t, "Cost with tax: 8.80");
	}
	
	@Test
	public void testTpVisitor() {
		String t = tp.accept(tax);
		assertEquals(t, "Cost with tax: 5.60");
	}

}
