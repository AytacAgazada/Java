package customerFeedback;
public class Main {
    public static void main(String[] args) {
        FeedbackProcessor.loadRawFeedback();
        FeedbackProcessor.processFeedback();
        FeedbackProcessor.showMenu();
    }
}
