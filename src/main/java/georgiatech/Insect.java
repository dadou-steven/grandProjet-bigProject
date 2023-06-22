package georgiatech;

public class Insect {

    // déclaration de variables d'instance et constante

    private double weight;
    private int x;
    private int y;

    public static final double DIST_WEIGHT_LOSS_FACTOR = .0001;
    public static final int DEFAULT_X = 0;
    public static final int DEFAULT_Y = 0;
    private static int population = 0;
    private static final String[] FACTS = {
            "The two main groups of insects are winged and wingless",
            "There are more than 1 million insect species",
            "Insects are cold-blooded",
            "Spiders are not considered insects"
    };

    // constructor

    /**
     * Spécification du constructeur avec trois paramètres
     * @param weight le poids de l'insecte
     * @param x la localisation de l'insecte
     * @param y localisation ou encore distance
     */
    public Insect(double weight, int x, int y) {
        this.weight = weight;
        this.x = x;
        this.y = y;
        population++;
    }

    public Insect(double initWeight) {
        this(initWeight, DEFAULT_X, DEFAULT_Y);
    }

    // méthodes accesseur et mutateur


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        if (isLegalX(x)) {
            this.x = x;
        }
    }

    public void setY(int y) {
        if (isLegalY(y)) {
            this.y = y;
        }
    }

    public static int getPopulation() {
        return population;
    }

    public static void setPopulation(int population) {
        Insect.population = population;
    }

    // méthodes

    public static boolean isLegalX(int x) {
        return (x >= 0 ? true : false);
    }

    public static boolean isLegalY(int y) {
        return (y >= 0 ? true : false);
    }

    /**
     * Spécification de la méthode eat
     * @param amount nombre de poids augmente
     */
    public void eat(double amount) {
        System.out.println("Nibble Nibble");
        weight += amount;
    }

    /**
     * Spécification de la méthode move
     * @param newX distance parcourue
     * @param newY distance parcourue
     */
    public void move(int newX, int newY) {
        double distance = calculateDistance(x, y, newX, newY);
        if (distance > 0) {
            x = newX;
            y = newY;
            weight = weight * DIST_WEIGHT_LOSS_FACTOR * distance;
            System.out.printf("Moved %.2f units\n", distance);
        } else {
            System.out.println("Staying put");
        }
    }

    /**
     * Spécification de la méthode calculateDistance
     * @param x1 la distance
     * @param y1 la distance
     * @param x2 la distance
     * @param y2 la distance
     * @return la résultat de la distance
     */
    private static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    public static String produceRandomFact() {
        int index = (int) (Math.random() * ((FACTS.length - 1) + 1));
        return FACTS[index];
    }

    public String toString() {
        return "weight : " + weight + ", x : " + x + ", y : " + y;
    }

    // afficher le résultat

    public static void main(String[] args) {
        Insect bug1 = new Insect(10, 100, 90);
        Insect bug2 = new Insect(9.5, -300, 400);

        bug1.move(1, 10);
        bug2.move(-300, 400);
    }

}
