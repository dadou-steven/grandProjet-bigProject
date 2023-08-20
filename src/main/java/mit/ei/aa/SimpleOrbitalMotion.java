package mit.ei.aa;

public class SimpleOrbitalMotion {

    // déclaration de variables d'instance

    private double g;
    private double m1;
    private double m2;
    private double r2;
    private double p;
    private double a;

    // constructeur

    /**
     * Spécification du constructeur
     * @param g l'accélération
     * @param m1 la masse de la terre
     * @param m2 la masse 2
     * @param r2 le rayon de la terre
     */
    public SimpleOrbitalMotion(double g, double m1, double m2, double r2, double p, double a) {
        this.g = g;
        this.m1 = m1;
        this.m2 = m2;
        this.r2 = r2;
        this.p = p;
        this.a = a;
    }

    // accesseurs (getters) et mutateurs (setters)


    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }

    public double getM1() {
        return m1;
    }

    public void setM1(double m1) {
        this.m1 = m1;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public double getR2() {
        return r2;
    }

    public void setR2(double r2) {
        this.r2 = r2;
    }

    // afficher la résultat

    public static void main(String[] args) {
        SimpleOrbitalMotion ForceG = new SimpleOrbitalMotion(50, 24, 34, 6400, 10, 25);

        double solutionForceGravitationnelle = ForceG.g * ForceG.m1 * ForceG.m2 / ForceG.r2;

        double loisDeKepler3 = (ForceG.m1 + ForceG.m2) * ForceG.p * ForceG.a;


        System.out.println(solutionForceGravitationnelle);
        System.out.println(loisDeKepler3);
    }
}
