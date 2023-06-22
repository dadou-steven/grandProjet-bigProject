package georgiatech;

public class Car implements Groomable {

    // déclaration de variables d'instance

    private String make;
    private String model;
    private int year;
    private int charge;
    private boolean powered;
    private int speed;

    // constructeur

    /**
     * Spécification du constructeur
     * @param make marque de la voiture
     * @param model le modèle
     * @param year l'année de sortie
     */
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start() {
        if (charge > 0) {
            System.out.println("ding");
            powered = true;
        }
    }

    public void groom() {
        if (speed == 0) {
            System.out.println("soap, rinse, wax, and little tree air freshener");
        }
    }
}
