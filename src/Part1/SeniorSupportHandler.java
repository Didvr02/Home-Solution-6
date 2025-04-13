package Part1;

class SeniorSupportHandler extends SupportHandler {
    public SeniorSupportHandler(Logger logger) {
        super(logger);
    }

    @Override
    public void handle(String issue) {
        if (issue.equals("account_ban") || issue.equals("data_loss")) {
            logger.log("[SeniorSupport] Handled " + issue);
            System.out.println("[SeniorSupport] Handled " + issue);
        } else {
            logger.log("[SeniorSupport] Cannot handle " + issue + " - escalate manually");
            System.out.println("[SeniorSupport] Cannot handle " + issue + " - escalate manually");
        }
    }
}