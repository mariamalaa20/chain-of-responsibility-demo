public class Main {
    public static void main(String[] args) {
        
        TechnicalSupportHandler technicalSupport = new TechnicalSupportHandler();
        BillingHandler billing = new BillingHandler();
        GeneralSupportHandler generalSupport = new GeneralSupportHandler();
        StrategyHandler strategy = new StrategyHandler();

        technicalSupport.setNextHandler(billing);
        billing.setNextHandler(generalSupport);

        System.out.println("Starting with technical request:");
        technicalSupport.handleRequest("technical");

        System.out.println("\nStarting with billing request:");
        technicalSupport.handleRequest("billing");

        System.out.println("\nStarting with general request:");
        technicalSupport.handleRequest("general");

        System.out.println("\nStarting with an unrecognized request:");
        technicalSupport.handleRequest("new issue");
    }
}