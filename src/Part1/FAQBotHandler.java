package Part1;

class FAQBotHandler extends SupportHandler {
    public FAQBotHandler(Logger logger) {
        super(logger);
    }

    @Override
    public void handle(String issue) {
        if (issue.equals("password_reset")) {
            logger.log("[FAQBot] Handled " + issue);
            System.out.println("[FAQBot] Handled " + issue);
        } else if (nextHandler != null) {
            nextHandler.handle(issue);
        } else {
            logger.log("[FAQBot] Cannot handle " + issue + " - escalate manually");
            System.out.println("[FAQBot] Cannot handle " + issue + " - escalate manually");
        }
    }
}
