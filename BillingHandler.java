class BillingHandler extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("billing")) {
            System.out.println("Billing: Billing issue resolved.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}