package patterns.builder;

public class Server {


    private BurgerBuilder burgerBuilder;

    //selects which concrete builder will be used to make a pizza
    public void setBurgerBuilder(BurgerBuilder cook) {
        burgerBuilder = cook;
    }

    //tells the selected builder to make a pizza
    public void constructBurger() {
        System.out.println("\nThe burger is being prepared...");
        burgerBuilder.createNewBurger();
        burgerBuilder.buildBun();
        burgerBuilder.buildFilling();
        burgerBuilder.buildToppings();
        burgerBuilder.setPrice();
    }

    //returns the selected pizza builder's completed pizza
    public Burger getBurger() {
        return burgerBuilder.getBurger();
    }

}
