class TechnicalSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("technical")) {
            System.out.println("Technical Support: Issue is being resolved.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}