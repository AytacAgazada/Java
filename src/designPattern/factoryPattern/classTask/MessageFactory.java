package designPattern.factoryPattern.classTask;

public class MessageFactory {
    public static Message getMessage(String activityType) {
        switch (activityType){
            case "math" :
                return new FunMessage();
            case "story":
                return new StoryMessage();
            case "puzzle":
                return new PuzzleMessage();
            default:
                throw new IllegalArgumentException("Unknown activity type: " + activityType);
        }
    }
}
