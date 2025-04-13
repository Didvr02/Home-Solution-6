package Part1;

abstract class SupportHandler {
    protected SupportHandler nextHandler;
    protected Logger logger;

    public SupportHandler(Logger logger) {
        this.logger = logger;
    }

    public SupportHandler setNext(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
        return this;
    }

    public abstract void handle(String issue);
}
