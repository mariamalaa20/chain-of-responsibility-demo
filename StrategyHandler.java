public class StrategyHandler extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("strategy")) {
            System.out.println("Operation completed");
        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest("consultation");
            }
        }
    }
}