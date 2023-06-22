package mit.ei.gei.ecl1;

public class LetterSet {

    // déclaration de variable d'instance

    private String s;

    // constructeur

    /**
     * Spécification du constructeur qui prend en charge l'immuabilité
     * @param chars en chaîne de caractères
     */
    public LetterSet(String chars) {
        s = chars;
    }

    // méthodes

    public String getS() {
        return s;
    }


    // afficher le résultat

    public static void main(String[] args) {

        LetterSet lettre1 = new LetterSet("aBc");
        LetterSet lettre2 = new LetterSet("");
        LetterSet lettre3 = new LetterSet("bbbbbbbc");
        LetterSet lettre4 = new LetterSet("1a2b3c");

        System.out.println(lettre1.getS());
        System.out.println(lettre2.getS());
        System.out.println(lettre3.getS());
        System.out.println(lettre4.getS());
    }
}
