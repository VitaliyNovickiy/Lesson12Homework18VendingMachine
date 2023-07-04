
import java.util.Scanner;
public class VendingMachine {

    public static void main(String[] args) {
        Drinks drinks = new Drinks();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the drinks machine!");

        while (true) {
            System.out.println("Choose a drink (Coffee, Tea, Lemonade, Mojito, Mineral, Coca_Cola):");
            System.out.println("If you have finished selecting press exit ");
            String drinkChoice = scanner.nextLine().toUpperCase();

            if (drinkChoice.equals("EXIT")) {
                break;
            }

            DrinksMachine selectedDrink;
            switch (drinkChoice) {
                case "COFFEE":
                    selectedDrink = DrinksMachine.COFFEE;
                    break;
                case "TEA":
                    selectedDrink = DrinksMachine.TEA;
                    break;
                case "LEMONADE":
                    selectedDrink = DrinksMachine.LEMONADE;
                    break;
                case "MOJITO":
                    selectedDrink = DrinksMachine.MOJITO;
                    break;
                case "MINERAL":
                    selectedDrink = DrinksMachine.MINERAL;
                    break;
                case "COCA_COLA":
                    selectedDrink = DrinksMachine.COCA_COLA;
                    break;
                default:
                    System.out.println("Invalid drink choice. Please try again.");
                    continue;
            }

            drinks.makeDrink(selectedDrink);
        }

        System.out.println("Total quantity of drinks: " + drinks.getQuantity());
        System.out.println("Total price: $" + drinks.getTotalPrice());
    }
}