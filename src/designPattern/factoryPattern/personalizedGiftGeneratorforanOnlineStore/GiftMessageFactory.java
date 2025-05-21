package designPattern.factoryPattern.personalizedGiftGeneratorforanOnlineStore;

public class GiftMessageFactory {
    public static GiftMessage createMessage(String type) {
        switch (type) {
            case "Birthday": return new BirthdayMessage();
            case "Anniversary": return new AnniversaryMessage();
            case "Graduation": return new GraduationMessage();
            default: throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}
