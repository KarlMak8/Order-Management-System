//@author Felix Chen
public class BurgerMeal {
    private int numHamburgers = 0;
    private int numCheeseburgers = 0;
    private int numVeggieburgers = 0;
    boolean soda = false;
    
    public BurgerMeal(int numHamburgers, int numCheeseburgers, int numVeggieburgers, boolean soda){
        this.numHamburgers = numHamburgers;
        this.numCheeseburgers = numCheeseburgers;
        this.numVeggieburgers = numVeggieburgers;
        this.soda = soda;
    }
    
    @Override
    public String toString() {
        return "Burger Restaurant: " +
                "\nHamburgers: " + numHamburgers +
                " \nCheeseburgers: " + numCheeseburgers +
                " \nVeggieburgers: " + numVeggieburgers +
                " \nSoda: " + soda;
    }
}
