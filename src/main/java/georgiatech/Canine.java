package georgiatech;

public abstract class Canine implements Groomable {

    // déclaration de variables d'instance ou super classe ( arrêter à 58 : 28)

    protected double size;

    // constructeur

    /**
     * Spécification du constructor
     * @param size la taille de Canine
     */
    public Canine(double size) {
        this.size = size;
    }

    // méthodes

    public void bark() {
        System.out.println("Woof Woof");
    }
}
