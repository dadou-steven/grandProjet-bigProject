package mit.ei.gei.ecl1.fileDAttenteEtPassageDeMessage;

public class FridgeResult {

    // déclaration de variables d'instance

    private final int drinksTakenOrAdded;
    private final int drinksLeftInFridge;

    public FridgeResult(int drinksTakenOrAdded, int drinksLeftInFridge) {
        this.drinksTakenOrAdded = drinksTakenOrAdded;
        this.drinksLeftInFridge = drinksLeftInFridge;
    }

    @Override
    public String toString() {
        return (drinksTakenOrAdded >= 0 ? "you took " : "you put in")
                + Math.abs(drinksTakenOrAdded) + " drinks, fridge has "
                + drinksLeftInFridge + " left";
    }
}