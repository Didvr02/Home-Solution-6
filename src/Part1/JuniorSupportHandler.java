package Part1;

class JuniorSupportHandler extends SupportHandler {
    public JuniorSupportHandler(Logger logger) {
        super(logger);
    }

    @Override
    public void handle(String issue) {
        if (issue.equals("refund_request") || issue.equals("billing_issue")) {
            logger.log("[JuniorSupport] Handled " + issue);
            System.out.println("[JuniorSupport] Handled " + issue);
        } else if (nextHandler != null) {
            nextHandler.handle(issue);
        } else {
            logger.log("[JuniorSupport] Cannot handle " + issue + " - escalate manually");
            System.out.println("[JuniorSupport] Cannot handle " + issue + " - escalate manually");
        }
    }
}