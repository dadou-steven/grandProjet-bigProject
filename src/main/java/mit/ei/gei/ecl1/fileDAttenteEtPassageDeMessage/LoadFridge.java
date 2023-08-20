package mit.ei.gei.ecl1.fileDAttenteEtPassageDeMessage;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class LoadFridge {

    public static void main(String[] args) {

        BlockingDeque<Integer> requests = new LinkedBlockingDeque<>();
        BlockingDeque<FridgeResult> replies = new LinkedBlockingDeque<>();

        DrinksFridge fridge = new DrinksFridge(0, requests, replies);
        fridge.start();

        try {
            requests.put(-42);
            System.out.println(replies.take());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("done");
        System.exit(0);
    }
}
