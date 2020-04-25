package patterns.builder;

import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.*;


public class TestAll {
	private Server server;
	private BurgerBuilder meatyBurger;
	private BurgerBuilder veggieBurger;
	private BurgerBuilder cheeseBurger;

	@Before
	public void setUp(){
		server = new Server();
		meatyBurger = new MeatyBurgerBuilder();
		veggieBurger = new VeggieBurgerBuilder();
		cheeseBurger = new CheeseBurgerBuilder();		
	}

	@Test
	public void testMeatyBurger() {
		 server.setBurgerBuilder(meatyBurger);
	     server.constructBurger();
	     Burger meatyOrder1 = server.getBurger();
	     assertTrue(meatyOrder1 instanceof Burger);
	     
	}
	@Test
	public void testVeggieBurger() {
		 server.setBurgerBuilder(veggieBurger);
	     server.constructBurger();
	     Burger veggieOrder2 = server.getBurger();
	     assertTrue(veggieOrder2 instanceof Burger);
	}
	
	@Test
	public void testCheeseBurger() {
		 server.setBurgerBuilder(cheeseBurger);
	     server.constructBurger();
	     Burger cheeseOrder3 = server.getBurger();
	     assertTrue(cheeseOrder3 instanceof Burger);
	     
	}

}
