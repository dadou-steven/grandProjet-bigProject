package georgiatech;

import java.util.Random;

public class Die {

    // déclaration de variables d'instance et constante

    public static final int SIDES = 6;
    private int faceValue;
    private Random rand;

    // constructeur sans paramètre fixant les valeurs

    public Die() {
        faceValue = 1;
        rand = new Random();
    }

    // accesseurs (getter) et mutateur (setter)

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }


    // méthodes

    /**
     * Spécification sans paramètre de la méthode faceValue
     * @return la face de dé
     */
    public int roll() {
        faceValue = rand.nextInt(SIDES) + 1;
        return faceValue;
    }

    /**
     * Possibilité d'impression en grand format
     * @return la face de dé
     */
    public String toString() {
        return "Die with face value : " + faceValue;
    }

    // afficher le résultat

    public static void main(String[] args) {
        Die die1 = new Die();

        System.out.println(die1.toString());
        System.out.println(die1.roll());
        System.out.println(die1.roll());
    }
}
