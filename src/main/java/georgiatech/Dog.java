package georgiatech;

public class Dog extends Canine{

    // déclaration de variables d'instance

    private String name;

    // constructeur

    /**
     * Spécification du constructeur avec deux paramètres d'instance
     * @param name du chien
     * @param size la taille du chien
     */
    public Dog(String name, double size) {
        super(size);
        this.name = name;
    }

    // méthodes

    public void fetch() {
        System.out.println("Run");
        System.out.println("Clinch");
        System.out.println("Return");
    }

    public String toSring() {
        return ("Name : " + name + "; Size : " + size);
    }

    public void groom() {}

    // afficher le résultat

    public static void main(String[] args) {
        Dog spot = new Dog("Spot", 9.6);
        spot.bark();
    }
}
