package georgiatech;

public class Poodle extends Dog {

    // déclaration de variables d'instance

    private String favoriteShampoo;
    private String favoriteConditionner;

    // constructeur

    public Poodle(String name, double size, String favoriteShampoo, String favoriteConditionner) {
        super(name, size);
        this.favoriteShampoo = favoriteShampoo;
        this.favoriteConditionner = favoriteConditionner;
    }

    // héritier

    public void groom() {
        System.out.println( favoriteShampoo + " rinse " + favoriteConditionner + " wait 10 mins " + "dry and massage");
    }
}
