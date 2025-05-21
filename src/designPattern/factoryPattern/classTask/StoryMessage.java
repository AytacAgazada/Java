package designPattern.factoryPattern.classTask;

public class StoryMessage implements Message{

    @Override
    public void display() {
        System.out.println("📖 Great job finishing your story time!");
    }
}
