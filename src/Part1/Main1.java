package Part1;

public class Main1 {
    public static void main(String[] args) {

        Logger logger = new Logger();
        FAQBotHandler faq = new FAQBotHandler(logger);
        JuniorSupportHandler junior = new JuniorSupportHandler(logger);
        SeniorSupportHandler senior = new SeniorSupportHandler(logger);

        faq.setNext(junior).setNext(senior);

        String[] issues = {"password_reset", "refund_request", "account_ban", "unknown_bug"};
        for (String issue : issues) {
            faq.handle(issue);
        }


    }
}
