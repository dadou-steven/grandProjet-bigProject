package mit.ei.gei.ecl1.fileDAttenteEtPassageDeMessage;

public class FridgeRequest {

    // déclaration de variables d'instance

    private final String requestType;
    public static final String DRINK_REQUEST = "drink";
    public static final String STOP_REQUEST = "stop";

    public FridgeRequest(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestType() {
        return requestType;
    }
}
