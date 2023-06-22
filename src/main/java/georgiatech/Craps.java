package georgiatech;

public class Craps {

    // déclaration de variables d'instance

    private Die die1, die2;
    private int point;

    // constructor sans paramètre fixant les valeurs

    public Craps() {
        die1 = new Die();
        die2 = new Die();
    }

    // méthodes accesseurs (getter) et mutateur (setter)

    public Die getDie1() {
        return die1;
    }

    public void setDie1(Die die1) {
        this.die1 = die1;
    }

    public Die getDie2() {
        return die2;
    }

    public void setDie2(Die die2) {
        this.die2 = die2;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    // méthodes d'instance, static et concrète

    /**
     * Spécification de la méthode toss sans paramètre
     * @return le nombre total de dé
     */
    private int toss() {
        int total = die1.roll() + die2.roll();
        System.out.println("Die One : " + die1.getFaceValue() + ", Die Two : " + die2.getFaceValue());
        return total;
    }

    private void go() {
        point = toss();
        System.out.println("Point : " + point);
        if ((point == 7) || (point == 11)) {
            System.out.println("Winner ! \uD83D\uDE1C");
        } else if ((point == 2) || (point == 3) || (point == 12)) {
            System.out.println("You lost ! \uD83D\uDE25");
        } else {
            System.out.println("Entering stage 2");
            stage2();
        }
    }

    /**
     * Méthode de liaison
     */
    public void stage2() {

        boolean endGame = false;

        while (!endGame) {
            int total = toss();

            System.out.println("Total : " + total);
            if (total == point) {
                System.out.println("Winner ! \uD83D\uDE1C");
                endGame = true;
            } else if (total == 7) {
                System.out.println("You lost ! \uD83D\uDE25");
            }
        }
    }

    // afficher le résultat

    public static void main(String[] args) {
        Craps game = new Craps();
        game.go();
    }
}
