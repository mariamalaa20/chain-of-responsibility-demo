class GeneralSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("general")) {
            System.out.println("General Support: General questions answered.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}