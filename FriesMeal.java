//@author Karin Kato

public class FriesMeal {
    private int numCrinkleFries = 0;
    private int numCheeseFries = 0;
    private boolean ranch = false;
    private boolean ketchup = false;
    private boolean bacon = false;
    private boolean drink = false;
    private int orderNum = 0;

    public FriesMeal(int numCrinkleFries, int numCheeseFries, boolean ranch, boolean ketchup, boolean bacon, boolean drink) {
        this.numCrinkleFries = numCrinkleFries;
        this.numCheeseFries = numCheeseFries;
        this.ranch = ranch;
        this.ketchup = ketchup;
        this.bacon = bacon;
        this.drink = drink;
    }
    
    @Override
    public String toString() {
        return "Fries Restaurant: " +
                "\nCrinkle Fries: " + numCrinkleFries +
                "\nCheese Fries: " + numCheeseFries +
                "\nRanch: " + ranch +
                "\nKetchup: " + ketchup +
                "\nBacon: " + bacon +
                "\nDrink: " + drink;
    }
}
