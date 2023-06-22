package mit.ei.gei.ecl1;

public class Duration {

    // déclaration de variables d'instance
    private final int mins;
    private final int secs;

    // constructeur

    /**
     * Spécification du constructeur qui prend en charge l'immuabilité
     * @param m les minutes
     * @param s les secondes
     */
    public Duration(int m, int s) {
        mins = m;
        secs = s;
    }

    // méthodes

    public long getLength() {
        return (long) mins * 60 + secs;
    }

    // afficher le résultat

    public static void main(String[] args) {

        Duration d1 = new Duration(1, 2);
        Duration d2 = new Duration(1, 3);
        Duration d3 = new Duration(0, 62);
        Duration d4 = new Duration(1, 2);

        System.out.println(d1.getLength());
        System.out.println(d2.getLength());
        System.out.println(d3.getLength());
        System.out.println(d4.getLength());
    }
}
