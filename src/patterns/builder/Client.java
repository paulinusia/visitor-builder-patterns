package patterns.builder;

public class Client {
	   public static void main(String[] args) {
		   Server server = new Server();
		   BurgerBuilder meatyBurger = new MeatyBurgerBuilder();
		   BurgerBuilder veggieBurger = new VeggieBurgerBuilder();
		   BurgerBuilder cheeseBurger = new CheeseBurgerBuilder();
		   
		   System.out.println("This is a Burger Restaurant, here is our menu:");
		   System.out.println("Menu:" + "\n Meaty Burger ..... 7.00" +
		   "\nVeggie Burger ..... 10.00" + "\nCheese Burger ..... 8.00");
		   
//		   Example Order for Meaty Burger:
		   System.out.println("You have ordered a Meaty Burger");
	        server.setBurgerBuilder(meatyBurger);
	        server.constructBurger();
	        Burger meatyOrder1 = server.getBurger();
	        
//	       Example Order for Veggie Burger:
	        System.out.println("You have ordered a Veggie Burger");
	        server.setBurgerBuilder(veggieBurger);
	        server.constructBurger();
	        Burger veggieOrder2 = server.getBurger();
	        
//	        Example Order for Cheese Burger:
	        System.out.println("You have ordered a Cheese Burger");
	        server.setBurgerBuilder(cheeseBurger);
	        server.constructBurger();
	        Burger cheeseOrder3 = server.getBurger();
	   }

}
