package mit.ei.aa;

public class ZeroGravity {

    // déclaration de variables d'instance

    private double g;
    private double m1;
    private double m2;
    private double r;
    private double microGravity; // G ~ 10 ** - 6
    private final double WEIGHTLESSNESS = 0; // en Kg

    // constructeur

    public ZeroGravity(double g, double m1, double m2, double r, double microGravity) {
        this.g = g;
        this.m1 = m1;
        this.m2 = m2;
        this.r = r;
        this.microGravity = microGravity;
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

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getMicroGravity() {
        return microGravity;
    }

    public void setMicroGravity(double microGravity) {
        this.microGravity = microGravity;
    }

    public double getWEIGHTLESSNESS() {
        return WEIGHTLESSNESS;
    }

    // afficher le résultat

    public static void main(String[] args) {

        ZeroGravity F = new ZeroGravity(85, 6, 4, 6, 3);
        double force = F.g * F.m1 * F.m2 / F.r * F.r;

        System.out.println(force);
    }
}
