package mit.ei.gei.ecl1.fileDAttenteEtPassageDeMessage;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class DrinksFridge {

    // déclaration de variable d'instance

    private int drinksInFridge;
    private final BlockingDeque<Integer> in;
    private final BlockingDeque<FridgeResult> out;

    // constructeur

    /**
     * Spécification du constructeur
     *
     * @param i        le nombre
     * @param requests la requêtes
     * @param replies  la réponse
     */
    public DrinksFridge(int i, BlockingDeque<Integer> requests, BlockingDeque<FridgeResult> replies) {
        this.drinksInFridge = 0;
        this.in = requests;
        this.out = replies;
        checkRep();
    }

    private void checkRep() {
        assert drinksInFridge >= 0;
        assert in != null;
        assert out != null;
    }

    public void start() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        int n = in.take();
                        FridgeResult result = handleDrinkRequest(n);
                        out.put(result);
                    } catch (InterruptedException ie) {
                        ie.printStackTrace();
                    }
                }
            }
        }).start();
    }

    private FridgeResult handleDrinkRequest(int n) {
        int change = Math.min(n, drinksInFridge);
        drinksInFridge -= change;
        checkRep();
        return new FridgeResult(change, drinksInFridge);
    }
}