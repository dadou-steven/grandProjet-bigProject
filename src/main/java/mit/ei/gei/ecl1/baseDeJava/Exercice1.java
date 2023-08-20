package mit.ei.gei.ecl1.baseDeJava;

public class Exercice1 {

    // méthodes

    void f(String s, StringBuilder sb) {
        System.out.println(s.concat("b"));
        System.out.println(s += "c");
        System.out.println(sb.append("b"));
    }

    // afficher le résultat

    public static void main(String[] args) {

        double fahrenheit = 212.0;
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " -> " + celsius);
        System.out.printf("%s -> %s \n", fahrenheit, celsius);

        String s = "a";
        s = s + "b";
        System.out.println(s);

        StringBuilder sb = new StringBuilder("a");
        System.out.println(sb.append("b"));

        String t = "d";
        t = "de";
        System.out.println(t);
    }
}
