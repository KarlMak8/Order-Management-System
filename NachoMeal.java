//@author Felix Chen

public class NachoMeal {

    private boolean cheeseSauce = false;
    private boolean guacamoleSauce = false;
    private boolean streetCornSauce = false;
    private boolean mexicanStyleWhiteSauce = false;

    public NachoMeal(boolean cheeseSauce, boolean guacamoleSauce, boolean streetCornSauce, boolean mexicanStyleWhiteSauce) {
        this.cheeseSauce = cheeseSauce;
        this.guacamoleSauce = guacamoleSauce;
        this.streetCornSauce = streetCornSauce;
        this.mexicanStyleWhiteSauce = mexicanStyleWhiteSauce;
    }
    @Override
    public String toString() {
        return "Nacho Restaurant: " +
                "\nCheese Sauce: " + cheeseSauce +
                "\nGuacamole Sauce: " + guacamoleSauce +
                "\nStreet Corn Sauce: " + streetCornSauce +
                "\nMexican Style White Sauce: " + mexicanStyleWhiteSauce;
    }
}
