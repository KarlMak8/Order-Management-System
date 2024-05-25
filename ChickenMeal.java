//@author Karin Kato

public class ChickenMeal {
    private int numChickenTenders = 0;
    private boolean crinkleFries = false;
    private boolean ranch = false;
    private boolean ketchup = false;
    private boolean drink = false;
    private int orderNum = 0;
    
    public ChickenMeal(int numChickenTenders, boolean crinkleFries, boolean ranch, boolean ketchup, boolean drink){
        this.numChickenTenders = numChickenTenders;
        this.crinkleFries = crinkleFries;
        this.ranch = ranch;
        this.ketchup = ketchup;
        this.drink = drink;
        this.orderNum = orderNum;
    }

    @Override
    public String toString() {
        return "Chicken Restaurant: " +
                "\nChicken Tenders: " + numChickenTenders +
                "\nCrinkle Fries: " + crinkleFries +
                "\nRanch: " + ranch +
                "\nKetchup: " + ketchup +
                "\nDrink: " + drink;
    }
}