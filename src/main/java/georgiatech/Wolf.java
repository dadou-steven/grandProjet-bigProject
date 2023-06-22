package georgiatech;

import java.util.Arrays;

public class Wolf extends Canine implements Groomable, Comparable<Wolf> {

    // déclaration de variables d'instance

    protected int rank;

    // constructeur

    /**
     * Spécification du constructeur
     * @param size la taille du loup
     * @param rank le rand du loup
     */
    public Wolf(double size, int rank) {
        super(size);
        this.rank = rank;
    }

    // méthodes accesseur et mutateur

    public int getRank() {
        return rank;
    }

    // méthodes

    public void bark() {
        for (int i = 1; i <= 3; i++) {
            super.bark();
        }
    }

    public void bark(int barkMultiple) {
        for (int i = 1; i <= barkMultiple; i++) {
            super.bark();
        }
    }

    public void groom() {
        System.out.println("lick");
    }

    /**
     * Spécification de la méthode compareTo
     * @param anotherWolf the object to be compared.
     * @return le tri
     */
    public int compareTo(Wolf anotherWolf) {
        return -(rank - anotherWolf.rank);
    }

    public String toString() {
        return ("Rank " + rank + ", Size " + size);
    }

    // afficher le résultat

    public static void main(String[] args) {

        Wolf[] pack = {
                new Wolf(17.1, 2),
                new Wolf(3, 10),
                new Wolf(9.2, 7),
                new Wolf(9.1, 8),
                new Wolf(17.01, 3),
                new Wolf(16.2, 1),
                new Wolf(16, 4),
                new Wolf(16, 5),
                new Wolf(10, 6),
                new Wolf(5, 9),
        };

        System.out.println("Unsorted Pack : " + Arrays.toString(pack));
        Arrays.sort(pack);
        System.out.println("========================================");
        System.out.println("Sorted Pack : " + Arrays.toString(pack));
    }

}
