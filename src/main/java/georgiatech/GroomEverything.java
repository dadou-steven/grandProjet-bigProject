package georgiatech;

public class GroomEverything {

    // afficher le résultat

    public static void main(String[] args) {
        Groomable[] groomer = {
                new Wolf(17.01, 3),
                new Poodle("richie", 9, "Lux Brand", "Rich Brand"),
                new Wolf(16, 5),
                new Poodle("Pixy", 4, "Top shelf", "Only the Best"),
                new Car("Yuhina", "Spark", 2037)
        };

        for (Groomable g : groomer) {
            g.groom();
        }
    }
}
