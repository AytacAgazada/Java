package designPattern.factoryPattern.classTask;

public class MessageApp {
    public static void main(String[] args) {
        Message funMessage = MessageFactory.getMessage("math");
        Message storyMessage = MessageFactory.getMessage("story");
        Message puzzleMessage = MessageFactory.getMessage("puzzle");

        funMessage.display();
        storyMessage.display();
        puzzleMessage.display();
    }
}
