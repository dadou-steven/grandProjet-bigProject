package mit.ei.gei.ecl1.verification_statique;

public class SequenceG {

    public static void main(String[] args) {

        int n = 3;

        while (n != 1) {
            System.out.println(n);
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }

        System.out.println(n);
    }
}
