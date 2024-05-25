import java.util.ArrayList;
import java.util.Scanner;
//@author Felix Chen
public class StadiumKitchen {
    private final ArrayList<BurgerMeal> burgerOrderList = new ArrayList<BurgerMeal>();
    private final ArrayList<NachoMeal> nachoOrderList = new ArrayList<NachoMeal>();
    private final ArrayList<ChickenMeal> chickenOrderList = new ArrayList<ChickenMeal>();
    private final ArrayList<FriesMeal> friesOrderList = new ArrayList<FriesMeal>();
    private static int nextOrderNum = 0;
    Scanner sc = new Scanner(System.in);

//@author Karl Mak
    public static int getNextOrderNum(){
        return nextOrderNum;
    }

    private static void increamentNextOrderNum(){
        nextOrderNum++;
    }
    public void handleBurgerOrder(Scanner sc) {
        System.out.println("Welcome to the Burger Restaurant!");
        System.out.println("How many Hamburgers would you like?");
        int q1 = sc.nextInt();
        System.out.println("How many Cheeseburgers would you like?");
        int q2 = sc.nextInt();
        System.out.println("How many Veggieburgers would you like?");
        int q3 = sc.nextInt();
        sc.nextLine();
        System.out.println("Would you like a soda? (Y or N)");
        String q4 = sc.nextLine().toLowerCase();
        boolean q4ans = q4.equals("y");
        addBurgerOrder(q1, q2, q3, q4ans);
        
    }

    public void handleNachosOrder(Scanner sc) {
        System.out.println("Welcome to the Nachos Restaurant!");
        System.out.println("Would you like cheese sauce? (Y or N)");
        String q1 = sc.nextLine().toLowerCase();
        boolean q1ans = q1.equals("y");
        System.out.println("Would you like guacamole sauce? (Y or N)");
        String q2 = sc.nextLine().toLowerCase();
        boolean q2ans = q2.equals("y");
        System.out.println("Would you like street corn sauce? (Y or N)");
        String q3 = sc.nextLine().toLowerCase();
        boolean q3ans = q3.equals("y");
        System.out.println("Would you like mexican style white sauce? (Y or N)");
        String q4 = sc.nextLine().toLowerCase();
        boolean q4ans = q4.equals("y");
        addNachoOrder(q1ans, q2ans, q3ans, q4ans);
    }

    public void handleChickenOrder(Scanner sc) {
        System.out.println("Welcome to the Chicken Restaurant!");
        System.out.println("How many chicken tenders would you like?");
        int q1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Do you want crinkle fries? (Y or N)");
        String q2 = sc.nextLine().toLowerCase();
        boolean q2ans = q2.equals("y");
        System.out.println("Would you like ranch? (Y or N)");
        String q3 = sc.nextLine().toLowerCase();
        boolean q3ans = q3.equals("y");
        System.out.println("Would you like ketchup? (Y or N)");
        String q4 = sc.nextLine().toLowerCase();
        boolean q4ans = q4.equals("y");
        System.out.println("Would you like a drink? (Y or N)");
        String q5 = sc.nextLine().toLowerCase();
        boolean q5ans = q5.equals("y");
        addChickenOrder(q1, q2ans, q3ans, q4ans, q5ans);
    }

    public void handleFriesOrder(Scanner sc) {
        System.out.println("Welcome to the Fries Restaurant!");
        System.out.println("How many crinkle fries would you like?");
        int q1 = sc.nextInt();
        System.out.println("How many cheese fries would you like?");
        int q2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Would you like ranch? (Y or N)");
        String q3 = sc.nextLine().toLowerCase();
        boolean q3ans = q3.equals("y");
        System.out.println("Would you like ketchup? (Y or N)");
        String q4 = sc.nextLine().toLowerCase();
        boolean q4ans = q4.equals("y");
        System.out.println("Would you like bacon? (Y or N)");
        String q5 = sc.nextLine().toLowerCase();
        boolean q5ans = q5.equals("y");
        System.out.println("Would you like a drink? (Y or N)");
        String q6 = sc.nextLine().toLowerCase();
        boolean q6ans = q6.equals("y");
        addFriesOrder(q1, q2, q3ans, q4ans, q5ans, q6ans);
        }


    public int addBurgerOrder(int ham, int cheese, int veggie, boolean soda){
        BurgerMeal newBurgerOrder= new BurgerMeal(ham, cheese, veggie, soda);
        burgerOrderList.add(newBurgerOrder);
        int orderID=getNextOrderNum();
        increamentNextOrderNum();
        return orderID;
    }

    public int addNachoOrder(boolean cheese,boolean guacamole,boolean streetCorn,boolean mexicanStyleWhite){
        NachoMeal newNachoOrder= new NachoMeal(cheese, guacamole, streetCorn, mexicanStyleWhite);
        nachoOrderList.add(newNachoOrder);
        increamentNextOrderNum();
        int orderID=getNextOrderNum();
        increamentNextOrderNum();
        return orderID;
    }

    public int addChickenOrder(int numChickenTenders, boolean crinkleFries, boolean ranch, boolean ketchup, boolean drink) {
        ChickenMeal newChickenOrder = new ChickenMeal(numChickenTenders, crinkleFries, ranch, ketchup, drink);
        chickenOrderList.add(newChickenOrder);
        int orderID=getNextOrderNum();
        increamentNextOrderNum();
        return orderID;
    }

    public int addFriesOrder(int CrinkleFries, int CheeseFries, boolean ranch, boolean ketchup, boolean bacon, boolean drink){
        FriesMeal newFriesOrder = new FriesMeal(CrinkleFries, CheeseFries, ranch, ketchup, bacon, drink);
        friesOrderList.add(newFriesOrder);
        int orderID=getNextOrderNum();
        increamentNextOrderNum();
        return orderID;
    }
    
//@author Isaac Vunzi
    public void printOrderDetails() {
        System.out.println("Order Details:\n");

        if (!burgerOrderList.isEmpty()) {
            for (BurgerMeal burgerMeal : burgerOrderList) {
                System.out.println(burgerMeal);
            }
        }

        if (!nachoOrderList.isEmpty()) {
            for (NachoMeal nachoMeal : nachoOrderList) {
                System.out.println(nachoMeal);
            }
        }

        if (!chickenOrderList.isEmpty()) {
            for (ChickenMeal chickenMeal : chickenOrderList) {
                System.out.println(chickenMeal);
            }
        }

        if (!friesOrderList.isEmpty()) {
            for (FriesMeal friesMeal : friesOrderList) {
                System.out.println(friesMeal);
            }
        }
    }

}

